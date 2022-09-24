package Controlador;

import Modelo.Glosa501;
import Modelo.Glosa501Consultas;
import Vista.PanelPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class CtrlAdministrar implements ActionListener {

    private PanelPrincipal frmPrincipal;
    private Glosa501 modGlosa501;
    private Glosa501Consultas modcGlosa501;

    public CtrlAdministrar(PanelPrincipal frmPrincipal, Glosa501 modGlosa501, Glosa501Consultas modcGlosa501) {
        this.frmPrincipal = frmPrincipal;
        this.modGlosa501 = modGlosa501;
        this.modcGlosa501 = modcGlosa501;
        this.frmPrincipal.btnBuscarAdministrarGlosa.addActionListener(this);
    }
    
    public void buscarGlosa(){
        long dateInicial = frmPrincipal.datechFechaInicialAdministrarGlosa.getDate().getTime();
        long dateFinal = frmPrincipal.datechFechaFinalAdministrarGlosa.getDate().getTime();
        java.sql.Date fechaInicial = new java.sql.Date(dateInicial);
        java.sql.Date fechaFinal = new java.sql.Date(dateFinal);
        modGlosa501.setFechaInicio(fechaInicial);
        modGlosa501.setFechaFinal(fechaFinal);
        String glosa = frmPrincipal.cmbGlosaAdministrarGlosa.getSelectedItem().toString();
        
        switch(glosa){
            case "Glosa501":
                ArrayList<Glosa501> lista501 = modcGlosa501.buscar(modGlosa501);
                String matris[][] = new String[lista501.size()][32];
                
                for (int i = 0; i < lista501.size(); i++) {
                    matris[i][0] = String.valueOf(lista501.get(i).getId());
                    matris[i][1] = lista501.get(i).getPatente();
                    matris[i][2] = lista501.get(i).getPedimento();
                    matris[i][3] = lista501.get(i).getSeccionAduanera();
                    matris[i][4] = lista501.get(i).getTipoOperacion();
                    matris[i][5] = lista501.get(i).getClaveDocumento();
                    matris[i][6] = lista501.get(i).getSeccionAduaneraEntrada();
                    matris[i][7] = lista501.get(i).getCurpContribuyente();
                    matris[i][8] = lista501.get(i).getRfc();
                    matris[i][9] = lista501.get(i).getCurpAgenteA();
                    matris[i][10] = String.valueOf(lista501.get(i).getTipoCambio());
                    matris[i][11] = String.valueOf(lista501.get(i).getTotalFletes());
                    matris[i][12] = String.valueOf(lista501.get(i).getTotalSeguros());
                    matris[i][13] = String.valueOf(lista501.get(i).getTotalEmbalajes());
                    matris[i][14] = String.valueOf(lista501.get(i).getTotalIncrementables());
                    matris[i][15] = String.valueOf(lista501.get(i).getTotalDeducibles());
                    matris[i][16] = String.valueOf(lista501.get(i).getPesoBrutoMercancia());
                    matris[i][17] = lista501.get(i).getMedioTransporteSalida();
                    matris[i][18] = lista501.get(i).getMedioTransporteArribo();
                    matris[i][19] = lista501.get(i).getMedioTransporteEntrada_Salida();
                    matris[i][20] = lista501.get(i).getDestinoMercancia();
                    matris[i][21] = lista501.get(i).getNombreContribuyente();
                    matris[i][22] = lista501.get(i).getCalleContribuyente();
                    matris[i][23] = lista501.get(i).getNumeroContribuyente();
                    matris[i][24] = lista501.get(i).getNumExteriorContribuyente();
                    matris[i][25] = lista501.get(i).getCPContribuyente();
                    matris[i][26] = lista501.get(i).getMunicipioContribuyente();
                    matris[i][27] = lista501.get(i).getEntidadFedContribuyente();
                    matris[i][28] = lista501.get(i).getPaisContribuyente();
                    matris[i][29] = lista501.get(i).getTipoPedimento();
                    matris[i][30] = String.valueOf(lista501.get(i).getFechaRecepcionPedimento());
                    matris[i][31] = String.valueOf(lista501.get(i).getFechaPagoReal());
                    
                }
                
                frmPrincipal.jtableAdministrarGlosa.setModel(new javax.swing.table.DefaultTableModel(
                        matris,
                        new String[]{
                           "id", "Patente", "Pedimento", "SeccionAduanera", "TipoOperacion", "ClaveDocumento", "SeccionAduaneraEntrada", "CurpContribuyente", "Rfc",
                            "CurpAgenteA", "TipoCambio", "TotalFletes", "TotalSeguros", "TotalEmbalajes", "TotalIncrementables", "TotalDeducibles", "PesoBrutoMercancia",
                            "MedioTransporteSalida", "MedioTransporteArribo", "MedioTransporteEntrada_Salida", "DestinoMercancia", "NombreContribuyente", "CalleContribuyente",
                            "NumeroContribuyente", "NumExteriorContribuyente", "CPContribuyente", "MunicipioContribuyente", "EntidadFedContribuyente", "PaisContribuyente", 
                            "TipoPedimento", "FechaRecepcionPedimento","FechaPagoReal", 
                        }
                ));
                
                frmPrincipal.jtableAdministrarGlosa.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
                
                break;
            default:
                JOptionPane.showMessageDialog(null, "No se encontro seleccion");
        }
    }

    @Override
    public void actionPerformed(ActionEvent ev) {
        if (ev.getSource() == frmPrincipal.btnBuscarAdministrarGlosa) {
            buscarGlosa();
        }

    }

}
