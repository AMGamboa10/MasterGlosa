package Principal;

import Controlador.CtrlFrame;
import Vista.PanelPrincipal;
import Vista.PopUpEliminar;

public class Principal {
    
    public static void main(String[] args) {
        PanelPrincipal frmPrincipal = new PanelPrincipal();
        PopUpEliminar frmEliminar = new PopUpEliminar();
        
        CtrlFrame ctrlFrame = new CtrlFrame(frmPrincipal, frmEliminar);
        
        ctrlFrame.run();
        frmPrincipal.setVisible(true);
    }
    
}
