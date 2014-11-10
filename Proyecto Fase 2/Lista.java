package Proyecto;

import javax.swing.JOptionPane;



public class Lista {
	private Nodo inicio;
	private Nodo fin;
	
	public Lista(){
		
		inicio = null;
		fin = null;
		
	}

	public void InsertarInicio(String nombre, Integer dia, Integer precio, String tipo, String estado){
		if(inicio == null){
			inicio = new Nodo(nombre, dia, precio, tipo, estado, null, null);
			fin = inicio;
		}
		else{
			Nodo nuevo = new Nodo(nombre, dia, precio, tipo, estado,null,inicio);
			inicio.setAnterior(nuevo);
			inicio = nuevo;
		}
	}
	
	
	
	public String obtenerInicio(){
		String dato = inicio.getNombre();		
		inicio = inicio.getSiguiente();
		if(inicio != null){
			inicio.setAnterior(null);
		}
		else
			fin = null;
		return dato;
	}
	 
	public String obtenerFin(){
		String dato = fin.getNombre();		
		fin = fin.getAnterior();
		if(fin != null){
			fin.setSiguiente(null);
		}
		else
			inicio = null;
		return dato;
	}
	
	public void MostrarAdelante(){
		Nodo temp = inicio;
		while(temp != null){
			System.out.println(temp.getNombre());
			temp = temp.getSiguiente();
		}
		
	}
	
	public void MostrarRegreso(){
		Nodo temp = fin;
		while(temp != null){
			System.out.println(temp.getNombre());
			temp = temp.getAnterior();
		}
	}
	
	public void buscarRestaurante(String nombre, Integer precio){
		Nodo temp = inicio;
		while(temp != null){
			if(temp.getNombre().equals(nombre)){
				JOptionPane.showMessageDialog(null, "Se ha encontrado al cliente, se le ingresara su cargo");
				temp.AddCuentaR(precio);
				break;
			}
			else{
				temp = temp.getSiguiente();
			}
							
			JOptionPane.showMessageDialog(null, "El cliente no esta registrado");
	}
	
}
	public void buscarPiscina(String nombre, Integer precio){
		Nodo temp = inicio;
		while(temp != null){
			if(temp.getNombre().equals(nombre)){
				JOptionPane.showMessageDialog(null, "Se ha encontrado al cliente, se le ingresara su cargo");
				temp.AddCuentaP(precio);
				break;
			}
			else{
				temp = temp.getSiguiente();
			} JOptionPane.showMessageDialog(null, "El cliente no esta registrado");
		}
	}
	public void buscarDiscoteca(String nombre, Integer precio){
		Nodo temp = inicio;
		while(temp != null){
			if(temp.getNombre().equals(nombre)){
				JOptionPane.showMessageDialog(null, "Se ha encontrado al cliente, se le ingresara su cargo");
				temp.AddDisco(precio);
				break;
			}
			else{
				temp = temp.getSiguiente();
			}	JOptionPane.showMessageDialog(null, "El cliente no esta registrado");
		}
	}
	public void buscarBar(String nombre, Integer precio){
		Nodo temp = inicio;
			while(temp != null){
				if(temp.getNombre().equals(nombre)){
					JOptionPane.showMessageDialog(null, "Se ha encontrado al cliente, se le ingresara su cargo");
					temp.AddCuentaB(precio);
					break;
				}
				else{
						temp = temp.getSiguiente();
				}	JOptionPane.showMessageDialog(null, "El cliente no esta registrado");
			}
	}
}


