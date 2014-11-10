package Tarea4IPC;

import java.awt.Color;
import java.awt.Graphics;

public class Circle {
	public int positionx, positiony;
	public float velx, vely;
	public int size;
	public float velocons;
	public float jumpimpulse;
	
		public Circle ()
		{
			size = 10;
			velocons = 0.5f;
			
			
		}
		public void Update(){
			AplicarVelocidad();
			CambioPosicion();
			DetectarPared();
		}
		public void DetectarPared(){
			if (positionx + size >600 ){
				System.out.println("Detectar Suelo");
			}
		}
		public void CambioPosicion(){
			positionx = (int) velx;
			positiony = (int) vely;
		}
		
		public void AplicarVelocidad(){
			velx += velocons;
			
		}
		public void AplicarVelocidadNeg(){
			velx -= velocons;
		}
		
		public void DrawCircle(Graphics g){
			g.setColor(Color.black);
			g.fillOval(positionx, positiony, size, size);
		}
		
}


