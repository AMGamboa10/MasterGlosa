package Modelo;


public class Glosa501 {

    private int id;
    private String Patente;
    private String Pedimento;
    private String SeccionAduanera;
    private String TipoOperacion;
    private String ClaveDocumento;
    private String SeccionAduaneraEntrada;
    private String CurpContribuyente;
    private String Rfc;
    private String CurpAgenteA;
    private double TipoCambio;
    private int TotalFletes;
    private int TotalSeguros;
    private int TotalEmbalajes;
    private int TotalIncrementables;
    private int TotalDeducibles;
    private double PesoBrutoMercancia;
    private String MedioTransporteSalida;
    private String MedioTransporteArribo;
    private String MedioTransporteEntrada_Salida;
    private String DestinoMercancia;
    private String NombreContribuyente;
    private String CalleContribuyente;
    private String NumeroContribuyente;
    private String NumExteriorContribuyente;
    private String CPContribuyente;
    private String MunicipioContribuyente;
    private String EntidadFedContribuyente;
    private String PaisContribuyente;
    private String TipoPedimento;
    private java.sql.Date FechaRecepcionPedimento;
    private java.sql.Date FechaPagoReal;
    
    private java.sql.Date FechaInicio;
    private java.sql.Date FechaFinal;
    private int mes;
    private int año;


    public Glosa501(int id, String Patente, String Pedimento, String SeccionAduanera, String TipoOperacion, String ClaveDocumento, String SeccionAduaneraEntrada, String CurpContribuyente, String Rfc, String CurpAgenteA, double TipoCambio, int TotalFletes, int TotalSeguros, int TotalEmbalajes, int TotalIncrementables, int TotalDeducibles, double PesoBrutoMercancia, String MedioTransporteSalida, String MedioTransporteArribo, String MedioTransporteEntrada_Salida, String DestinoMercancia, String NombreContribuyente, String CalleContribuyente, String NumeroContribuyente, String NumExteriorContribuyente, String CPContribuyente, String MunicipioContribuyente, String EntidadFedContribuyente, String PaisContribuyente, String TipoPedimento, java.sql.Date FechaRecepcionPedimento, java.sql.Date FechaPagoReal) {
        this.id = id;
        this.Patente = Patente;
        this.Pedimento = Pedimento;
        this.SeccionAduanera = SeccionAduanera;
        this.TipoOperacion = TipoOperacion;
        this.ClaveDocumento = ClaveDocumento;
        this.SeccionAduaneraEntrada = SeccionAduaneraEntrada;
        this.CurpContribuyente = CurpContribuyente;
        this.Rfc = Rfc;
        this.CurpAgenteA = CurpAgenteA;
        this.TipoCambio = TipoCambio;
        this.TotalFletes = TotalFletes;
        this.TotalSeguros = TotalSeguros;
        this.TotalEmbalajes = TotalEmbalajes;
        this.TotalIncrementables = TotalIncrementables;
        this.TotalDeducibles = TotalDeducibles;
        this.PesoBrutoMercancia = PesoBrutoMercancia;
        this.MedioTransporteSalida = MedioTransporteSalida;
        this.MedioTransporteArribo = MedioTransporteArribo;
        this.MedioTransporteEntrada_Salida = MedioTransporteEntrada_Salida;
        this.DestinoMercancia = DestinoMercancia;
        this.NombreContribuyente = NombreContribuyente;
        this.CalleContribuyente = CalleContribuyente;
        this.NumeroContribuyente = NumeroContribuyente;
        this.NumExteriorContribuyente = NumExteriorContribuyente;
        this.CPContribuyente = CPContribuyente;
        this.MunicipioContribuyente = MunicipioContribuyente;
        this.EntidadFedContribuyente = EntidadFedContribuyente;
        this.PaisContribuyente = PaisContribuyente;
        this.TipoPedimento = TipoPedimento;
        this.FechaRecepcionPedimento = FechaRecepcionPedimento;
        this.FechaPagoReal = FechaPagoReal;
    }

    public Glosa501() {
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

    public String getTipoOperacion() {
        return TipoOperacion;
    }

    public void setTipoOperacion(String TipoOperacion) {
        this.TipoOperacion = TipoOperacion;
    }

    public String getClaveDocumento() {
        return ClaveDocumento;
    }

    public void setClaveDocumento(String ClaveDocumento) {
        this.ClaveDocumento = ClaveDocumento;
    }

    public String getSeccionAduaneraEntrada() {
        return SeccionAduaneraEntrada;
    }

    public void setSeccionAduaneraEntrada(String SeccionAduaneraEntrada) {
        this.SeccionAduaneraEntrada = SeccionAduaneraEntrada;
    }

    public String getCurpContribuyente() {
        return CurpContribuyente;
    }

    public void setCurpContribuyente(String CurpContribuyente) {
        this.CurpContribuyente = CurpContribuyente;
    }

    public String getRfc() {
        return Rfc;
    }

    public void setRfc(String Rfc) {
        this.Rfc = Rfc;
    }

    public String getCurpAgenteA() {
        return CurpAgenteA;
    }

    public void setCurpAgenteA(String CurpAgenteA) {
        this.CurpAgenteA = CurpAgenteA;
    }

    public double getTipoCambio() {
        return TipoCambio;
    }

    public void setTipoCambio(double TipoCambio) {
        this.TipoCambio = TipoCambio;
    }

    public int getTotalFletes() {
        return TotalFletes;
    }

    public void setTotalFletes(int TotalFletes) {
        this.TotalFletes = TotalFletes;
    }

    public int getTotalSeguros() {
        return TotalSeguros;
    }

    public void setTotalSeguros(int TotalSeguros) {
        this.TotalSeguros = TotalSeguros;
    }

    public int getTotalEmbalajes() {
        return TotalEmbalajes;
    }

    public void setTotalEmbalajes(int TotalEmbalajes) {
        this.TotalEmbalajes = TotalEmbalajes;
    }

    public int getTotalIncrementables() {
        return TotalIncrementables;
    }

    public void setTotalIncrementables(int TotalIncrementables) {
        this.TotalIncrementables = TotalIncrementables;
    }

    public int getTotalDeducibles() {
        return TotalDeducibles;
    }

    public void setTotalDeducibles(int TotalDeducibles) {
        this.TotalDeducibles = TotalDeducibles;
    }

    public double getPesoBrutoMercancia() {
        return PesoBrutoMercancia;
    }

    public void setPesoBrutoMercancia(double PesoBrutoMercancia) {
        this.PesoBrutoMercancia = PesoBrutoMercancia;
    }

    public String getMedioTransporteSalida() {
        return MedioTransporteSalida;
    }

    public void setMedioTransporteSalida(String MedioTransporteSalida) {
        this.MedioTransporteSalida = MedioTransporteSalida;
    }

    public String getMedioTransporteArribo() {
        return MedioTransporteArribo;
    }

    public void setMedioTransporteArribo(String MedioTransporteArribo) {
        this.MedioTransporteArribo = MedioTransporteArribo;
    }

    public String getMedioTransporteEntrada_Salida() {
        return MedioTransporteEntrada_Salida;
    }

    public void setMedioTransporteEntrada_Salida(String MedioTransporteEntrada_Salida) {
        this.MedioTransporteEntrada_Salida = MedioTransporteEntrada_Salida;
    }

    public String getDestinoMercancia() {
        return DestinoMercancia;
    }

    public void setDestinoMercancia(String DestinoMercancia) {
        this.DestinoMercancia = DestinoMercancia;
    }

    public String getNombreContribuyente() {
        return NombreContribuyente;
    }

    public void setNombreContribuyente(String NombreContribuyente) {
        this.NombreContribuyente = NombreContribuyente;
    }

    public String getCalleContribuyente() {
        return CalleContribuyente;
    }

    public void setCalleContribuyente(String CalleContribuyente) {
        this.CalleContribuyente = CalleContribuyente;
    }

    public String getNumeroContribuyente() {
        return NumeroContribuyente;
    }

    public void setNumeroContribuyente(String NumeroContribuyente) {
        this.NumeroContribuyente = NumeroContribuyente;
    }

    public String getNumExteriorContribuyente() {
        return NumExteriorContribuyente;
    }

    public void setNumExteriorContribuyente(String NumExteriorContribuyente) {
        this.NumExteriorContribuyente = NumExteriorContribuyente;
    }

    public String getCPContribuyente() {
        return CPContribuyente;
    }

    public void setCPContribuyente(String CPContribuyente) {
        this.CPContribuyente = CPContribuyente;
    }

    public String getMunicipioContribuyente() {
        return MunicipioContribuyente;
    }

    public void setMunicipioContribuyente(String MunicipioContribuyente) {
        this.MunicipioContribuyente = MunicipioContribuyente;
    }

    public String getEntidadFedContribuyente() {
        return EntidadFedContribuyente;
    }

    public void setEntidadFedContribuyente(String EntidadFedContribuyente) {
        this.EntidadFedContribuyente = EntidadFedContribuyente;
    }

    public String getPaisContribuyente() {
        return PaisContribuyente;
    }

    public void setPaisContribuyente(String PaisContribuyente) {
        this.PaisContribuyente = PaisContribuyente;
    }

    public String getTipoPedimento() {
        return TipoPedimento;
    }

    public void setTipoPedimento(String TipoPedimento) {
        this.TipoPedimento = TipoPedimento;
    }

    public java.sql.Date getFechaRecepcionPedimento() {
        return FechaRecepcionPedimento;
    }

    public void setFechaRecepcionPedimento(java.sql.Date FechaRecepcionPedimento) {
        this.FechaRecepcionPedimento = FechaRecepcionPedimento;
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
