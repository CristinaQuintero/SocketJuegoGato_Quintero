package Modelo;
import javax.swing.JOptionPane;

public class Comprobacion {
	public void Comprobacion(int btn1,int btn2,int btn3,int btn4,int btn5,int btn6,int btn7,int btn8,int btn9) {
		if ((btn1 == 1 && btn2 == 1 && btn3 == 1) || (btn4 == 1 && btn5 == 1 && btn6 == 1)
				|| (btn7 == 1 && btn8 == 1 && btn9 == 1)) {
			
			System.out.println("JUGADOR[1]-NEGRO");
			JOptionPane.showMessageDialog(null, "JUGADOR 1", "GANADOR",JOptionPane.INFORMATION_MESSAGE);
		} else if ((btn1 == 1 && btn4 == 1 && btn7 == 1) || (btn2 == 1 && btn5 == 1 && btn8 == 1)
				|| (btn3 == 1 && btn6 == 1 && btn9 == 1)) {
		
			System.out.println("JUGADOR[1]-NEGRO");
			JOptionPane.showMessageDialog(null, "JUGADOR 1", "GANADOR",JOptionPane.INFORMATION_MESSAGE);
		} else if ((btn1 == 1 && btn5 == 1 && btn9 == 1) || (btn3 == 1 && btn5 == 1 && btn7 == 1)) {
			
			System.out.println("JUGADOR[1]-NEGRO");
			JOptionPane.showMessageDialog(null, "JUGADOR 1", "GANADOR",JOptionPane.INFORMATION_MESSAGE);
		} else if ((btn1 == 2 && btn2 == 2 && btn3 == 2) || (btn4 == 2 && btn5 == 2 && btn6 == 2)
				|| (btn7 == 2 && btn8 == 2 && btn9 == 2)) {
			
			System.out.println("JUGADOR[2]-ROJO");
			JOptionPane.showMessageDialog(null, "JUGADOR 2", "GANADOR",JOptionPane.INFORMATION_MESSAGE);
		} else if ((btn1 == 2 && btn4 == 2 && btn7 == 2) || (btn2 == 2 && btn5 == 2 && btn8 == 2)
				|| (btn3 == 2 && btn6 == 2 && btn9 == 2)) {
			
			System.out.println("JUGADOR[2]-ROJO");
			JOptionPane.showMessageDialog(null, "JUGADOR 2", "GANADOR",JOptionPane.INFORMATION_MESSAGE);
			
		} else if ((btn1 == 2 && btn5 == 2 && btn9 == 2) || (btn3 == 2 && btn5 == 2 && btn7 == 2)) {
			
			System.out.println("JUGADOR[2]-ROJO");
			JOptionPane.showMessageDialog(null, "JUGADOR 2", "GANADOR",JOptionPane.INFORMATION_MESSAGE);
		}
		
	}

}//fin de la clase comprobacion
