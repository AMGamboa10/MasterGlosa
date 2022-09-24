package Modelo;

import java.util.Date;

public class Glosa557 {

    private int id;
    private String Patente;
    private String Pedimento;
    private String SeccionAduanera;
    private String Fraccion;
    private String SecuenciaFraccion;
    private String ClaveContribucion;
    private String FormaPago;
    private double ImportPago;
    private java.sql.Date FechaValidacionPagoR;
    
    private java.sql.Date FechaInicio;
    private java.sql.Date FechaFinal;
    private int mes;
    private int año;

    public Glosa557(int id, String Patente, String Pedimento, String SeccionAduanera, String Fraccion, String SecuenciaFraccion, String ClaveContribucion, String FormaPago, double ImportPago, java.sql.Date FechaValidacionPagoR) {
        this.id = id;
        this.Patente = Patente;
        this.Pedimento = Pedimento;
        this.SeccionAduanera = SeccionAduanera;
        this.Fraccion = Fraccion;
        this.SecuenciaFraccion = SecuenciaFraccion;
        this.ClaveContribucion = ClaveContribucion;
        this.FormaPago = FormaPago;
        this.ImportPago = ImportPago;
        this.FechaValidacionPagoR = FechaValidacionPagoR;
    }

    public Glosa557() {
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

    public String getFraccion() {
        return Fraccion;
    }

    public void setFraccion(String Fraccion) {
        this.Fraccion = Fraccion;
    }

    public String getSecuenciaFraccion() {
        return SecuenciaFraccion;
    }

    public void setSecuenciaFraccion(String SecuenciaFraccion) {
        this.SecuenciaFraccion = SecuenciaFraccion;
    }

    public String getClaveContribucion() {
        return ClaveContribucion;
    }

    public void setClaveContribucion(String ClaveContribucion) {
        this.ClaveContribucion = ClaveContribucion;
    }

    public String getFormaPago() {
        return FormaPago;
    }

    public void setFormaPago(String FormaPago) {
        this.FormaPago = FormaPago;
    }

    public double getImportPago() {
        return ImportPago;
    }

    public void setImportPago(double ImportPago) {
        this.ImportPago = ImportPago;
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
