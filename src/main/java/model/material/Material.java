package model.material;

import model.recommendation.Recomendacion;

public class Material {
    private String nombre;
    private TipoMaterial tipo;
    private Recomendacion recomendacion;

    // Constructor
    public Material(String nombre) {
        this.nombre = nombre;
        this.tipo = null;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TipoMaterial getTipo() {
        return tipo;
    }

    public void setTipo(TipoMaterial tipo) {
        this.tipo = tipo;
    }

    public Recomendacion getRecomendacion() {
        return recomendacion;
    }

    public void setRecomendacion(Recomendacion recomendacion) {
        this.recomendacion = recomendacion;
    }

    public Boolean tipoNoAsignado(){
        return this.tipo == null;
    }

}
