import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VistaUsuario {
    private JLabel labelBienvenida;
    private JLabel labelNombreRestaurante;
    private JLabel labelDireccion;
    private JLabel labelMesasDisponibles;
    private JTextField textNombreRestaurante;
    private JTextField textDireccion;
    private JTextField textMesasDisponibles;
    private JButton botonReservarMesa;
    private JButton botonRealizarPedido;

    public VistaUsuario(){
        JFrame frame = new JFrame("Vista Usuario");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        JPanel panel = new JPanel();
        frame.add(panel);

        labelBienvenida = new JLabel("Bienvenido al sistema de gestión de restaurantes");
        panel.add(labelBienvenida);

        labelNombreRestaurante = new JLabel("Nombre del Restaurante:");
        textNombreRestaurante = new JTextField(20);
        panel.add(labelNombreRestaurante);
        panel.add(textNombreRestaurante);

        labelDireccion = new JLabel("Dirección:");
        textDireccion = new JTextField(20);
        panel.add(labelDireccion);
        panel.add(textDireccion);

        labelMesasDisponibles = new JLabel("Mesas Disponibles:");
        textMesasDisponibles = new JTextField(20);
        panel.add(labelMesasDisponibles);
        panel.add(textMesasDisponibles);

        botonReservarMesa = new JButton("Reservar Mesa");
        botonReservarMesa.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Mesa reservada con éxito");
            }
        });
        panel.add(botonReservarMesa);

        botonRealizarPedido = new JButton("Realizar Pedido");
        botonRealizarPedido.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Pedido realizado con éxito");
            }
        });
        panel.add(botonRealizarPedido);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new VistaUsuario();
    }
}