package Proyecto;

import javax.swing.JOptionPane;

public class Ventana extends javax.swing.JFrame {
	Lista l = new Lista();
    ListaCola lc = new ListaCola();    
	private javax.swing.JButton Boton1;
	    private javax.swing.JButton Boton2;
	    private javax.swing.JButton Boton3;
	    private javax.swing.JButton Boton4;
	    private javax.swing.JButton Boton5;
	    private javax.swing.JButton Boton6;
	    private javax.swing.JButton Boton7;
	    private javax.swing.JButton Boton8;
	    private javax.swing.JButton Boton9;
	    private javax.swing.JDesktopPane Escritorio;
	    private javax.swing.JInternalFrame Int1;
	    private javax.swing.JInternalFrame Int2;
	    private javax.swing.JInternalFrame Int3;
	    private javax.swing.JInternalFrame Int4;
	    private javax.swing.JInternalFrame Int5;
	    private javax.swing.JInternalFrame Int6;
	    private javax.swing.JLabel Lbl1;
	    private javax.swing.JMenuBar Menu;
	    private javax.swing.JMenuItem MenuItem1;
	    private javax.swing.JMenuItem MenuItem2;
	    private javax.swing.JMenuItem MenuItem3;
	    private javax.swing.JMenuItem MenuItem4;
	    private javax.swing.JMenuItem MenuItem5;
	    private javax.swing.JMenuItem MenuItem6;
	    private javax.swing.JTextField Txt1;
	    private javax.swing.JTextField Txt2;
	    private javax.swing.JTextField Txt3;
	    private javax.swing.JTextField Txt4;
	    private javax.swing.JTextField Txt5;
	    private javax.swing.JMenu jMenu1;
	    private javax.swing.JLabel lbl1;
	    private javax.swing.JLabel lbl2;
	    private javax.swing.JLabel lbl3;
	    private javax.swing.JLabel lbl4;
	    private javax.swing.JLabel lbl5;
	    private javax.swing.JLabel lbl6;
	    private javax.swing.JTextField txt1;
	    private javax.swing.JTextField txt2;	
	public Ventana(){
		componentes();
        Int1.dispose();
        Int2.dispose();
        Int3.dispose();
        Int4.dispose();
        Int5.dispose();
        Int6.dispose();
	}
	private void componentes(){
		Escritorio = new javax.swing.JDesktopPane();
        Int1 = new javax.swing.JInternalFrame();
        Lbl1 = new javax.swing.JLabel();
        txt1 = new javax.swing.JTextField();
        lbl2 = new javax.swing.JLabel();
        txt2 = new javax.swing.JTextField();
        Boton1 = new javax.swing.JButton();
        Boton2 = new javax.swing.JButton();
        Boton3 = new javax.swing.JButton();
        Boton9 = new javax.swing.JButton();
        Int2 = new javax.swing.JInternalFrame();
        lbl3 = new javax.swing.JLabel();
        Txt2 = new javax.swing.JTextField();
        Boton5 = new javax.swing.JButton();
        Int4 = new javax.swing.JInternalFrame();
        lbl4 = new javax.swing.JLabel();
        Txt3 = new javax.swing.JTextField();
        Boton6 = new javax.swing.JButton();
        Int5 = new javax.swing.JInternalFrame();
        lbl5 = new javax.swing.JLabel();
        Txt4 = new javax.swing.JTextField();
        Boton7 = new javax.swing.JButton();
        Int6 = new javax.swing.JInternalFrame();
        lbl6 = new javax.swing.JLabel();
        Txt5 = new javax.swing.JTextField();
        Boton8 = new javax.swing.JButton();
        Int3 = new javax.swing.JInternalFrame();
        lbl1 = new javax.swing.JLabel();
        Txt1 = new javax.swing.JTextField();
        Boton4 = new javax.swing.JButton();
        Menu = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        MenuItem1 = new javax.swing.JMenuItem();
        MenuItem2 = new javax.swing.JMenuItem();
        MenuItem4 = new javax.swing.JMenuItem();
        MenuItem3 = new javax.swing.JMenuItem();
        MenuItem5 = new javax.swing.JMenuItem();
        MenuItem6 = new javax.swing.JMenuItem();
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Int1.setClosable(true);
        Int1.setIconifiable(true);
        Int1.setMaximizable(true);
        Int1.setTitle("Habitaciones");
        Int1.setVisible(true);

        Lbl1.setText("Ingrese el nombre:");

        lbl2.setText("Ingrese el tiempo:");

        Boton1.setText("Reservar Simple");
        Boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton1ActionPerformed(evt);
            }
        });

        Boton2.setText("Reservar Deluxe");
        Boton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton2ActionPerformed(evt);
            }
        });

        Boton3.setText("Reservar Regular");
        Boton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton3ActionPerformed(evt);
            }
        });

        Boton9.setText("Salida");
        Boton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Int1Layout = new javax.swing.GroupLayout(Int1.getContentPane());
        Int1.getContentPane().setLayout(Int1Layout);
        Int1Layout.setHorizontalGroup(
            Int1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Int1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Int1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Int1Layout.createSequentialGroup()
                        .addComponent(lbl2)
                        .addGap(18, 18, 18)
                        .addComponent(txt2, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE))
                    .addGroup(Int1Layout.createSequentialGroup()
                        .addComponent(Lbl1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt1, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE))
                    .addGroup(Int1Layout.createSequentialGroup()
                        .addGroup(Int1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Boton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Boton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Int1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Boton3)
                            .addComponent(Boton2))))
                .addContainerGap())
        );
        Int1Layout.setVerticalGroup(
            Int1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Int1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Int1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lbl1)
                    .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Int1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Int1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Boton1)
                    .addComponent(Boton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Int1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Boton9)
                    .addComponent(Boton3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Int1.setBounds(10, 10, 190, 130);
        Escritorio.add(Int1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Int2.setClosable(true);
        Int2.setIconifiable(true);
        Int2.setMaximizable(true);
        Int2.setTitle("Restaurante");
        Int2.setVisible(true);

        lbl3.setText("Ingrese el nombre:");

        Boton5.setText("Reservar");
        Boton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Int2Layout = new javax.swing.GroupLayout(Int2.getContentPane());
        Int2.getContentPane().setLayout(Int2Layout);
        Int2Layout.setHorizontalGroup(
            Int2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Int2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Int2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Int2Layout.createSequentialGroup()
                        .addComponent(lbl3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Txt2, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                    .addGroup(Int2Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(Boton5)))
                .addContainerGap())
        );
        Int2Layout.setVerticalGroup(
            Int2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Int2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(Int2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl3)
                    .addComponent(Txt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Boton5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Int2.setBounds(210, 10, 170, 130);
        Escritorio.add(Int2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Int4.setClosable(true);
        Int4.setIconifiable(true);
        Int4.setMaximizable(true);
        Int4.setTitle("Discoteca");
        Int4.setVisible(true);

        lbl4.setText("Ingrese el nombre:");

        Boton6.setText("Reservar");
        Boton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Int4Layout = new javax.swing.GroupLayout(Int4.getContentPane());
        Int4.getContentPane().setLayout(Int4Layout);
        Int4Layout.setHorizontalGroup(
            Int4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Int4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Int4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Int4Layout.createSequentialGroup()
                        .addComponent(lbl4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Txt3, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                    .addGroup(Int4Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(Boton6)))
                .addContainerGap())
        );
        Int4Layout.setVerticalGroup(
            Int4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Int4Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(Int4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl4)
                    .addComponent(Txt3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Boton6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Int4.setBounds(210, 150, 170, 120);
        Escritorio.add(Int4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Int5.setClosable(true);
        Int5.setIconifiable(true);
        Int5.setMaximizable(true);
        Int5.setTitle("Bar");
        Int5.setVisible(true);

        lbl5.setText("Ingrese el nombre:");

        Boton7.setText("Reservar");
        Boton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Int5Layout = new javax.swing.GroupLayout(Int5.getContentPane());
        Int5.getContentPane().setLayout(Int5Layout);
        Int5Layout.setHorizontalGroup(
            Int5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Int5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Int5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Int5Layout.createSequentialGroup()
                        .addComponent(lbl5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Txt4, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                    .addGroup(Int5Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(Boton7)))
                .addContainerGap())
        );
        Int5Layout.setVerticalGroup(
            Int5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Int5Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(Int5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl5)
                    .addComponent(Txt4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Boton7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Int5.setBounds(400, 10, 150, 130);
        Escritorio.add(Int5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Int6.setClosable(true);
        Int6.setIconifiable(true);
        Int6.setMaximizable(true);
        Int6.setTitle("Promociones");
        Int6.setVisible(true);

        lbl6.setText("Ingrese el nombre:");

        Boton8.setText("Reservar");
        Boton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Int6Layout = new javax.swing.GroupLayout(Int6.getContentPane());
        Int6.getContentPane().setLayout(Int6Layout);
        Int6Layout.setHorizontalGroup(
            Int6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 142, Short.MAX_VALUE)
            .addGroup(Int6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Int6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Int6Layout.createSequentialGroup()
                        .addComponent(lbl6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Txt5, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                    .addGroup(Int6Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(Boton8)))
                .addContainerGap())
        );
        Int6Layout.setVerticalGroup(
            Int6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 93, Short.MAX_VALUE)
            .addGroup(Int6Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(Int6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl6)
                    .addComponent(Txt5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Boton8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Int6.setBounds(400, 150, 150, 120);
        Escritorio.add(Int6, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Int3.setClosable(true);
        Int3.setIconifiable(true);
        Int3.setMaximizable(true);
        Int3.setTitle("Piscina");
        Int3.setVisible(true);

        lbl1.setText("Ingrese el nombre:");

        Boton4.setText("Reservar");
        Boton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Int3Layout = new javax.swing.GroupLayout(Int3.getContentPane());
        Int3.getContentPane().setLayout(Int3Layout);
        Int3Layout.setHorizontalGroup(
            Int3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Int3Layout.createSequentialGroup()
                .addGroup(Int3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Int3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbl1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Txt1, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                    .addGroup(Int3Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(Boton4)))
                .addContainerGap())
        );
        Int3Layout.setVerticalGroup(
            Int3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Int3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Int3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl1)
                    .addComponent(Txt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Boton4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Int3.setBounds(10, 150, 190, 120);
        Escritorio.add(Int3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jMenu1.setText("Menu");

        MenuItem1.setText("Crear Reservacion");
        MenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(MenuItem1);

        MenuItem2.setText("Reservar mesa");
        MenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(MenuItem2);

        MenuItem4.setText("Reservar Disco");
        MenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(MenuItem4);

        MenuItem3.setText("Reservar Piscina");
        MenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(MenuItem3);

        MenuItem5.setText("Reservar Bar");
        MenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(MenuItem5);

        MenuItem6.setText("Aplicar Promocion");
        MenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(MenuItem6);

        Menu.add(jMenu1);

        setJMenuBar(Menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(Escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 598, Short.MAX_VALUE).addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE))
        );

        pack();
    }
	
	private void MenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {
        Escritorio.add(Int1);
        Int1.show();
    }

    private void MenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {
       Escritorio.add(Int2);
       Int2.show();
    }

    private void MenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {
        Escritorio.add(Int3);
        Int3.show();
    }

    private void MenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {
       Escritorio.add(Int4);
       Int4.show();
    }

    private void MenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {
        Escritorio.add(Int5);
        Int5.show();
    }

    private void MenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {
        Escritorio.add(Int6);
        Int6.show();
    }

    private void Boton1ActionPerformed(java.awt.event.ActionEvent evt) {
    	
      Integer contador = 1;
  	  String Nombre = txt1.getText();
  	  String dias = txt2.getText();
  	  String entero = dias;
  	  Integer enteros = Integer.parseInt(entero);
  	  Integer precios;
  	  precios = 50*enteros;
  	  if(contador == 100){
  		  JOptionPane.showMessageDialog(null, "Ya no hay cupo de habitaciones simples");
  		  lc.Insertar(Nombre, enteros, precios, "simple", "Espera");
        	JOptionPane.showMessageDialog(null, "Se han agregado los clientes a la lista de espera. Gracias");
  	  }else{
        l.InsertarInicio(Nombre, enteros, precios, "simple", "ocupado");
        contador++;
        JOptionPane.showMessageDialog(null, "Se han insertado los datos correctamente. Gracias");
  	  }
    }

    private void Boton2ActionPerformed(java.awt.event.ActionEvent evt) {
    	
        Integer contador = 101;
  	  String Nombre = txt1.getText();
  	  String dias = txt2.getText();
  	  String entero = dias;
  	  Integer enteros = Integer.parseInt(entero);
  	  Integer precios;
  	  precios = 150*enteros;
  	  if(contador == 200){
  		  JOptionPane.showMessageDialog(null, "Ya no hay cupo de habitaciones deluxe");
  		  lc.Insertar(Nombre, enteros, precios, "deluxe", "Espera");
        	JOptionPane.showMessageDialog(null, "Se han agregado los clientes a la lista de espera. Gracias");
  	  }else{
        l.InsertarInicio(Nombre, enteros, precios, "deluxe", "ocupado");
        contador++;
        JOptionPane.showMessageDialog(null, "Se han insertado los datos correctamente. Gracias");
  	  }
    }

    private void Boton3ActionPerformed(java.awt.event.ActionEvent evt) {
    	
        Integer contador = 201;
  	  String Nombre = txt1.getText();
  	  String dias = txt2.getText();
  	  String entero = dias;
  	  Integer enteros = Integer.parseInt(entero);
  	  Integer precios;
  	  precios = 100*enteros;
  	  if(contador == 300){
  		  JOptionPane.showMessageDialog(null, "Ya no hay cupo de habitaciones regulares");
  		  lc.Insertar(Nombre, enteros, precios, "regulares", "Espera");
        	JOptionPane.showMessageDialog(null, "Se han agregado los clientes a la lista de espera. Gracias");
  	  }else{
        l.InsertarInicio(Nombre, enteros, precios, "regular", "ocupado");
        contador++;
        JOptionPane.showMessageDialog(null, "Se han insertado los datos correctamente. Gracias");
  	  }
    }

    private void Boton4ActionPerformed(java.awt.event.ActionEvent evt) {
        String Nombre = Txt1.getText();
        l.buscarPiscina(Nombre, 0);
    }

    private void Boton5ActionPerformed(java.awt.event.ActionEvent evt) {
    			
    		String Nombre = Txt2.getText();
    		l.buscarRestaurante(Nombre, 0);
	
    	
    }

    private void Boton6ActionPerformed(java.awt.event.ActionEvent evt) {
    		String Nombre = Txt3.getText();
    		l.buscarDiscoteca(Nombre, 0);
    }

    private void Boton7ActionPerformed(java.awt.event.ActionEvent evt) {
    	String Nombre = Txt4.getText();
    		l.buscarBar(Nombre, 0);
    }

    private void Boton8ActionPerformed(java.awt.event.ActionEvent evt) {
    		
    		String Nombre = Txt5.getText();
    		l.InsertarInicio(Nombre, 6, 130, "Regular", "Ocupado");
    }

    private void Boton9ActionPerformed(java.awt.event.ActionEvent evt) {
    	// Aqui va el codigo de salida
    }

  
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

   

   
}
