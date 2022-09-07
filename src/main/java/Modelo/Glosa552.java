package Modelo;

import java.util.Date;

public class Glosa552 {

    private int id;
    private String Patente;
    private String Pedimento;
    private String SeccionAduanera;
    private String Fraccion;
    private String SecuenciaFraccion;
    private String VinNumeroSerie;
    private double KilometrajeVehiculo;
    private Date FechaPagoReal;

    public Glosa552(int id, String Patente, String Pedimento, String SeccionAduanera, String Fraccion, String SecuenciaFraccion, String VinNumeroSerie, double KilometrajeVehiculo, Date FechaPagoReal) {
        this.id = id;
        this.Patente = Patente;
        this.Pedimento = Pedimento;
        this.SeccionAduanera = SeccionAduanera;
        this.Fraccion = Fraccion;
        this.SecuenciaFraccion = SecuenciaFraccion;
        this.VinNumeroSerie = VinNumeroSerie;
        this.KilometrajeVehiculo = KilometrajeVehiculo;
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

    public String getVinNumeroSerie() {
        return VinNumeroSerie;
    }

    public void setVinNumeroSerie(String VinNumeroSerie) {
        this.VinNumeroSerie = VinNumeroSerie;
    }

    public double getKilometrajeVehiculo() {
        return KilometrajeVehiculo;
    }

    public void setKilometrajeVehiculo(double KilometrajeVehiculo) {
        this.KilometrajeVehiculo = KilometrajeVehiculo;
    }

    public Date getFechaPagoReal() {
        return FechaPagoReal;
    }

    public void setFechaPagoReal(Date FechaPagoReal) {
        this.FechaPagoReal = FechaPagoReal;
    }
    
    

}
