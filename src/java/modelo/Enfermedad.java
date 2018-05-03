/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author usuario
 */
public class Enfermedad {
    private String nombree;
    private String descripcion;
    private int duracion;
    private String tratamiento;
    private int idenf;

    public Enfermedad() {
    }

    public Enfermedad(String nombree, String descripcion, int duracion, String tratamiento, int idenf) {
        this.nombree = nombree;
        this.descripcion = descripcion;
        this.duracion = duracion;
        this.tratamiento = tratamiento;
        this.idenf = idenf;
    }

    public String getNombree() {
        return nombree;
    }

    public void setNombree(String nombree) {
        this.nombree = nombree;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

    public int getIdenf() {
        return idenf;
    }

    public void setIdenf(int idenf) {
        this.idenf = idenf;
    }
    
}
