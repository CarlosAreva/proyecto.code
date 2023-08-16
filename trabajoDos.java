import java.awt.Color;
//import java.awt.Dimension;
import javax.swing.*;

public class trabajoDos extends JFrame {

    private JTextField nombreTextField;
    private JTextField precioTextField;
    private JTextField ivaTextField;
    private JTextField totalTextField;

    public trabajoDos() {
        setSize(800, 600);
        setTitle("Paneles");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JPanel panel1 = new JPanel();
        panel1.setSize(800, 600);
//        panel1.setLocation(100, 100);
        panel1.setBackground(Color.CYAN);
        panel1.setLayout(null);
        add(panel1);

        ImageIcon logoIcon = new ImageIcon("bmw.png");
        JLabel logoLabel = new JLabel(logoIcon);
        logoLabel.setBounds(250, 10, 100, 100);
        panel1.add(logoLabel);

        JLabel nameLabel = new JLabel("Nombre:");
        nameLabel.setBounds(50, 120, 150, 20);
        panel1.add(nameLabel);

        nombreTextField = new JTextField();
        nombreTextField.setBounds(140, 120, 200, 25);
        panel1.add(nombreTextField);

        JLabel precioLabel = new JLabel("Precio:");
        precioLabel.setBounds(50, 160, 80, 25);
        panel1.add(precioLabel);

        precioTextField = new JTextField();
        precioTextField.setBounds(140, 160, 200, 25);
        panel1.add(precioTextField);

        JLabel ivaLabel = new JLabel("IVA:");
        ivaLabel.setBounds(50, 200, 80, 25);
        panel1.add(ivaLabel);

        ivaTextField = new JTextField();
        ivaTextField.setBounds(140, 200, 200, 25);
        panel1.add(ivaTextField);

        JLabel totalLabel = new JLabel("Total:");
        totalLabel.setBounds(50, 240, 80, 25);
        panel1.add(totalLabel);

        totalTextField = new JTextField();
        totalTextField.setBounds(140, 240, 200, 25);
        panel1.add(totalTextField);

        
        
        
        
        String[] marcas = {"Toyota", "BMW", "Suzuki"};
        JComboBox<String> marcaComboBox = new JComboBox<>(marcas);
        marcaComboBox.setBounds(140, 280, 200, 25);
        panel1.add(marcaComboBox);

       
        
        
        
        
        JButton calcularButton = new JButton("Calcular");
        calcularButton.setBounds(140, 320, 100, 30);
        panel1.add(calcularButton);
        calcularButton.addActionListener(e -> calcularIVA());

        
        
        
        
        JButton limpiarButton = new JButton("Limpiar");
        limpiarButton.setBounds(260, 320, 100, 30);
        panel1.add(limpiarButton);
        limpiarButton.addActionListener(e -> limpiarCampos());
    }

    private void calcularIVA() {
        try {
            double precio = Double.parseDouble(precioTextField.getText());
            double iva = precio * 0.12; 
            double total = precio + iva;
            ivaTextField.setText(String.valueOf(iva));
            totalTextField.setText(String.valueOf(total));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Ingresa un precio válido.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void limpiarCampos() {
        nombreTextField.setText("");
        precioTextField.setText("");
        ivaTextField.setText("");
        totalTextField.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            trabajoDos ventana = new trabajoDos();
            ventana.setVisible(true);
        });
    }
}
