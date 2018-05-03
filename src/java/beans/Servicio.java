/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.util.ArrayList;
import javax.ejb.Singleton;
import modelo.*;
/**
 *
 * @author usuario
 */
@Singleton
public class Servicio implements ServicioLocal {
    
    private ArrayList<Veterinario>veterinarios=new ArrayList();
    private ArrayList<Mascota>mascotas=new ArrayList();
    private ArrayList<Enfermedad>enfermedades=new ArrayList();
    
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
    public Servicio(){
        
    }
    
    

    @Override
    public void addVeterinario(Veterinario veterinario) {
        veterinarios.add(veterinario);
    }
    
    

    @Override
    public Veterinario buscarVeterinario(int rut) {
        for(Veterinario v:veterinarios){
            if(v.getRut()==rut){
                return v;
            }
        }
        return null;
    }
    
    @Override
    public void addMascota(Mascota mascota, int rut) {
        mascotas.add(mascota);
    }
    
    @Override
    public void addEnfermedad(int rut, Mascota mascota, Enfermedad enfermedad) {
        enfermedades.add(enfermedad);
    }

    @Override
    public ArrayList<Mascota> getMascotas(int rut) {
        return mascotas;
    }

    @Override
    public ArrayList<Veterinario> getVeterinario() {
        return veterinarios;
    }

    @Override
    public ArrayList<Enfermedad> getEnfermedad() {
        return enfermedades;
    }
    
    

    

    

    
    
    
    
    
    
}
