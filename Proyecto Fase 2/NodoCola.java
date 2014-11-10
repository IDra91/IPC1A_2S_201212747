package Proyecto;

public class NodoCola {
	private NodoCola siguiente;
	private NodoCola anterior;
	private Integer dias;
	private Integer Precio;
	private String nombre;
	private String Estado;
	private String Tipo;
	
		public NodoCola(String Nombre, Integer dia, Integer precio, String estado, String tipo, NodoCola ant,NodoCola sig){
			siguiente = sig;
			anterior = ant;
			nombre = Nombre;
			dias = dia;
			Estado = estado;
			Tipo = tipo;
			Precio = precio;
		}
		public NodoCola getSiguiente(){
			return siguiente;
		}
		
		public void setSiguiente(NodoCola siguiente){
			this.siguiente = siguiente;
		}
		
		public NodoCola getAnterior(){
			return anterior;
		}
		
		public void setAnterior(NodoCola anterior){
			this.anterior = anterior;
		}
		
		public String getDato(){
			return nombre;
		}
		public Integer getPrecio(){
			return Precio;
		}
		
		public void setNombre(String Nombre){
			this.nombre = Nombre;
		}
		public void setFecha(Integer dia){
			this.dias = dia;
		}
		public void setEstado(String estado){
			this.Estado = estado;
		}
		public void setTipo(String tipo){
			this.Tipo = tipo;
		}
		public void setPrecio(Integer precio){
			this.Precio = precio;
		}	
	
}
