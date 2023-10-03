import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;
import java.awt.*;

public class MinMaxCalculation implements View {

    //Instance variables
    double minimum;
    double maximum;
    //JTextField jtfMin;
    //JTextField jtfMax;
    JTextComponent textComponent; 
    String name;

    public MinMaxCalculation() {
        minimum = 0;
        maximum = 0; 
        //jtfMin = new JTextField(5);
        //jtfMin.setEditable(false);
        //jtfMax = new JTextField(5);
        //jtfMax.setEditable(false);
        textComponent = new JTextArea(2, 5); // Create a JTextArea for multi-line text
        textComponent.setEditable(false);
        name = "Minimum and Maximum";
    }

    @Override
    public void update(ArrayList<Double> numbers) {
        minimum = BasicStats.minimum(BasicStats.getArrayDouble(numbers));

        //Set text
        //jtfMin.setText("" + minimum);
        maximum = BasicStats.maximum(BasicStats.getArrayDouble(numbers));

        //Set text
        textComponent.setText("Minimum: " + minimum + "\nMaximum: " + maximum);

        //jtfMax.setText("" + maximum);

    }
/* 
    @Override
    public void reset() {
        jtfMin.setText("");
        jtfMax.setText("");
    }

    @Override
    public JTextComponent show() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 1)); // Two rows for minimum and maximum

        panel.add(jtfMin);
        panel.add(jtfMax);

    return panel;
    }

    @Override
    public String getName() {
        return name;
    }

    public double getMinimum() {
        return minimum;
    }

    public double getMaximum() {
        return maximum;
    }
*/
    @Override
    public void reset() {
        textComponent.setText(""); // Clear the text when resetting
    }

    @Override
    public JTextComponent show() {
        return textComponent;
    }

    @Override
    public String getName() {
        return name;
    }

    public double getMinimum() {
        return minimum;
    }

    public double getMaximum() {
        return maximum;
    }

}