package Controlador;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import Interfaz.Servidor;
import Modelo.Comprobacion;

public class ClienteHilo implements Runnable {

	private Socket cliente;
	private Servidor servidor;
	private ObjectInputStream input;
	
	Comprobacion ganador = new Comprobacion();
	
	public ClienteHilo(Socket cliente, Servidor servidor) {
		this.cliente=cliente;
		this.servidor=servidor;	
	}
	@Override
	public void run() {
		
		while(true){
			try {
				input=new ObjectInputStream(cliente.getInputStream());
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}