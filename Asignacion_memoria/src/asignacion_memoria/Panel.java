/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asignacion_memoria;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import javax.swing.JPanel;



public class Panel extends JPanel{
    ArrayList<Espacio>espacios=new ArrayList<Espacio>();
    Graphics g;
    public Panel(){
        
                
       
        init();
        
        
    }
    
    public void paintComponent(Graphics g){
       
       Graphics2D g2d = (Graphics2D) g;
        Font f=new Font("TimesRoman", Font.BOLD, 40);
        g2d.setFont(f);
        g2d.setColor(Color.black);
       for(int i=0;i<espacios.size();i++){
           g2d.draw(espacios.get(i).getEspacio());
       }
        g2d.drawString("OS8M", 120, 70);
        g2d.drawString("P18M", 120, 158);
        f=new Font("TimesRoman", Font.BOLD, 20);
        g2d.setFont(f);
        g2d.drawString("P32M", 145, 280);
        f=new Font("TimesRoman", Font.BOLD, 40);
        g2d.setFont(f);
        g2d.drawString("P58M", 120, 446);
        f=new Font("TimesRoman", Font.BOLD, 30);
        g2d.setFont(f);
        g2d.drawString("0", 53, 30);
        g2d.drawString("8", 53, 110);
        g2d.drawString("16", 36, 190);
        g2d.drawString("24", 36, 270);
        g2d.drawString("26", 36, 290);
        g2d.drawString("36", 36, 390);
        g2d.drawString("44", 36, 470);
        g2d.drawString("48", 36, 510);
        
    }
    public void init(){
        espacios.add(new Espacio(70,20,220,80));
        espacios.add(new Espacio(70,100,220,80));
        espacios.add(new Espacio(70,180,220,80));
        espacios.add(new Espacio(70,260,220,20));
        espacios.add(new Espacio(70,280,220,100));
        espacios.add(new Espacio(70,380,220,80));
        espacios.add(new Espacio(70,460,220,40));
       
        
    }
    
    
}
