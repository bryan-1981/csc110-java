import javax.swing.*;
import java.awt.*;

public class PetPanel extends JPanel {
    // instance variables so the button listener can reach them
    private JTextField nameField, speciesField, ageField, weightField;
    private JLabel resultLabel;

    public PetPanel() {
        setLayout(new GridLayout(5, 2));                 // 5 rows, 2 columns
        setBackground(new Color(255, 173, 173));         // pink
        setPreferredSize(new Dimension(500, 200));       // play with this

        // assign to the instance vars, NO type in front or you shadow them
        nameField = new JTextField();
        speciesField = new JTextField();
        ageField = new JTextField();
        weightField = new JTextField();
        resultLabel = new JLabel("");
        resultLabel.setFont(new Font("Arial", Font.BOLD, 12));

        JButton createButton = new JButton("Create Profile");

        add(new JLabel("Pet Name:"));      add(nameField);
        add(new JLabel("Species:"));       add(speciesField);
        add(new JLabel("Age:"));           add(ageField);
        add(new JLabel("Weight (lbs):"));  add(weightField);
        add(createButton);                 add(resultLabel);

        // runs every time the button is clicked
        createButton.addActionListener(e -> {
            try {
                String name = nameField.getText();
                String species = speciesField.getText();
                int age = Integer.parseInt(ageField.getText().trim());            // String -> int
                double weight = Double.parseDouble(weightField.getText().trim()); // String -> double

                Pet pet = new Pet(name, species, age, weight);
                resultLabel.setText(pet.toString());
            } catch (NumberFormatException ex) {
                resultLabel.setText("Enter a valid age and weight.");
            }
        });
    }
}