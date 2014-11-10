package Proyecto;

import java.awt.BorderLayout;
import java.awt.EventQueue;




import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;
import java.net.URL;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Principal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Principal() {
		setTitle("Hoteles de Centroamerica");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 467, 453);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel lblBienvenidoA = new JLabel("Bienvenido a Hoteles de Centroamerica");
		lblBienvenidoA.setFont(new Font("Footlight MT Light", Font.PLAIN, 18));
		contentPane.add(lblBienvenidoA, BorderLayout.NORTH);
		
		JButton btnReservarHabitacion = new JButton("Entrar");
		btnReservarHabitacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Ventana v = new Ventana();
				v.setVisible(true);
			}
		});
		contentPane.add(btnReservarHabitacion, BorderLayout.SOUTH);
		
		JLabel lblNewLabel = new JLabel("");
		
		lblNewLabel.setIcon(new ImageIcon("D:\\Manuel\\Universidad San Carlos\\2014\\Segundo Semestre\\IPC\\Proyecto\\src\\Proyecto\\imagendepalmeraparaimprimir5.jpg"));
		contentPane.add(lblNewLabel, BorderLayout.WEST);
	}

}
