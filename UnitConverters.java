import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class UnitConverters {
    UnitConverters() {
        JFrame JFrame = new JFrame("Unit Conversions");

        JButton InToFt = new JButton("InToFt");
        InToFt.setBounds(75, 140, 140, 40);

        JFrame.add(InToFt);
        JFrame.setSize(300, 300);
        JFrame.setLayout(null);
        JFrame.setVisible(true);
        JFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}