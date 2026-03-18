import javax.swing.JFrame;

import tarea.PanelSaludo;

public class Main3 {
public static void main(String[] args) {
    	// Construimos la ventana
    	JFrame frame = new JFrame("App");
	// La ventana no se puede redimensionar
	frame.setResizable(false);
	// Posición de la ventana
    	frame.setLocationRelativeTo(null);
	// Incluimos el panel en la ventana
    	frame.add(new PanelSaludo());
       // Ajusta el frame al contenido
       frame.pack();
	// Hacemos visible la ventana
    	frame.setVisible(true);
	//Acción por defecto al pulsar el botón de cierre de la ventana
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
    
}
