package model.recycling;

public enum Procedimiento {
    PAPEL("Reuse used paper sheets on both sides for taking notes or printing documents. When you no longer need them, dispose of them in the paper recycling bin."),
    CARTON("Make sure to crush cardboard boxes to save space in the recycling bin. Don't forget to remove any non-recyclable materials like adhesive tape or plastic labels."),
    PLASTICO("Wash and dry plastic containers before recycling them. Check the recycling number at the bottom of the container to ensure it can be recycled in your area."),
    VIDRIO("Wash and dry glass bottles and jars. Remember that not all glass products can be recycled, such as light bulbs, window glass, or mirrors."),
    ALUMINIO("Aluminum cans are 100% recyclable. Be sure to crush them to save space in the recycling bin."),
    ORGANICO("Group organic waste such as food scraps, fruit and vegetable peels, and garden waste in a composting bin."),
    ELECTRONICO("Electronic devices should be taken to a specialized recycling center. Be sure to erase your personal data."),
    ROPA("Clothes that you no longer use can be donated or taken to a textile recycling center."),
    NEUMATICOS("Tires should be recycled at specific centers. Ask your tire supplier about recycling programs."),
    MADERA("Untreated wood products can be recycled. Avoid including treated wood."),
    METAL("Metals like copper and steel are recyclable. Clean any residue before taking them for recycling."),
    BATERIAS("Batteries should be taken to specific recycling centers, as they contain heavy metals."),
    CARTUCHOS_TONER("Return toner and ink cartridges to specific collection points for recycling."),
    PILAS("Disposable batteries should be recycled at designated collection centers."),
    LAMPARAS_FLUORESCENTES("Fluorescent lamps contain mercury and should be taken to a recycling center that accepts hazardous waste."),
    CAJAS_COMIDA_POLIESTIRENO("Check with your local recycling center about the recyclability of takeout food boxes."),
    PAPEL_ALUMINIO("Aluminum foil is recyclable if it is clean and dry."),
    BOTELLAS_PET("PET plastic bottles are recyclable. Wash them and remove the caps before recycling."),
    SISTEMAS_CAFE("Check if the manufacturer has a specific recycling program for coffee capsules."),
    NO_DETERMINADO("Needs to be grouped with other materials that do not have a recommendation.");

    private final String descripcion;

    Procedimiento(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
