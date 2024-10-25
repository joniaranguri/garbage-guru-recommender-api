package model.recommendation;

import model.recycling.Procedimiento;

public class Recomendacion {
    private Procedimiento procedimiento;  // El procedimiento asociado a la recomendación

    // Constructor
    public Recomendacion(Procedimiento procedimiento) {
        this.procedimiento = procedimiento;
    }

    // Getter y Setter
    public Procedimiento getProcedimiento() {
        return procedimiento;
    }

    public void setProcedimiento(Procedimiento procedimiento) {
        this.procedimiento = procedimiento;
    }

    // Método para obtener la descripción del procedimiento
    public String getDescripcion() {
        return procedimiento.getDescripcion();
    }
}
