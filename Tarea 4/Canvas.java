package Tarea4IPC;
import java.awt.Color;
import java.awt.Graphics;
import Tarea4IPC.Circle;
import Tarea4IPC.Bouncy;
import javax.swing.JPanel;
public class Canvas extends JPanel{
	private static final long serialVersionUID = 1L;
	Bouncy circulo = new Bouncy();
	Circle cir = new Circle();
	
	public Canvas(){
		
	}
	public void Paint(Graphics gra){
		update(gra);
		gra.setColor(Color.black);
		gra.fillRect(0, 0, getSize().width, getSize().height);
		circulo.DrawCircle(gra);
		cir.DrawCircle(gra);
		repaint();
		
	}
	public void update(Graphics gra){
		circulo.Update();
		cir.Update();
	}
	
}
