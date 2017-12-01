package Interfaz;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import Controlador.ClienteHilo;
import Modelo.Comprobacion;

public class Servidor extends JFrame implements Runnable {

	private JPanel contentPane;
	private static JTextField txtJugador1;
	private static JTextField txtJugador2;
	Boolean turno = true;// se inicia con el turno jugador1 por default CIRCULO
	int btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
	private Socket cliente;
	Comprobacion ganador = new Comprobacion();

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Servidor frame = new Servidor();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Servidor() {

		setIconImage(Toolkit.getDefaultToolkit().getImage(Servidor.class.getResource("/Imagenes/TicTacToe.png")));
		setResizable(false);
		setTitle("  G A T O_Servidor");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(525, 200, 290, 345);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnCirculo = new JButton("");
		btnCirculo.setBackground(new Color(0, 0, 0));

		btnCirculo.setSelectedIcon(null);
		btnCirculo.setIcon(new ImageIcon(Servidor.class.getResource("/Imagenes/picmonkey_image (2).jpg")));
		btnCirculo.setBounds(10, 67, 41, 43);
		contentPane.add(btnCirculo);

		JButton btnX = new JButton("");
		btnX.setBackground(new Color(220, 20, 60));

		btnX.setIcon(new ImageIcon(Servidor.class.getResource("/Imagenes/picmonkey_image.jpg")));
		btnX.setBounds(185, 67, 41, 43);
		contentPane.add(btnX);

		JLabel lblTurno = new JLabel("Turno");
		lblTurno.setHorizontalAlignment(SwingConstants.CENTER);
		lblTurno.setForeground(new Color(0, 0, 0));
		lblTurno.setFont(new Font("SimHei", Font.BOLD, 25));
		lblTurno.setBounds(96, 11, 81, 30);
		contentPane.add(lblTurno);
		JButton boton7 = new JButton("");
		boton7.setBackground(new Color(245, 255, 250));
		boton7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (turno == true) {
					boton7.setIcon(new ImageIcon(Servidor.class.getResource("/Imagenes/picmonkey_image (2).jpg")));
					turno = false;
					btn7 = 1;

				} else {
					boton7.setIcon(new ImageIcon(Servidor.class.getResource("/Imagenes/picmonkey_image.jpg")));
					turno = true;
					btn7 = 2;

				}
				boton7.removeActionListener(boton7.getActionListeners()[0]);
				System.out.println(turno + "" + btn7);
				ganador.Comprobacion(btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9);
			}
		});
		boton7.setBounds(55, 258, 50, 50);
		contentPane.add(boton7);

		JButton boton1 = new JButton("");
		boton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(turno + "" + btn1);
				if (turno == true) {
					boton1.setIcon(new ImageIcon(Servidor.class.getResource("/Imagenes/picmonkey_image (2).jpg")));
					turno = false;
					btn1 = 1;
				} else {
					boton1.setIcon(new ImageIcon(Servidor.class.getResource("/Imagenes/picmonkey_image.jpg")));
					turno = true;
					btn1 = 2;
				}
				boton1.removeActionListener(boton1.getActionListeners()[0]);
				System.out.println(turno + "" + btn1);
				ganador.Comprobacion(btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9);
			}

		});
		boton1.setBackground(new Color(245, 255, 250));
		boton1.setForeground(new Color(0, 0, 0));

		boton1.setBounds(55, 136, 50, 50);
		contentPane.add(boton1);

		JButton boton4 = new JButton("");
		boton4.setBackground(new Color(245, 255, 250));
		boton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (turno == true) {
					boton4.setIcon(new ImageIcon(Servidor.class.getResource("/Imagenes/picmonkey_image (2).jpg")));
					turno = false;
					btn4 = 1;
				} else {
					boton4.setIcon(new ImageIcon(Servidor.class.getResource("/Imagenes/picmonkey_image.jpg")));
					turno = true;
					btn4 = 2;
				}
				boton4.removeActionListener(boton4.getActionListeners()[0]);
				System.out.println(turno + "" + btn4);
				ganador.Comprobacion(btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9);
			}
		});
		boton4.setBounds(55, 197, 50, 50);
		contentPane.add(boton4);

		JButton boton8 = new JButton("");
		boton8.setBackground(new Color(245, 255, 250));
		boton8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (turno == true) {
					boton8.setIcon(new ImageIcon(Servidor.class.getResource("/Imagenes/picmonkey_image (2).jpg")));
					turno = false;
					btn8 = 1;
				} else {
					boton8.setIcon(new ImageIcon(Servidor.class.getResource("/Imagenes/picmonkey_image.jpg")));
					turno = true;
					btn8 = 2;
				}
				boton8.removeActionListener(boton8.getActionListeners()[0]);
				ganador.Comprobacion(btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9);
			}
		});
		boton8.setBounds(121, 258, 50, 50);
		contentPane.add(boton8);

		JButton boton2 = new JButton("");
		boton2.setBackground(new Color(245, 255, 250));
		boton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// cambio de imagen

				if (turno == true) {
					boton2.setIcon(new ImageIcon(Servidor.class.getResource("/Imagenes/picmonkey_image (2).jpg")));
					turno = false;
					btn2 = 1;
				} else {
					boton2.setIcon(new ImageIcon(Servidor.class.getResource("/Imagenes/picmonkey_image.jpg")));
					turno = true;
					btn2 = 2;
				}
				boton2.removeActionListener(boton2.getActionListeners()[0]);
				ganador.Comprobacion(btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9);
			}
		});
		boton2.setBounds(121, 136, 50, 50);
		contentPane.add(boton2);

		JButton boton5 = new JButton("");
		boton5.setBackground(new Color(245, 255, 250));
		boton5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (turno == true) {
					boton5.setIcon(new ImageIcon(Servidor.class.getResource("/Imagenes/picmonkey_image (2).jpg")));
					turno = false;
					btn5 = 1;
				} else {
					boton5.setIcon(new ImageIcon(Servidor.class.getResource("/Imagenes/picmonkey_image.jpg")));
					turno = true;
					btn5 = 2;
				}
				boton5.removeActionListener(boton5.getActionListeners()[0]);
				ganador.Comprobacion(btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9);
			}
		});
		boton5.setBounds(121, 197, 50, 50);
		contentPane.add(boton5);

		JButton boton3 = new JButton("");
		boton3.setBackground(new Color(245, 255, 250));
		boton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (turno == true) {
					boton3.setIcon(new ImageIcon(Servidor.class.getResource("/Imagenes/picmonkey_image (2).jpg")));
					turno = false;
					btn3 = 1;
				} else {
					boton3.setIcon(new ImageIcon(Servidor.class.getResource("/Imagenes/picmonkey_image.jpg")));
					turno = true;
					btn3 = 2;
				}
				boton3.removeActionListener(boton3.getActionListeners()[0]);
				ganador.Comprobacion(btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9);
			}
		});
		boton3.setBounds(185, 136, 50, 50);
		contentPane.add(boton3);

		JButton boton6 = new JButton("");
		boton6.setBackground(new Color(245, 255, 250));
		boton6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (turno == true && btn6 == 0) {
					boton6.setIcon(new ImageIcon(Servidor.class.getResource("/Imagenes/picmonkey_image (2).jpg")));
					turno = false;
					btn6 = 1;
				} else {
					boton6.setIcon(new ImageIcon(Servidor.class.getResource("/Imagenes/picmonkey_image.jpg")));
					turno = true;
					btn6 = 2;
				}
				boton6.removeActionListener(boton6.getActionListeners()[0]);
				ganador.Comprobacion(btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9);

			}
		});
		boton6.setBounds(185, 197, 50, 50);
		contentPane.add(boton6);

		JButton boton9 = new JButton("");
		boton9.setBackground(new Color(245, 255, 250));
		boton9.setBounds(185, 258, 50, 50);
		contentPane.add(boton9);
		boton9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (turno == true && btn9 == 0) {
					boton9.setIcon(new ImageIcon(Servidor.class.getResource("/Imagenes/picmonkey_image (2).jpg")));
					turno = false;
					btn9 = 1;
				} else {
					boton9.setIcon(new ImageIcon(Servidor.class.getResource("/Imagenes/picmonkey_image.jpg")));
					turno = true;
					btn9 = 2;
				}
				boton9.removeActionListener(boton9.getActionListeners()[0]);
				ganador.Comprobacion(btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9);
				repaint();
			}
		});

		txtJugador1 = new JTextField();
		txtJugador1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

			}
		});
		txtJugador1.setFont(new Font("Verdana", Font.BOLD, 15));
		txtJugador1.setBounds(61, 67, 41, 43);
		contentPane.add(txtJugador1);
		txtJugador1.setColumns(10);

		txtJugador2 = new JTextField();
		txtJugador2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});

		txtJugador2.setFont(new Font("Verdana", Font.BOLD, 15));
		txtJugador2.setBounds(236, 67, 43, 43);
		contentPane.add(txtJugador2);
		txtJugador2.setColumns(10);

		JLabel lblJugador = new JLabel("Jugador 1");
		lblJugador.setBounds(10, 42, 71, 14);
		contentPane.add(lblJugador);

		JLabel lblJugador_1 = new JLabel("Jugador 2");
		lblJugador_1.setBounds(185, 42, 71, 14);
		contentPane.add(lblJugador_1);

		Thread t = new Thread(this);
		t.start();
	}

	@Override
	public void run() {
		try {

			ServerSocket servidor = new ServerSocket(8007);

			while (true) {
				;
				cliente = servidor.accept();
				ClienteHilo ch = new ClienteHilo(cliente, this);
				Thread t = new Thread(ch);
				t.start();
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
