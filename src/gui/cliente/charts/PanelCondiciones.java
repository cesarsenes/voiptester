/* 
Este fichero es parte de VoIPTester

    Copyright (C) 2009-2010 
    	      Antonio S�nchez Navarro (titosanxez@gmail.com)
	      Juan M. L�pez Soler (juanma@ugr.es)
	      Jorge Navarro Ortiz (jorgenavarro@ugr.es)
    

    Este programa es software libre: usted puede redistribuirlo y/o modificarlo 
    bajo los t�rminos de la Licencia P�blica General GNU publicada 
    por la Fundaci�n para el Software Libre, ya sea la versi�n 3 
    de la Licencia, o (a su elecci�n) cualquier versi�n posterior.

    Este programa se distribuye con la esperanza de que sea �til, pero 
    SIN GARANT�A ALGUNA; ni siquiera la garant�a impl�cita 
    MERCANTIL o de APTITUD PARA UN PROP�SITO DETERMINADO. 
    Consulte los detalles de la Licencia P�blica General GNU para obtener 
    una informaci�n m�s detallada. 

    Deber�a haber recibido una copia de la Licencia P�blica General GNU 
    junto a este programa. 
    En caso contrario, consulte <http://www.gnu.org/licenses/>.

*/


package gui.cliente.charts;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;

/**
 *
 * @author Antonio
 */
public class PanelCondiciones extends JPanel{

    JTextArea textAreaCondiciones;

    public PanelCondiciones() {

        super();
        super.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createTitledBorder("measurement conditions"),
                BorderFactory.createEmptyBorder(5, 5, 5, 5)));


        //textarea
        this.textAreaCondiciones = new JTextArea();
        this.textAreaCondiciones.setOpaque(false);
        this.textAreaCondiciones.setEditable(false);

        //layout de los componentes
        GridBagLayout layout = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        super.setLayout(layout);

        gbc.fill = GridBagConstraints.BOTH;
        super.add(this.textAreaCondiciones, gbc);


    }

}

