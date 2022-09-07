package Modelo;

import java.util.Date;

public class Glosa556 {

    private int id;
    private String Patente;
    private String Pedimento;
    private String SeccionAduanera;
    private String Fraccion;
    private String SecuenciaFraccion;
    private String ClaveContribucion;
    private String TasaContribucion;
    private String TipoTasa;
    private Date FechaPagoReal;

    public Glosa556(int id, String Patente, String Pedimento, String SeccionAduanera, String Fraccion, String SecuenciaFraccion, String ClaveContribucion, String TasaContribucion, String TipoTasa, Date FechaPagoReal) {
        this.id = id;
        this.Patente = Patente;
        this.Pedimento = Pedimento;
        this.SeccionAduanera = SeccionAduanera;
        this.Fraccion = Fraccion;
        this.SecuenciaFraccion = SecuenciaFraccion;
        this.ClaveContribucion = ClaveContribucion;
        this.TasaContribucion = TasaContribucion;
        this.TipoTasa = TipoTasa;
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

    public Date getFechaPagoReal() {
        return FechaPagoReal;
    }

    public void setFechaPagoReal(Date FechaPagoReal) {
        this.FechaPagoReal = FechaPagoReal;
    }
    
    

}
