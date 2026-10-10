package modelo;

public class Conductor {
    private String cedula;
    private String nombreCompleto;
    private String tipoLicencia;
    private String telefono;
    private boolean licenciaVigente;

    public Conductor(String cedula, String nombreCompleto, String tipoLicencia, String telefono, boolean licenciaVigente) {
        this.cedula = cedula;
        this.nombreCompleto = nombreCompleto;
        this.tipoLicencia = tipoLicencia;
        this.telefono = telefono;
        this.licenciaVigente = licenciaVigente;
    }

    public String getCedula() { return cedula; }
    public void setCedula(String cedula) { this.cedula = cedula; }

    public String getNombreCompleto() { return nombreCompleto; }
    public void setNombreCompleto(String nombreCompleto) { this.nombreCompleto = nombreCompleto; }

    public String getTipoLicencia() { return tipoLicencia; }
    public void setTipoLicencia(String tipoLicencia) { this.tipoLicencia = tipoLicencia; }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }

    public boolean isLicenciaVigente() { return licenciaVigente; }
    public void setLicenciaVigente(boolean licenciaVigente) { this.licenciaVigente = licenciaVigente; }
}