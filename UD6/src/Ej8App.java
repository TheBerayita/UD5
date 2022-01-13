import javax.swing.JOptionPane;
/*
 * Autor Albert Perez
 */
public class Ej8App {
	public static void main(String[] args) {
		int num[]=new int[10];
		llenar(num);
		mostrar(num);
	}
	public static void llenar(int num[]) {
		for (int i = 0; i < num.length-1; i++) {
			int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número"));
			num[i] = numero;
		}
	}

	public static void mostrar(int num[]) {
		for (int i = 0; i < num.length-1; i++) {
			System.out.println(num[i]);
		}
	}
}
