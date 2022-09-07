package Modelo;

import java.util.Date;

public class Glosa508 {

    private int id;
    private String Patente;
    private String Pedimento;
    private String SeccionAduanera;
    private String InstitucionEmisora;
    private String NumeroCuenta;
    private String FolioConstancia;
    private Date FechaConstancia;
    private String TipoCuenta;
    private String ClaveGarantia;
    private double ValorUnitarioTitulo;
    private String TotalGarantia;
    private String CantidadUnidades;
    private String TitulosAsignados;
    private Date FechaPagoReal;

    public Glosa508(int id, String Patente, String Pedimento, String SeccionAduanera, String InstitucionEmisora, String NumeroCuenta, String FolioConstancia, Date FechaConstancia, String TipoCuenta, String ClaveGarantia, double ValorUnitarioTitulo, String TotalGarantia, String CantidadUnidades, String TitulosAsignados, Date FechaPagoReal) {
        this.id = id;
        this.Patente = Patente;
        this.Pedimento = Pedimento;
        this.SeccionAduanera = SeccionAduanera;
        this.InstitucionEmisora = InstitucionEmisora;
        this.NumeroCuenta = NumeroCuenta;
        this.FolioConstancia = FolioConstancia;
        this.FechaConstancia = FechaConstancia;
        this.TipoCuenta = TipoCuenta;
        this.ClaveGarantia = ClaveGarantia;
        this.ValorUnitarioTitulo = ValorUnitarioTitulo;
        this.TotalGarantia = TotalGarantia;
        this.CantidadUnidades = CantidadUnidades;
        this.TitulosAsignados = TitulosAsignados;
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

    public String getInstitucionEmisora() {
        return InstitucionEmisora;
    }

    public void setInstitucionEmisora(String InstitucionEmisora) {
        this.InstitucionEmisora = InstitucionEmisora;
    }

    public String getNumeroCuenta() {
        return NumeroCuenta;
    }

    public void setNumeroCuenta(String NumeroCuenta) {
        this.NumeroCuenta = NumeroCuenta;
    }

    public String getFolioConstancia() {
        return FolioConstancia;
    }

    public void setFolioConstancia(String FolioConstancia) {
        this.FolioConstancia = FolioConstancia;
    }

    public Date getFechaConstancia() {
        return FechaConstancia;
    }

    public void setFechaConstancia(Date FechaConstancia) {
        this.FechaConstancia = FechaConstancia;
    }

    public String getTipoCuenta() {
        return TipoCuenta;
    }

    public void setTipoCuenta(String TipoCuenta) {
        this.TipoCuenta = TipoCuenta;
    }

    public String getClaveGarantia() {
        return ClaveGarantia;
    }

    public void setClaveGarantia(String ClaveGarantia) {
        this.ClaveGarantia = ClaveGarantia;
    }

    public double getValorUnitarioTitulo() {
        return ValorUnitarioTitulo;
    }

    public void setValorUnitarioTitulo(double ValorUnitarioTitulo) {
        this.ValorUnitarioTitulo = ValorUnitarioTitulo;
    }

    public String getTotalGarantia() {
        return TotalGarantia;
    }

    public void setTotalGarantia(String TotalGarantia) {
        this.TotalGarantia = TotalGarantia;
    }

    public String getCantidadUnidades() {
        return CantidadUnidades;
    }

    public void setCantidadUnidades(String CantidadUnidades) {
        this.CantidadUnidades = CantidadUnidades;
    }

    public String getTitulosAsignados() {
        return TitulosAsignados;
    }

    public void setTitulosAsignados(String TitulosAsignados) {
        this.TitulosAsignados = TitulosAsignados;
    }

    public Date getFechaPagoReal() {
        return FechaPagoReal;
    }

    public void setFechaPagoReal(Date FechaPagoReal) {
        this.FechaPagoReal = FechaPagoReal;
    }
    
    

}
