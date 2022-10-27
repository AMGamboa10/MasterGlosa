package Controlador;

import Vista.PanelPrincipal;
import Vista.PopUpAgregarConsultaSQL;
import Vista.PopUpEliminar;
import Vista.PopUpInsertarGlosaComprimido;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.time.LocalDate;

public class CtrlFrame implements MouseListener, ActionListener {

    private PanelPrincipal frmPrincipal;
    private PopUpEliminar frmEliminar;
    private PopUpAgregarConsultaSQL frmAgregarConsultaSQL;
    private PopUpInsertarGlosaComprimido frmPopUpInsertarGlosaComprimido ;

    public CtrlFrame(PanelPrincipal frmPrincipal, PopUpEliminar frmEliminar, PopUpAgregarConsultaSQL frmAgregarConsultaSQL, PopUpInsertarGlosaComprimido frmPopUpInsertarGlosaComprimido) {
        this.frmPrincipal = frmPrincipal;
        this.frmEliminar = frmEliminar;
        this.frmAgregarConsultaSQL = frmAgregarConsultaSQL;
        this.frmPopUpInsertarGlosaComprimido = frmPopUpInsertarGlosaComprimido;
        this.frmPrincipal.btnVistaAdministrar.addMouseListener(this);
        this.frmPrincipal.btnVistaConsulta.addMouseListener(this);
        this.frmPrincipal.btnVistaConsultaSQL.addMouseListener(this);
        this.frmPrincipal.btnVistaDashboard.addMouseListener(this);
        this.frmPrincipal.btnSalir.addMouseListener(this);
        this.frmPrincipal.btnEliminarAdministrarGlosa.addActionListener(this);
        this.frmEliminar.btnCancelarpopEliminar.addActionListener(this);

    }

    public void listarAño() {
        LocalDate current_date = LocalDate.now();
        //getting the current year from the current_date
        int current_Year = current_date.getYear();
        int año = 2010;
        frmPopUpInsertarGlosaComprimido.cmbAñopopInsertarGlosa.removeAllItems();
        frmPopUpInsertarGlosaComprimido.cmbAñopopInsertarGlosa.addItem("Seleccionar");
        
        while (año != (current_Year + 1)) {
            frmPopUpInsertarGlosaComprimido.cmbAñopopInsertarGlosa.addItem(String.valueOf(año));
            año ++;
        }
    }
    
    public void listaMes(){
        LocalDate current_date = LocalDate.now();
        //getting the current year from the current_date
        int current_month_number = current_date.getMonthValue();
        String current_month = current_date.getMonth().toString();
        
        frmPopUpInsertarGlosaComprimido.cmbMespopInsertarGlosa.removeAllItems();
        frmPopUpInsertarGlosaComprimido.cmbMespopInsertarGlosa.addItem("Seleccionar");
        
    }

    public void run() {
        frmPrincipal.setResizable(false);
        frmPrincipal.setTitle("Reportador Data Stage");
        frmPrincipal.setLocationRelativeTo(null);
        frmAgregarConsultaSQL.txtDescripcionpopAgregarConsultaSQL.setLineWrap(true);
        frmAgregarConsultaSQL.txtQuerypopAgregarConsultaSQL.setLineWrap(true);
        frmPrincipal.txtQueryConsultaSQL.setLineWrap(true);
        frmPrincipal.txtQueryConsultaSQL.setEnabled(false);
        frmPrincipal.txtQueryConsultaSQL.setBackground(Color.lightGray);
        listarAño();
        
        //Image im = Toolkit.getDefaultToolkit().createImage("/icons/cursorProhibido.png");
        //Cursor cur = Toolkit.getDefaultToolkit().createCustomCursor(im, new Point(23,23), "Prohibido");
        //frmPrincipal.txtQueryConsultaSQL.setCursor(cur);
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
            frmEliminar.cmbAñopopEliminar.setSelectedItem("Seleccionar");
            frmEliminar.cmbEliminarTipopopEliminar.setSelectedItem("Seleccionar");
            frmEliminar.cmbGlosapopEliminar.setSelectedItem("Seleccionar");
            frmEliminar.cmbMespopEliminar.setSelectedItem("Seleccionar");
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
