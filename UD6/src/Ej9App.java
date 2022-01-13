import javax.swing.JOptionPane;
/*
 * Autor Albert Perez
 */
public class Ej9App {

	public static void main(String[] args) {
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número"));
		int array[] = new int[numero];
		rellenar(array);
		mostrar(array);
		sumar(array);
	}

	public static void rellenar(int array[]) {
		for (int i = 0; i < array.length; i++) {
			int num1 = ((int) Math.floor(Math.random() * (10 - 0) + 0));
			array[i] = num1;
		}
	}

	public static void mostrar(int array[]) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
	public static void sumar(int array[]) {
		int resultado = 0;
		for (int i = 0; i < array.length; i++) {
			resultado +=array[i];
		}
		System.out.println("La suma es : "+resultado);
	}
}
