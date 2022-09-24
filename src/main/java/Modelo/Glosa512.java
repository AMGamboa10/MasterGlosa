package Modelo;

import java.util.Date;

public class Glosa512 {

    private int id;
    private String Patente;
    private String Pedimento;
    private String SeccionAduanera;
    private String PatenteAduanalOrig;
    private String PedimentoOriginal;
    private String SeccionAduaneraDespOrig;
    private String DocumentoOriginal;
    private java.sql.Date FechaOperacionOrig;
    private String FraccionOriginal;
    private String UnidadMedida;
    private double MercanciaDescargada;
    private String TipoPedimento;
    private java.sql.Date FechaPagoReal;
    
    private java.sql.Date FechaInicio;
    private java.sql.Date FechaFinal;
    private int mes;
    private int año;

    public Glosa512(int id, String Patente, String Pedimento, String SeccionAduanera, String PatenteAduanalOrig, String PedimentoOriginal, String SeccionAduaneraDespOrig, String DocumentoOriginal, java.sql.Date FechaOperacionOrig, String FraccionOriginal, String UnidadMedida, double MercanciaDescargada, String TipoPedimento, java.sql.Date FechaPagoReal) {
        this.id = id;
        this.Patente = Patente;
        this.Pedimento = Pedimento;
        this.SeccionAduanera = SeccionAduanera;
        this.PatenteAduanalOrig = PatenteAduanalOrig;
        this.PedimentoOriginal = PedimentoOriginal;
        this.SeccionAduaneraDespOrig = SeccionAduaneraDespOrig;
        this.DocumentoOriginal = DocumentoOriginal;
        this.FechaOperacionOrig = FechaOperacionOrig;
        this.FraccionOriginal = FraccionOriginal;
        this.UnidadMedida = UnidadMedida;
        this.MercanciaDescargada = MercanciaDescargada;
        this.TipoPedimento = TipoPedimento;
        this.FechaPagoReal = FechaPagoReal;
    }

    public Glosa512() {
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

    public String getPatenteAduanalOrig() {
        return PatenteAduanalOrig;
    }

    public void setPatenteAduanalOrig(String PatenteAduanalOrig) {
        this.PatenteAduanalOrig = PatenteAduanalOrig;
    }

    public String getPedimentoOriginal() {
        return PedimentoOriginal;
    }

    public void setPedimentoOriginal(String PedimentoOriginal) {
        this.PedimentoOriginal = PedimentoOriginal;
    }

    public String getSeccionAduaneraDespOrig() {
        return SeccionAduaneraDespOrig;
    }

    public void setSeccionAduaneraDespOrig(String SeccionAduaneraDespOrig) {
        this.SeccionAduaneraDespOrig = SeccionAduaneraDespOrig;
    }

    public String getDocumentoOriginal() {
        return DocumentoOriginal;
    }

    public void setDocumentoOriginal(String DocumentoOriginal) {
        this.DocumentoOriginal = DocumentoOriginal;
    }

    public java.sql.Date getFechaOperacionOrig() {
        return FechaOperacionOrig;
    }

    public void setFechaOperacionOrig(java.sql.Date FechaOperacionOrig) {
        this.FechaOperacionOrig = FechaOperacionOrig;
    }

    public String getFraccionOriginal() {
        return FraccionOriginal;
    }

    public void setFraccionOriginal(String FraccionOriginal) {
        this.FraccionOriginal = FraccionOriginal;
    }

    public String getUnidadMedida() {
        return UnidadMedida;
    }

    public void setUnidadMedida(String UnidadMedida) {
        this.UnidadMedida = UnidadMedida;
    }

    public double getMercanciaDescargada() {
        return MercanciaDescargada;
    }

    public void setMercanciaDescargada(double MercanciaDescargada) {
        this.MercanciaDescargada = MercanciaDescargada;
    }

    public String getTipoPedimento() {
        return TipoPedimento;
    }

    public void setTipoPedimento(String TipoPedimento) {
        this.TipoPedimento = TipoPedimento;
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
