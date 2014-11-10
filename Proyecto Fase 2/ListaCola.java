package Proyecto;

public class ListaCola {
	private NodoCola inicio;
	private NodoCola fin;
	
	public ListaCola(){
		inicio = null;
		fin = null;
	}
	public void Insertar(String nombre, Integer dia, Integer precio, String tipo, String estado){
		if(inicio == null){
			inicio = new NodoCola(nombre, dia, precio, tipo, estado, null, null);
			fin = inicio;
		}
		else{
			NodoCola temporal = new NodoCola(nombre, dia, precio, tipo, estado, null,inicio);
			inicio.setAnterior(temporal);
			inicio = temporal;
		}
		
	}
}
