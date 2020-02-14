package jason.unitconverters;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSpinner;
public class FeetToCentimeters {
    FeetToCentimeters() {
        JFrame Frame = new JFrame("Feet To Centimeters");

        JButton Convert = new JButton("Convert");
        Convert.setBounds(75, 140, 140, 40);

        JLabel NumberLabel = new JLabel();
        NumberLabel.setText("Enter Number of Feet:");
        NumberLabel.setBounds(75, 10, 500, 100);

        JLabel Result = new JLabel();
        Result.setBounds(30, 155, 500, 100);

        JSpinner Number = new JSpinner();
        Number.setBounds(75, 90, 130, 30);

        Frame.add(Result);
        Frame.add(Number);
        Frame.add(NumberLabel);
        Frame.add(Convert);
        Frame.setSize(300, 300);
        Frame.setLayout(null);
        Frame.setVisible(true);
        Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Convert.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                int x = (Integer) Number.getValue();
                Result.setText(x + " ft converts to " + x * 30.48 + " cm");
            }
        });
    }

    public static void main(String[] args) {
        new FeetToCentimeters();
		}    
 }