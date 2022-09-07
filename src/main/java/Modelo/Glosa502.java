package Modelo;

import java.util.Date;

public class Glosa502 {

    private int id;
    private String Patente;
    private String Pedimento;
    private String SeccionAduanera;
    private String RfcTransportista;
    private String CurpTransportista;
    private String NombreTransportista;
    private String PaisTransporte;
    private String IdentificadorTransporte;
    private Date FechaPagoReal;

    public Glosa502(int id, String Patente, String Pedimento, String SeccionAduanera, String RfcTransportista, String CurpTransportista, String NombreTransportista, String PaisTransporte, String IdentificadorTransporte, Date FechaPagoReal) {
        this.id = id;
        this.Patente = Patente;
        this.Pedimento = Pedimento;
        this.SeccionAduanera = SeccionAduanera;
        this.RfcTransportista = RfcTransportista;
        this.CurpTransportista = CurpTransportista;
        this.NombreTransportista = NombreTransportista;
        this.PaisTransporte = PaisTransporte;
        this.IdentificadorTransporte = IdentificadorTransporte;
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

    public String getRfcTransportista() {
        return RfcTransportista;
    }

    public void setRfcTransportista(String RfcTransportista) {
        this.RfcTransportista = RfcTransportista;
    }

    public String getCurpTransportista() {
        return CurpTransportista;
    }

    public void setCurpTransportista(String CurpTransportista) {
        this.CurpTransportista = CurpTransportista;
    }

    public String getNombreTransportista() {
        return NombreTransportista;
    }

    public void setNombreTransportista(String NombreTransportista) {
        this.NombreTransportista = NombreTransportista;
    }

    public String getPaisTransporte() {
        return PaisTransporte;
    }

    public void setPaisTransporte(String PaisTransporte) {
        this.PaisTransporte = PaisTransporte;
    }

    public String getIdentificadorTransporte() {
        return IdentificadorTransporte;
    }

    public void setIdentificadorTransporte(String IdentificadorTransporte) {
        this.IdentificadorTransporte = IdentificadorTransporte;
    }

    public Date getFechaPagoReal() {
        return FechaPagoReal;
    }

    public void setFechaPagoReal(Date FechaPagoReal) {
        this.FechaPagoReal = FechaPagoReal;
    }
    
    

}
