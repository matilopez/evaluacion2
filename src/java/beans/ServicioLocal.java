/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.util.ArrayList;
import javax.ejb.Local;
import modelo.*;

/**
 *
 * @author usuario
 */
@Local
public interface ServicioLocal {
    
    void addVeterinario(Veterinario veterinario);

    Veterinario buscarVeterinario(int rut);
    
    void addMascota(Mascota mascota, int rut);

    void addEnfermedad(int rut, Mascota mascota, Enfermedad enfermedad);

    ArrayList<Mascota> getMascotas(int rut);

    ArrayList<Veterinario> getVeterinario();

    ArrayList<Enfermedad> getEnfermedad();

    

    

    
    
}
