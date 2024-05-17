import java.awt.*;
import javax.swing.*;

public class GridLayoutEX extends JFrame{
    public GridLayoutEX(){
        super("GridLayout 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane = getContentPane();

        contentPane.setLayout(new GridLayout(4,3));

        for(int i=0;i<10;i++){
            String text = Integer.toString(i);
            JButton button = new JButton(text);
            contentPane.add(button);
        }
        setSize(500,200);
        setVisible(true);
    }
    public static void main(String[]args){
        new GridLayoutEX();
    }
}
