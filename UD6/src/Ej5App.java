import javax.swing.JOptionPane;

/* 

@author Albert Perez

*/
public class Ej5App {
    public static void main(String[] args) {
        String texto=JOptionPane.showInputDialog("Introduce un numero");
        int numero=Integer.parseInt(texto);
        String binario=decimalBinario(numero);
        System.out.println("El numero "+numero+ " en binario es "+binario);
    }
   public static String decimalBinario (int numero){
        String binario="";
        String digito;
        for(int i=numero;i>0;i/=2){
            if(i%2==1){
                digito="1";
            }else{
                digito="0";
            }
            //Se añade el digito al principio (mira la imagen del post)
            binario=digito+binario;
        }
        return binario;
    }
}
