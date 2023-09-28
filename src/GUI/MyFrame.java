package GUI;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    public static void main(String[] args) {

    }

    public MyFrame() throws HeadlessException {
       ;
        this.setSize(420,420);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//JFrame.EXIT_ON_CLOSE=3  Integer value is 3
        this.getContentPane().setBackground(new Color(200,225,50));//(new Color(0,0,0) for R,G,B values
    }
}
