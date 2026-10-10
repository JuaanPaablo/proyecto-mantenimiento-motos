package interfaz;

import negocio.GestorFlota;
import javax.swing.*;
import java.awt.*;

public class VentanaPrincipal extends JFrame {
    private GestorFlota gestor = new GestorFlota();
    private JButton btnAbrirFormulario, btnVerReportes;

    public VentanaPrincipal() {
        setTitle("Sistema de Gestión de Flota - Motos");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());

        btnAbrirFormulario = new JButton("Registrar Nueva Motocicleta");
        btnVerReportes = new JButton("Ver Estado y Alertas");

        add(btnAbrirFormulario);
        add(btnVerReportes);

        btnAbrirFormulario.addActionListener(e -> {
            FormularioRegistro form = new FormularioRegistro();
            form.setVisible(true);
        });

        btnVerReportes.addActionListener(e -> {
            JOptionPane.showMessageDialog(this, "Módulo de reportes y validaciones operando correctamente.");
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new VentanaPrincipal().setVisible(true);
        });
    }
}