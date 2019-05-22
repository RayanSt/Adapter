/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package armas;

import javax.swing.ImageIcon;

/**
 *
 * @author DANIEL
 */
public class Espada extends ArmaAbstracta{

    public Espada() {
    super();
        setAtaque(240);
        setCadencia(1.0);
        setVelocidadMov(0.87);
        setDistancia_atq(10);
        setRegenVida(0.1);
        setImagen(new ImageIcon("/resources/armas/espada.png"));
    }

    
    @Override
    public void setAtaque(int ataque) {
        this.ataque=ataque;
        
    }

    @Override
    public void setCadencia(double cadencia) {
        this.cadencia = cadencia;
        
    }

    @Override
    public void setVelocidadMov(double velocidadMov) {
        this.velocidadMov = velocidadMov;
        
    }

    @Override
    public void setDistancia_atq(int distancia_atq) {
        this.distancia_atq=distancia_atq;
        
    }

    @Override
    public void setRegenVida(double regenVida) {
        this.regenVida=regenVida;
        
    }
    @Override
    public void setImagen(ImageIcon imagen) {
        this.imagen=imagen;
        
    }
}
