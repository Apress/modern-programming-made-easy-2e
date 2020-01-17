
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
import javax.swing.*;

public class Browser extends JFrame {

    JTextField urlField = new JTextField();
    JEditorPane viewer = new JEditorPane();
    JScrollPane pane = new JScrollPane();

    public Browser() {
        super("Browser");
         setSize(800, 600); //width, height
         setAlwaysOnTop(true);
         setDefaultCloseOperation(EXIT_ON_CLOSE);
         init();
    }
    
    private void init() {
        viewer.setContentType("text/html");
        pane.setViewportView(viewer);
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout(2,2));
        panel.add(pane, BorderLayout.CENTER);
        panel.add(urlField, BorderLayout.NORTH);
        setContentPane(panel);
        urlField.addKeyListener(new KeyAdapter() {
               @Override
               public void keyReleased(KeyEvent e) {
                       handleKeyPress(e);
               }
       });
    }
    
    private void handleKeyPress(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            try {
                    viewer.setPage(new URL(urlField.getText()));
            } catch (MalformedURLException ex) {
                    ex.printStackTrace();
            } catch (IOException ex) {
                    ex.printStackTrace();
            }
       }
    }

   public static void main(String[] args) {
            new  Browser().setVisible(true);
   }

}
