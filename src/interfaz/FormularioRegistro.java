package interfaz;

import javax.swing.*;
import java.awt.*;

public class FormularioRegistro extends JFrame {
    private JTextField txtPlaca, txtMarca, txtModelo, txtKilometraje;
    private JButton btnGuardar;

    public FormularioRegistro() {
        setTitle("Registro de Motocicleta");
        setSize(350, 250);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(5, 2, 5, 5));

        add(new JLabel(" Placa:"));
        txtPlaca = new JTextField();
        add(txtPlaca);

        add(new JLabel(" Marca:"));
        txtMarca = new JTextField();
        add(txtMarca);

        add(new JLabel(" Modelo:"));
        txtModelo = new JTextField();
        add(txtModelo);

        add(new JLabel(" Kilometraje Inicial:"));
        txtKilometraje = new JTextField();
        add(txtKilometraje);

        btnGuardar = new JButton("Guardar Registro");
        add(btnGuardar);

        btnGuardar.addActionListener(e -> {
            JOptionPane.showMessageDialog(this, "Datos capturados correctamente (Simulación de guardado).");
            dispose();
        });
    }
}