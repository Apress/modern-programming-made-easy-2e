
package com.github.modernprog.swingui;

import javax.swing.JFrame;

/**
 * @author adavis
 *
 */
public class HelloFrame extends JFrame {

	public HelloFrame() {
		super("Hello");
		setSize(500, 500);
		setAlwaysOnTop(true);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new HelloFrame();
	}
	
}
