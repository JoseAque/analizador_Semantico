import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;

public class test_Analizador_Indentificadores {
    // Expresión regular que valida cadenas que comienzan con una letra (incluyendo
    // caracteres acentuados) y pueden contener números
    private static final String letra = "[a-zA-Zá-úÁ-Ú][a-zA-Z0-9á-úÁ-Ú]*";

    public static void main(String[] args) {
        // Asegura que la interfaz gráfica se cree en el hilo de eventos de Swing para
        // evitar problemas de concurrencia
        SwingUtilities.invokeLater(test_Analizador_Indentificadores::createAndShowGUI);
    }

    private static void createAndShowGUI() {
        // Crea la ventana principal de la aplicación con un título
        JFrame frame = new JFrame("Equipo 11. Validador de Expresión Regular");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 150);
        frame.setLayout(new FlowLayout());
        frame.setLocationRelativeTo(null);
        
        // Crea un campo de texto con una longitud de 20 caracteres para ingresar la
        // cadena a validar
        JTextField textField = new JTextField(20);
        JButton validateButton = new JButton("Validar");
        JButton clearButton = new JButton("Limpiar");
        JLabel resultLabel = new JLabel("");

        // Agrega una etiqueta para indicar al usuario que ingrese un texto en el campo
        JLabel instructionLabel = new JLabel("Ingresa una variable a validar:");

        // Agrega un listener al botón de validación para verificar si el texto
        // ingresado cumple con la expresión regular
        validateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = textField.getText();
                if (Pattern.matches(letra, input)) {
                    resultLabel.setText(input + "  es Válido");
                    resultLabel.setForeground(Color.GREEN);
                } else {
                    resultLabel.setText(input + " es Inválido");
                    resultLabel.setForeground(Color.RED);
                }
            }
        });

        // Agrega un listener al botón de limpiar para borrar el texto ingresado y el
        // resultado
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText("");
                resultLabel.setText("");
            }
        });

        frame.add(instructionLabel);
        frame.add(textField);
        frame.add(validateButton);
        frame.add(clearButton);
        frame.add(resultLabel);

        frame.setVisible(true);
    }
}
