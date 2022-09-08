package Controlador;

import Vista.PanelPrincipal;
import Vista.PopUpAgregarConsultaSQL;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CtrlConsultasSQL implements ActionListener {

    private PanelPrincipal frmPrincipal;
    private PopUpAgregarConsultaSQL frmAgregarConsultaSQL;

    public CtrlConsultasSQL(PanelPrincipal frmPrincipal, PopUpAgregarConsultaSQL frmAgregarConsultaSQL) {
        this.frmPrincipal = frmPrincipal;
        this.frmAgregarConsultaSQL = frmAgregarConsultaSQL;
        this.frmPrincipal.btnAgregarNuevaConsultaSQL.addActionListener(this);
        this.frmAgregarConsultaSQL.btnCancelarpopAgregarConsultaSQL.addActionListener(this);
        this.frmPrincipal.btnModificarConsultaSQL.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent ev) {
        if (ev.getSource() == frmPrincipal.btnAgregarNuevaConsultaSQL) {
            
            frmAgregarConsultaSQL.setVisible(true);
            frmAgregarConsultaSQL.setLocationRelativeTo(null);
            frmAgregarConsultaSQL.setResizable(false);
            frmAgregarConsultaSQL.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
            frmPrincipal.setEnabled(false);
            
        }
        if (ev.getSource() == frmAgregarConsultaSQL.btnCancelarpopAgregarConsultaSQL) {
            frmAgregarConsultaSQL.setVisible(false);
            frmPrincipal.setEnabled(true);
            frmPrincipal.setVisible(true);
        }
        if (ev.getSource() == frmPrincipal.btnModificarConsultaSQL) {
            if (frmPrincipal.btnModificarConsultaSQL.getToolTipText().equals("Editar")) {
                frmPrincipal.btnModificarConsultaSQL.setToolTipText("Cancelar");
                frmPrincipal.btnModificarConsultaSQL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/noEditar.png")));
                frmPrincipal.txtQueryConsultaSQL.setEnabled(true);
                
            }else{
                frmPrincipal.btnModificarConsultaSQL.setToolTipText("Editar");
                frmPrincipal.btnModificarConsultaSQL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/noEditar.png")));
                frmPrincipal.txtQueryConsultaSQL.setEnabled(true);
            }
        }
    }

}
