package modelo;

public class Motocicleta {
    private String placa;
    private String marca;
    private String modelo;
    private int cilindraje;
    private double kilometrajeActual;
    private double ultimoCambioAceite;

    public Motocicleta(String placa, String marca, String modelo, int cilindraje, double kilometrajeActual) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.cilindraje = cilindraje;
        this.kilometrajeActual = kilometrajeActual;
        this.ultimoCambioAceite = kilometrajeActual;
    }

    public String getPlaca() { return placa; }
    public void setPlaca(String placa) { this.placa = placa; }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public int getCilindraje() { return cilindraje; }
    public void setCilindraje(int cilindraje) { this.cilindraje = cilindraje; }

    public double getKilometrajeActual() { return kilometrajeActual; }
    public void setKilometrajeActual(double kilometrajeActual) { this.kilometrajeActual = kilometrajeActual; }

    public double getUltimoCambioAceite() { return ultimoCambioAceite; }
    public void setUltimoCambioAceite(double ultimoCambioAceite) { this.ultimoCambioAceite = ultimoCambioAceite; }
}