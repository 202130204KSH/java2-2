import javax.swing.*;
import java.awt.*;

public class FlowLayoutEx extends JFrame {
    public FlowLayoutEx() {
        setTitle("FlowLayout 예제");
        setDefaultCloseOperation(JFrame.EXIt_ON_CLOASE);
        Container contentPane = getContentPane();

        contentPane.setLayout(new FlowLayout(FlowLayout.Left,30,40));

        contentPane.add(new JButton("add"));
        contentPane.add(new JButton("sub"));
        contentPane.add(new JButton("mul"));
        contentPane.add(new JButton("div"));
        contentPane.add(new JButton("Calculate"));
        
        setSize(300,200);
        setVisible(true);
    }
    public static void main(String[] args){
        new FlowLayoutEx();
    }
}
