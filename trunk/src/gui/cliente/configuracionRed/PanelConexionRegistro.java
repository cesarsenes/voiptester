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


package gui.cliente.configuracionRed;

import javax.swing.JPanel;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Color;

import gui.selectorDirSocket.CampoIP;
import gui.GuiManager;
import gui.cliente.Estado;

/**
 *
 * @author Antonio
 */
public class PanelConexionRegistro extends JPanel{

    //componentes GUI
    public final CampoIP campoIP = new CampoIP();
    public final BotonConectar botonConectar = new BotonConectar("registro");

    //elementos no gráficos
    //Estado

    public PanelConexionRegistro() {

        super();
        super.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createTitledBorder("Register server connection"),
                BorderFactory.createEmptyBorder(5, 5, 5, 5)));

        //JPanel panelDireccionesRed = new JPanel();
        this.campoIP.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createTitledBorder("Server network address"),
                BorderFactory.createEmptyBorder(5, 5, 5, 5)));


        //posicionamiento de los campos
        GridBagLayout layout = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        super.setLayout(layout);
        
        gbc.gridy = 0;
        gbc.insets.top = 20;
        gbc.insets.left = 20;
        gbc.insets.right = 20;
        super.add(this.campoIP, gbc);

        this.botonConectar.setEstadoConexion(false);
        gbc.gridy++;
        gbc.insets.bottom = 20;
        super.add(this.botonConectar, gbc);
    }


     public void setEnabled(boolean enabled) {

        super.setEnabled(enabled);
        GuiManager.setEnabled(this, enabled);
    }

}
