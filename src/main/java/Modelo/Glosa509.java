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
    private Date FechaPagoReal;

    public Glosa509(int id, String Patente, String Pedimento, String SeccionAduanera, String ClaveContribucion, String TasaContribucion, String TipoTasa, String TipoPedimento, Date FechaPagoReal) {
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

    public Date getFechaPagoReal() {
        return FechaPagoReal;
    }

    public void setFechaPagoReal(Date FechaPagoReal) {
        this.FechaPagoReal = FechaPagoReal;
    }
    
}
