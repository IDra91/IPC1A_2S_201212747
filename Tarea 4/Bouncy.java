package Tarea4IPC;

import java.awt.Color;
import java.awt.Graphics;

public class Bouncy extends Circle {
	Color color;
	
	public Bouncy(){
		size = 100;
		velocons = 2f;
		color = Color.BLACK;
		
	}
	public void WallJump(){
		velx = 3f;
	}
	public void DetectarPared(){
		if (positionx+size >600){
			Estatico();
			WallJump();
		}
	}
	public void DetectarPared2(){
		if (positionx+size >0){
			Estatico();
			Salto();
		}
	}
	public void Salto(){
		velx -= velocons;
	}
	public void Estatico(){
		velx = 0f;
	}
	public void CambiarColor(){
		color = Color.blue;
	}
	@Override
	public void DrawCircle(Graphics gra){
	gra.setColor(Color.black);
	gra.fillOval(positionx, positiony, size, size);
	}
	
	public void Update(){
		AplicarVelocidad();
		CambioPosicion();
		
	}

	
}
