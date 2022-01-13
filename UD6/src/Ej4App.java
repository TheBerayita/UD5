import javax.swing.JOptionPane;
/* 

@author Albert Perez

*/
public class Ej4App {

	public static void main(String[] args) {
		int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número"));
		JOptionPane.showMessageDialog(null,factorial(num));
	}

	public static int factorial(int numero) {
		int fact = 1;
		for (int i = 1; i <= numero; i++) {
			fact *= i;
		}
		return fact;

	}
}
