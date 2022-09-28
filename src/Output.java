import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Output extends JFrame    {

    public static void main(String[] args) {
        Button b1 = new Button("Button 1  Press Me");

        b1.addActionListener(e -> System.out.println("Button  1 is pressed"));


        JFrame jf = new Output();
        jf.setBounds(500,500,150,150);
        jf.add(b1);

        jf.setVisible(true);






    }


}
