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
    private Date FechaValidacionPagoR;

    public Glosa557(int id, String Patente, String Pedimento, String SeccionAduanera, String Fraccion, String SecuenciaFraccion, String ClaveContribucion, String FormaPago, double ImportPago, Date FechaValidacionPagoR) {
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

    public Date getFechaValidacionPagoR() {
        return FechaValidacionPagoR;
    }

    public void setFechaValidacionPagoR(Date FechaValidacionPagoR) {
        this.FechaValidacionPagoR = FechaValidacionPagoR;
    }
    
    

}
