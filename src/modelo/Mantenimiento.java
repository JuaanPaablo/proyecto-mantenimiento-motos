package modelo;

public class Mantenimiento {
    private String placaMoto;
    private String tipoMantenimiento; // Preventivo / Correctivo
    private double costo;
    private String descripcion;
    private double kilometrajeServicio;

    public Mantenimiento(String placaMoto, String tipoMantenimiento, double costo, String descripcion, double kilometrajeServicio) {
        this.placaMoto = placaMoto;
        this.tipoMantenimiento = tipoMantenimiento;
        this.costo = costo;
        this.descripcion = descripcion;
        this.kilometrajeServicio = kilometrajeServicio;
    }

    public String getPlacaMoto() { return placaMoto; }
    public String getTipoMantenimiento() { return tipoMantenimiento; }
    public double getCosto() { return costo; }
    public String getDescripcion() { return descripcion; }
    public double getKilometrajeServicio() { return kilometrajeServicio; }
}