import javax.swing.JOptionPane;

/*
 * Autor Albert Perez 
 */
public class Ej1App {

	public static void main(String[] args) {

		SeleccionCalculo();

	}

	public static void SeleccionCalculo() {
		String dia = JOptionPane.showInputDialog("introduce que desea calcular (circulo / triangulo / cuadrado)");
		double resultado = 0;
		switch (dia) {
		case "circulo":
			resultado = CalcularCirculos();
			JOptionPane.showMessageDialog(null,resultado);

			break;

		case "triangulo":
			resultado = CalcularTriangulos();
			JOptionPane.showMessageDialog(null,resultado);

			break;

		case "cuadrado":
			resultado = CalcularCuadrados();
			JOptionPane.showMessageDialog(null,resultado);

			break;

		default:
			JOptionPane.showMessageDialog(null,"el calculo introducido no existe");
			break;
		}

	}

	public static double CalcularCirculos() {
		double radio, resultado;
		double pi = Math.PI;
		radio = Double.parseDouble(JOptionPane.showInputDialog("Introduce el radio"));

		resultado = pi * Math.pow(radio, 2);

		return resultado;
	}

	public static double CalcularTriangulos() {
		double base, altura, resultado;
		base = Double.parseDouble(JOptionPane.showInputDialog("Introduce la base"));
		altura = Double.parseDouble(JOptionPane.showInputDialog("Introduce la altura"));

		resultado = (base * altura) / 2;

		return resultado;
	}

	public static double CalcularCuadrados() {
		double lado, resultado;
		lado = Double.parseDouble(JOptionPane.showInputDialog("Introduce el lado"));

		resultado = lado * 2;

		return resultado;
	}

}
