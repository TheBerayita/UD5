import javax.swing.JOptionPane;

/* 

@author Albert Perez

*/
public class Ej6App {

	public static void main(String[] args) {
		String numero = JOptionPane.showInputDialog("Introduce el n�mero");
		int num = Integer.parseInt(numero);
		if (num > 0) {
			JOptionPane.showMessageDialog(null, numero.length());
		} else {
			JOptionPane.showMessageDialog(null, "Introduce numero positvo");
		}
	}

}
