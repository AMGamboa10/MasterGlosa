package Controlador;

import Vista.PanelPrincipal;
import Vista.PopUpEliminar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class CtrlFrame implements MouseListener, ActionListener {

    private PanelPrincipal frmPrincipal;
    private PopUpEliminar frmEliminar;

    public CtrlFrame(PanelPrincipal frmPrincipal, PopUpEliminar frmEliminar) {
        this.frmPrincipal = frmPrincipal;
        this.frmEliminar = frmEliminar;
        this.frmPrincipal.btnVistaAdministrar.addMouseListener(this);
        this.frmPrincipal.btnVistaConsulta.addMouseListener(this);
        this.frmPrincipal.btnVistaConsultaSQL.addMouseListener(this);
        this.frmPrincipal.btnVistaDashboard.addMouseListener(this);
        this.frmPrincipal.btnSalir.addMouseListener(this);
        this.frmPrincipal.btnEliminarAdministrarGlosa.addActionListener(this);
        this.frmEliminar.btnCancelarpopEliminar.addActionListener(this);
        
    }
    
    public void run(){
        frmPrincipal.setResizable(false);
        frmPrincipal.setTitle("Reportador Data Stage");
        frmPrincipal.setLocationRelativeTo(null);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent ev) {
        if (ev.getSource() == frmPrincipal.btnEliminarAdministrarGlosa) {
            frmEliminar.setVisible(true);
            frmEliminar.setLocationRelativeTo(null);
            frmEliminar.setResizable(false);
            frmEliminar.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
            frmPrincipal.setEnabled(false);
        }
        if (ev.getSource() == frmEliminar.btnCancelarpopEliminar) {
            frmEliminar.setVisible(false);
            frmPrincipal.setEnabled(true);
            frmPrincipal.setVisible(true);
        }
    }
    
    @Override
    public void mouseClicked(MouseEvent ev) {
        
        if (ev.getSource() == frmPrincipal.btnVistaAdministrar) {
            //Al seleccionar resltamos con otro color el boton y hacemos visible el panel
            frmPrincipal.pnlAdministrar.setVisible(true);
            frmPrincipal.btnVistaAdministrar.setBackground(new java.awt.Color(80, 131, 182));
            
            //Y el resto de botones lo regresamos a color normal y ocultamos los paneles
            frmPrincipal.pnlConsulta.setVisible(false);
            frmPrincipal.btnVistaConsulta.setBackground(new java.awt.Color(0, 78, 151));
            frmPrincipal.pnlConsultaSQL.setVisible(false);
            frmPrincipal.btnVistaConsultaSQL.setBackground(new java.awt.Color(0, 78, 151));
            frmPrincipal.pnlDashBoard.setVisible(false);
            frmPrincipal.btnVistaDashboard.setBackground(new java.awt.Color(0, 78, 151));
        }
        
        if (ev.getSource() == frmPrincipal.btnVistaConsulta) {
            //Al seleccionar resltamos con otro color el boton y hacemos visible el panel
            frmPrincipal.pnlConsulta.setVisible(true);
            frmPrincipal.btnVistaConsulta.setBackground(new java.awt.Color(80, 131, 182));
            
            //Y el resto de botones lo regresamos a color normal y ocultamos los paneles
            frmPrincipal.pnlAdministrar.setVisible(false);
            frmPrincipal.btnVistaAdministrar.setBackground(new java.awt.Color(0, 78, 151));
            frmPrincipal.pnlConsultaSQL.setVisible(false);
            frmPrincipal.btnVistaConsultaSQL.setBackground(new java.awt.Color(0, 78, 151));
            frmPrincipal.pnlDashBoard.setVisible(false);
            frmPrincipal.btnVistaDashboard.setBackground(new java.awt.Color(0, 78, 151));
            
        }
        if (ev.getSource() == frmPrincipal.btnVistaConsultaSQL) {
            //Al seleccionar resltamos con otro color el boton y hacemos visible el panel
            frmPrincipal.pnlConsultaSQL.setVisible(true);
            frmPrincipal.btnVistaConsultaSQL.setBackground(new java.awt.Color(80, 131, 182));
            
            //Y el resto de botones lo regresamos a color normal y ocultamos los paneles
            frmPrincipal.pnlConsulta.setVisible(false);
            frmPrincipal.btnVistaConsulta.setBackground(new java.awt.Color(0, 78, 151));
            frmPrincipal.pnlAdministrar.setVisible(false);
            frmPrincipal.btnVistaAdministrar.setBackground(new java.awt.Color(0, 78, 151));
            frmPrincipal.pnlDashBoard.setVisible(false);
            frmPrincipal.btnVistaDashboard.setBackground(new java.awt.Color(0, 78, 151));
        }
        if (ev.getSource() == frmPrincipal.btnVistaDashboard) {
            //Al seleccionar resltamos con otro color el boton y hacemos visible el panel
            frmPrincipal.pnlDashBoard.setVisible(true);
            frmPrincipal.btnVistaDashboard.setBackground(new java.awt.Color(80, 131, 182));
            
            //Y el resto de botones lo regresamos a color normal y ocultamos los paneles
            frmPrincipal.pnlConsulta.setVisible(false);
            frmPrincipal.btnVistaConsulta.setBackground(new java.awt.Color(0, 78, 151));
            frmPrincipal.pnlAdministrar.setVisible(false);
            frmPrincipal.btnVistaAdministrar.setBackground(new java.awt.Color(0, 78, 151));
            frmPrincipal.pnlConsultaSQL.setVisible(false);
            frmPrincipal.btnVistaConsultaSQL.setBackground(new java.awt.Color(0, 78, 151));
        }
        if (ev.getSource() == frmPrincipal.btnSalir) {
            System.exit(0);
        }
    }

    @Override
    public void mousePressed(MouseEvent arg0) {
        
    }

    @Override
    public void mouseReleased(MouseEvent arg0) {
        
    }

    @Override
    public void mouseEntered(MouseEvent arg0) {
        
    }

    @Override
    public void mouseExited(MouseEvent arg0) {
        
    }    
    
}
