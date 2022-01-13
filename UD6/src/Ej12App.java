import javax.swing.JOptionPane;
/*
 * Autor Albert Perez
 */
public class Ej12App {

	public static void main(String[] args) {
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número"));
		String opcion = JOptionPane.showInputDialog("Introduce que numero desea ver");
		int array[] = new int[numero];
		rellenar(array);
		mostrar(array);
		sumar(array);
		mostraropcion(array, opcion);
	}

	public static void rellenar(int array[]) {
		for (int i = 0; i < array.length; i++) {
			int num1 = ((int) Math.floor(Math.random() * (300 - 1) + 1));
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
			resultado += array[i];
		}
		System.out.println("La suma es : " + resultado);
	}

	public static void mostraropcion(int array[], String opcion) {
		String num;
		for (int i = 0; i < array.length; i++) {
			num = Integer.toString(array[i]);
			if (num.contains(opcion)) {
				System.out.println("Esta es la eleccion " + array[i]);
			}

		}
	}
}