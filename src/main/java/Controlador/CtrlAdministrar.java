package Controlador;

import Modelo.Consultas;
import Modelo.Glosa501;
import Modelo.Glosa501Consultas;
import Modelo.Glosa502;
import Modelo.Glosa502Consultas;
import Modelo.Glosa503;
import Modelo.Glosa503Consultas;
import Modelo.Glosa504;
import Modelo.Glosa504Consultas;
import Modelo.Glosa505;
import Modelo.Glosa505Consultas;
import Modelo.Glosa506;
import Modelo.Glosa506Consultas;
import Modelo.Glosa507;
import Modelo.Glosa507Consultas;
import Modelo.Glosa508;
import Modelo.Glosa508Consultas;
import Modelo.Glosa509;
import Modelo.Glosa509Consultas;
import Modelo.Glosa510;
import Modelo.Glosa510Consultas;
import Modelo.Glosa511;
import Modelo.Glosa511Consultas;
import Modelo.Glosa512;
import Modelo.Glosa512Consultas;
import Modelo.Glosa520;
import Modelo.Glosa520Consultas;
import Modelo.Glosa551;
import Modelo.Glosa551Consultas;
import Modelo.Glosa552;
import Modelo.Glosa552Consultas;
import Modelo.Glosa553;
import Modelo.Glosa553Consultas;
import Modelo.Glosa554;
import Modelo.Glosa554Consultas;
import Modelo.Glosa555;
import Modelo.Glosa555Consultas;
import Modelo.Glosa556;
import Modelo.Glosa556Consultas;
import Modelo.Glosa557;
import Modelo.Glosa557Consultas;
import Modelo.Glosa558;
import Modelo.Glosa558Consultas;
import Modelo.Glosa701;
import Modelo.Glosa701Consultas;
import Modelo.Glosa702;
import Modelo.Glosa702Consultas;
import Vista.PanelPrincipal;
import java.awt.Desktop;
import org.apache.poi.ss.usermodel.Row;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CtrlAdministrar implements ActionListener {

    private PanelPrincipal frmPrincipal;
    private Glosa501 modGlosa501;
    private Glosa501Consultas modcGlosa501;
    private Glosa502 modGlosa502;
    private Glosa502Consultas modcGlosa502;
    private Glosa503 modGlosa503;
    private Glosa503Consultas modcGlosa503;
    private Glosa504 modGlosa504;
    private Glosa504Consultas modcGlosa504;
    private Glosa505 modGlosa505;
    private Glosa505Consultas modcGlosa505;
    private Glosa506 modGlosa506;
    private Glosa506Consultas modcGlosa506;
    private Glosa507 modGlosa507;
    private Glosa507Consultas modcGlosa507;
    private Glosa508 modGlosa508;
    private Glosa508Consultas modcGlosa508;
    private Glosa509 modGlosa509;
    private Glosa509Consultas modcGlosa509;
    private Glosa510 modGlosa510;
    private Glosa510Consultas modcGlosa510;
    private Glosa511 modGlosa511;
    private Glosa511Consultas modcGlosa511;
    private Glosa512 modGlosa512;
    private Glosa512Consultas modcGlosa512;
    private Glosa520 modGlosa520;
    private Glosa520Consultas modcGlosa520;
    private Glosa551 modGlosa551;
    private Glosa551Consultas modcGlosa551;
    private Glosa552 modGlosa552;
    private Glosa552Consultas modcGlosa552;
    private Glosa553 modGlosa553;
    private Glosa553Consultas modcGlosa553;
    private Glosa554 modGlosa554;
    private Glosa554Consultas modcGlosa554;
    private Glosa555 modGlosa555;
    private Glosa555Consultas modcGlosa555;
    private Glosa556 modGlosa556;
    private Glosa556Consultas modcGlosa556;
    private Glosa557 modGlosa557;
    private Glosa557Consultas modcGlosa557;
    private Glosa558 modGlosa558;
    private Glosa558Consultas modcGlosa558;
    private Glosa701 modGlosa701;
    private Glosa701Consultas modcGlosa701;
    private Glosa702 modGlosa702;
    private Glosa702Consultas modcGlosa702;
    private Consultas modcConsultas;

    public CtrlAdministrar(PanelPrincipal frmPrincipal, Glosa501 modGlosa501, Glosa501Consultas modcGlosa501, Glosa502 modGlosa502, 
            Glosa502Consultas modcGlosa502, Glosa503 modGlosa503, Glosa503Consultas modcGlosa503, Glosa504 modGlosa504, Glosa504Consultas modcGlosa504, 
            Glosa505 modGlosa505, Glosa505Consultas modcGlosa505, Glosa506 modGlosa506, Glosa506Consultas modcGlosa506, Glosa507 modGlosa507, 
            Glosa507Consultas modcGlosa507, Glosa508 modGlosa508, Glosa508Consultas modcGlosa508, Glosa509 modGlosa509, Glosa509Consultas modcGlosa509, 
            Glosa510 modGlosa510, Glosa510Consultas modcGlosa510, Glosa511 modGlosa511, Glosa511Consultas modcGlosa511, Glosa512 modGlosa512, 
            Glosa512Consultas modcGlosa512, Glosa520 modGlosa520, Glosa520Consultas modcGlosa520, Glosa551 modGlosa551, Glosa551Consultas modcGlosa551, 
            Glosa552 modGlosa552, Glosa552Consultas modcGlosa552, Glosa553 modGlosa553, Glosa553Consultas modcGlosa553, Glosa554 modGlosa554, 
            Glosa554Consultas modcGlosa554, Glosa555 modGlosa555, Glosa555Consultas modcGlosa555, Glosa556 modGlosa556, Glosa556Consultas modcGlosa556, 
            Glosa557 modGlosa557, Glosa557Consultas modcGlosa557, Glosa558 modGlosa558, Glosa558Consultas modcGlosa558, Glosa701 modGlosa701, 
            Glosa701Consultas modcGlosa701, Glosa702 modGlosa702, Glosa702Consultas modcGlosa702, Consultas modcConsultas) {
        this.frmPrincipal = frmPrincipal;
        this.modGlosa501 = modGlosa501;
        this.modcGlosa501 = modcGlosa501;
        this.modGlosa502 = modGlosa502;
        this.modcGlosa502 = modcGlosa502;
        this.modGlosa503 = modGlosa503;
        this.modcGlosa503 = modcGlosa503;
        this.modGlosa504 = modGlosa504;
        this.modcGlosa504 = modcGlosa504;
        this.modGlosa505 = modGlosa505;
        this.modcGlosa505 = modcGlosa505;
        this.modGlosa506 = modGlosa506;
        this.modcGlosa506 = modcGlosa506;
        this.modGlosa507 = modGlosa507;
        this.modcGlosa507 = modcGlosa507;
        this.modGlosa508 = modGlosa508;
        this.modcGlosa508 = modcGlosa508;
        this.modGlosa509 = modGlosa509;
        this.modcGlosa509 = modcGlosa509;
        this.modGlosa510 = modGlosa510;
        this.modcGlosa510 = modcGlosa510;
        this.modGlosa511 = modGlosa511;
        this.modcGlosa511 = modcGlosa511;
        this.modGlosa512 = modGlosa512;
        this.modcGlosa512 = modcGlosa512;
        this.modGlosa520 = modGlosa520;
        this.modcGlosa520 = modcGlosa520;
        this.modGlosa551 = modGlosa551;
        this.modcGlosa551 = modcGlosa551;
        this.modGlosa552 = modGlosa552;
        this.modcGlosa552 = modcGlosa552;
        this.modGlosa553 = modGlosa553;
        this.modcGlosa553 = modcGlosa553;
        this.modGlosa554 = modGlosa554;
        this.modcGlosa554 = modcGlosa554;
        this.modGlosa555 = modGlosa555;
        this.modcGlosa555 = modcGlosa555;
        this.modGlosa556 = modGlosa556;
        this.modcGlosa556 = modcGlosa556;
        this.modGlosa557 = modGlosa557;
        this.modcGlosa557 = modcGlosa557;
        this.modGlosa558 = modGlosa558;
        this.modcGlosa558 = modcGlosa558;
        this.modGlosa701 = modGlosa701;
        this.modcGlosa701 = modcGlosa701;
        this.modGlosa702 = modGlosa702;
        this.modcGlosa702 = modcGlosa702;
        this.modcConsultas = modcConsultas;
        this.frmPrincipal.btnBuscarAdministrarGlosa.addActionListener(this);
        this.frmPrincipal.btnexportarExcelAdministrar.addActionListener(this);
    }

    
    public void buscarGlosa(){
        long dateInicial = frmPrincipal.datechFechaInicialAdministrarGlosa.getDate().getTime();
        long dateFinal = frmPrincipal.datechFechaFinalAdministrarGlosa.getDate().getTime();
        java.sql.Date fechaInicial = new java.sql.Date(dateInicial);
        java.sql.Date fechaFinal = new java.sql.Date(dateFinal);
        modGlosa501.setFechaInicio(fechaInicial);
        modGlosa501.setFechaFinal(fechaFinal);
        String glosa = frmPrincipal.cmbGlosaAdministrarGlosa.getSelectedItem().toString();
        frmPrincipal.jtableAdministrarGlosa.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        
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
                
                break;
            case "Glosa502":
                
                ArrayList<Glosa502> lista502 = modcGlosa502.buscar(modGlosa502);
                String matris502[][] = new String[lista502.size()][10];
                
                for (int i = 0; i < lista502.size(); i++) {
                    matris502[i][0] = String.valueOf(lista502.get(i).getId());
                    matris502[i][1] = lista502.get(i).getPatente();
                    matris502[i][2] = lista502.get(i).getPedimento();
                    matris502[i][3] = lista502.get(i).getSeccionAduanera();
                    matris502[i][4] = lista502.get(i).getRfcTransportista();
                    matris502[i][5] = lista502.get(i).getCurpTransportista();
                    matris502[i][6] = lista502.get(i).getNombreTransportista();
                    matris502[i][7] = lista502.get(i).getPaisTransporte();
                    matris502[i][8] = lista502.get(i).getIdentificadorTransporte();
                    matris502[i][9] = String.valueOf(lista502.get(i).getFechaPagoReal());
                }
                
                frmPrincipal.jtableAdministrarGlosa.setModel(new javax.swing.table.DefaultTableModel(
                        matris502,
                        new String[]{
                           "id","Patente","Pedimento","SeccionAduanera","RfcTransportista","CurpTransportista","NombreTransportista","PaisTransporte",
                            "IdentificadorTransporte","FechaPagoReal"
                        }
                ));
                
                break;
                
            case "Glosa503":
                ArrayList<Glosa503> lista503 = modcGlosa503.buscar(modGlosa503);
                String matris503[][] = new String[lista503.size()][7];
                
                for (int i = 0; i < lista503.size(); i++) {
                    matris503[i][0] = String.valueOf(lista503.get(i).getId());
                    matris503[i][1] = lista503.get(i).getPatente();
                    matris503[i][2] = lista503.get(i).getPedimento();
                    matris503[i][3] = lista503.get(i).getSeccionAduanera();
                    matris503[i][4] = lista503.get(i).getNumeroGuia();
                    matris503[i][5] = lista503.get(i).getTipoGuia();
                    matris503[i][6] = String.valueOf(lista503.get(i).getFechaPagoReal());
                }
                
                frmPrincipal.jtableAdministrarGlosa.setModel(new javax.swing.table.DefaultTableModel(
                        matris503,
                        new String[]{
                           "id", "Patente", "Pedimento", "SeccionAduanera", "NumeroGuia", "TipoGuia", "FechaPagoReal"
                        }
                ));
                break;
            case "Glosa504":
                
                ArrayList<Glosa504> lista504 = modcGlosa504.buscar(modGlosa504);
                String matris504[][] = new String[lista504.size()][7];
                
                for (int i = 0; i < lista504.size(); i++) {
                    matris504[i][0] = String.valueOf(lista504.get(i).getId());
                    matris504[i][1] = lista504.get(i).getPatente();
                    matris504[i][2] = lista504.get(i).getPedimento();
                    matris504[i][3] = lista504.get(i).getSeccionAduanera();
                    matris504[i][4] = lista504.get(i).getNumContenedor();
                    matris504[i][5] = lista504.get(i).getTipoContenedor();
                    matris504[i][6] = String.valueOf(lista504.get(i).getFechaPagoReal());
                }
                
                frmPrincipal.jtableAdministrarGlosa.setModel(new javax.swing.table.DefaultTableModel(
                        matris504,
                        new String[]{
                           "id", "Patente", "Pedimento", "SeccionAduanera", "NumContenedor", "TipoContenedor", "FechaPagoReal"
                        }
                ));
                
                break;
            case "Glosa505":
                ArrayList<Glosa505> lista505 = modcGlosa505.buscar(modGlosa505);
                String matris505[][] = new String[lista505.size()][20];
                
                for (int i = 0; i < lista505.size(); i++) {
                    matris505[i][0] = String.valueOf(lista505.get(i).getId());
                    matris505[i][1] = lista505.get(i).getPatente();
                    matris505[i][2] = lista505.get(i).getPedimento();
                    matris505[i][3] = lista505.get(i).getSeccionAduanera();
                    matris505[i][4] = String.valueOf(lista505.get(i).getFechaFacturacion());
                    matris505[i][5] = lista505.get(i).getNumeroFactura();
                    matris505[i][6] = lista505.get(i).getTerminoFacturacion();
                    matris505[i][7] = lista505.get(i).getMonedaFacturacion();
                    matris505[i][8] = String.valueOf(lista505.get(i).getValorDolares());
                    matris505[i][9] = String.valueOf(lista505.get(i).getValorMonedaExtranjera());
                    matris505[i][10] = lista505.get(i).getPaisFacturacion();
                    matris505[i][11] = lista505.get(i).getEntidadFedFacturacion();
                    matris505[i][12] = lista505.get(i).getIndentFiscalProveedor();
                    matris505[i][13] = lista505.get(i).getProveedorMercancia();
                    matris505[i][14] = lista505.get(i).getCalleProveedor();
                    matris505[i][15] = lista505.get(i).getNumInteriorProveedor();
                    matris505[i][16] = lista505.get(i).getNumExteriorProveedor();
                    matris505[i][17] = lista505.get(i).getCpProveedor();
                    matris505[i][18] = lista505.get(i).getMunicipioProveedor();
                    matris505[i][19] = String.valueOf(lista505.get(i).getFechaPagoReal());
                    
                }
                
                frmPrincipal.jtableAdministrarGlosa.setModel(new javax.swing.table.DefaultTableModel(
                        matris505,
                        new String[]{
                            "id", "Patente", "Pedimento", "SeccionAduanera", "FechaFacturacion", "NumeroFactura", "TerminoFacturacion", "MonedaFacturacion",
                                   "ValorDolares", "ValorMonedaExtranjera", "PaisFacturacion", "EntidadFedFacturacion", "IndentFiscalProveedor", "ProveedorMercancia",
                                   "CalleProveedor", "NumInteriorProveedor", "NumExteriorProveedor", "CpProveedor", "MunicipioProveedor", "FechaPagoReal"
                        }
                ));
                break;
                
            case "Glosa506":
                ArrayList<Glosa506> lista506 = modcGlosa506.buscar(modGlosa506);
                String matris506[][] = new String[lista506.size()][7];
                
                for (int i = 0; i < lista506.size(); i++) {
                    matris506[i][0] = String.valueOf(lista506.get(i).getId());
                    matris506[i][1] = lista506.get(i).getPatente();
                    matris506[i][2] = lista506.get(i).getPedimento();
                    matris506[i][3] = lista506.get(i).getSeccionAduanera();
                    matris506[i][4] = String.valueOf(lista506.get(i).getTipoFecha());
                    matris506[i][5] = String.valueOf(lista506.get(i).getFechaOperacion());
                    matris506[i][6] = String.valueOf(lista506.get(i).getFechaValidacionPagoR());
                    
                }
                
                frmPrincipal.jtableAdministrarGlosa.setModel(new javax.swing.table.DefaultTableModel(
                        matris506,
                        new String[]{
                           "id", "Patente", "Pedimento", "SeccionAduanera", "TipoFecha", "FechaOperacion", "FechaValidacionPagoR"
                        }
                ));
                break;
                
            case "Glosa507":
                ArrayList<Glosa507> lista507 = modcGlosa507.buscar(modGlosa507);
                String matris507[][] = new String[lista507.size()][9];
                
                for (int i = 0; i < lista507.size(); i++) {
                    matris507[i][0] = String.valueOf(lista507.get(i).getId());
                    matris507[i][1] = lista507.get(i).getPatente();
                    matris507[i][2] = lista507.get(i).getPedimento();
                    matris507[i][3] = lista507.get(i).getSeccionAduanera();
                    matris507[i][4] = lista507.get(i).getClaveCaso();
                    matris507[i][5] = lista507.get(i).getIdentificadorCaso();
                    matris507[i][6] = lista507.get(i).getTipoPedimento();
                    matris507[i][7] = lista507.get(i).getComplementoCaso();
                    matris507[i][8] = String.valueOf(lista507.get(i).getFechaValidacionPagoR());
                }
                
                frmPrincipal.jtableAdministrarGlosa.setModel(new javax.swing.table.DefaultTableModel(
                        matris507,
                        new String[]{
                           "id", "Patente", "Pedimento", "SeccionAduanera", "ClaveCaso", "IdentificadorCaso", 
                                   "TipoPedimento", "ComplementoCaso", "FechaValidacionPagoR"
                        }
                ));
                break;
                
            case "Glosa508":
                ArrayList<Glosa508> lista508 = modcGlosa508.buscar(modGlosa508);
                String matris508[][] = new String[lista508.size()][15];
                
                for (int i = 0; i < lista508.size(); i++) {
                    matris508[i][0] = String.valueOf(lista508.get(i).getId());
                    matris508[i][1] = lista508.get(i).getPatente();
                    matris508[i][2] = lista508.get(i).getPedimento();
                    matris508[i][3] = lista508.get(i).getSeccionAduanera();
                    matris508[i][4] = lista508.get(i).getInstitucionEmisora();
                    matris508[i][5] = lista508.get(i).getNumeroCuenta();
                    matris508[i][6] = lista508.get(i).getFolioConstancia();
                    matris508[i][7] = String.valueOf(lista508.get(i).getFechaConstancia());
                    matris508[i][8] = lista508.get(i).getTipoCuenta();
                    matris508[i][9] = lista508.get(i).getClaveGarantia();
                    matris508[i][10] = String.valueOf(lista508.get(i).getValorUnitarioTitulo());
                    matris508[i][11] = lista508.get(i).getTotalGarantia();
                    matris508[i][12] = lista508.get(i).getCantidadUnidades();
                    matris508[i][13] = lista508.get(i).getTitulosAsignados();
                    matris508[i][14] = String.valueOf(lista508.get(i).getFechaPagoReal());
                }
                
                frmPrincipal.jtableAdministrarGlosa.setModel(new javax.swing.table.DefaultTableModel(
                        matris508,
                        new String[]{
                           "id", "Patente", "Pedimento", "SeccionAduanera", "InstitucionEmisora", "NumeroCuenta",
                                   "FolioConstancia", "FechaConstancia", "TipoCuenta", "ClaveGarantia", "ValorUnitarioTitulo",
                                   "TotalGarantia", "CantidadUnidades", "TitulosAsignados", "FechaPagoReal"
                        }
                ));
                break;
                
            case "Glosa509":
                ArrayList<Glosa509> lista509 = modcGlosa509.buscar(modGlosa509);
                String matris509[][] = new String[lista509.size()][9];
                
                for (int i = 0; i < lista509.size(); i++) {
                    matris509[i][0] = String.valueOf(lista509.get(i).getId());
                    matris509[i][1] = lista509.get(i).getPatente();
                    matris509[i][2] = lista509.get(i).getPedimento();
                    matris509[i][3] = lista509.get(i).getSeccionAduanera();
                    matris509[i][4] = lista509.get(i).getClaveContribucion();
                    matris509[i][5] = lista509.get(i).getTasaContribucion();
                    matris509[i][6] = lista509.get(i).getTipoTasa();
                    matris509[i][7] = lista509.get(i).getTipoPedimento();
                    matris509[i][8] = String.valueOf(lista509.get(i).getFechaPagoReal());
                }
                
                frmPrincipal.jtableAdministrarGlosa.setModel(new javax.swing.table.DefaultTableModel(
                        matris509,
                        new String[]{
                           "id", "Patente", "Pedimento", "SeccionAduanera", "ClaveContribucion",
                                   "TasaContribucion", "TipoTasa", "TipoPedimento", "FechaPagoReal"
                        }
                ));
                break;
                
            case "Glosa510":
                ArrayList<Glosa510> lista510 = modcGlosa510.buscar(modGlosa510);
                String matris510[][] = new String[lista510.size()][9];
                
                for (int i = 0; i < lista510.size(); i++) {
                    matris510[i][0] = String.valueOf(lista510.get(i).getId());
                    matris510[i][1] = lista510.get(i).getPatente();
                    matris510[i][2] = lista510.get(i).getPedimento();
                    matris510[i][3] = lista510.get(i).getSeccionAduanera();
                    matris510[i][4] = lista510.get(i).getClaveContribucion();
                    matris510[i][5] = lista510.get(i).getFormaPago();
                    matris510[i][6] = String.valueOf(lista510.get(i).getImportePago());
                    matris510[i][7] = lista510.get(i).getTipoPedimento();
                    matris510[i][8] = String.valueOf(lista510.get(i).getFechaPagoReal());
                    
                }
                
                frmPrincipal.jtableAdministrarGlosa.setModel(new javax.swing.table.DefaultTableModel(
                        matris510,
                        new String[]{
                           "id", "Patente", "Pedimento", "SeccionAduanera", "ClaveContribucion", 
                                   "FormaPago", "ImportePago", "TipoPedimento", "FechaPagoReal"
                        }
                ));
                break;
                
            case "Glosa511":
                ArrayList<Glosa511> lista511 = modcGlosa511.buscar(modGlosa511);
                String matris511[][] = new String[lista511.size()][8];
                
                for (int i = 0; i < lista511.size(); i++) {
                    matris511[i][0] = String.valueOf(lista511.get(i).getId());
                    matris511[i][1] = lista511.get(i).getPatente();
                    matris511[i][2] = lista511.get(i).getPedimento();
                    matris511[i][3] = lista511.get(i).getSeccionAduanera();
                    matris511[i][4] = lista511.get(i).getObservaciones();
                    matris511[i][5] = lista511.get(i).getTipoPedimento();
                    matris511[i][6] = String.valueOf(lista511.get(i).getFechaValidacionPagoR());
                }
                
                frmPrincipal.jtableAdministrarGlosa.setModel(new javax.swing.table.DefaultTableModel(
                        matris511,
                        new String[]{
                           "id", "Patente", "Pedimento", "SeccionAduanera", "SecuenciaObservacion", 
                                   "Observaciones", "TipoPedimento", "FechaValidacionPagoR"
                        }
                ));
                break;
                
            case "Glosa512":
                ArrayList<Glosa512> lista512 = modcGlosa512.buscar(modGlosa512);
                String matris512[][] = new String[lista512.size()][14];
                
                for (int i = 0; i < lista512.size(); i++) {
                    matris512[i][0] = String.valueOf(lista512.get(i).getId());
                    matris512[i][1] = lista512.get(i).getPatente();
                    matris512[i][2] = lista512.get(i).getPedimento();
                    matris512[i][3] = lista512.get(i).getSeccionAduanera();
                    matris512[i][4] = lista512.get(i).getPatenteAduanalOrig();
                    matris512[i][5] = lista512.get(i).getPedimentoOriginal();
                    matris512[i][6] = lista512.get(i).getSeccionAduaneraDespOrig();
                    matris512[i][7] = lista512.get(i).getDocumentoOriginal();
                    matris512[i][8] = String.valueOf(lista512.get(i).getFechaOperacionOrig());
                    matris512[i][9] = lista512.get(i).getFraccionOriginal();
                    matris512[i][10] = lista512.get(i).getUnidadMedida();
                    matris512[i][11] = String.valueOf(lista512.get(i).getMercanciaDescargada());
                    matris512[i][12] = lista512.get(i).getTipoPedimento();
                    matris512[i][13] = String.valueOf(lista512.get(i).getFechaPagoReal());
                    
                }
                
                frmPrincipal.jtableAdministrarGlosa.setModel(new javax.swing.table.DefaultTableModel(
                        matris512,
                        new String[]{
                           "id", "Patente", "Pedimento", "SeccionAduanera", "PatenteAduanalOrig", 
                                   "PedimentoOriginal", "SeccionAduaneraDespOrig", "DocumentoOriginal", 
                                   "FechaOperacionOrig", "FraccionOriginal", "UnidadMedida", 
                                   "MercanciaDescargada", "TipoPedimento", "FechaPagoReal"
                        }
                ));
                break;
                
            case "Glosa520":
                ArrayList<Glosa520> lista520 = modcGlosa520.buscar(modGlosa520);
                String matris520[][] = new String[lista520.size()][13];
                
                for (int i = 0; i < lista520.size(); i++) {
                    matris520[i][0] = String.valueOf(lista520.get(i).getId());
                    matris520[i][1] = lista520.get(i).getPatente();
                    matris520[i][2] = lista520.get(i).getPedimento();
                    matris520[i][3] = lista520.get(i).getSeccionAduanera();
                    matris520[i][4] = lista520.get(i).getIndentFiscalDestinatario();
                    matris520[i][5] = lista520.get(i).getNombreDestinatarioMercancia();
                    matris520[i][6] = lista520.get(i).getCalleDestinatario();
                    matris520[i][7] = lista520.get(i).getNumInteriorDestinatario();
                    matris520[i][8] = lista520.get(i).getNumExteriorDestinatario();
                    matris520[i][9] = lista520.get(i).getCpDestinatario();
                    matris520[i][10] = lista520.get(i).getMunicpioDestinatario();
                    matris520[i][11] = lista520.get(i).getPaisDestinatario();
                    matris520[i][12] = String.valueOf(lista520.get(i).getFechaPagoReal());
                }
                
                frmPrincipal.jtableAdministrarGlosa.setModel(new javax.swing.table.DefaultTableModel(
                        matris520,
                        new String[]{
                           "id", "Patente", "Pedimento", "SeccionAduanera", "IndentFiscalDestinatario", 
                                   "NombreDestinatarioMercancia", "CalleDestinatario", "NumInteriorDestinatario", 
                                   "NumExteriorDestinatario", "CpDestinatario", "MunicpioDestinatario", 
                                   "PaisDestinatario", "FechaPagoReal"
                        }
                ));
                break;
                
            case "Glosa551":
                ArrayList<Glosa551> lista551 = modcGlosa551.buscar(modGlosa551);
                String matris551[][] = new String[lista551.size()][31];
                
                for (int i = 0; i < lista551.size(); i++) {
                    matris551[i][0] = String.valueOf(lista551.get(i).getId());
                    matris551[i][1] = lista551.get(i).getPatente();
                    matris551[i][2] = lista551.get(i).getPedimento();
                    matris551[i][3] = lista551.get(i).getSeccionAduanera();
                    matris551[i][4] = lista551.get(i).getFraccion();
                    matris551[i][5] = lista551.get(i).getSecuenciaFraccion();
                    matris551[i][6] = lista551.get(i).getSubdivisionFraccion();
                    matris551[i][7] = lista551.get(i).getDescripcionMercancia();
                    matris551[i][8] = String.valueOf(lista551.get(i).getPrecioUnitario());
                    matris551[i][9] = String.valueOf(lista551.get(i).getValorAduana());
                    matris551[i][10] = String.valueOf(lista551.get(i).getValorComercial());
                    matris551[i][11] = String.valueOf(lista551.get(i).getValorDolares());
                    matris551[i][12] = String.valueOf(lista551.get(i).getCantidadUMComercial());
                    matris551[i][13] = String.valueOf(lista551.get(i).getUnidadMedidaComercial());
                    matris551[i][14] = String.valueOf(lista551.get(i).getCantidadUMTarifa());
                    matris551[i][15] = String.valueOf(lista551.get(i).getUnidadMedidaTarifa());
                    matris551[i][16] = String.valueOf(lista551.get(i).getValorAgregado());
                    matris551[i][17] = lista551.get(i).getClaveVinculacion();
                    matris551[i][18] = lista551.get(i).getMetodoValorizacion();
                    matris551[i][19] = lista551.get(i).getCodigoMercanciaProducto();
                    matris551[i][20] = lista551.get(i).getMarcaMercanciaProducto();
                    matris551[i][21] = lista551.get(i).getModeloMercanciaProducto();
                    matris551[i][22] = lista551.get(i).getPaisOrigenDestino();
                    matris551[i][23] = lista551.get(i).getPaisCompradorVendedor();
                    matris551[i][24] = lista551.get(i).getEntidadFedOrigen();
                    matris551[i][25] = lista551.get(i).getEntidadFedDestino();
                    matris551[i][26] = lista551.get(i).getEntidadFedComprador();
                    matris551[i][27] = lista551.get(i).getEntidadFedVendedor();
                    matris551[i][28] = lista551.get(i).getTipoOperacion();
                    matris551[i][29] = lista551.get(i).getClaveDocumento();
                    matris551[i][30] = String.valueOf(lista551.get(i).getFechaPagoReal());
                }
                
                frmPrincipal.jtableAdministrarGlosa.setModel(new javax.swing.table.DefaultTableModel(
                        matris551,
                        new String[]{
                           "id", "Patente", "Pedimento", "SeccionAduanera", "Fraccion", "SecuenciaFraccion",
                                   "SubdivisionFraccion", "DescripcionMercancia", "PrecioUnitario", "ValorAduana",
                                   "ValorComercial", "ValorDolares", "CantidadUMComercial", "UnidadMedidaComercial",
                                   "CantidadUMTarifa", "UnidadMedidaTarifa", "ValorAgregado", "ClaveVinculacion",
                                   "MetodoValorizacion", "CodigoMercanciaProducto", "MarcaMercanciaProducto", "ModeloMercanciaProducto",
                                   "PaisOrigenDestino", "PaisCompradorVendedor", "EntidadFedOrigen", "EntidadFedDestino", "EntidadFedComprador",
                                   "EntidadFedVendedor", "TipoOperacion", "ClaveDocumento", "FechaPagoReal"
                        }
                ));
                break;
            case "Glosa552":
                ArrayList<Glosa552> lista552 = modcGlosa552.buscar(modGlosa552);
                String matris552[][] = new String[lista552.size()][9];
                
                for (int i = 0; i < lista552.size(); i++) {
                    matris552[i][0] = String.valueOf(lista552.get(i).getId());
                    matris552[i][1] = lista552.get(i).getPatente();
                    matris552[i][2] = lista552.get(i).getPedimento();
                    matris552[i][3] = lista552.get(i).getSeccionAduanera();
                    matris552[i][4] = lista552.get(i).getFraccion();
                    matris552[i][5] = lista552.get(i).getSecuenciaFraccion();
                    matris552[i][6] = lista552.get(i).getVinNumeroSerie();
                    matris552[i][7] = String.valueOf(lista552.get(i).getKilometrajeVehiculo());
                    matris552[i][8] = String.valueOf(lista552.get(i).getFechaPagoReal());
                }
                
                frmPrincipal.jtableAdministrarGlosa.setModel(new javax.swing.table.DefaultTableModel(
                        matris552,
                        new String[]{
                           "id", "Patente", "Pedimento", "SeccionAduanera", "Fraccion", "SecuenciaFraccion",
                                   "VinNumeroSerie", "KilometrajeVehiculo", "FechaPagoReal"
                        }
                ));
                break;
                
            case "Glosa553":
                ArrayList<Glosa553> lista553 = modcGlosa553.buscar(modGlosa553);
                String matris553[][] = new String[lista553.size()][12];
                
                for (int i = 0; i < lista553.size(); i++) {
                    matris553[i][0] = String.valueOf(lista553.get(i).getId());
                    matris553[i][1] = lista553.get(i).getPatente();
                    matris553[i][2] = lista553.get(i).getPedimento();
                    matris553[i][3] = lista553.get(i).getSeccionAduanera();
                    matris553[i][4] = lista553.get(i).getFraccion();
                    matris553[i][5] = lista553.get(i).getSecuenciaFraccion();
                    matris553[i][6] = lista553.get(i).getClavePermiso();
                    matris553[i][7] = lista553.get(i).getFirmaDescargo();
                    matris553[i][8] = lista553.get(i).getNumeroPermiso();
                    matris553[i][9] = String.valueOf(lista553.get(i).getValorComercialDolares());
                    matris553[i][10] = String.valueOf(lista553.get(i).getCantidadMUMTarifa());
                    matris553[i][11] = String.valueOf(lista553.get(i).getFechaPagoReal());
                }
                
                frmPrincipal.jtableAdministrarGlosa.setModel(new javax.swing.table.DefaultTableModel(
                        matris553,
                        new String[]{
                           "id", "Patente", "Pedimento", "SeccionAduanera", "Fraccion", 
                                   "SecuenciaFraccion", "ClavePermiso", "FirmaDescargo", 
                                   "NumeroPermiso", "ValorComercialDolares", "CantidadMUMTarifa", 
                                   "FechaPagoReal"
                        }
                ));
                break;
                
            case "Glosa554":
                ArrayList<Glosa554> lista554 = modcGlosa554.buscar(modGlosa554);
                String matris554[][] = new String[lista554.size()][10];
                
                for (int i = 0; i < lista554.size(); i++) {
                    matris554[i][0] = String.valueOf(lista554.get(i).getId());
                    matris554[i][1] = lista554.get(i).getPatente();
                    matris554[i][2] = lista554.get(i).getPedimento();
                    matris554[i][3] = lista554.get(i).getSeccionAduanera();
                    matris554[i][4] = lista554.get(i).getFraccion();
                    matris554[i][5] = lista554.get(i).getSecuenciaFraccion();
                    matris554[i][6] = lista554.get(i).getClaveCaso();
                    matris554[i][7] = lista554.get(i).getIdentificadorCaso();
                    matris554[i][8] = lista554.get(i).getComplementoCaso();
                    matris554[i][9] = String.valueOf(lista554.get(i).getFechaPagoReal());
                }
                
                frmPrincipal.jtableAdministrarGlosa.setModel(new javax.swing.table.DefaultTableModel(
                        matris554,
                        new String[]{
                           "id", "Patente", "Pedimento", "SeccionAduanera", "Fraccion", "SecuenciaFraccion",
                                   "ClaveCaso", "IdentificadorCaso", "ComplementoCaso", "FechaPagoReal"
                        }
                ));
                break;
                
            case "Glosa555":
                ArrayList<Glosa555> lista555 = modcGlosa555.buscar(modGlosa555);
                String matris555[][] = new String[lista555.size()][16];
                
                for (int i = 0; i < lista555.size(); i++) {
                    matris555[i][0] = String.valueOf(lista555.get(i).getId());
                    matris555[i][1] = lista555.get(i).getPatente();
                    matris555[i][2] = lista555.get(i).getPedimento();
                    matris555[i][3] = lista555.get(i).getSeccionAduanera();
                    matris555[i][4] = lista555.get(i).getFraccion();
                    matris555[i][5] = lista555.get(i).getSecuenciaFraccion();
                    matris555[i][6] = lista555.get(i).getInstitucionEmisora();
                    matris555[i][7] = lista555.get(i).getNumeroCuenta();
                    matris555[i][8] = lista555.get(i).getFolioConstancia();
                    matris555[i][9] = String.valueOf(lista555.get(i).getFechaConstancia());
                    matris555[i][10] = lista555.get(i).getClaveGarantia();
                    matris555[i][11] = String.valueOf(lista555.get(i).getValorUnitarioTitulo());
                    matris555[i][12] = lista555.get(i).getTotalGarantia();
                    matris555[i][13] = lista555.get(i).getCantidadUnidadesMedida();
                    matris555[i][14] = lista555.get(i).getTitulosAsignados();
                    matris555[i][15] = String.valueOf(lista555.get(i).getFechaPagoReal());
                }
                
                frmPrincipal.jtableAdministrarGlosa.setModel(new javax.swing.table.DefaultTableModel(
                        matris555,
                        new String[]{
                           "id", "Patente", "Pedimento", "SeccionAduanera", "Fraccion", "SecuenciaFraccion",
                                   "InstitucionEmisora", "NumeroCuenta", "FolioConstancia", "FechaConstancia",
                                   "ClaveGarantia", "ValorUnitarioTitulo", "TotalGarantia", "CantidadUnidadesMedida",
                                   "TitulosAsignados", "FechaPagoReal"
                        }
                ));
                break;
                
            case "Glosa556":
                ArrayList<Glosa556> lista556 = modcGlosa556.buscar(modGlosa556);
                String matris556[][] = new String[lista556.size()][10];
                
                for (int i = 0; i < lista556.size(); i++) {
                    matris556[i][0] = String.valueOf(lista556.get(i).getId());
                    matris556[i][1] = lista556.get(i).getPatente();
                    matris556[i][2] = lista556.get(i).getPedimento();
                    matris556[i][3] = lista556.get(i).getSeccionAduanera();
                    matris556[i][4] = lista556.get(i).getFraccion();
                    matris556[i][5] = lista556.get(i).getSecuenciaFraccion();
                    matris556[i][6] = lista556.get(i).getClaveContribucion();
                    matris556[i][7] = lista556.get(i).getTasaContribucion();
                    matris556[i][8] = lista556.get(i).getTipoTasa();
                    matris556[i][9] = String.valueOf(lista556.get(i).getFechaPagoReal());
                    
                }
                
                frmPrincipal.jtableAdministrarGlosa.setModel(new javax.swing.table.DefaultTableModel(
                        matris556,
                        new String[]{
                           "id", "Patente", "Pedimento", "SeccionAduanera", "Fraccion", "SecuenciaFraccion",
                                   "ClaveContribucion", "TasaContribucion", "TipoTasa", "FechaPagoReal"
                        }
                ));
                break;
                
            case "Glosa557":
                ArrayList<Glosa557> lista557 = modcGlosa557.buscar(modGlosa557);
                String matris557[][] = new String[lista557.size()][10];
                
                for (int i = 0; i < lista557.size(); i++) {
                    matris557[i][0] = String.valueOf(lista557.get(i).getId());
                    matris557[i][1] = lista557.get(i).getPatente();
                    matris557[i][2] = lista557.get(i).getPedimento();
                    matris557[i][3] = lista557.get(i).getSeccionAduanera();
                    matris557[i][4] = lista557.get(i).getFraccion();
                    matris557[i][5] = lista557.get(i).getSecuenciaFraccion();
                    matris557[i][6] = lista557.get(i).getClaveContribucion();
                    matris557[i][7] = lista557.get(i).getFormaPago();
                    matris557[i][8] = String.valueOf(lista557.get(i).getImportPago());
                    matris557[i][9] = String.valueOf(lista557.get(i).getFechaValidacionPagoR());
                }
                
                frmPrincipal.jtableAdministrarGlosa.setModel(new javax.swing.table.DefaultTableModel(
                        matris557,
                        new String[]{
                           "id", "Patente", "Pedimento", "SeccionAduanera", "Fraccion", "SecuenciaFraccion", 
                                   "ClaveContribucion", "FormaPago", "ImportPago", "FechaValidacionPagoR"
                        }
                ));
                break;
            case "Glosa558":
                ArrayList<Glosa558> lista558 = modcGlosa558.buscar(modGlosa558);
                String matris558[][] = new String[lista558.size()][9];
                
                for (int i = 0; i < lista558.size(); i++) {
                    matris558[i][0] = String.valueOf(lista558.get(i).getId());
                    matris558[i][1] = lista558.get(i).getPatente();
                    matris558[i][2] = lista558.get(i).getPedimento();
                    matris558[i][3] = lista558.get(i).getSeccionAduanera();
                    matris558[i][4] = lista558.get(i).getFraccion();
                    matris558[i][5] = lista558.get(i).getSecuenciaFraccion();
                    matris558[i][6] = lista558.get(i).getSecuenciaObservacion();
                    matris558[i][7] = lista558.get(i).getObservaciones();
                    matris558[i][8] = String.valueOf(lista558.get(i).getFechaPagoReal());
                }
                
                frmPrincipal.jtableAdministrarGlosa.setModel(new javax.swing.table.DefaultTableModel(
                        matris558,
                        new String[]{
                           "id", "Patente", "Pedimento", "SeccionAduanera", "Fraccion", "SecuenciaFraccion",
                                   "SecuenciaObservacion", "Observaciones", "FechaPagoReal"
                        }
                ));
                break;
            case "Glosa701":
                ArrayList<Glosa701> lista701 = modcGlosa701.buscar(modGlosa701);
                String matris701[][] = new String[lista701.size()][15];
                
                for (int i = 0; i < lista701.size(); i++) {
                    matris701[i][0] = String.valueOf(lista701.get(i).getId());
                    matris701[i][1] = lista701.get(i).getPatente();
                    matris701[i][2] = lista701.get(i).getPedimento();
                    matris701[i][3] = lista701.get(i).getSeccionAduanera();
                    matris701[i][4] = lista701.get(i).getClaveDocumento();
                    matris701[i][5] = String.valueOf(lista701.get(i).getFechaPago());
                    matris701[i][6] = lista701.get(i).getPedimentoAnterior();
                    matris701[i][7] = lista701.get(i).getPatenteAnterior();
                    matris701[i][8] = lista701.get(i).getSeccionAduaneraAnterior();
                    matris701[i][9] = lista701.get(i).getDocumentoAnterior();
                    matris701[i][10] = String.valueOf(lista701.get(i).getFechaOperacionAnterior());
                    matris701[i][11] = lista701.get(i).getPedimentoOriginal();
                    matris701[i][12] = lista701.get(i).getPatenteAduanalOrig();
                    matris701[i][13] = lista701.get(i).getSeccionAduanalDespOrig();
                    matris701[i][14] = String.valueOf(lista701.get(i).getFechaPagoReal());
                }
                
                frmPrincipal.jtableAdministrarGlosa.setModel(new javax.swing.table.DefaultTableModel(
                        matris701,
                        new String[]{
                           "id", "Patente", "Pedimento", "SeccionAduanera", "ClaveDocumento", "FechaPago",
                                   "PedimentoAnterior", "PatenteAnterior", "SeccionAduaneraAnterior", "DocumentoAnterior",
                                   "FechaOperacionAnterior", "PedimentoOriginal", "PatenteAduanalOrig",
                                   "SeccionAduanalDespOrig", "FechaPagoReal"
                        }
                ));
                break;
            case "Glosa702":
                ArrayList<Glosa702> lista702 = modcGlosa702.buscar(modGlosa702);
                String matris702[][] = new String[lista702.size()][10];
                
                for (int i = 0; i < lista702.size(); i++) {
                    matris702[i][0] = String.valueOf(lista702.get(i).getId());
                    matris702[i][1] = lista702.get(i).getPatente();
                    matris702[i][2] = lista702.get(i).getPedimento();
                    matris702[i][3] = lista702.get(i).getSeccionAduanera();
                    matris702[i][4] = lista702.get(i).getClaveContribucion();
                    matris702[i][5] = lista702.get(i).getFormaPago();
                    matris702[i][6] = String.valueOf(lista702.get(i).getImportePago());
                    matris702[i][7] = lista702.get(i).getTipoPedimento();
                    matris702[i][8] = String.valueOf(lista702.get(i).getFechaPagoReal());
                }
                
                frmPrincipal.jtableAdministrarGlosa.setModel(new javax.swing.table.DefaultTableModel(
                        matris702,
                        new String[]{
                           "id", "Patente", "Pedimento", "SeccionAduanera", "ClaveContribucion", 
                                   "FormaPago", "ImportePago", "TipoPedimento", "FechaPagoReal"
                        }
                ));
                break;
            default:
                JOptionPane.showMessageDialog(null, "No se encontro seleccion");
                break;
        }
    }
    
    public void exportarGlosaExcel(DefaultTableModel model){
        Workbook book = new XSSFWorkbook();
        Sheet sheet = book.createSheet("TXT");
        
        model = (DefaultTableModel) frmPrincipal.jtableAdministrarGlosa.getModel();
        
        //Cramos nuestra primer fila
        Row row1 = sheet.createRow(0);
        String glosa = frmPrincipal.cmbGlosaAdministrarGlosa.getSelectedItem().toString();
        //Consultamos los nombres de columnas y los ponemos en una lista
        ArrayList<String> listaEncabezados = modcConsultas.buscarEncabezadosGlosa(glosa);
        
        for(int i = 0; i < listaEncabezados.size(); i++){
            row1.createCell(i).setCellValue(listaEncabezados.get(i));
        }
        
        for(int i = 0; i < model.getRowCount(); i++){
            Row row = sheet.createRow(i + 1);
            for(int y = 0; y < listaEncabezados.size(); y++){
                row.createCell(y).setCellValue(model.getValueAt(i, y).toString());
            }            
        }
        
        String time = DateTimeFormatter.ofPattern("yyMMdd-hhmmss").format(LocalDateTime.now());
        String ruta = "O:\\Mexico\\Trade Compliance\\GLOSA\\REPORTEADORGLOSA\\Reportes\\";
        String fechaInicial = String.valueOf(frmPrincipal.datechFechaInicialAdministrarGlosa.getDate());
        String fechaFinal = String.valueOf(frmPrincipal.datechFechaFinalAdministrarGlosa.getDate());
        
        String nombreArchivo = glosa + fechaInicial + "-" + fechaFinal + ""
                + ".xlsx";
        
        try {
            FileOutputStream fileout = new FileOutputStream(ruta + nombreArchivo);
            book.write(fileout);
            fileout.close();
            File file = new File(ruta + nombreArchivo);
            Desktop.getDesktop().open(file);
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CtrlAdministrar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(CtrlAdministrar.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
   
    @Override
    public void actionPerformed(ActionEvent ev) {
        if (ev.getSource() == frmPrincipal.btnBuscarAdministrarGlosa) {
            buscarGlosa();
        }
        if (ev.getSource() == frmPrincipal.btnexportarExcelAdministrar) {
            DefaultTableModel model;
            model = (DefaultTableModel) frmPrincipal.jtableAdministrarGlosa.getModel();
            exportarGlosaExcel(model);
        }
    }
}