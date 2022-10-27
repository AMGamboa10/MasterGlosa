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
import Vista.PopUpInsertarGlosaComprimido;
import java.awt.Desktop;
import org.apache.poi.ss.usermodel.Row;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CtrlAdministrar implements ActionListener {

    private PanelPrincipal frmPrincipal;
    private PopUpInsertarGlosaComprimido frmPopUpInsertarGlosa;
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
    public int tipoCargaGlosa = 0;

    public CtrlAdministrar(PanelPrincipal frmPrincipal, PopUpInsertarGlosaComprimido frmPopUpInsertarGlosa, Glosa501 modGlosa501, Glosa501Consultas modcGlosa501, Glosa502 modGlosa502, 
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
        this.frmPopUpInsertarGlosa = frmPopUpInsertarGlosa;
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
        this.frmPrincipal.btnCargarComprimidoAdministrarGlosa.addActionListener(this);
        this.frmPrincipal.btnCargarIndividualAdministrarGlosa.addActionListener(this);
        this.frmPopUpInsertarGlosa.btnAceptarPopUpInsertarGlosa.addActionListener(this);
        this.frmPopUpInsertarGlosa.btnCancelarpopInsertarGlosa.addActionListener(this);
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
                modGlosa501.setFechaInicio(fechaInicial);
                modGlosa501.setFechaFinal(fechaFinal);
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
                modGlosa502.setFechaInicio(fechaInicial);
                modGlosa502.setFechaFinal(fechaFinal);
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
                modGlosa503.setFechaInicio(fechaInicial);
                modGlosa503.setFechaFinal(fechaFinal);
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
                modGlosa504.setFechaInicio(fechaInicial);
                modGlosa504.setFechaFinal(fechaFinal);
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
                modGlosa505.setFechaInicio(fechaInicial);
                modGlosa505.setFechaFinal(fechaFinal);
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
                modGlosa506.setFechaInicio(fechaInicial);
                modGlosa506.setFechaFinal(fechaFinal);
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
                modGlosa507.setFechaInicio(fechaInicial);
                modGlosa507.setFechaFinal(fechaFinal);
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
                modGlosa508.setFechaInicio(fechaInicial);
                modGlosa508.setFechaFinal(fechaFinal);
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
                modGlosa509.setFechaInicio(fechaInicial);
                modGlosa509.setFechaFinal(fechaFinal);
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
                modGlosa510.setFechaInicio(fechaInicial);
                modGlosa510.setFechaFinal(fechaFinal);
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
                modGlosa511.setFechaInicio(fechaInicial);
                modGlosa511.setFechaFinal(fechaFinal);
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
                modGlosa512.setFechaInicio(fechaInicial);
                modGlosa512.setFechaFinal(fechaFinal);
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
                modGlosa520.setFechaInicio(fechaInicial);
                modGlosa520.setFechaFinal(fechaFinal);
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
                modGlosa551.setFechaInicio(fechaInicial);
                modGlosa551.setFechaFinal(fechaFinal);
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
                modGlosa552.setFechaInicio(fechaInicial);
                modGlosa552.setFechaFinal(fechaFinal);
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
                modGlosa553.setFechaInicio(fechaInicial);
                modGlosa553.setFechaFinal(fechaFinal);
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
                modGlosa554.setFechaInicio(fechaInicial);
                modGlosa554.setFechaFinal(fechaFinal);
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
                modGlosa555.setFechaInicio(fechaInicial);
                modGlosa555.setFechaFinal(fechaFinal);
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
                modGlosa556.setFechaInicio(fechaInicial);
                modGlosa556.setFechaFinal(fechaFinal);
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
                    matris556[i][7] = String.valueOf(lista556.get(i).getTasaContribucion());
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
                modGlosa557.setFechaInicio(fechaInicial);
                modGlosa557.setFechaFinal(fechaFinal);
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
                modGlosa558.setFechaInicio(fechaInicial);
                modGlosa558.setFechaFinal(fechaFinal);
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
                modGlosa701.setFechaInicio(fechaInicial);
                modGlosa701.setFechaFinal(fechaFinal);
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
                modGlosa702.setFechaInicio(fechaInicial);
                modGlosa702.setFechaFinal(fechaFinal);
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
        String glosa = frmPrincipal.cmbGlosaAdministrarGlosa.getSelectedItem().toString();
        
        Workbook book = new XSSFWorkbook();
        Sheet sheet = book.createSheet(glosa);
        
        model = (DefaultTableModel) frmPrincipal.jtableAdministrarGlosa.getModel();
        
        //Cramos nuestra primer fila
        Row row1 = sheet.createRow(0);
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
        
        String nombreArchivo = glosa + " " + time + ".xlsx";
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
    
    private static final int BUFFER_SIZE = 4096;
    
    public static void unzip(String ZipFilePath, String DestFilePath) throws IOException {
        File Destination_Directory = new File(DestFilePath);
        if (!Destination_Directory.exists()) {
        	Destination_Directory.mkdirs();
        }
        ZipInputStream Zip_Input_Stream = new ZipInputStream(new FileInputStream(ZipFilePath));
        ZipEntry Zip_Entry = Zip_Input_Stream.getNextEntry();

        while (Zip_Entry != null) {
            String File_Path = DestFilePath + File.separator + Zip_Entry.getName();
            if (!Zip_Entry.isDirectory()) {

                extractFile(Zip_Input_Stream, File_Path);
            } else {

                File directory = new File(File_Path);
                directory.mkdirs();
            }
            Zip_Input_Stream.closeEntry();
            Zip_Entry = Zip_Input_Stream.getNextEntry();
        }
        Zip_Input_Stream.close();
    }

    private static void extractFile(ZipInputStream Zip_Input_Stream, String File_Path) throws IOException {
        BufferedOutputStream Buffered_Output_Stream = new BufferedOutputStream(new FileOutputStream(File_Path));
        byte[] Bytes = new byte[BUFFER_SIZE];
        int Read_Byte = 0;
        while ((Read_Byte = Zip_Input_Stream.read(Bytes)) != -1) {
        	Buffered_Output_Stream.write(Bytes, 0, Read_Byte);
        }
        Buffered_Output_Stream.close();
    }

    public void extraerZip() throws IOException {
    	JFileChooser fc = new JFileChooser("O:\\Mexico\\Trade Compliance\\GLOSA");
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("*.zip", "zip");
        fc.setFileFilter(filtro);
        fc.showOpenDialog(null);
        File fileZip = fc.getSelectedFile();
        
        String ZipFilePath = fileZip.getAbsolutePath();
        
        String año = frmPopUpInsertarGlosa.cmbAñopopInsertarGlosa.getSelectedItem().toString();
        String mes = frmPopUpInsertarGlosa.cmbMespopInsertarGlosa.getSelectedItem().toString();
        String numMes = numeroMes(frmPopUpInsertarGlosa.cmbMespopInsertarGlosa.getSelectedItem().toString());
        
    	String DestFilePath = "O:\\Mexico\\Trade Compliance\\GLOSA\\GLOSAPRUEBA" 
                + año + "\\" +numMes + " " + mes + " " + año + "\\" + fileZip.getName().substring(1,fileZip.getName().indexOf("."));
    	unzip(ZipFilePath, DestFilePath);
        System.out.println("Zip File extracted Successfully");
        insertarGlosaComprimido(DestFilePath);
    }
    
    //Listamos los archivos de nuestra carpeta descomprimida para poder leerlo
    public void insertarGlosaComprimido(String GlosaPath){
        File carpeta = new File(GlosaPath);
        String[] listado = carpeta.list();
        
        if (listado == null || listado.length == 0) {
            System.out.println("No hay elementos dentro de la carpeta actual");
            JOptionPane.showMessageDialog(null, "No hay elementos dentro de la carpeta actual: " + GlosaPath);
            return;
        }
        else {
            for (int i=0; i< listado.length; i++) {
                String glosa = listado[i].substring(listado[i].indexOf("_") + 1, listado[i].indexOf("_") + 4);
                File file = new File(GlosaPath + "\\" +listado[i]);
                seleccionarGlosa(file, glosa);
            }
            JOptionPane.showMessageDialog(null, "Carga completada");
            
        }
    }
    
    public void insertarGlosaIndividual(){
        JFileChooser fc = new JFileChooser("O:\\Mexico\\Trade Compliance\\GLOSA");
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("*.txt, .asc", "txt", "asc");
        fc.setFileFilter(filtro);
        fc.showOpenDialog(null);
        File file = fc.getSelectedFile();
        String glosa = file.getName().substring(file.getName().indexOf("_") + 1, file.getName().indexOf("_") + 4);
        seleccionarGlosa(file, glosa);
        JOptionPane.showMessageDialog(null, "Carga completada");
        
    }
    
    public void seleccionarGlosa(File file, String glosaNombre){
        
        switch (glosaNombre) {
            case "501":
                try {
                insertarGlosa501(file);
                System.out.println("Insertado Glosa 501 terminado");
            } catch (IOException ex) {
                Logger.getLogger(CtrlAdministrar.class.getName()).log(Level.SEVERE, null, ex);
            }
            break;
            case "502":
                        try {
                insertarGlosa502(file);
                System.out.println("Insertado Glosa 502 terminado");
            } catch (IOException ex) {
                Logger.getLogger(CtrlAdministrar.class.getName()).log(Level.SEVERE, null, ex);
            }
            break;
            case "503":
                        try {
                insertarGlosa503(file);
                System.out.println("Insertado Glosa 503 terminado");
            } catch (IOException ex) {
                Logger.getLogger(CtrlAdministrar.class.getName()).log(Level.SEVERE, null, ex);
            }
            break;
            case "504":
                        try {
                insertarGlosa504(file);
                System.out.println("Insertado Glosa 504 terminado");
            } catch (IOException ex) {
                Logger.getLogger(CtrlAdministrar.class.getName()).log(Level.SEVERE, null, ex);
            }
            break;
            case "505":
                        try {
                insertarGlosa505(file);
                System.out.println("Insertado Glosa 505 terminado");
            } catch (IOException ex) {
                Logger.getLogger(CtrlAdministrar.class.getName()).log(Level.SEVERE, null, ex);
            }
            break;
            case "506":
                        try {
                insertarGlosa506(file);
                System.out.println("Insertado Glosa 506 terminado");
            } catch (IOException ex) {
                Logger.getLogger(CtrlAdministrar.class.getName()).log(Level.SEVERE, null, ex);
            }
            break;
            case "507":
                        try {
                insertarGlosa507(file);
                System.out.println("Insertado Glosa 507 terminado");
            } catch (IOException ex) {
                Logger.getLogger(CtrlAdministrar.class.getName()).log(Level.SEVERE, null, ex);
            }
            break;
            case "508":
                        try {
                insertarGlosa508(file);
                System.out.println("Insertado Glosa 508 terminado");
            } catch (IOException ex) {
                Logger.getLogger(CtrlAdministrar.class.getName()).log(Level.SEVERE, null, ex);
            }
            break;
            case "509":
                        try {
                insertarGlosa509(file);
                System.out.println("Insertado Glosa 509 terminado");
            } catch (IOException ex) {
                Logger.getLogger(CtrlAdministrar.class.getName()).log(Level.SEVERE, null, ex);
            }
            break;
            case "510":
                        try {
                insertarGlosa510(file);
                System.out.println("Insertado Glosa 510 terminado");
            } catch (IOException ex) {
                Logger.getLogger(CtrlAdministrar.class.getName()).log(Level.SEVERE, null, ex);
            }
            break;
            case "511":
                        try {
                insertarGlosa511(file);
                System.out.println("Insertado Glosa 511 terminado");
            } catch (IOException ex) {
                Logger.getLogger(CtrlAdministrar.class.getName()).log(Level.SEVERE, null, ex);
            }
            break;
            case "512":
                        try {
                insertarGlosa512(file);
                System.out.println("Insertado Glosa 512 terminado");
            } catch (IOException ex) {
                Logger.getLogger(CtrlAdministrar.class.getName()).log(Level.SEVERE, null, ex);
            }
            break;
            case "520":
                        try {
                insertarGlosa520(file);
                System.out.println("Insertado Glosa 520 terminado");
            } catch (IOException ex) {
                Logger.getLogger(CtrlAdministrar.class.getName()).log(Level.SEVERE, null, ex);
            }
            break;
            case "551":
                        try {
                insertarGlosa551(file);
                System.out.println("Insertado Glosa 551 terminado");
            } catch (IOException ex) {
                Logger.getLogger(CtrlAdministrar.class.getName()).log(Level.SEVERE, null, ex);
            }
            break;
            case "552":
                        try {
                insertarGlosa552(file);
                System.out.println("Insertado Glosa 552 terminado");
            } catch (IOException ex) {
                Logger.getLogger(CtrlAdministrar.class.getName()).log(Level.SEVERE, null, ex);
            }
            break;
            case "553":
                        try {
                insertarGlosa553(file);
                System.out.println("Insertado Glosa 553 terminado");
            } catch (IOException ex) {
                Logger.getLogger(CtrlAdministrar.class.getName()).log(Level.SEVERE, null, ex);
            }
            break;
            case "554":
                        try {
                insertarGlosa554(file);
                System.out.println("Insertado Glosa 554 terminado");
            } catch (IOException ex) {
                Logger.getLogger(CtrlAdministrar.class.getName()).log(Level.SEVERE, null, ex);
            }
            break;
            case "555":
                        try {
                insertarGlosa555(file);
                System.out.println("Insertado Glosa 555 terminado");
            } catch (IOException ex) {
                Logger.getLogger(CtrlAdministrar.class.getName()).log(Level.SEVERE, null, ex);
            }
            break;
            case "556":
                        try {
                insertarGlosa556(file);
                System.out.println("Insertado Glosa 556 terminado");
            } catch (IOException ex) {
                Logger.getLogger(CtrlAdministrar.class.getName()).log(Level.SEVERE, null, ex);
            }
            break;
            case "557":
                        try {
                insertarGlosa557(file);
                System.out.println("Insertado Glosa 557 terminado");
            } catch (IOException ex) {
                Logger.getLogger(CtrlAdministrar.class.getName()).log(Level.SEVERE, null, ex);
            }
            break;
            case "558":
                        try {
                insertarGlosa558(file);
                System.out.println("Insertado Glosa 558 terminado");
            } catch (IOException ex) {
                Logger.getLogger(CtrlAdministrar.class.getName()).log(Level.SEVERE, null, ex);
            }
            break;
            case "701":
                        try {
                insertarGlosa701(file);
                System.out.println("Insertado Glosa 701 terminado");
            } catch (IOException ex) {
                Logger.getLogger(CtrlAdministrar.class.getName()).log(Level.SEVERE, null, ex);
            }
            break;
            case "702":
                        try {
                insertarGlosa702(file);
                System.out.println("Insertado Glosa 702 terminado");
            } catch (IOException ex) {
                Logger.getLogger(CtrlAdministrar.class.getName()).log(Level.SEVERE, null, ex);
            }
            break;
        }
    }
    
    public void insertarGlosa501(File file) throws IOException{
        
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
        String linea = "";
        String patente, pedimento, seccionAduanera, tipoOperacion, claveDocumento, seccionAduaneraEntrada, curpContribuyente,
                    rfc, curpAgenteA, medioTransporteSalida, medioTransporteArribo, medioTransporteEntrada_Salida, destinoMercancia, nombreContribuyente, calleContribuyente,
                    numeroContribuyente, numExteriorContribuyente, cpContribuyente, municipioContribuyente, entidadFedContribuyente, paisContribuyente,
                    tipoPedimento, fechaRecepcionPedimento, fechaPagoReal;
        Double tipoCambio, pesoBrutoMercancia;
        int totalFletes, totalSeguros, totalEmbalajes, totalIncrementables, totalDeducibles;
        SimpleDateFormat dateFormatSQL = new SimpleDateFormat("yyyy-MM-dd");
        
        int n = 1;
        
        while (((linea = br.readLine()) != null)) {
            if (n == 1) {
                n++;
            } else {
                
                patente = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                pedimento = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                seccionAduanera = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                tipoOperacion = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                claveDocumento = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                seccionAduaneraEntrada = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                curpContribuyente = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                rfc = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                curpAgenteA = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                tipoCambio = Double.parseDouble(linea.substring(0, linea.indexOf('|')));
                linea = linea.substring(linea.indexOf('|') + 1);
                totalFletes = Integer.parseInt(linea.substring(0, linea.indexOf('|')));
                linea = linea.substring(linea.indexOf('|') + 1);
                totalSeguros = Integer.parseInt(linea.substring(0, linea.indexOf('|')));
                linea = linea.substring(linea.indexOf('|') + 1);
                totalEmbalajes = Integer.parseInt(linea.substring(0, linea.indexOf('|')));
                linea = linea.substring(linea.indexOf('|') + 1);
                totalIncrementables = Integer.parseInt(linea.substring(0, linea.indexOf('|')));
                linea = linea.substring(linea.indexOf('|') + 1);
                totalDeducibles = Integer.parseInt(linea.substring(0, linea.indexOf('|')));
                linea = linea.substring(linea.indexOf('|') + 1);
                pesoBrutoMercancia = Double.parseDouble(linea.substring(0, linea.indexOf('|')));
                linea = linea.substring(linea.indexOf('|') + 1);
                medioTransporteSalida = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                medioTransporteArribo = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                medioTransporteEntrada_Salida = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                destinoMercancia = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                nombreContribuyente = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                calleContribuyente = linea.substring(0, linea.indexOf('|'));linea = linea.substring(linea.indexOf('|') + 1);
                numeroContribuyente = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                numExteriorContribuyente = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                cpContribuyente = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                municipioContribuyente = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                entidadFedContribuyente = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                paisContribuyente = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                tipoPedimento = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                fechaRecepcionPedimento = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                fechaPagoReal = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                    
                modGlosa501.setPatente(patente);
                modGlosa501.setPedimento(pedimento);
                modGlosa501.setSeccionAduanera(seccionAduanera);
                modGlosa501.setTipoOperacion(tipoOperacion);
                modGlosa501.setClaveDocumento(claveDocumento);
                modGlosa501.setSeccionAduaneraEntrada(seccionAduaneraEntrada);
                modGlosa501.setCurpContribuyente(curpContribuyente);
                modGlosa501.setRfc(rfc);
                modGlosa501.setCurpAgenteA(curpAgenteA);
                modGlosa501.setTipoCambio(tipoCambio);
                modGlosa501.setTotalFletes(totalFletes);
                modGlosa501.setTotalSeguros(totalSeguros);
                modGlosa501.setTotalEmbalajes(totalEmbalajes);
                modGlosa501.setTotalIncrementables(totalIncrementables);
                modGlosa501.setTotalDeducibles(totalDeducibles);
                modGlosa501.setPesoBrutoMercancia(pesoBrutoMercancia);
                modGlosa501.setMedioTransporteSalida(medioTransporteSalida);
                modGlosa501.setMedioTransporteArribo(medioTransporteArribo);
                modGlosa501.setMedioTransporteEntrada_Salida(medioTransporteEntrada_Salida);
                modGlosa501.setDestinoMercancia(destinoMercancia);
                modGlosa501.setNombreContribuyente(nombreContribuyente);
                modGlosa501.setCalleContribuyente(calleContribuyente);
                modGlosa501.setNumeroContribuyente(numeroContribuyente);
                modGlosa501.setNumExteriorContribuyente(numExteriorContribuyente);
                modGlosa501.setCPContribuyente(cpContribuyente);
                modGlosa501.setMunicipioContribuyente(municipioContribuyente);
                modGlosa501.setEntidadFedContribuyente(entidadFedContribuyente);
                modGlosa501.setPaisContribuyente(paisContribuyente);
                modGlosa501.setTipoPedimento(tipoPedimento);
                Date parsed = dateFormatSQL.parse(fechaRecepcionPedimento);
                java.sql.Date fechaRecepcionPedimentoSQL = new java.sql.Date(parsed.getTime());
                modGlosa501.setFechaRecepcionPedimento(fechaRecepcionPedimentoSQL);
                Date parsed1 = dateFormatSQL.parse(fechaPagoReal);
                java.sql.Date fechaPagoRealSQL = new java.sql.Date(parsed1.getTime());
                modGlosa501.setFechaPagoReal(fechaPagoRealSQL);
                modcGlosa501.registrar(modGlosa501);
            }
        }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CtrlAdministrar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(CtrlAdministrar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void insertarGlosa502(File file) throws IOException{
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
        String linea = "";
        String patente, pedimento, seccionAduanera, rfcTransportista, curpTransportista, nombreTransportista, paisTransporte, identificadorTransporte, fechaPagoReal;
        SimpleDateFormat dateFormatSQL = new SimpleDateFormat("yyyy-MM-dd");
        
        int n = 1;
        
        while (((linea = br.readLine()) != null)) {
            if (n == 1) {
                n++;
            } else {
                
                patente = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                pedimento = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                seccionAduanera = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                rfcTransportista = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                curpTransportista = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                nombreTransportista = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                paisTransporte = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                identificadorTransporte = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                fechaPagoReal = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                    
                modGlosa502.setPatente(patente);
                modGlosa502.setPedimento(pedimento);
                modGlosa502.setSeccionAduanera(seccionAduanera);
                modGlosa502.setRfcTransportista(rfcTransportista);
                modGlosa502.setCurpTransportista(curpTransportista);
                modGlosa502.setNombreTransportista(nombreTransportista);
                modGlosa502.setPaisTransporte(paisTransporte);
                modGlosa502.setIdentificadorTransporte(identificadorTransporte);
                Date parsed1 = dateFormatSQL.parse(fechaPagoReal);
                java.sql.Date fechaPagoRealSQL = new java.sql.Date(parsed1.getTime());
                modGlosa502.setFechaPagoReal(fechaPagoRealSQL);
                modcGlosa502.registrar(modGlosa502);
            }
        }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CtrlAdministrar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(CtrlAdministrar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void insertarGlosa503(File file) throws IOException{
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
        String linea = "";
        String patente, pedimento, seccionAduanera, numeroGuia, tipoGuia, fechaPagoReal;
        
        SimpleDateFormat dateFormatSQL = new SimpleDateFormat("yyyy-MM-dd");
        
        int n = 1;
        
        while (((linea = br.readLine()) != null)) {
            if (n == 1) {
                n++;
            } else {
                
                patente = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                pedimento = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                seccionAduanera = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                numeroGuia = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                tipoGuia = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                fechaPagoReal = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                    
                modGlosa503.setPatente(patente);
                modGlosa503.setPedimento(pedimento);
                modGlosa503.setSeccionAduanera(seccionAduanera);
                modGlosa503.setNumeroGuia(numeroGuia);
                modGlosa503.setTipoGuia(tipoGuia);
                Date parsed1 = dateFormatSQL.parse(fechaPagoReal);
                java.sql.Date fechaPagoRealSQL = new java.sql.Date(parsed1.getTime());
                modGlosa503.setFechaPagoReal(fechaPagoRealSQL);
                modcGlosa503.registrar(modGlosa503);
            }
        }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CtrlAdministrar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(CtrlAdministrar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void insertarGlosa504(File file) throws IOException{
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String linea = "";
            String patente, pedimento, seccionAduanera, numContenedor, tipoContenedor, fechaPagoReal;
        
        SimpleDateFormat dateFormatSQL = new SimpleDateFormat("yyyy-MM-dd");
        
        int n = 1;
        
        while (((linea = br.readLine()) != null)) {
            if (n == 1) {
                n++;
            } else {
                
                patente = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                pedimento = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                seccionAduanera = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                numContenedor = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                tipoContenedor = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                fechaPagoReal = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                    
                modGlosa504.setPatente(patente);
                modGlosa504.setPedimento(pedimento);
                modGlosa504.setSeccionAduanera(seccionAduanera);
                modGlosa504.setNumContenedor(numContenedor);
                modGlosa504.setTipoContenedor(tipoContenedor);
                Date parsed1 = dateFormatSQL.parse(fechaPagoReal);
                java.sql.Date fechaPagoRealSQL = new java.sql.Date(parsed1.getTime());
                modGlosa504.setFechaPagoReal(fechaPagoRealSQL);
                modcGlosa504.registrar(modGlosa504);
            }
        }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CtrlAdministrar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(CtrlAdministrar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void insertarGlosa505(File file) throws IOException{
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String linea = "";
            String patente, pedimento, seccionAduanera, numeroFactura, terminoFacturacion, monedaFacturacion, paisFacturacion, entidadFedFacturacion,
                    indentFiscalProveedor, proveedorMercancia, calleProveedor, numInteriorProveedor, numExteriorProveedor,
                    cpProveedor, municipioProveedor, fechaPagoReal, FechaFacturacion;
            Double valorDolares, valorMonedaExtranjera;
            
        
        SimpleDateFormat dateFormatSQL = new SimpleDateFormat("yyyy-MM-dd");
        
        int n = 1;
        
        while (((linea = br.readLine()) != null)) {
            if (n == 1) {
                n++;
            } else {
                
                patente = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                pedimento = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                seccionAduanera = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                
                FechaFacturacion = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                numeroFactura = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                terminoFacturacion = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                monedaFacturacion = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                valorDolares = Double.parseDouble(linea.substring(0, linea.indexOf('|')));
                linea = linea.substring(linea.indexOf('|') + 1);
                valorMonedaExtranjera = Double.parseDouble(linea.substring(0, linea.indexOf('|')));
                linea = linea.substring(linea.indexOf('|') + 1);
                paisFacturacion = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                entidadFedFacturacion = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                indentFiscalProveedor = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                proveedorMercancia = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                calleProveedor = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                numInteriorProveedor = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                numExteriorProveedor = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                cpProveedor = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                municipioProveedor = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                
                fechaPagoReal = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                    
                modGlosa505.setPatente(patente);
                modGlosa505.setPedimento(pedimento);
                modGlosa505.setSeccionAduanera(seccionAduanera);
                Date parsed2 = dateFormatSQL.parse(FechaFacturacion);
                java.sql.Date fechaFacturacionSQL = new java.sql.Date(parsed2.getTime());
                modGlosa505.setFechaFacturacion(fechaFacturacionSQL);
                modGlosa505.setNumeroFactura(numeroFactura);
                modGlosa505.setTerminoFacturacion(terminoFacturacion);
                modGlosa505.setMonedaFacturacion(monedaFacturacion);
                modGlosa505.setValorDolares(valorDolares);
                modGlosa505.setValorMonedaExtranjera(valorMonedaExtranjera);
                modGlosa505.setPaisFacturacion(paisFacturacion);
                modGlosa505.setEntidadFedFacturacion(entidadFedFacturacion);
                modGlosa505.setIndentFiscalProveedor(indentFiscalProveedor);
                modGlosa505.setProveedorMercancia(proveedorMercancia);
                modGlosa505.setCalleProveedor(calleProveedor);
                modGlosa505.setNumInteriorProveedor(numInteriorProveedor);
                modGlosa505.setNumExteriorProveedor(numExteriorProveedor);
                modGlosa505.setCpProveedor(cpProveedor);
                modGlosa505.setMunicipioProveedor(municipioProveedor);
                Date parsed1 = dateFormatSQL.parse(fechaPagoReal);
                java.sql.Date fechaPagoRealSQL = new java.sql.Date(parsed1.getTime());
                modGlosa505.setFechaPagoReal(fechaPagoRealSQL);
                
                modcGlosa505.registrar(modGlosa505);
            }
        }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CtrlAdministrar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(CtrlAdministrar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void insertarGlosa506(File file) throws IOException{
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String linea = "";
            String patente, pedimento, seccionAduanera, tipoFecha, fechaOperacion, fechaValidacionPagoR;
        
        SimpleDateFormat dateFormatSQL = new SimpleDateFormat("yyyy-MM-dd");
        
        int n = 1;
        
        while (((linea = br.readLine()) != null)) {
            if (n == 1) {
                n++;
            } else {
                
                patente = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                pedimento = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                seccionAduanera = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                tipoFecha = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                fechaOperacion = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                fechaValidacionPagoR = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                    
                modGlosa506.setPatente(patente);
                modGlosa506.setPedimento(pedimento);
                modGlosa506.setSeccionAduanera(seccionAduanera);
                modGlosa506.setTipoFecha(tipoFecha);
                
                Date parsed2 = dateFormatSQL.parse(fechaOperacion);
                java.sql.Date fechaOperacionSQL = new java.sql.Date(parsed2.getTime());
                modGlosa506.setFechaOperacion(fechaOperacionSQL);
                
                Date parsed3 = dateFormatSQL.parse(fechaValidacionPagoR);
                java.sql.Date fechaValidacionPagoRSQL = new java.sql.Date(parsed3.getTime());
                modGlosa506.setFechaValidacionPagoR(fechaValidacionPagoRSQL);
                
                modcGlosa506.registrar(modGlosa506);
            }
        }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CtrlAdministrar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(CtrlAdministrar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void insertarGlosa507(File file) throws IOException{
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String linea = "";
            String patente, pedimento, seccionAduanera, claveCaso, identificadorCaso, tipoPedimento, complementoCaso, fechaValidacionPagoR;
            SimpleDateFormat dateFormatSQL = new SimpleDateFormat("yyyy-MM-dd");
        
        int n = 1;
        
        while (((linea = br.readLine()) != null)) {
            if (n == 1) {
                n++;
            } else {
                
                patente = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                pedimento = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                seccionAduanera = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                claveCaso = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                identificadorCaso = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                tipoPedimento = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                complementoCaso = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                fechaValidacionPagoR = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                
                    
                modGlosa507.setPatente(patente);
                modGlosa507.setPedimento(pedimento);
                modGlosa507.setSeccionAduanera(seccionAduanera);
                modGlosa507.setClaveCaso(claveCaso);
                modGlosa507.setIdentificadorCaso(identificadorCaso);
                modGlosa507.setTipoPedimento(tipoPedimento);
                modGlosa507.setComplementoCaso(complementoCaso);
                
                Date parsed1 = dateFormatSQL.parse(fechaValidacionPagoR);
                java.sql.Date fechaValidacionPagoRSQL = new java.sql.Date(parsed1.getTime());
                modGlosa507.setFechaValidacionPagoR(fechaValidacionPagoRSQL);
                modcGlosa507.registrar(modGlosa507);
            }
        }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CtrlAdministrar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(CtrlAdministrar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void insertarGlosa508(File file) throws IOException{
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String linea = "";
            String patente, pedimento, seccionAduanera, institucionEmisora, numeroCuenta, folioConstancia,
                    fechaConstancia, tipoCuenta, claveGarantia, totalGarantia, cantidadUnidades,
                    titulosAsignados, fechaPagoReal;
            Double valorUnitarioTitulo;
            SimpleDateFormat dateFormatSQL = new SimpleDateFormat("yyyy-MM-dd");
        
        int n = 1;
        
        while (((linea = br.readLine()) != null)) {
            if (n == 1) {
                n++;
            } else {
                
                patente = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                pedimento = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                seccionAduanera = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                institucionEmisora = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                numeroCuenta = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                folioConstancia = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                fechaConstancia = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                tipoCuenta = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                claveGarantia = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                valorUnitarioTitulo = Double.parseDouble(linea.substring(0, linea.indexOf('|')));
                linea = linea.substring(linea.indexOf('|') + 1);
                totalGarantia = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                cantidadUnidades = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                titulosAsignados = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                fechaPagoReal = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                
                    
                modGlosa508.setPatente(patente);
                modGlosa508.setPedimento(pedimento);
                modGlosa508.setSeccionAduanera(seccionAduanera);
                modGlosa508.setInstitucionEmisora(institucionEmisora);
                modGlosa508.setNumeroCuenta(numeroCuenta);
                modGlosa508.setFolioConstancia(folioConstancia);
                
                Date parsed2 = dateFormatSQL.parse(fechaConstancia);
                java.sql.Date fechaConstanciaSQL = new java.sql.Date(parsed2.getTime());
                modGlosa508.setFechaPagoReal(fechaConstanciaSQL);
                
                modGlosa508.setTipoCuenta(tipoCuenta);
                modGlosa508.setClaveGarantia(claveGarantia);
                modGlosa508.setValorUnitarioTitulo(valorUnitarioTitulo);
                modGlosa508.setTotalGarantia(totalGarantia);
                modGlosa508.setCantidadUnidades(cantidadUnidades);
                modGlosa508.setTitulosAsignados(titulosAsignados);
                
                Date parsed1 = dateFormatSQL.parse(fechaPagoReal);
                java.sql.Date fechaPagoRealSQL = new java.sql.Date(parsed1.getTime());
                modGlosa508.setFechaPagoReal(fechaPagoRealSQL);
                
                
                modcGlosa508.registrar(modGlosa508);
            }
        }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CtrlAdministrar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(CtrlAdministrar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void insertarGlosa509(File file) throws IOException{
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String linea = "";
            String patente, pedimento, seccionAduanera, claveContribucion, tasaContribucion, tipoTasa, tipoPedimento, fechaPagoReal;
            SimpleDateFormat dateFormatSQL = new SimpleDateFormat("yyyy-MM-dd");
        
        int n = 1;
        
        while (((linea = br.readLine()) != null)) {
            if (n == 1) {
                n++;
            } else {
                
                patente = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                pedimento = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                seccionAduanera = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                claveContribucion = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                tasaContribucion = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                tipoTasa = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                tipoPedimento = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                fechaPagoReal = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                
                
                    
                modGlosa509.setPatente(patente);
                modGlosa509.setPedimento(pedimento);
                modGlosa509.setSeccionAduanera(seccionAduanera);
                modGlosa509.setClaveContribucion(claveContribucion);
                modGlosa509.setTasaContribucion(tasaContribucion);
                modGlosa509.setTipoTasa(tipoTasa);
                modGlosa509.setTipoPedimento(tipoPedimento);
                
                Date parsed1 = dateFormatSQL.parse(fechaPagoReal);
                java.sql.Date fechaPagoRealSQL = new java.sql.Date(parsed1.getTime());
                modGlosa509.setFechaPagoReal(fechaPagoRealSQL);
                
                modcGlosa509.registrar(modGlosa509);
            }
        }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CtrlAdministrar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(CtrlAdministrar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void insertarGlosa510(File file) throws IOException{
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String linea = "";
            String patente, pedimento, seccionAduanera, claveContribucion,formaPago, tipoPedimento, fechaPagoReal;
            Double importePago;
            
            SimpleDateFormat dateFormatSQL = new SimpleDateFormat("yyyy-MM-dd");
        
        int n = 1;
        
        while (((linea = br.readLine()) != null)) {
            if (n == 1) {
                n++;
            } else {
                
                patente = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                pedimento = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                seccionAduanera = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                claveContribucion = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                formaPago = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                importePago = Double.parseDouble(linea.substring(0, linea.indexOf('|')));
                linea = linea.substring(linea.indexOf('|') + 1);
                tipoPedimento = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                fechaPagoReal = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                
                    
                modGlosa510.setPatente(patente);
                modGlosa510.setPedimento(pedimento);
                modGlosa510.setSeccionAduanera(seccionAduanera);
                modGlosa510.setClaveContribucion(claveContribucion);
                modGlosa510.setFormaPago(formaPago);
                modGlosa510.setImportePago(importePago);
                modGlosa510.setTipoPedimento(tipoPedimento);
                
                Date parsed1 = dateFormatSQL.parse(fechaPagoReal);
                java.sql.Date fechaPagoRealSQL = new java.sql.Date(parsed1.getTime());
                modGlosa510.setFechaPagoReal(fechaPagoRealSQL);
                
                modcGlosa510.registrar(modGlosa510);
            }
        }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CtrlAdministrar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(CtrlAdministrar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void insertarGlosa511(File file) throws IOException{
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String linea = "";
            String patente, pedimento, seccionAduanera, secuenciaObservacion, observaciones, tipoPedimento, fechaValidacionPagoR;
            
            SimpleDateFormat dateFormatSQL = new SimpleDateFormat("yyyy-MM-dd");
        
        int n = 1;
        
        while (((linea = br.readLine()) != null)) {
            if (n == 1) {
                n++;
            } else {
                
                patente = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                pedimento = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                seccionAduanera = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                secuenciaObservacion = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                observaciones = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                tipoPedimento = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                fechaValidacionPagoR = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                
                    
                modGlosa511.setPatente(patente);
                modGlosa511.setPedimento(pedimento);
                modGlosa511.setSeccionAduanera(seccionAduanera);
                modGlosa511.setSecuenciaObservacion(secuenciaObservacion);
                modGlosa511.setObservaciones(observaciones);
                modGlosa511.setTipoPedimento(tipoPedimento);
                
                Date parsed1 = dateFormatSQL.parse(fechaValidacionPagoR);
                java.sql.Date fechaValidacionPagoRSQL = new java.sql.Date(parsed1.getTime());
                modGlosa511.setFechaValidacionPagoR(fechaValidacionPagoRSQL);
                
                modcGlosa511.registrar(modGlosa511);
            }
        }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CtrlAdministrar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(CtrlAdministrar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void insertarGlosa512(File file) throws IOException{
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String linea = "";
            String patente, pedimento, seccionAduanera, patenteAduanalOrig, pedimentoOriginal, seccionAduaneraDespOrig,
                    documentoOriginal, fechaOperacionOrig, fraccionOriginal, unidadMedida, tipoPedimento, fechaPagoReal;
            Double mercanciaDescargada;
            
            SimpleDateFormat dateFormatSQL = new SimpleDateFormat("yyyy-MM-dd");
        
        int n = 1;
        
        while (((linea = br.readLine()) != null)) {
            if (n == 1) {
                n++;
            } else {
                
                patente = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                pedimento = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                seccionAduanera = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                patenteAduanalOrig = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                pedimentoOriginal = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                seccionAduaneraDespOrig = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                documentoOriginal = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                fechaOperacionOrig = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                fraccionOriginal = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                unidadMedida = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                mercanciaDescargada = Double.parseDouble(linea.substring(0, linea.indexOf('|')));
                linea = linea.substring(linea.indexOf('|') + 1);
                tipoPedimento = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                fechaPagoReal = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                
                    
                modGlosa512.setPatente(patente);
                modGlosa512.setPedimento(pedimento);
                modGlosa512.setSeccionAduanera(seccionAduanera);
                modGlosa512.setPatenteAduanalOrig(patenteAduanalOrig);
                modGlosa512.setPedimentoOriginal(pedimentoOriginal);
                modGlosa512.setSeccionAduaneraDespOrig(seccionAduaneraDespOrig);
                modGlosa512.setDocumentoOriginal(documentoOriginal);
                Date parsed1 = dateFormatSQL.parse(fechaOperacionOrig);
                java.sql.Date fechaOperacionOrigSQL = new java.sql.Date(parsed1.getTime());
                modGlosa512.setFechaOperacionOrig(fechaOperacionOrigSQL);
                
                modGlosa512.setFraccionOriginal(fraccionOriginal);
                modGlosa512.setUnidadMedida(unidadMedida);
                modGlosa512.setMercanciaDescargada(mercanciaDescargada);
                modGlosa512.setTipoPedimento(tipoPedimento);
                
                Date parsed2 = dateFormatSQL.parse(fechaPagoReal);
                java.sql.Date fechaPagoRealSQL = new java.sql.Date(parsed2.getTime());
                modGlosa512.setFechaPagoReal(fechaPagoRealSQL);
                
                modcGlosa512.registrar(modGlosa512);
            }
        }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CtrlAdministrar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(CtrlAdministrar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void insertarGlosa520(File file) throws IOException{
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String linea = "";
            String patente, pedimento, seccionAduanera, indentFiscalDestinatario, nombreDestinatarioMercancia,
                    calleDestinatario, numInteriorDestinatario, numExteriorDestinatario, cpDestinatario,
                    municpioDestinatario, paisDestinatario, fechaPagoReal;
            
            SimpleDateFormat dateFormatSQL = new SimpleDateFormat("yyyy-MM-dd");
        
        int n = 1;
        
        while (((linea = br.readLine()) != null)) {
            if (n == 1) {
                n++;
            } else {
                
                patente = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                pedimento = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                seccionAduanera = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                indentFiscalDestinatario = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                nombreDestinatarioMercancia = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                calleDestinatario = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                numInteriorDestinatario = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                numExteriorDestinatario = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                cpDestinatario = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                municpioDestinatario = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                paisDestinatario = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                fechaPagoReal = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                
                    
                modGlosa520.setPatente(patente);
                modGlosa520.setPedimento(pedimento);
                modGlosa520.setSeccionAduanera(seccionAduanera);
                modGlosa520.setIndentFiscalDestinatario(indentFiscalDestinatario);
                modGlosa520.setNombreDestinatarioMercancia(nombreDestinatarioMercancia);
                modGlosa520.setCalleDestinatario(calleDestinatario);
                modGlosa520.setNumInteriorDestinatario(numInteriorDestinatario);
                modGlosa520.setNumExteriorDestinatario(numExteriorDestinatario);
                modGlosa520.setCpDestinatario(cpDestinatario);
                modGlosa520.setMunicpioDestinatario(municpioDestinatario);
                modGlosa520.setPaisDestinatario(paisDestinatario);
                
                Date parsed1 = dateFormatSQL.parse(fechaPagoReal);
                java.sql.Date fechaPagoRealSQL = new java.sql.Date(parsed1.getTime());
                modGlosa520.setFechaPagoReal(fechaPagoRealSQL);
                
                modcGlosa520.registrar(modGlosa520);
            }
        }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CtrlAdministrar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(CtrlAdministrar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void insertarGlosa551(File file) throws IOException{
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String linea = "";
            String patente, pedimento, seccionAduanera, fraccion, secuenciaFraccion, subdivisionFraccion, descripcionMercancia,
                    claveVinculacion, metodoValorizacion, codigoMercanciaProducto,
                    marcaMercanciaProducto, modeloMercanciaProducto, paisOrigenDestino, paisCompradorVendedor, entidadFedOrigen, entidadFedDestino,
                    entidadFedComprador, entidadFedVendedor, tipoOperacion, claveDocumento, fechaPagoReal;
            Double precioUnitario, valorAduana, valorComercial, valorDolares, cantidadUMComercial, cantidadUMTarifa, valorAgregado;
            int unidadMedidaComercial, unidadMedidaTarifa;
            
            SimpleDateFormat dateFormatSQL = new SimpleDateFormat("yyyy-MM-dd");
        
        int n = 1;
        
        while (((linea = br.readLine()) != null)) {
            if (n == 1) {
                n++;
            } else {
                
                patente = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                pedimento = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                seccionAduanera = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                fraccion = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                secuenciaFraccion = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                subdivisionFraccion = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                descripcionMercancia = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                    precioUnitario = Double.parseDouble(linea.substring(0, linea.indexOf('|')));
                    linea = linea.substring(linea.indexOf('|') + 1);
                    valorAduana = Double.parseDouble(linea.substring(0, linea.indexOf('|')));
                    linea = linea.substring(linea.indexOf('|') + 1);
                    valorComercial = Double.parseDouble(linea.substring(0, linea.indexOf('|')));
                    linea = linea.substring(linea.indexOf('|') + 1);
                    valorDolares = Double.parseDouble(linea.substring(0, linea.indexOf('|')));
                    linea = linea.substring(linea.indexOf('|') + 1);
                    cantidadUMComercial = Double.parseDouble(linea.substring(0, linea.indexOf('|')));
                    linea = linea.substring(linea.indexOf('|') + 1);
                    unidadMedidaComercial = Integer.parseInt((linea.substring(0, linea.indexOf('|'))));
                    linea = linea.substring(linea.indexOf('|') + 1);
                    cantidadUMTarifa = Double.parseDouble(linea.substring(0, linea.indexOf('|')));
                    linea = linea.substring(linea.indexOf('|') + 1);
                    unidadMedidaTarifa = Integer.parseInt(linea.substring(0, linea.indexOf('|')));
                    linea = linea.substring(linea.indexOf('|') + 1);
                    valorAgregado = Double.parseDouble(linea.substring(0, linea.indexOf('|')));
                    linea = linea.substring(linea.indexOf('|') + 1);
                    claveVinculacion = linea.substring(0, linea.indexOf('|'));
                    linea = linea.substring(linea.indexOf('|') + 1);
                    metodoValorizacion = linea.substring(0, linea.indexOf('|'));
                    linea = linea.substring(linea.indexOf('|') + 1);
                    codigoMercanciaProducto = linea.substring(0, linea.indexOf('|'));
                    linea = linea.substring(linea.indexOf('|') + 1);
                    marcaMercanciaProducto = linea.substring(0, linea.indexOf('|'));
                    linea = linea.substring(linea.indexOf('|') + 1);
                    modeloMercanciaProducto = linea.substring(0, linea.indexOf('|'));
                    linea = linea.substring(linea.indexOf('|') + 1);
                    paisOrigenDestino = linea.substring(0, linea.indexOf('|'));
                    linea = linea.substring(linea.indexOf('|') + 1);
                    paisCompradorVendedor = linea.substring(0, linea.indexOf('|'));
                    linea = linea.substring(linea.indexOf('|') + 1);
                    entidadFedOrigen = linea.substring(0, linea.indexOf('|'));
                    linea = linea.substring(linea.indexOf('|') + 1);
                    entidadFedDestino = linea.substring(0, linea.indexOf('|'));
                    linea = linea.substring(linea.indexOf('|') + 1);
                    entidadFedComprador = linea.substring(0, linea.indexOf('|'));
                    linea = linea.substring(linea.indexOf('|') + 1);
                    entidadFedVendedor = linea.substring(0, linea.indexOf('|'));
                    linea = linea.substring(linea.indexOf('|') + 1);
                    tipoOperacion = linea.substring(0, linea.indexOf('|'));
                    linea = linea.substring(linea.indexOf('|') + 1);
                    claveDocumento = linea.substring(0, linea.indexOf('|'));
                    linea = linea.substring(linea.indexOf('|') + 1);
                    fechaPagoReal = linea.substring(0, linea.indexOf('|'));
                    linea = linea.substring(linea.indexOf('|') + 1);
                
                    
                modGlosa551.setPatente(patente);
                modGlosa551.setPedimento(pedimento);
                modGlosa551.setSeccionAduanera(seccionAduanera);
                modGlosa551.setFraccion(fraccion);
                modGlosa551.setSecuenciaFraccion(secuenciaFraccion);
                modGlosa551.setSubdivisionFraccion(subdivisionFraccion);
                modGlosa551.setDescripcionMercancia(descripcionMercancia);
                modGlosa551.setPrecioUnitario(precioUnitario);
                modGlosa551.setValorAduana(valorAduana);
                modGlosa551.setValorComercial(valorComercial);
                modGlosa551.setValorDolares(valorDolares);
                modGlosa551.setCantidadUMComercial(cantidadUMComercial);
                modGlosa551.setUnidadMedidaComercial(unidadMedidaComercial);
                modGlosa551.setCantidadUMTarifa(cantidadUMTarifa);
                modGlosa551.setUnidadMedidaTarifa(unidadMedidaTarifa);
                modGlosa551.setValorAgregado(valorAgregado);
                modGlosa551.setClaveVinculacion(claveVinculacion);
                modGlosa551.setMetodoValorizacion(metodoValorizacion);
                modGlosa551.setCodigoMercanciaProducto(codigoMercanciaProducto);
                modGlosa551.setMarcaMercanciaProducto(marcaMercanciaProducto);
                modGlosa551.setModeloMercanciaProducto(modeloMercanciaProducto);
                modGlosa551.setPaisOrigenDestino(paisOrigenDestino);
                modGlosa551.setPaisCompradorVendedor(paisCompradorVendedor);
                modGlosa551.setEntidadFedOrigen(entidadFedOrigen);
                modGlosa551.setEntidadFedDestino(entidadFedDestino);
                modGlosa551.setEntidadFedComprador(entidadFedComprador);
                modGlosa551.setEntidadFedVendedor(entidadFedVendedor);
                modGlosa551.setTipoOperacion(tipoOperacion);
                modGlosa551.setClaveDocumento(claveDocumento);
                
                Date parsed1 = dateFormatSQL.parse(fechaPagoReal);
                java.sql.Date fechaPagoRealSQL = new java.sql.Date(parsed1.getTime());
                modGlosa551.setFechaPagoReal(fechaPagoRealSQL);
                
                modcGlosa551.registrar(modGlosa551);
            }
        }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CtrlAdministrar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(CtrlAdministrar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void insertarGlosa552(File file) throws IOException{
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String linea = "";
            String patente, pedimento, seccionAduanera, fraccion, secuenciafraccion, vinnumeroserie, fechapagoreal;
            Double kilometrajevehiculo;
            
            SimpleDateFormat dateFormatSQL = new SimpleDateFormat("yyyy-MM-dd");
        
        int n = 1;
        
        while (((linea = br.readLine()) != null)) {
            if (n == 1) {
                n++;
            } else {
                
                patente = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                pedimento = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                seccionAduanera = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                fraccion = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                secuenciafraccion = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                vinnumeroserie = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                kilometrajevehiculo = Double.parseDouble(linea.substring(0, linea.indexOf('|')));
                linea = linea.substring(linea.indexOf('|') + 1);
                fechapagoreal = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                    
                modGlosa552.setPatente(patente);
                modGlosa552.setPedimento(pedimento);
                modGlosa552.setSeccionAduanera(seccionAduanera);
                modGlosa552.setFraccion(fraccion);
                modGlosa552.setSecuenciaFraccion(secuenciafraccion);
                modGlosa552.setVinNumeroSerie(vinnumeroserie);
                modGlosa552.setKilometrajeVehiculo(kilometrajevehiculo);
                
                Date parsed1 = dateFormatSQL.parse(fechapagoreal);
                java.sql.Date fechaPagoRealSQL = new java.sql.Date(parsed1.getTime());
                modGlosa552.setFechaPagoReal(fechaPagoRealSQL);
                
                modcGlosa552.registrar(modGlosa552);
            }
        }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CtrlAdministrar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(CtrlAdministrar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void insertarGlosa553(File file) throws IOException{
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String linea = "";
            String patente, pedimento, seccionAduanera, fraccion, secuenciafraccion,clavepermiso,
                    firmadescargo,numeropermiso,fechapagoreal;
            Double valorcomercialdolares, cantidadmumtarifa;
            
            SimpleDateFormat dateFormatSQL = new SimpleDateFormat("yyyy-MM-dd");
        
        int n = 1;
        
        while (((linea = br.readLine()) != null)) {
            if (n == 1) {
                n++;
            } else {
                
                patente = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                pedimento = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                seccionAduanera = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                fraccion = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                secuenciafraccion = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                clavepermiso = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                firmadescargo = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                numeropermiso = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                valorcomercialdolares = Double.parseDouble(linea.substring(0, linea.indexOf('|')));
                linea = linea.substring(linea.indexOf('|') + 1);
                if (linea.substring(0, linea.indexOf('|')).equals("")) {
                    cantidadmumtarifa = 0.0;
                }else{
                    cantidadmumtarifa = Double.parseDouble(linea.substring(0, linea.indexOf('|')));
                }
                linea = linea.substring(linea.indexOf('|') + 1);
                fechapagoreal = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                
                modGlosa553.setPatente(patente);
                modGlosa553.setPedimento(pedimento);
                modGlosa553.setSeccionAduanera(seccionAduanera);
                modGlosa553.setFraccion(fraccion);
                modGlosa553.setSecuenciaFraccion(secuenciafraccion);
                modGlosa553.setClavePermiso(clavepermiso);
                modGlosa553.setFirmaDescargo(firmadescargo);
                modGlosa553.setNumeroPermiso(numeropermiso);
                modGlosa553.setValorComercialDolares(valorcomercialdolares);
                modGlosa553.setCantidadMUMTarifa(cantidadmumtarifa);
                
                Date parsed1 = dateFormatSQL.parse(fechapagoreal);
                java.sql.Date fechaPagoRealSQL = new java.sql.Date(parsed1.getTime());
                modGlosa553.setFechaPagoReal(fechaPagoRealSQL);
                
                modcGlosa553.registrar(modGlosa553);
            }
        }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CtrlAdministrar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(CtrlAdministrar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void insertarGlosa554(File file) throws IOException{
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String linea = "";
            String patente, pedimento, seccionaduanera, fraccion, secuenciafraccion, clavecaso, 
                    identificadorcaso, complementocaso, fechapagoreal;
            
            SimpleDateFormat dateFormatSQL = new SimpleDateFormat("yyyy-MM-dd");
        
        int n = 1;
        
        while (((linea = br.readLine()) != null)) {
            if (n == 1) {
                n++;
            } else {
                
                patente = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                pedimento = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                seccionaduanera = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                fraccion = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                secuenciafraccion = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                clavecaso = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                identificadorcaso = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                complementocaso = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                fechapagoreal = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                
                modGlosa554.setPatente(patente);
                modGlosa554.setPedimento(pedimento);
                modGlosa554.setSeccionAduanera(seccionaduanera);
                modGlosa554.setFraccion(fraccion);
                modGlosa554.setSecuenciaFraccion(secuenciafraccion);
                modGlosa554.setClaveCaso(clavecaso);
                modGlosa554.setIdentificadorCaso(identificadorcaso);
                modGlosa554.setComplementoCaso(complementocaso);
                
                Date parsed1 = dateFormatSQL.parse(fechapagoreal);
                java.sql.Date fechaPagoRealSQL = new java.sql.Date(parsed1.getTime());
                modGlosa554.setFechaPagoReal(fechaPagoRealSQL);
                
                modcGlosa554.registrar(modGlosa554);
            }
        }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CtrlAdministrar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(CtrlAdministrar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void insertarGlosa555(File file) throws IOException{
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String linea = "";
            String patente, pedimento, seccionaduanera, fraccion, secuenciafraccion, institucionemisora, 
                    numerocuenta, folioconstancia, fechaconstancia, clavegarantia, 
                    totalgarantia, cantidadunidadesmedida, titulosasignados, fechapagoreal;
            Double valorunitariotitulo;
            
            SimpleDateFormat dateFormatSQL = new SimpleDateFormat("yyyy-MM-dd");
        
        int n = 1;
        
        while (((linea = br.readLine()) != null)) {
            if (n == 1) {
                n++;
            } else {
                
                patente = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                pedimento = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                seccionaduanera = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                fraccion = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                secuenciafraccion = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                institucionemisora = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                numerocuenta = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                folioconstancia = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                fechaconstancia = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                clavegarantia = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                valorunitariotitulo = Double.parseDouble(linea.substring(0, linea.indexOf('|')));
                linea = linea.substring(linea.indexOf('|') + 1);
                totalgarantia = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                cantidadunidadesmedida = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                titulosasignados = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                fechapagoreal = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                    
                modGlosa555.setPatente(patente);
                modGlosa555.setPedimento(pedimento);
                modGlosa555.setSeccionAduanera(seccionaduanera);
                modGlosa555.setFraccion(fraccion);
                modGlosa555.setSecuenciaFraccion(secuenciafraccion);
                modGlosa555.setInstitucionEmisora(institucionemisora);
                modGlosa555.setNumeroCuenta(numerocuenta);
                modGlosa555.setFolioConstancia(folioconstancia);
                Date parsed2 = dateFormatSQL.parse(fechaconstancia);
                java.sql.Date fechaconstanciaSQL = new java.sql.Date(parsed2.getTime());
                modGlosa555.setFechaConstancia(fechaconstanciaSQL);
                
                modGlosa555.setClaveGarantia(clavegarantia);
                modGlosa555.setValorUnitarioTitulo(valorunitariotitulo);
                modGlosa555.setTotalGarantia(totalgarantia);
                modGlosa555.setCantidadUnidadesMedida(cantidadunidadesmedida);
                modGlosa555.setTitulosAsignados(titulosasignados);
                
                Date parsed1 = dateFormatSQL.parse(fechapagoreal);
                java.sql.Date fechaPagoRealSQL = new java.sql.Date(parsed1.getTime());
                modGlosa555.setFechaPagoReal(fechaPagoRealSQL);
                
                modcGlosa555.registrar(modGlosa555);
            }
        }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CtrlAdministrar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(CtrlAdministrar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void insertarGlosa556(File file) throws IOException{
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String linea = "";
            String patente, pedimento, seccionaduanera, fraccion, secuenciafraccion, 
                    clavecontribucion, tipotasa, fechapagoreal;
            double tasacontribucion;
            
            SimpleDateFormat dateFormatSQL = new SimpleDateFormat("yyyy-MM-dd");
        
        int n = 1;
        
        while (((linea = br.readLine()) != null)) {
            if (n == 1) {
                n++;
            } else {
                
                patente = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                pedimento = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                seccionaduanera = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                fraccion = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                secuenciafraccion = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                clavecontribucion = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                tasacontribucion = Double.parseDouble(linea.substring(0, linea.indexOf('|')));
                linea = linea.substring(linea.indexOf('|') + 1);
                tipotasa = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                fechapagoreal = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                    
                modGlosa556.setPatente(patente);
                modGlosa556.setPedimento(pedimento);
                modGlosa556.setSeccionAduanera(seccionaduanera);
                modGlosa556.setFraccion(fraccion);
                modGlosa556.setSecuenciaFraccion(secuenciafraccion);
                modGlosa556.setClaveContribucion(clavecontribucion);
                modGlosa556.setTasaContribucion(tasacontribucion);
                modGlosa556.setTipoTasa(tipotasa);

                
                Date parsed1 = dateFormatSQL.parse(fechapagoreal);
                java.sql.Date fechaPagoRealSQL = new java.sql.Date(parsed1.getTime());
                modGlosa556.setFechaPagoReal(fechaPagoRealSQL);
                
                modcGlosa556.registrar(modGlosa556);
            }
        }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CtrlAdministrar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(CtrlAdministrar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void insertarGlosa557(File file) throws IOException{
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String linea = "";
            String patente, pedimento, seccionaduanera, fraccion, secuenciafraccion, clavecontribucion, formapago, fechavalidacionpagor;;
            Double importpago;
            
            SimpleDateFormat dateFormatSQL = new SimpleDateFormat("yyyy-MM-dd");
        
        int n = 1;
        
        while (((linea = br.readLine()) != null)) {
            if (n == 1) {
                n++;
            } else {
                
                patente = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                pedimento = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                seccionaduanera = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                fraccion = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                secuenciafraccion = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                clavecontribucion = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                formapago = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                importpago = Double.parseDouble(linea.substring(0, linea.indexOf('|')));
                linea = linea.substring(linea.indexOf('|') + 1);
                fechavalidacionpagor = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                    
                modGlosa557.setPatente(patente);
                modGlosa557.setPedimento(pedimento);
                modGlosa557.setSeccionAduanera(seccionaduanera);
                modGlosa557.setFraccion(fraccion);
                modGlosa557.setSecuenciaFraccion(secuenciafraccion);
                modGlosa557.setClaveContribucion(clavecontribucion);
                modGlosa557.setFormaPago(formapago);
                modGlosa557.setImportPago(importpago);
                
                Date parsed1 = dateFormatSQL.parse(fechavalidacionpagor);
                java.sql.Date fechavalidacionpagorSQL = new java.sql.Date(parsed1.getTime());
                modGlosa557.setFechaValidacionPagoR(fechavalidacionpagorSQL);
                
                modcGlosa557.registrar(modGlosa557);
            }
        }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CtrlAdministrar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(CtrlAdministrar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void insertarGlosa558(File file) throws IOException{
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String linea = "";
            String patente, pedimento, seccionaduanera, fraccion, secuenciafraccion, secuenciaobservacion, observaciones, fechapagoreal;
            Double kilometrajevehiculo;
            
            SimpleDateFormat dateFormatSQL = new SimpleDateFormat("yyyy-MM-dd");
        
        int n = 1;
        
        while (((linea = br.readLine()) != null)) {
            if (n == 1) {
                n++;
            } else {
                
                patente = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                pedimento = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                seccionaduanera = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                fraccion = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                secuenciafraccion = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                secuenciaobservacion = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                observaciones = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                fechapagoreal = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                    
                modGlosa558.setPatente(patente);
                modGlosa558.setPedimento(pedimento);
                modGlosa558.setSeccionAduanera(seccionaduanera);
                modGlosa558.setFraccion(fraccion);
                modGlosa558.setSecuenciaFraccion(secuenciafraccion);
                modGlosa558.setSecuenciaObservacion(secuenciaobservacion);
                modGlosa558.setObservaciones(observaciones);
                
                Date parsed1 = dateFormatSQL.parse(fechapagoreal);
                java.sql.Date fechaPagoRealSQL = new java.sql.Date(parsed1.getTime());
                modGlosa558.setFechaPagoReal(fechaPagoRealSQL);
                
                modcGlosa558.registrar(modGlosa558);
            }
        }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CtrlAdministrar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(CtrlAdministrar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void insertarGlosa701(File file) throws IOException{
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String linea = "";
            String patente, pedimento, seccionaduanera, clavedocumento, fechapago, pedimentoanterior, patenteanterior, 
                    seccionaduaneraanterior, documentoanterior, fechaoperacionanterior, pedimentooriginal, 
                    patenteaduanalorig, seccionaduanaldesporig, fechapagoreal;
            Double kilometrajevehiculo;
            
            SimpleDateFormat dateFormatSQL = new SimpleDateFormat("yyyy-MM-dd");
        
        int n = 1;
        
        while (((linea = br.readLine()) != null)) {
            if (n == 1) {
                n++;
            } else {
                
                patente = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                pedimento = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                seccionaduanera = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                clavedocumento = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                fechapago = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                pedimentoanterior = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                patenteanterior = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                seccionaduaneraanterior = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                documentoanterior = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                fechaoperacionanterior = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                pedimentooriginal = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                patenteaduanalorig = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                seccionaduanaldesporig = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                fechapagoreal = linea.substring(0, linea.indexOf('|'));
                    
                modGlosa701.setPatente(patente);
                modGlosa701.setPedimento(pedimento);
                modGlosa701.setSeccionAduanera(seccionaduanera);
                modGlosa701.setClaveDocumento(clavedocumento);
                Date parsed2 = dateFormatSQL.parse(fechapago);
                java.sql.Date fechapagoSQL = new java.sql.Date(parsed2.getTime());
                modGlosa701.setFechaPago(fechapagoSQL);
                
                modGlosa701.setPedimentoAnterior(pedimentoanterior);
                modGlosa701.setPatenteAnterior(patenteanterior);
                modGlosa701.setSeccionAduaneraAnterior(seccionaduaneraanterior);
                modGlosa701.setDocumentoAnterior(documentoanterior);
                Date parsed3 = dateFormatSQL.parse(fechaoperacionanterior);
                java.sql.Date fechaoperacionanteriorSQL = new java.sql.Date(parsed3.getTime());
                modGlosa701.setFechaOperacionAnterior(fechaoperacionanteriorSQL);
                
                modGlosa701.setPedimentoOriginal(pedimentooriginal);
                modGlosa701.setPatenteAduanalOrig(patenteaduanalorig);
                modGlosa701.setSeccionAduanalDespOrig(seccionaduanaldesporig);
                Date parsed1 = dateFormatSQL.parse(fechapagoreal);
                java.sql.Date fechaPagoRealSQL = new java.sql.Date(parsed1.getTime());
                modGlosa701.setFechaPagoReal(fechaPagoRealSQL);
                
                modcGlosa701.registrar(modGlosa701);
            }
        }
        } catch (FileNotFoundException | ParseException ex) {
            Logger.getLogger(CtrlAdministrar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void insertarGlosa702(File file) throws IOException{
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String linea = "";
            String patente, pedimento, seccionAduanera, clavecontribucion, formapago, tipopedimento, fechapagoreal;
            Double importepago;
            
            SimpleDateFormat dateFormatSQL = new SimpleDateFormat("yyyy-MM-dd");
        
        int n = 1;
        
        while (((linea = br.readLine()) != null)) {
            if (n == 1) {
                n++;
            } else {
                
                patente = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                pedimento = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                seccionAduanera = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                clavecontribucion = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                formapago = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                importepago = Double.parseDouble(linea.substring(0, linea.indexOf('|')));
                linea = linea.substring(linea.indexOf('|') + 1);
                tipopedimento = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                fechapagoreal = linea.substring(0, linea.indexOf('|'));
                linea = linea.substring(linea.indexOf('|') + 1);
                    
                modGlosa702.setPatente(patente);
                modGlosa702.setPedimento(pedimento);
                modGlosa702.setSeccionAduanera(seccionAduanera);
                modGlosa702.setClaveContribucion(clavecontribucion);
                modGlosa702.setFormaPago(formapago);
                modGlosa702.setImportePago(importepago);
                modGlosa702.setTipoPedimento(tipopedimento);

                Date parsed1 = dateFormatSQL.parse(fechapagoreal);
                java.sql.Date fechaPagoRealSQL = new java.sql.Date(parsed1.getTime());
                modGlosa702.setFechaPagoReal(fechaPagoRealSQL);
                
                modcGlosa702.registrar(modGlosa702);
            }
        }
        } catch (FileNotFoundException | ParseException ex) {
            Logger.getLogger(CtrlAdministrar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public String numeroMes(String mes){
        String numMes = "";
        
        switch(mes){
            case "Enero":
                numMes = "01";
                break;
            case "Febrero":
                numMes = "02";
                break;
            case "Marzo":
                numMes = "03";
                break;
            case "Abril":
                numMes = "04";
                break;
            case "Mayo":
                numMes = "05";
                break;
            case "Junio":
                numMes = "06";
                break;
            case "Julio":
                numMes = "07";
                break;
            case "Agosto":
                numMes = "08";
                break;
            case "Septiembre":
                numMes = "09";
                break;
            case "Octubre":
                numMes = "10";
                break;
            case "Noviembre":
                numMes = "11";
                break;
            case "Diciembre":
                numMes = "12";
                break;
            default:
                JOptionPane.showMessageDialog(null, "No se encontro el mes");
        }
        return numMes;
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
        if (ev.getSource() == frmPrincipal.btnCargarComprimidoAdministrarGlosa) {
            tipoCargaGlosa = 1;
            frmPopUpInsertarGlosa.setVisible(true);
            frmPopUpInsertarGlosa.setLocationRelativeTo(null);
            frmPopUpInsertarGlosa.setResizable(false);
            frmPopUpInsertarGlosa.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
            frmPrincipal.setEnabled(false);
        }
        if (ev.getSource() == frmPrincipal.btnCargarIndividualAdministrarGlosa) {
            tipoCargaGlosa = 2;
            frmPopUpInsertarGlosa.setVisible(true);
            frmPopUpInsertarGlosa.setLocationRelativeTo(null);
            frmPopUpInsertarGlosa.setResizable(false);
            frmPopUpInsertarGlosa.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
            frmPrincipal.setEnabled(false);
        }
        
        if (ev.getSource() == frmPopUpInsertarGlosa.btnAceptarPopUpInsertarGlosa) {
            try {
                if (tipoCargaGlosa == 1) {
                    extraerZip();
                }else{
                    insertarGlosaIndividual();
                }
            } catch (IOException ex) {
                Logger.getLogger(CtrlAdministrar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (ev.getSource() == frmPopUpInsertarGlosa.btnCancelarpopInsertarGlosa) {
            frmPopUpInsertarGlosa.setVisible(false);
            frmPrincipal.setEnabled(true);
            frmPrincipal.setVisible(true);
        }
        
    }
}