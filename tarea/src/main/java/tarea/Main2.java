package tarea;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;

public class Main2 {
public static void main(String[] args) {

    JFrame ventanaPrincipal = new JFrame("Aplicación");
    // Establecemos el layout del JFrame
ventanaPrincipal.setLayout(new BorderLayout());

// Añadimos los paneles en cada posición del BorderLayout

// Añadir panel amarillo en la posición superior (NORTH)
      ventanaPrincipal.add(new MiPanel(Color.yellow), BorderLayout.NORTH);

	// Añadir panel rojo en la posición inferior (SOUTH)
    	ventanaPrincipal.add(new MiPanel(Color.red), BorderLayout.SOUTH);

// Añadir panel gris en la posición central (CENTER)
    	ventanaPrincipal.add(new MiPanel(Color.gray), BorderLayout.CENTER);

// Añadir panel verde en la posición izquierda (WEST)
    	ventanaPrincipal.add(new MiPanel(Color.green), BorderLayout.WEST);

// Añadir panel cián en la posición derecha (EAST)
    	ventanaPrincipal.add(new MiPanel(Color.cyan), BorderLayout.EAST);
}
}
