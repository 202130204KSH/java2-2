import javax.swing.*;
import java.awt.*;

public class ContentPaneEX extends JFrame {
public ContentPaneEX() {
    setTitle("ContentPhane과 JFrame예제");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    Container contentPhane = getContentPane();
    contentPane.setBackground(Color.ORANGE);
    contentPane.setLayout(new FlowLayout());

    contentPane.add(new JButton("OK"));
    contentPane.add(new JButton("Cancel"));
    contentPane.add(new JButton("Ignore"));

    setSize(300,150);
    setVisible(ture);
    }

public static void main(String[]args){
    new ContentPaneEx();
    }
}