package Modelo;

import java.util.Date;

public class Glosa506 {

    private int id;
    private String Patente;
    private String Pedimento;
    private String SeccionAduanera;
    private java.sql.Date TipoFecha;
    private java.sql.Date FechaOperacion;
    private java.sql.Date FechaValidacionPagoR;
    
    private java.sql.Date FechaInicio;
    private java.sql.Date FechaFinal;
    private int mes;
    private int año;

    public Glosa506(int id, String Patente, String Pedimento, String SeccionAduanera, java.sql.Date TipoFecha, java.sql.Date FechaOperacion, java.sql.Date FechaValidacionPagoR) {
        this.id = id;
        this.Patente = Patente;
        this.Pedimento = Pedimento;
        this.SeccionAduanera = SeccionAduanera;
        this.TipoFecha = TipoFecha;
        this.FechaOperacion = FechaOperacion;
        this.FechaValidacionPagoR = FechaValidacionPagoR;
    }

    public Glosa506() {
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

    public java.sql.Date getTipoFecha() {
        return TipoFecha;
    }

    public void setTipoFecha(java.sql.Date TipoFecha) {
        this.TipoFecha = TipoFecha;
    }

    public java.sql.Date getFechaOperacion() {
        return FechaOperacion;
    }

    public void setFechaOperacion(java.sql.Date FechaOperacion) {
        this.FechaOperacion = FechaOperacion;
    }

    public java.sql.Date getFechaValidacionPagoR() {
        return FechaValidacionPagoR;
    }

    public void setFechaValidacionPagoR(java.sql.Date FechaValidacionPagoR) {
        this.FechaValidacionPagoR = FechaValidacionPagoR;
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
