import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Aplicacion {

	public static final String PATH = "C:\\Users\\Profesor\\Documents\\Proyectos Java\\Bingo3Cartones\\src\\";
	// Frame que alberga la aplicación
	static JFrame jFM = new JFrame("Cuadro texto");
	// Panel asociado al Frame donde coloco los elementos.
	static JPanel jpanel = (JPanel) jFM.getContentPane();

	public static void main(String[] args) {

		lanzarVentana();

		CartonVDA carton1 = new CartonVDA();
		carton1.mostrarBolasCartonVDA(jpanel);
		CartonVDA carton2 = new CartonVDA();
		carton2.mostrarBolasCartonVDA(jpanel);
		CartonVDA carton3 = new CartonVDA();
		carton3.mostrarBolasCartonVDA(jpanel);

		/*
		 * for (int i=0;i<carton1.BOLASTOTALES;i++) { carton1.mostrarBolaCarton(i); }
		 */
	}

	static void lanzarVentana() {
		// Creo la ventana principal
		jFM.setSize(842, 700);
		// Configuro panel. Disposición nula, control total
		jpanel.setLayout(null);
		jpanel.setBackground(Color.cyan);

		jFM.setVisible(true);
	}

}
