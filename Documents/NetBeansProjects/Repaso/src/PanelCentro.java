import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class PanelCentro extends JPanel {
	static GridBagConstraints contenido;

	  public PanelCentro() {
		  
			Border borde = BorderFactory.createTitledBorder( " " );
            
            setBorder(BorderFactory.createMatteBorder(5, 5, 5, 5, Color.ORANGE));
			setLayout(new GridBagLayout());
			contenido = new GridBagConstraints();
		  
			JLabel etiqueta = new JLabel(" BIENVENIDO A CAJERO UDEC ");
			etiqueta.setForeground(Color.BLACK);
			etiqueta.setFont(new java.awt.Font("Tahoma", 1, 19));
			contenido.fill = GridBagConstraints.HORIZONTAL;
			contenido.weightx = 0.03;
			contenido.weighty = 0.03;
			contenido.gridx = 1;
			contenido.gridy = 0;
			add(etiqueta, contenido);
			
			ImageIcon imagen = new ImageIcon( "images/tarjeta.png");		
			JLabel foto = new JLabel(imagen);
			contenido.fill = GridBagConstraints.HORIZONTAL;
			contenido.weightx = 0.03;
			contenido.weighty = 0.03;
			contenido.gridx = 0;
			contenido.gridy = 0;
			add(foto, contenido);
			
			JLabel etiqueta45 = new JLabel(" INSERTE SU TARJETA ");
			etiqueta45.setForeground(Color.BLACK);
			etiqueta45.setFont(new java.awt.Font("Tahoma", 1, 11));
			contenido.fill = GridBagConstraints.HORIZONTAL;
			contenido.weightx = 0.03;
			contenido.weighty = 0.03;
			contenido.gridx = 1;
			contenido.gridy = 1;
			add(etiqueta45, contenido);
			
			
			
		

		
	  }
}
		