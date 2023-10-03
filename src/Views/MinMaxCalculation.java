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
    JTextField jtfMin;
    //JTextField jtfMax;
  
    String name;

    public MinMaxCalculation() {
        minimum = 0;
       
        jtfMin = new JTextField(5);
        jtfMin.setEditable(false);

        name = "Minimum";
    }

    @Override
    public void update(ArrayList<Double> numbers) {
        minimum = BasicStats.minimum(BasicStats.getArrayDouble(numbers));

        //Set text
        jtfMin.setText("" + minimum);
    

    }
    public void reset() {
        jtfMin.setText("");
      }
    
      @Override
      public JTextComponent show() {
        return jtfMin;
      }
   

    @Override
    public String getName() {
        return name;
    }

    public double getMinimum() {
        return minimum;
    }

    

    

}