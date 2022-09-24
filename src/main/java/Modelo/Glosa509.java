package Modelo;

import java.util.Date;

public class Glosa509 {

    private int id;
    private String Patente;
    private String Pedimento;
    private String SeccionAduanera;
    private String ClaveContribucion;
    private String TasaContribucion;
    private String TipoTasa;
    private String TipoPedimento;
    private java.sql.Date FechaPagoReal;
    
    private java.sql.Date FechaInicio;
    private java.sql.Date FechaFinal;
    private int mes;
    private int año;

    public Glosa509(int id, String Patente, String Pedimento, String SeccionAduanera, String ClaveContribucion, String TasaContribucion, String TipoTasa, String TipoPedimento, java.sql.Date FechaPagoReal) {
        this.id = id;
        this.Patente = Patente;
        this.Pedimento = Pedimento;
        this.SeccionAduanera = SeccionAduanera;
        this.ClaveContribucion = ClaveContribucion;
        this.TasaContribucion = TasaContribucion;
        this.TipoTasa = TipoTasa;
        this.TipoPedimento = TipoPedimento;
        this.FechaPagoReal = FechaPagoReal;
    }

    public Glosa509() {
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

    public String getClaveContribucion() {
        return ClaveContribucion;
    }

    public void setClaveContribucion(String ClaveContribucion) {
        this.ClaveContribucion = ClaveContribucion;
    }

    public String getTasaContribucion() {
        return TasaContribucion;
    }

    public void setTasaContribucion(String TasaContribucion) {
        this.TasaContribucion = TasaContribucion;
    }

    public String getTipoTasa() {
        return TipoTasa;
    }

    public void setTipoTasa(String TipoTasa) {
        this.TipoTasa = TipoTasa;
    }

    public String getTipoPedimento() {
        return TipoPedimento;
    }

    public void setTipoPedimento(String TipoPedimento) {
        this.TipoPedimento = TipoPedimento;
    }

    public java.sql.Date getFechaPagoReal() {
        return FechaPagoReal;
    }

    public void setFechaPagoReal(java.sql.Date FechaPagoReal) {
        this.FechaPagoReal = FechaPagoReal;
    }

    public java.sql.Date getFechaInicio() {
        return FechaInicio;
    }

    public void setFechaInicio(java.sql.Date FechaInicio) {
        this.FechaInicio = FechaInicio;
    }

    public java.sql.Date getFechaFinal() {
        return FechaFinal;
    }

    public void setFechaFinal(java.sql.Date FechaFinal) {
        this.FechaFinal = FechaFinal;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
    
    
}
