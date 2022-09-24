package Modelo;

import java.util.Date;

public class Glosa701 {

    private int id;
    private String Patente;
    private String Pedimento;
    private String SeccionAduanera;
    private String ClaveDocumento;
    private java.sql.Date FechaPago;
    private String PedimentoAnterior;
    private String PatenteAnterior;
    private String SeccionAduaneraAnterior;
    private String DocumentoAnterior;
    private java.sql.Date FechaOperacionAnterior;
    private String PedimentoOriginal;
    private String PatenteAduanalOrig;
    private String SeccionAduanalDespOrig;
    private java.sql.Date FechaPagoReal;
    
    private java.sql.Date FechaInicio;
    private java.sql.Date FechaFinal;
    private int mes;
    private int año;

    public Glosa701(int id, String Patente, String Pedimento, String SeccionAduanera, String ClaveDocumento, java.sql.Date FechaPago, String PedimentoAnterior, String PatenteAnterior, String SeccionAduaneraAnterior, String DocumentoAnterior, java.sql.Date FechaOperacionAnterior, String PedimentoOriginal, String PatenteAduanalOrig, String SeccionAduanalDespOrig, java.sql.Date FechaPagoReal) {
        this.id = id;
        this.Patente = Patente;
        this.Pedimento = Pedimento;
        this.SeccionAduanera = SeccionAduanera;
        this.ClaveDocumento = ClaveDocumento;
        this.FechaPago = FechaPago;
        this.PedimentoAnterior = PedimentoAnterior;
        this.PatenteAnterior = PatenteAnterior;
        this.SeccionAduaneraAnterior = SeccionAduaneraAnterior;
        this.DocumentoAnterior = DocumentoAnterior;
        this.FechaOperacionAnterior = FechaOperacionAnterior;
        this.PedimentoOriginal = PedimentoOriginal;
        this.PatenteAduanalOrig = PatenteAduanalOrig;
        this.SeccionAduanalDespOrig = SeccionAduanalDespOrig;
        this.FechaPagoReal = FechaPagoReal;
    }

    public Glosa701() {
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

    public String getClaveDocumento() {
        return ClaveDocumento;
    }

    public void setClaveDocumento(String ClaveDocumento) {
        this.ClaveDocumento = ClaveDocumento;
    }

    public String getPedimentoAnterior() {
        return PedimentoAnterior;
    }

    public void setPedimentoAnterior(String PedimentoAnterior) {
        this.PedimentoAnterior = PedimentoAnterior;
    }

    public String getPatenteAnterior() {
        return PatenteAnterior;
    }

    public void setPatenteAnterior(String PatenteAnterior) {
        this.PatenteAnterior = PatenteAnterior;
    }

    public String getSeccionAduaneraAnterior() {
        return SeccionAduaneraAnterior;
    }

    public void setSeccionAduaneraAnterior(String SeccionAduaneraAnterior) {
        this.SeccionAduaneraAnterior = SeccionAduaneraAnterior;
    }

    public String getDocumentoAnterior() {
        return DocumentoAnterior;
    }

    public void setDocumentoAnterior(String DocumentoAnterior) {
        this.DocumentoAnterior = DocumentoAnterior;
    }

    public String getPedimentoOriginal() {
        return PedimentoOriginal;
    }

    public void setPedimentoOriginal(String PedimentoOriginal) {
        this.PedimentoOriginal = PedimentoOriginal;
    }

    public String getPatenteAduanalOrig() {
        return PatenteAduanalOrig;
    }

    public void setPatenteAduanalOrig(String PatenteAduanalOrig) {
        this.PatenteAduanalOrig = PatenteAduanalOrig;
    }

    public String getSeccionAduanalDespOrig() {
        return SeccionAduanalDespOrig;
    }

    public void setSeccionAduanalDespOrig(String SeccionAduanalDespOrig) {
        this.SeccionAduanalDespOrig = SeccionAduanalDespOrig;
    }

    public java.sql.Date getFechaPago() {
        return FechaPago;
    }

    public void setFechaPago(java.sql.Date FechaPago) {
        this.FechaPago = FechaPago;
    }

    public java.sql.Date getFechaOperacionAnterior() {
        return FechaOperacionAnterior;
    }

    public void setFechaOperacionAnterior(java.sql.Date FechaOperacionAnterior) {
        this.FechaOperacionAnterior = FechaOperacionAnterior;
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
