package asignacion_memoria;

import java.awt.geom.Rectangle2D;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andres Wilches
 */
public class Espacio_libre {
    int x,y;
    int m,p;

    public Espacio_libre(int x, int y, int m, int p) {
        this.x = x;
        this.y = y;
        
        this.m = m;
        this.p = p;
    }
    
   /* public Rectangle2D getrectangle(int ancho){
        return new Rectangle2D.Double(x,y,ancho,alto);
    }*/
    
}
