import javax.swing.*; import java.awt.Graphics;

    public class HelloWindow extends JWindow {
 
            public HelloWindow() {
                     setSize(500, 500); //width, height
                     setAlwaysOnTop(true);
                     setVisible(true);
            }

           @Override
           public void paint(Graphics g) {
                    g.setFont(g.getFont().deriveFont(20f));
                    g.drawString("Hello Window", 10, 20); //x,y
           }

           public static void main(String[] args) {
                    new HelloWindow();
           }

   }
