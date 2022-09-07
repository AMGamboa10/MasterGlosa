package Modelo;

import java.util.Date;

public class Glosa504 {

    private int id;
    private String Patente;
    private String Pedimento;
    private String SeccionAduanera;
    private String NumContenedor;
    private String TipoContenedor;
    private Date FechaPagoReal;

    public Glosa504(int id, String Patente, String Pedimento, String SeccionAduanera, String NumContenedor, String TipoContenedor, Date FechaPagoReal) {
        this.id = id;
        this.Patente = Patente;
        this.Pedimento = Pedimento;
        this.SeccionAduanera = SeccionAduanera;
        this.NumContenedor = NumContenedor;
        this.TipoContenedor = TipoContenedor;
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

    public Date getFechaPagoReal() {
        return FechaPagoReal;
    }

    public void setFechaPagoReal(Date FechaPagoReal) {
        this.FechaPagoReal = FechaPagoReal;
    }
    
    

}
