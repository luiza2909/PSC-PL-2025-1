import javax.swing.JOptionPane;

public class ExemploIf {
    public static void main(String[] args) {
        
         int numero = Integer.parseInt(JOptionPane.showInputDialog("digite um número"));

         if (numero > 0) {

            JOptionPane.showMessageDialog(null, " o número " + numero + " é positivo" );
}else{

            JOptionPane.showMessageDialog(null, " o número " + numero + " é negativo ");

}
    }
}
