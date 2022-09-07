package Modelo;

import java.util.Date;

public class Glosa553 {

    private int id;
    private String Patente;
    private String Pedimento;
    private String SeccionAduanera;
    private String Fraccion;
    private String SecuenciaFraccion;
    private String ClavePermiso;
    private String FirmaDescargo;
    private String NumeroPermiso;
    private double ValorComercialDolares;
    private double CantidadMUMTarifa;
    private Date FechaPagoReal;

    public Glosa553(int id, String Patente, String Pedimento, String SeccionAduanera, String Fraccion, String SecuenciaFraccion, String ClavePermiso, String FirmaDescargo, String NumeroPermiso, double ValorComercialDolares, double CantidadMUMTarifa, Date FechaPagoReal) {
        this.id = id;
        this.Patente = Patente;
        this.Pedimento = Pedimento;
        this.SeccionAduanera = SeccionAduanera;
        this.Fraccion = Fraccion;
        this.SecuenciaFraccion = SecuenciaFraccion;
        this.ClavePermiso = ClavePermiso;
        this.FirmaDescargo = FirmaDescargo;
        this.NumeroPermiso = NumeroPermiso;
        this.ValorComercialDolares = ValorComercialDolares;
        this.CantidadMUMTarifa = CantidadMUMTarifa;
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

    public String getClavePermiso() {
        return ClavePermiso;
    }

    public void setClavePermiso(String ClavePermiso) {
        this.ClavePermiso = ClavePermiso;
    }

    public String getFirmaDescargo() {
        return FirmaDescargo;
    }

    public void setFirmaDescargo(String FirmaDescargo) {
        this.FirmaDescargo = FirmaDescargo;
    }

    public String getNumeroPermiso() {
        return NumeroPermiso;
    }

    public void setNumeroPermiso(String NumeroPermiso) {
        this.NumeroPermiso = NumeroPermiso;
    }

    public double getValorComercialDolares() {
        return ValorComercialDolares;
    }

    public void setValorComercialDolares(double ValorComercialDolares) {
        this.ValorComercialDolares = ValorComercialDolares;
    }

    public double getCantidadMUMTarifa() {
        return CantidadMUMTarifa;
    }

    public void setCantidadMUMTarifa(double CantidadMUMTarifa) {
        this.CantidadMUMTarifa = CantidadMUMTarifa;
    }

    public Date getFechaPagoReal() {
        return FechaPagoReal;
    }

    public void setFechaPagoReal(Date FechaPagoReal) {
        this.FechaPagoReal = FechaPagoReal;
    }
    
    

}
