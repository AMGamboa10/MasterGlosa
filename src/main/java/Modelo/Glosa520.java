package Modelo;

import java.util.Date;

public class Glosa520 {

    private int id;
    private String Patente;
    private String Pedimento;
    private String SeccionAduanera;
    private String IndentFiscalDestinatario;
    private String NombreDestinatarioMercancia;
    private String CalleDestinatario;
    private String NumInteriorDestinatario;
    private String NumExteriorDestinatario;
    private String CpDestinatario;
    private String MunicpioDestinatario;
    private String PaisDestinatario;
    private Date FechaPagoReal;

    public Glosa520(int id, String Patente, String Pedimento, String SeccionAduanera, String IndentFiscalDestinatario, String NombreDestinatarioMercancia, String CalleDestinatario, String NumInteriorDestinatario, String NumExteriorDestinatario, String CpDestinatario, String MunicpioDestinatario, String PaisDestinatario, Date FechaPagoReal) {
        this.id = id;
        this.Patente = Patente;
        this.Pedimento = Pedimento;
        this.SeccionAduanera = SeccionAduanera;
        this.IndentFiscalDestinatario = IndentFiscalDestinatario;
        this.NombreDestinatarioMercancia = NombreDestinatarioMercancia;
        this.CalleDestinatario = CalleDestinatario;
        this.NumInteriorDestinatario = NumInteriorDestinatario;
        this.NumExteriorDestinatario = NumExteriorDestinatario;
        this.CpDestinatario = CpDestinatario;
        this.MunicpioDestinatario = MunicpioDestinatario;
        this.PaisDestinatario = PaisDestinatario;
        this.FechaPagoReal = FechaPagoReal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPatente() {
        return Patente;
    }

    public void setPatente(String Patente) {
        this.Patente = Patente;
    }

    public String getPedimento() {
        return Pedimento;
    }

    public void setPedimento(String Pedimento) {
        this.Pedimento = Pedimento;
    }

    public String getSeccionAduanera() {
        return SeccionAduanera;
    }

    public void setSeccionAduanera(String SeccionAduanera) {
        this.SeccionAduanera = SeccionAduanera;
    }

    public String getIndentFiscalDestinatario() {
        return IndentFiscalDestinatario;
    }

    public void setIndentFiscalDestinatario(String IndentFiscalDestinatario) {
        this.IndentFiscalDestinatario = IndentFiscalDestinatario;
    }

    public String getNombreDestinatarioMercancia() {
        return NombreDestinatarioMercancia;
    }

    public void setNombreDestinatarioMercancia(String NombreDestinatarioMercancia) {
        this.NombreDestinatarioMercancia = NombreDestinatarioMercancia;
    }

    public String getCalleDestinatario() {
        return CalleDestinatario;
    }

    public void setCalleDestinatario(String CalleDestinatario) {
        this.CalleDestinatario = CalleDestinatario;
    }

    public String getNumInteriorDestinatario() {
        return NumInteriorDestinatario;
    }

    public void setNumInteriorDestinatario(String NumInteriorDestinatario) {
        this.NumInteriorDestinatario = NumInteriorDestinatario;
    }

    public String getNumExteriorDestinatario() {
        return NumExteriorDestinatario;
    }

    public void setNumExteriorDestinatario(String NumExteriorDestinatario) {
        this.NumExteriorDestinatario = NumExteriorDestinatario;
    }

    public String getCpDestinatario() {
        return CpDestinatario;
    }

    public void setCpDestinatario(String CpDestinatario) {
        this.CpDestinatario = CpDestinatario;
    }

    public String getMunicpioDestinatario() {
        return MunicpioDestinatario;
    }

    public void setMunicpioDestinatario(String MunicpioDestinatario) {
        this.MunicpioDestinatario = MunicpioDestinatario;
    }

    public String getPaisDestinatario() {
        return PaisDestinatario;
    }

    public void setPaisDestinatario(String PaisDestinatario) {
        this.PaisDestinatario = PaisDestinatario;
    }

    public Date getFechaPagoReal() {
        return FechaPagoReal;
    }

    public void setFechaPagoReal(Date FechaPagoReal) {
        this.FechaPagoReal = FechaPagoReal;
    }
    
    

}
