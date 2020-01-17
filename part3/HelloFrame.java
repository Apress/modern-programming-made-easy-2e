import javax.swing.*; import java.awt.Graphics;

    public class HelloFrame extends JFrame {
 
            public HelloFrame() {
                    super("Hello");
                     setSize(500, 500); //width, height
                     setAlwaysOnTop(true);
                     setVisible(true);
                     setDefaultCloseOperation(EXIT_ON_CLOSE);
            }

           public static void main(String[] args) {
                    new HelloFrame();
           }

   }
