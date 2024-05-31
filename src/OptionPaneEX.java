
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class OptionPaneEX extends JFrame{
    public OptionPaneEX() {
        setTitle("옵션");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        setSize(500,200);
        c.add(new MyPanel(), BorderLayout.NORTH);
        setVisible(true);
}

class MyPanel extends Panel {}