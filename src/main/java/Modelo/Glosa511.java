package Modelo;

import java.util.Date;

public class Glosa511 {

    private int id;
    private String Patente;
    private String Pedimento;
    private String SeccionAduanera;
    private String SecuenciaObservacion;
    private String Observaciones;
    private String TipoPedimento;
    private Date FechaValidacionPagoR;

    public Glosa511(int id, String Patente, String Pedimento, String SeccionAduanera, String SecuenciaObservacion, String Observaciones, String TipoPedimento, Date FechaValidacionPagoR) {
        this.id = id;
        this.Patente = Patente;
        this.Pedimento = Pedimento;
        this.SeccionAduanera = SeccionAduanera;
        this.SecuenciaObservacion = SecuenciaObservacion;
        this.Observaciones = Observaciones;
        this.TipoPedimento = TipoPedimento;
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

    public String getSecuenciaObservacion() {
        return SecuenciaObservacion;
    }

    public void setSecuenciaObservacion(String SecuenciaObservacion) {
        this.SecuenciaObservacion = SecuenciaObservacion;
    }

    public String getObservaciones() {
        return Observaciones;
    }

    public void setObservaciones(String Observaciones) {
        this.Observaciones = Observaciones;
    }

    public String getTipoPedimento() {
        return TipoPedimento;
    }

    public void setTipoPedimento(String TipoPedimento) {
        this.TipoPedimento = TipoPedimento;
    }

    public Date getFechaValidacionPagoR() {
        return FechaValidacionPagoR;
    }

    public void setFechaValidacionPagoR(Date FechaValidacionPagoR) {
        this.FechaValidacionPagoR = FechaValidacionPagoR;
    }
    
    

}
