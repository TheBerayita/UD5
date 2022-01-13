import javax.swing.JOptionPane;
/* 

@author Albert Perez

*/
public class Ej3App {

	public static void main(String[] args) {
		peticiones();
	}

	public static void peticiones() {
		int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce numero"));
		if (primo(num)) {
			JOptionPane.showMessageDialog(null, "Es primo");
		} else {
			JOptionPane.showMessageDialog(null, "No es primo");
		}
	}

	public static boolean primo(int numero) {
		int contador = 2;
		boolean primobol = true;
		if (numero <= 1) {
			while ((primobol) && (contador != numero)) {
				if (numero % contador == 0)
					primobol = false;
				contador++;
			}
		} else {
			return false;
		}
		return primobol;
	}

}
