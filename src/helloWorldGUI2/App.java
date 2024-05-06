/*
 * Implementing ActionListner interface.
 */
package helloWorldGUI2;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class App {
    public static void main(String[] args) {

        HelloWorldDisplay display = new HelloWorldDisplay();
        JButton okButton = new JButton("OK");
        ButtonHandler btnListener = new ButtonHandler();
        okButton.addActionListener(btnListener);
        
        JPanel content = new JPanel();
        content.setLayout(new BorderLayout());
        content.add(display, BorderLayout.CENTER);
        content.add(okButton, BorderLayout.SOUTH);

        JFrame mainWin = new  JFrame("GUI Test");
        mainWin.setContentPane(content);

        mainWin.setSize(250,100);
        mainWin.setLocation(400, 300);
        mainWin.setVisible(true);

        System.out.println("The End!");
    }
    private static class HelloWorldDisplay  extends JPanel {

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawString("Hello World!", 20, 30);
        }
    }

    private static class ButtonHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println(e);
            System.exit(0);
        }
        
    }
}
