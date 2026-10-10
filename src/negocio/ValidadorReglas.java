package negocio;

public class ValidadorReglas {

    public static boolean validarKilometraje(double actual, double nuevo) throws IllegalArgumentException {
        if (nuevo < actual) {
            throw new IllegalArgumentException("Error: El nuevo kilometraje no puede ser inferior al odómetro actual (" + actual + " km).");
        }
        return true;
    }

    public static boolean verificarDesgasteAceite(double kilometrajeActual, double ultimoCambio) {
        double limiteAceite = 5000.0; // Límite de mantenimiento preventivo
        return (kilometrajeActual - ultimoCambio) >= limiteAceite;
    }
}