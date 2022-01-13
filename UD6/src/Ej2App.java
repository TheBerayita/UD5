import javax.swing.JOptionPane;

/* 

@author Albert Perez

*/
public class Ej2App {

	public static void main(String[] args) {
        peticiones();
    }
	public static void peticiones() {
		int rango = Integer.parseInt(JOptionPane.showInputDialog("Introduce el rango de números"));
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Numero mas pequeño"));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Numero mas grande"));
        rellenar(rango,num1,num2);
	}
	public static void rellenar(int rango,int num1,int num2) {
		for(int i = 0; i < rango; i++) {
			JOptionPane.showMessageDialog(null,generarNum(num1, num2));
        }
	}
    public static int generarNum(int num1, int num2){
        return ((int)Math.floor(Math.random()*(num2-num1) + num1));
    }
}

