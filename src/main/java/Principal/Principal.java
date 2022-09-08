package Principal;

import Controlador.CtrlFrame;
import Controlador.CtrlConsultasSQL;
import Vista.PanelPrincipal;
import Vista.PopUpAgregarConsultaSQL;
import Vista.PopUpEliminar;

public class Principal {
    
    public static void main(String[] args) {
        PanelPrincipal frmPrincipal = new PanelPrincipal();
        PopUpEliminar frmEliminar = new PopUpEliminar();
        PopUpAgregarConsultaSQL frmAgregarConsultaSQL = new PopUpAgregarConsultaSQL();
        CtrlConsultasSQL ctrlConsultasSQL = new CtrlConsultasSQL(frmPrincipal, frmAgregarConsultaSQL);
        CtrlFrame ctrlFrame = new CtrlFrame(frmPrincipal, frmEliminar, frmAgregarConsultaSQL);
        
        ctrlFrame.run();
        frmPrincipal.setVisible(true);
    }
    
}
