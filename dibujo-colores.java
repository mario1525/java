package figuras;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.geom.*;

public class PruebaDibujo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        MarcoConDibujo mimarco=new MarcoConDibujo();
        mimarco.setVisible(true);
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
	}

}

class MarcoConDibujo extends JFrame{
	
	public MarcoConDibujo() {
            
		setTitle("Marco con dibujo");
		setSize(800,800);
		
		LaminaConFigura milamina=new LaminaConFigura(); //por ultimo instaciamos nuesta lamina
		add(milamina);   // si sale error es por que estas utilizando una version < 5.0 de java
	}
}

class LaminaConFigura extends JPanel {
    
   
    
	public void paintComponent(Graphics g) {
		super.paintComponent(g);		
		
		   
		Graphics2D g2=(Graphics2D) g;
                
		Rectangle2D rectangulo=new Rectangle2D.Double(200,200,400,250);
               g2.setColor(Color.red);
               g2.setBackground(Color.blue);
		g2.draw(rectangulo);
		
		Ellipse2D elipse=new Ellipse2D.Double();
		elipse.setFrame(rectangulo);
                g2.setColor(Color.blue);
		g2.draw(elipse);
                g2.setColor(Color.CYAN);
		g2.draw(new Line2D.Double(200,200,600,450));
		
		double CentroenX=rectangulo.getCenterX();
		double CentroenY=rectangulo.getCenterY();
		double radio=150;
		
	    Ellipse2D circulo=new Ellipse2D.Double();            
	    circulo.setFrameFromCenter(CentroenX, CentroenY, CentroenX+radio, CentroenY+radio);
	    g2.draw(circulo);
		
		setBackground(Color.gray);
			
	}
}