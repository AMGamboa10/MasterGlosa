package Modelo;

import java.util.Date;

public class Glosa507 {

    private int id;
    private String Patente;
    private String Pedimento;
    private String SeccionAduanera;
    private String ClaveCaso;
    private String IdentificadorCaso;
    private String TipoPedimento;
    private String ComplementoCaso;
    private Date FechaValidacionPagoR;

    public Glosa507(int id, String Patente, String Pedimento, String SeccionAduanera, String ClaveCaso, String IdentificadorCaso, String TipoPedimento, String ComplementoCaso, Date FechaValidacionPagoR) {
        this.id = id;
        this.Patente = Patente;
        this.Pedimento = Pedimento;
        this.SeccionAduanera = SeccionAduanera;
        this.ClaveCaso = ClaveCaso;
        this.IdentificadorCaso = IdentificadorCaso;
        this.TipoPedimento = TipoPedimento;
        this.ComplementoCaso = ComplementoCaso;
        this.FechaValidacionPagoR = FechaValidacionPagoR;
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

    public String getClaveCaso() {
        return ClaveCaso;
    }

    public void setClaveCaso(String ClaveCaso) {
        this.ClaveCaso = ClaveCaso;
    }

    public String getIdentificadorCaso() {
        return IdentificadorCaso;
    }

    public void setIdentificadorCaso(String IdentificadorCaso) {
        this.IdentificadorCaso = IdentificadorCaso;
    }

    public String getTipoPedimento() {
        return TipoPedimento;
    }

    public void setTipoPedimento(String TipoPedimento) {
        this.TipoPedimento = TipoPedimento;
    }

    public String getComplementoCaso() {
        return ComplementoCaso;
    }

    public void setComplementoCaso(String ComplementoCaso) {
        this.ComplementoCaso = ComplementoCaso;
    }

    public Date getFechaValidacionPagoR() {
        return FechaValidacionPagoR;
    }

    public void setFechaValidacionPagoR(Date FechaValidacionPagoR) {
        this.FechaValidacionPagoR = FechaValidacionPagoR;
    }
    

}
