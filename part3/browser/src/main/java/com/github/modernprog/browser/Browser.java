/**
 * Copyright 2014 Adam L. Davis
 */
package com.github.modernprog.browser;

import java.awt.BorderLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

/**
 * @author adavis
 * 
 */
public class Browser extends JFrame {

	JTextField urlField = new JTextField();
	JEditorPane viewer = new JEditorPane();
	JScrollPane pane = new JScrollPane();

	public Browser() {
		super("Browser");
		setSize(800,600);
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
		getContentPane().add(panel);
		urlField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					try {
						viewer.setPage(new URL(urlField.getText()));
					} catch (MalformedURLException e1) {
						e1.printStackTrace();
					} catch (IOException e1) {
						e1.printStackTrace();
					}
				}
			}
		});
	}

	public static void main(String[] args) {
		new Browser().setVisible(true);
	}

}
