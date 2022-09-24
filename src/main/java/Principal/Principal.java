package Principal;

import Controlador.CtrlAdministrar;
import Controlador.CtrlFrame;
import Controlador.CtrlConsultasSQL;
import Modelo.Glosa501;
import Modelo.Glosa501Consultas;
import Vista.PanelPrincipal;
import Vista.PopUpAgregarConsultaSQL;
import Vista.PopUpEliminar;

public class Principal {
    
    public static void main(String[] args) {
        PanelPrincipal frmPrincipal = new PanelPrincipal();
        PopUpEliminar frmEliminar = new PopUpEliminar();
        PopUpAgregarConsultaSQL frmAgregarConsultaSQL = new PopUpAgregarConsultaSQL();
        Glosa501 modGlosa501 = new Glosa501();
        Glosa501Consultas modcGlosa501 = new Glosa501Consultas();
        
        CtrlConsultasSQL ctrlConsultasSQL = new CtrlConsultasSQL(frmPrincipal, frmAgregarConsultaSQL);
        CtrlFrame ctrlFrame = new CtrlFrame(frmPrincipal, frmEliminar, frmAgregarConsultaSQL);
        CtrlAdministrar ctrlAdministrar = new CtrlAdministrar(frmPrincipal, modGlosa501, modcGlosa501);
        
        ctrlFrame.run();
        frmPrincipal.setVisible(true);
    }
    
}
