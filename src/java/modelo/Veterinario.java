/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class Veterinario {
    private String nonbrev;
    private String apellido;
    private int edadv;
    private String sexov;
    private String ciudad;
    private int telfijo;
    private int telcelular;
    private String direccion;
    private String especialidad;
    private int rut;
    private ArrayList<Mascota>misMascotas=new ArrayList();

    public Veterinario() {
    }

    public Veterinario(String nonbrev, String apellido, int edadv, String sexov, String ciudad, int telfijo, int telcelular, String direccion, String especialidad, int rut, ArrayList<Mascota>misMascotas) {
        this.nonbrev = nonbrev;
        this.apellido = apellido;
        this.edadv = edadv;
        this.sexov = sexov;
        this.ciudad = ciudad;
        this.telfijo = telfijo;
        this.telcelular = telcelular;
        this.direccion = direccion;
        this.especialidad = especialidad;
        this.rut = rut;
        this.misMascotas = misMascotas;
    }

    public String getNonbrev() {
        return nonbrev;
    }

    public void setNonbrev(String nonbrev) {
        this.nonbrev = nonbrev;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdadv() {
        return edadv;
    }

    public void setEdadv(int edadv) {
        this.edadv = edadv;
    }

    public String getSexov() {
        return sexov;
    }

    public void setSexov(String sexov) {
        this.sexov = sexov;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getTelfijo() {
        return telfijo;
    }

    public void setTelfijo(int telfijo) {
        this.telfijo = telfijo;
    }

    public int getTelcelular() {
        return telcelular;
    }

    public void setTelcelular(int telcelular) {
        this.telcelular = telcelular;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public ArrayList<Mascota> getMisMascotas() {
        return misMascotas;
    }

    public void setMisMascotas(ArrayList<Mascota> misMascotas) {
        this.misMascotas = misMascotas;
    }
    
}
