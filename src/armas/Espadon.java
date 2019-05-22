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
public class Espadon extends ArmaAbstracta{

    public Espadon() {
    super();
        setAtaque(320);
        setCadencia(0.6);
        setVelocidadMov(0.8);
        setDistancia_atq(15);
        setRegenVida(0.13);
        setImagen(new ImageIcon("/resources/armas/espadon.png"));
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
