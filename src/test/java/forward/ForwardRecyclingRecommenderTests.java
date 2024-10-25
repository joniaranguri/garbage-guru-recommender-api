package forward;

import model.material.Material;
import model.material.TipoMaterial;
import model.recycling.Procedimiento;
import model.recommendation.Recomendacion;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import utils.KnowledgeSessionHelper;
import org.junit.Assert;

import static utils.TestCaseUtils.print;

public class ForwardRecyclingRecommenderTests {
    String K_SESSION_NAME = "kforward-chaining-session";

    KieSession sessionStatefull;
    static KieContainer kieContainer;

    public ForwardRecyclingRecommenderTests() {
    }

    @BeforeClass
    public static void beforeallTestSetup() {
        kieContainer = KnowledgeSessionHelper.createRuleBase();
    }

    private void prepareKnowledgeSession() {
        sessionStatefull = KnowledgeSessionHelper.getStatefulKnowledgeSessionWithCallback(kieContainer, K_SESSION_NAME);
    }

    @Before
    public void setUp() {
        print("----------Start----------");
        print();
        this.prepareKnowledgeSession(); // Initialize knowledge session
    }

    @After
    public void tearDown() {
        print();
        print("----------End----------");
        print();
    }

    @Test
    public void testPaperRecycling() {
        print("Test: Recycling paper");
        Material material = new Material("papel");
        print(material);

        sessionStatefull.insert(material);
        sessionStatefull.fireAllRules();

        Recomendacion recomendacion = material.getRecomendacion();
        Procedimiento procedimientoEsperado = Procedimiento.PAPEL;

        Assert.assertEquals(recomendacion.getProcedimiento().getDescripcion(), procedimientoEsperado.getDescripcion());
        Assert.assertEquals(material.getTipo(), TipoMaterial.PAPEL);
    }

    @Test
    public void testCartonRecycling() {
        print("Test: Recycling carton");
        Material material = new Material("carton");
        print(material);

        sessionStatefull.insert(material);
        sessionStatefull.fireAllRules();

        Recomendacion recomendacion = material.getRecomendacion();
        Procedimiento procedimientoEsperado = Procedimiento.CARTON;

        Assert.assertEquals(recomendacion.getProcedimiento().getDescripcion(), procedimientoEsperado.getDescripcion());
        Assert.assertEquals(material.getTipo(), TipoMaterial.CARTON);
    }

    @Test
    public void testPlasticRecycling() {
        print("Test: Recycling plastic");
        Material material = new Material("plastico");
        print(material);

        sessionStatefull.insert(material);
        sessionStatefull.fireAllRules();

        Recomendacion recomendacion = material.getRecomendacion();
        Procedimiento procedimientoEsperado = Procedimiento.PLASTICO;

        Assert.assertEquals(recomendacion.getProcedimiento().getDescripcion(), procedimientoEsperado.getDescripcion());
        Assert.assertEquals(material.getTipo(), TipoMaterial.PLASTICO);
    }

    @Test
    public void testGlassRecycling() {
        print("Test: Recycling vidrio");
        Material material = new Material("vidrio");
        print(material);

        sessionStatefull.insert(material);
        sessionStatefull.fireAllRules();

        Recomendacion recomendacion = material.getRecomendacion();
        Procedimiento procedimientoEsperado = Procedimiento.VIDRIO;

        Assert.assertEquals(recomendacion.getProcedimiento().getDescripcion(), procedimientoEsperado.getDescripcion());
        Assert.assertEquals(material.getTipo(), TipoMaterial.VIDRIO);
    }

    @Test
    public void testAluminumRecycling() {
        print("Test: Recycling aluminio");
        Material material = new Material("aluminio");
        print(material);

        sessionStatefull.insert(material);
        sessionStatefull.fireAllRules();

        Recomendacion recomendacion = material.getRecomendacion();
        Procedimiento procedimientoEsperado = Procedimiento.ALUMINIO;

        Assert.assertEquals(recomendacion.getProcedimiento().getDescripcion(), procedimientoEsperado.getDescripcion());
        Assert.assertEquals(material.getTipo(), TipoMaterial.ALUMINIO);
    }

    @Test
    public void testOrganicRecycling() {
        print("Test: Recycling organico");
        Material material = new Material("organico");
        print(material);

        sessionStatefull.insert(material);
        sessionStatefull.fireAllRules();

        Recomendacion recomendacion = material.getRecomendacion();
        Procedimiento procedimientoEsperado = Procedimiento.ORGANICO;

        Assert.assertEquals(recomendacion.getProcedimiento().getDescripcion(), procedimientoEsperado.getDescripcion());
        Assert.assertEquals(material.getTipo(), TipoMaterial.ORGANICO);
    }

    @Test
    public void testElectronicRecycling() {
        print("Test: Recycling electronico");
        Material material = new Material("electronico");
        print(material);

        sessionStatefull.insert(material);
        sessionStatefull.fireAllRules();

        Recomendacion recomendacion = material.getRecomendacion();
        Procedimiento procedimientoEsperado = Procedimiento.ELECTRONICO;

        Assert.assertEquals(recomendacion.getProcedimiento().getDescripcion(), procedimientoEsperado.getDescripcion());
        Assert.assertEquals(material.getTipo(), TipoMaterial.ELECTRONICO);
    }

    @Test
    public void testClothingRecycling() {
        print("Test: Recycling ropa");
        Material material = new Material("ropa");
        print(material);

        sessionStatefull.insert(material);
        sessionStatefull.fireAllRules();

        Recomendacion recomendacion = material.getRecomendacion();
        Procedimiento procedimientoEsperado = Procedimiento.ROPA;

        Assert.assertEquals(recomendacion.getProcedimiento().getDescripcion(), procedimientoEsperado.getDescripcion());
        Assert.assertEquals(material.getTipo(), TipoMaterial.ROPA);
    }

    @Test
    public void testTireRecycling() {
        print("Test: Recycling neumáticos");
        Material material = new Material("neumatico");
        print(material);

        sessionStatefull.insert(material);
        sessionStatefull.fireAllRules();

        Recomendacion recomendacion = material.getRecomendacion();
        Procedimiento procedimientoEsperado = Procedimiento.NEUMATICOS;

        Assert.assertEquals(recomendacion.getProcedimiento().getDescripcion(), procedimientoEsperado.getDescripcion());
        Assert.assertEquals(material.getTipo(), TipoMaterial.NEUMATICOS);
    }

    @Test
    public void testWoodRecycling() {
        print("Test: Recycling madera");
        Material material = new Material("madera");
        print(material);

        sessionStatefull.insert(material);
        sessionStatefull.fireAllRules();

        Recomendacion recomendacion = material.getRecomendacion();
        Procedimiento procedimientoEsperado = Procedimiento.MADERA;

        Assert.assertEquals(recomendacion.getProcedimiento().getDescripcion(), procedimientoEsperado.getDescripcion());
        Assert.assertEquals(material.getTipo(), TipoMaterial.MADERA);
    }

    @Test
    public void testMetalRecycling() {
        print("Test: Recycling metal");
        Material material = new Material("metal");
        print(material);

        sessionStatefull.insert(material);
        sessionStatefull.fireAllRules();

        Recomendacion recomendacion = material.getRecomendacion();
        Procedimiento procedimientoEsperado = Procedimiento.METAL;

        Assert.assertEquals(recomendacion.getProcedimiento().getDescripcion(), procedimientoEsperado.getDescripcion());
        Assert.assertEquals(material.getTipo(), TipoMaterial.METAL);
    }

    @Test
    public void testBatteryRecycling() {
        print("Test: Recycling baterías");
        Material material = new Material("bateria");
        print(material);

        sessionStatefull.insert(material);
        sessionStatefull.fireAllRules();

        Recomendacion recomendacion = material.getRecomendacion();
        Procedimiento procedimientoEsperado = Procedimiento.BATERIAS;

        Assert.assertEquals(recomendacion.getProcedimiento().getDescripcion(), procedimientoEsperado.getDescripcion());
        Assert.assertEquals(material.getTipo(), TipoMaterial.BATERIAS);
    }

    @Test
    public void testTonerCartridgeRecycling() {
        print("Test: Recycling cartuchos de toner");
        Material material = new Material("cartucho toner");
        print(material);

        sessionStatefull.insert(material);
        sessionStatefull.fireAllRules();

        Recomendacion recomendacion = material.getRecomendacion();
        Procedimiento procedimientoEsperado = Procedimiento.CARTUCHOS_TONER;

        Assert.assertEquals(recomendacion.getProcedimiento().getDescripcion(), procedimientoEsperado.getDescripcion());
        Assert.assertEquals(material.getTipo(), TipoMaterial.CARTUCHOS_TONER);
    }

    @Test
    public void testBatteryRecycle() {
        print("Test: Recycling pilas");
        Material material = new Material("pila");
        print(material);

        sessionStatefull.insert(material);
        sessionStatefull.fireAllRules();

        Recomendacion recomendacion = material.getRecomendacion();
        Procedimiento procedimientoEsperado = Procedimiento.PILAS;

        Assert.assertEquals(recomendacion.getProcedimiento().getDescripcion(), procedimientoEsperado.getDescripcion());
        Assert.assertEquals(material.getTipo(), TipoMaterial.PILAS);
    }

    @Test
    public void testFluorescentLampRecycling() {
        print("Test: Recycling lámparas fluorescentes");
        Material material = new Material("lampara fluorescente");
        print(material);

        sessionStatefull.insert(material);
        sessionStatefull.fireAllRules();

        Recomendacion recomendacion = material.getRecomendacion();
        Procedimiento procedimientoEsperado = Procedimiento.LAMPARAS_FLUORESCENTES;

        Assert.assertEquals(recomendacion.getProcedimiento().getDescripcion(), procedimientoEsperado.getDescripcion());
        Assert.assertEquals(material.getTipo(), TipoMaterial.LAMPARAS_FLUORESCENTES);
    }

    @Test
    public void testUnknownMaterialRecycling() {
        print("Test: Recycling unknown material");
        Material material = new Material("material desconocido");
        print(material);

        sessionStatefull.insert(material);
        sessionStatefull.fireAllRules();

        Recomendacion recomendacion = material.getRecomendacion();
        Procedimiento procedimientoEsperado = Procedimiento.NO_DETERMINADO;

        Assert.assertEquals(recomendacion.getProcedimiento().getDescripcion(), procedimientoEsperado.getDescripcion());
        Assert.assertEquals(material.getTipo(), TipoMaterial.NO_DETERMINADO);
    }
}
