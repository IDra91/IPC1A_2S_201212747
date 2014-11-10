package Tarea4IPC;
import javax.swing.JFrame;


public class Main {

	public static void main(String[] args) {
		JFrame jframe= new JFrame();
		jframe.setSize(600, 600);
		
		Canvas c = new Canvas();
		jframe.add(c);
		jframe.setVisible(true);
	}

}
