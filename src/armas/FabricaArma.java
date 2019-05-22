/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package armas;

/**
 *
 * @author DANIEL
 */
public class FabricaArma {

    public ArmaAbstracta getArma(int ref) {
        switch (ref) {
            case 1:
                return new Arco();
            case 2:
                return new Baculo();
            case 3:
                return new Ballesta();
            case 4:
                return new Daga();
            case 5:
                return new Espada();
            case 6:
                return new Espadon();
            case 7:
                return new Manopla();
            case 8:
                return new Mazo();
            default:
                return new Arco();
        }
    }
}
