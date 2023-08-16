import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class EjemploPanel {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> createAndShowGUI());
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Ejemplo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400); // Tamaño de la ventana

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.setBackground(Color.WHITE);

        ImageIcon imageIcon = new ImageIcon("kira.jpg"); // Cambia la ruta si es necesario
        Image image = imageIcon.getImage();
        Image scaledImage = image.getScaledInstance(150, 150, Image.SCALE_SMOOTH); // Cambia el tamaño de la imagen
        ImageIcon scaledIcon = new ImageIcon(scaledImage);

        JLabel imageLabel = new JLabel(scaledIcon);
        panel.add(imageLabel, BorderLayout.NORTH);

        JLabel titleLabel = new JLabel("Texto a continuación", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Montserrat", Font.PLAIN, 16)); // Cambia el tamaño y el estilo de la fuente si es necesario
        titleLabel.setBounds(100, 200, 200, 30); // Cambia las coordenadas y las dimensiones
        panel.add(titleLabel);

        JTextField textField = new JTextField("Campo de texto");
        panel.add(textField, BorderLayout.CENTER);

        JCheckBox checkBox = new JCheckBox("Checkbox");
        panel.add(checkBox, BorderLayout.SOUTH);

        JLabel emptyLabel = new JLabel(""); // Label vacío
        panel.add(emptyLabel, BorderLayout.LINE_END);

        frame.add(panel);

        frame.setVisible(true);
    }
}
