
package com.github.modernprog.swingui;

import java.awt.Graphics;

import javax.swing.JWindow;

/**
 * @author adavis
 *
 */
public class HelloWindow extends JWindow {

	public HelloWindow() {
		setSize(500, 500);
		setAlwaysOnTop(true);
		setVisible(true);
	}
	
	@Override
	public void paint(Graphics g) {
		g.setFont(g.getFont().deriveFont(20f));
		g.drawString("Hello Window", 10, 20);
	}
	
	public static void main(String[] args) {
		new HelloWindow();
	}
	
}
