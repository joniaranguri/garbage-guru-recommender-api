import io.ktor.http.*
import io.ktor.serialization.gson.*
import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import io.ktor.server.plugins.contentnegotiation.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import model.material.Material
import org.kie.api.KieServices
import org.kie.api.runtime.KieContainer
import org.kie.api.runtime.KieSession
import org.slf4j.LoggerFactory
import utils.KnowledgeSessionHelper

val logger = LoggerFactory.getLogger("MyApp")

fun main() {
    logger.info("Starting the server...")
    embeddedServer(Netty, port = 8080) {
        module()
    }.start(wait = true)
}

fun Application.module() {
    install(ContentNegotiation) {
        gson()
    }
    logger.info("Server starting on port 8080...")

    routing {
        get("/recommendation") {
            val materialType = call.parameters["materialType"] ?: "UNKNOWN"
            val recommendation = getRecommendation(materialType)
            call.respond(HttpStatusCode.OK, recommendation)
        }
    }
}

fun getRecommendation(materialType: String): String {
    val kieContainer = KnowledgeSessionHelper.createRuleBase()
    val sessionStatefull = KnowledgeSessionHelper.getStatefulKnowledgeSessionWithCallback(
        kieContainer,
        K_SESSION_NAME
    )

    val fact = Material(materialType)

    sessionStatefull.insert(fact)
    sessionStatefull.fireAllRules()

    sessionStatefull.dispose()
    return fact.recomendacion.descripcion
}

const val K_SESSION_NAME = "kforward-chaining-session"
