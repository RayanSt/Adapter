/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personajes;

/**
 *
 * @author estudiantes
 */
public class FabricaConcretaAdapter extends FabricaAbstractaPersonaje{

    @Override
    public PersonajeAbstracto getPersonaje() {
       return new AdaptadorPersonaje();
    }
    
}
