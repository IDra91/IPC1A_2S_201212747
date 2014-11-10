package Proyecto;


public class Nodo {
	private Nodo siguiente;
	private Nodo anterior;
	private Integer dias;
	private Integer Precio;
	private String nombre;
	private String Estado;
	private String Tipo;
	
	public Nodo(String Nombre, Integer dia, Integer precio, String estado, String tipo, Nodo ant,Nodo sig){
		siguiente = sig;
		anterior = ant;
		nombre = Nombre;
		dias = dia;
		Estado = estado;
		Tipo = tipo;
		Precio = precio;
	}
	
	public Nodo getSiguiente(){
		return siguiente;
	}
	
	public void setSiguiente(Nodo siguiente){
		this.siguiente = siguiente;
	}
	
	public Nodo getAnterior(){
		return anterior;
	}
	
	public void setAnterior(Nodo anterior){
		this.anterior = anterior;
	}
	public void AddCuentaR(Integer precio){
		this.Precio = precio;
		precio = precio + 50;
	}
	public void AddCuentaP(Integer precio){
		this.Precio = precio;
		precio = precio + 10;
	}
	public void AddCuentaB(Integer precio){
		this.Precio = precio;
		precio = precio + 20;
	}
	public void AddDisco(Integer precio){
		this.Precio = precio;
		precio = precio + 10;
	}
	public String getNombre(){
		return nombre;
	}
	public Integer getPrecio(){
		return Precio;
	}
	public Integer getFecha(){
		return dias;
	}
	public String getTipo(){
		return Tipo;
	}
	public String getEstado(){
		return Estado;
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
