
package imagenes;

import java.awt.*;
import javax.swing.*;
import javax.imageio.*;
import java.io.*;

public class pruebaImagen {
    
    public static void main(String[] args) {
         marcoConimagen mimarco = new marcoConimagen();
        mimarco.setVisible(true);
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    }
    
}

class marcoConimagen extends JFrame{

    public marcoConimagen()  {
        setTitle("mi imagen ");
        setBounds(800,800,400,400);
        laminaConimagen  milamina = new laminaConimagen();
        add(milamina);
    }
    
    
}


class laminaConimagen extends JPanel{
    
  public void painComponent(Graphics g){
      super.paintComponent(g);
      File miimagen = new File("src/imagenes/png.png");
      
      
      try{
          imagen=ImageIO.read(miimagen);
      }
      catch(IOException e){
          System.out.println("la imagen no aparece ");
      }
      g.drawImage(imagen, 0, 0, null);
  } 
  
  private Image imagen;
}