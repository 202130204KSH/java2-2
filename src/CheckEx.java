
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class CheckEx extends JFrame{
    private JCheckBox [] fruits = new JCheckBox[3];
    private String[] name = {"검","창","총"};

    private JLabel sumLabel;

    public CheckEx() {
        setTitle("체크박스 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        c.add(new JLabel("골라라"));

        MyItemListener listener = new MyItemListener();

        for(int i=0;i<fruits.length;i++){
            fruits[i] = new JCheckBox(name[i]);
            fruits[i].setBorderPainted(true);
            c.add(fruits[i]);
            fruits[i].addItemListener(listener);
        }
    sumLabel = new JLabel("0");
    c.add(sumLabel);
    
    setSize(250,200);
    setVisible(true);
    }
    class MyItemListener implements ItemListener{
    private int sum = 0;
     
    public void itemStateChanged(ItemEvent e){
        if(e.getStateChange() == ItemEvent.SELECTED) {
            if(e.getItem() == fruits[0]){
            sum+=100;
            }else if(e.getItem() == fruits[1]){
                sum+=500;
            }else{
                sum +=20000;
            }
        }else {
            if(e.getItem() == fruits[0]){
                sum-=100;
            }else if(e.getItem() == fruits[1]){
                    sum-=500;
            }else{
                    sum -=20000;
            }
            sumLabel.setText("현재"+sum+"입니다");
        }
    }
    public static void main(String[] args) {
        new CheckEx();
    }
    }
}