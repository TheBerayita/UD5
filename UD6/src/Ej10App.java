import java.util.Random;

import javax.swing.JOptionPane;
/*
 * Autor Albert Perez
 */

public class Ej10App {

	public static void main(String[] args) {
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("tamaño de array"));
		int array[] = new int[n1];
		RellenarArray(array);
		MostrarArray(array);
		SumarArray(array);
	}

	public static void RellenarArray(int array[]) {
		int max = Integer.parseInt(JOptionPane.showInputDialog("rango maximo"));
		Random claseRandom = new Random();
		for (int i = 0; i < array.length; i++) {
			int n1 = claseRandom.nextInt(max);
			if (Primo(n1) == true) {
				array[i] = n1;
			} else {
				i--;
			}
		}
	}

	public static boolean Primo(int n1) {
		int contador = 2;
		boolean resultado = true;
		while ((resultado) && (contador != n1)) {
			if (n1 % contador == 0)
				resultado = false;
			contador++;
		}
		return resultado;
	}

	public static void MostrarArray(int array[]) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

	public static void SumarArray(int array[]) {
		int resultado = 0;
		for (int i = 0; i < array.length; i++) {
			resultado = resultado + array[i];
		}
		System.out.println(resultado);
	}

}
