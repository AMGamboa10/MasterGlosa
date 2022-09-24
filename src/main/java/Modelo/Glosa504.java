package Modelo;

public class Glosa504 {

    private int id;
    private String Patente;
    private String Pedimento;
    private String SeccionAduanera;
    private String NumContenedor;
    private String TipoContenedor;
    private java.sql.Date FechaPagoReal;
    
    private java.sql.Date FechaInicio;
    private java.sql.Date FechaFinal;
    private int mes;
    private int año;

    public Glosa504(int id, String Patente, String Pedimento, String SeccionAduanera, String NumContenedor, String TipoContenedor, java.sql.Date FechaPagoReal) {
        this.id = id;
        this.Patente = Patente;
        this.Pedimento = Pedimento;
        this.SeccionAduanera = SeccionAduanera;
        this.NumContenedor = NumContenedor;
        this.TipoContenedor = TipoContenedor;
        this.FechaPagoReal = FechaPagoReal;
    }

    public Glosa504() {
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

    public String getNumContenedor() {
        return NumContenedor;
    }

    public void setNumContenedor(String NumContenedor) {
        this.NumContenedor = NumContenedor;
    }

    public String getTipoContenedor() {
        return TipoContenedor;
    }

    public void setTipoContenedor(String TipoContenedor) {
        this.TipoContenedor = TipoContenedor;
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
