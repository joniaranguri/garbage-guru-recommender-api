package model.recycling;

public enum Procedimiento {
    PAPEL("Reutiliza las hojas de papel usadas por ambos lados para tomar notas o imprimir documentos. Cuando ya no las necesites, deposítalas en el contenedor de reciclaje de papel."),
    CARTON("Asegúrate de aplastar las cajas de cartón para ahorrar espacio en el contenedor de reciclaje. No olvides retirar cualquier material no reciclable como cinta adhesiva o etiquetas de plástico."),
    PLASTICO("Lava y seca los recipientes de plástico antes de reciclarlos. Verifica el número de reciclaje en la parte inferior del recipiente para asegurarte de que puede ser reciclado en tu área."),
    VIDRIO("Lava y seca las botellas y frascos de vidrio. Recuerda que no todos los productos de vidrio se pueden reciclar, como las bombillas, cristales de ventanas o espejos."),
    ALUMINIO("Las latas de aluminio son 100% reciclables. Asegúrate de aplastarlas para ahorrar espacio en el contenedor de reciclaje."),
    ORGANICO("Agrupa los residuos orgánicos como restos de comida, cáscaras de frutas y verduras, y residuos de jardín en un contenedor de compostaje."),
    ELECTRONICO("Los dispositivos electrónicos deben ser llevados a un centro de reciclaje especializado. Asegúrate de borrar tus datos personales."),
    ROPA("La ropa que ya no utilizas puede ser donada o llevada a un centro de reciclaje textil."),
    NEUMATICOS("Los neumáticos deben ser reciclados en centros específicos. Pregunta a tu proveedor de neumáticos sobre programas de reciclaje."),
    MADERA("Los productos de madera no tratada pueden ser reciclados. Evita incluir madera tratada."),
    METAL("Los metales como el cobre y el acero son reciclables. Limpia bien cualquier residuo antes de llevarlos a reciclaje."),
    BATERIAS("Las baterías deben ser llevadas a centros de reciclaje específicos, ya que contienen metales pesados."),
    CARTUCHOS_TONER("Devuelve los cartuchos de tóner y tinta a puntos de recogida específicos para su reciclaje."),
    PILAS("Las pilas desechables deben ser recicladas en centros de recogida designados."),
    LAMPARAS_FLUORESCENTES("Las lámparas fluorescentes contienen mercurio y deben ser llevadas a un centro de reciclaje que acepte desechos peligrosos."),
    CAJAS_COMIDA_POLIESTIRENO("Consulta a tu centro de reciclaje local sobre la reciclabilidad de las cajas de comida para llevar."),
    PAPEL_ALUMINIO("El papel aluminio es reciclable si está limpio y seco."),
    BOTELLAS_PET("Las botellas de plástico PET son reciclables. Lávalas y quita las tapas antes de reciclar."),
    SISTEMAS_CAFE("Consulta si el fabricante tiene un programa de reciclaje específico para cápsulas de café."),
    NO_DETERMINADO("Necesita ser agrupado junto con los demás materiales que no tienen una recomendación.");

    private final String descripcion;

    Procedimiento(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
