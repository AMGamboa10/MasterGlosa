package Modelo;

import java.util.Date;

public class Glosa506 {

    private int id;
    private String Patente;
    private String Pedimento;
    private String SeccionAduanera;
    private Date TipoFecha;
    private Date FechaOperacion;
    private Date FechaValidacionPagoR;

    public Glosa506(int id, String Patente, String Pedimento, String SeccionAduanera, Date TipoFecha, Date FechaOperacion, Date FechaValidacionPagoR) {
        this.id = id;
        this.Patente = Patente;
        this.Pedimento = Pedimento;
        this.SeccionAduanera = SeccionAduanera;
        this.TipoFecha = TipoFecha;
        this.FechaOperacion = FechaOperacion;
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

    public Date getTipoFecha() {
        return TipoFecha;
    }

    public void setTipoFecha(Date TipoFecha) {
        this.TipoFecha = TipoFecha;
    }

    public Date getFechaOperacion() {
        return FechaOperacion;
    }

    public void setFechaOperacion(Date FechaOperacion) {
        this.FechaOperacion = FechaOperacion;
    }

    public Date getFechaValidacionPagoR() {
        return FechaValidacionPagoR;
    }

    public void setFechaValidacionPagoR(Date FechaValidacionPagoR) {
        this.FechaValidacionPagoR = FechaValidacionPagoR;
    }
    
    

}
