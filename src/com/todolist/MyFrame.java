package com.todolist;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.LayoutManager;
import java.awt.BorderLayout;
import java.awt.Color;

class MyFrame extends JFrame {
	MyFrame() {
		this.setName("To-Do-List");

		ImageIcon logo = new ImageIcon("media/logo.png");
		this.setIconImage(logo.getImage());

		// this.getContentPane().setBackground(new Color(30, 50, 40));

		JPanel mainPanel = new JPanel();
		mainPanel.setBackground(new Color(24, 25, 38));
		mainPanel.setLayout(new BorderLayout());

		this.add(mainPanel);

		this.setSize(400, 600);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
}
