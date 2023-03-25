package dialogodeinstalacion;

import javax.swing.JOptionPane;

/**
 *
 * @author GarciaJorgeJesus
 *
 * JOptionPane Este programa ilustra el cuadro de diálogo del objeto
 * JOptionPane.
 *
 */
public class DialogoDeInstalacion {
    
    public void mensaje (){
       JOptionPane.showMessageDialog(null, "Antes de comenzar la instalación, " + "cierre todas las aplicaciones.");
    }

    public static void main(String[] args) {
DialogoDeInstalacion imprimir = new DialogoDeInstalacion ();
    imprimir.mensaje();
  }   
}
