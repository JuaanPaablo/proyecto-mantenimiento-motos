package negocio;

import modelo.Conductor;
import modelo.Motocicleta;
import modelo.Mantenimiento;
import java.util.ArrayList;
import java.util.List;

public class GestorFlota {
    private List<Conductor> listaConductores = new ArrayList<>();
    private List<Motocicleta> listaMotos = new ArrayList<>();
    private List<Mantenimiento> listaMantenimientos = new ArrayList<>();

    public void registrarConductor(Conductor c) {
        listaConductores.add(c);
    }

    public void registrarMotocicleta(Motocicleta m) {
        listaMotos.add(m);
    }

    public void registrarMantenimiento(Mantenimiento mant) {
        listaMantenimientos.add(mant);
    }

    public Motocicleta buscarMotocicleta(String placa) {
        for (Motocicleta m : listaMotos) {
            if (m.getPlaca().equalsIgnoreCase(placa)) {
                return m;
            }
        }
        return null;
    }

    public double calcularCostoTotalOperativo(String placa) {
        double total = 0;
        for (Mantenimiento mant : listaMantenimientos) {
            if (mant.getPlacaMoto().equalsIgnoreCase(placa)) {
                total += mant.getCosto();
            }
        }
        return total;
    }
}