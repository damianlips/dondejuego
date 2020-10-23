package app;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.FontUIResource;

import gestores.GestorAutenticacion;
import gui.Gui;
import gui.LugarRealizacionTM;
import gui.PanelAltaCompetencia;
import gui.PanelPersonalizado;


public class App extends JFrame {

	private static final long serialVersionUID = 1L;

	JPanel contenido;
	JButton boton_home;
	JButton boton_volver;
	JPanel actual = null;
	List<JPanel> listaPaneles = new ArrayList<JPanel>();


	private App() {
		this.setTitle("¿Dónde juego?");
		Gui.setearFuente("Comic Sans MS",this);

		{
			contenido = new JPanel(new GridBagLayout());
			contenido.setBackground(Color.WHITE);
			contenido.setBorder(new EmptyBorder(20, 20, 20, 20));
			this.setContentPane(contenido);
		}


		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		//	this.setPreferredSize(new Dimension(800,600));
		this.setMinimumSize(new Dimension(1280,1024));
		//this.setSize(800,600);
		this.setLocationRelativeTo(null);



		//https://stackoverflow.com/questions/2781939/setting-minimum-size-limit-for-a-window-in-java-swing
		this.addComponentListener(new ComponentAdapter(){
			public void componentResized(ComponentEvent e){
				Dimension d=getSize();
				Dimension minD=getMinimumSize();
				if(d.width<minD.width)
					d.width=minD.width;
				if(d.height<minD.height)
					d.height=minD.height;
				setSize(d);
			}
		});


		this.actual = new JPanel();
		PanelAltaCompetencia altaCompetencia = new PanelAltaCompetencia(); 
		this.cambiarPanel(altaCompetencia);


	}



	public void cambiarPanel(PanelPersonalizado p) {
		Dimension d = this.getSize();
		this.remove(actual);
		this.actual = p;
		//this.setContentPane(panel);
		this.add(this.actual);
		this.pack();
		this.revalidate();
		this.repaint();
		this.setSize(d);

	}






	public static void main (String[] args){
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				try {
					//UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");			    
					//UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");			    
					UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");

				}
				catch (Exception e) {
					if(Gui.DEBUG) System.out.println(e.getMessage());
				}

				new App().setVisible(true);

				SwingWorker<Void, Void> trabajador = new SwingWorker<Void, Void>(){
					@Override
					protected Void doInBackground() throws Exception {
						GestorAutenticacion ga = new GestorAutenticacion();
						ga.login("dieguitomaradona@gmail.com", "12345");
						return null;
					}
				};
				trabajador.execute();

			}
		});

	}
}
