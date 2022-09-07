package Modelo;

import java.util.Date;

public class Glosa503 {

    private int id;
    private String Patente;
    private String Pedimento;
    private String SeccionAduanera;
    private String NumeroGuia;
    private String TipoGuia;
    private Date FechaPagoReal;

    public Glosa503(int id, String Patente, String Pedimento, String SeccionAduanera, String NumeroGuia, String TipoGuia, Date FechaPagoReal) {
        this.id = id;
        this.Patente = Patente;
        this.Pedimento = Pedimento;
        this.SeccionAduanera = SeccionAduanera;
        this.NumeroGuia = NumeroGuia;
        this.TipoGuia = TipoGuia;
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

    public String getNumeroGuia() {
        return NumeroGuia;
    }

    public void setNumeroGuia(String NumeroGuia) {
        this.NumeroGuia = NumeroGuia;
    }

    public String getTipoGuia() {
        return TipoGuia;
    }

    public void setTipoGuia(String TipoGuia) {
        this.TipoGuia = TipoGuia;
    }

    public Date getFechaPagoReal() {
        return FechaPagoReal;
    }

    public void setFechaPagoReal(Date FechaPagoReal) {
        this.FechaPagoReal = FechaPagoReal;
    }
    
    

}
