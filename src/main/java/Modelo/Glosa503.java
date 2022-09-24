package Modelo;

import java.util.Date;

public class Glosa503 {

    private int id;
    private String Patente;
    private String Pedimento;
    private String SeccionAduanera;
    private String NumeroGuia;
    private String TipoGuia;
    private java.sql.Date FechaPagoReal;
    
    private java.sql.Date FechaInicio;
    private java.sql.Date FechaFinal;
    private int mes;
    private int año;

    public Glosa503(int id, String Patente, String Pedimento, String SeccionAduanera, String NumeroGuia, String TipoGuia, java.sql.Date FechaPagoReal) {
        this.id = id;
        this.Patente = Patente;
        this.Pedimento = Pedimento;
        this.SeccionAduanera = SeccionAduanera;
        this.NumeroGuia = NumeroGuia;
        this.TipoGuia = TipoGuia;
        this.FechaPagoReal = FechaPagoReal;
    }

    public Glosa503() {
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
