package com.todolist;

import javax.swing.JFrame;
import java.awt.BorderLayout;

class popUp extends JFrame {
	popUp(BorderLayout layout) {
		this.setVisible(true);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setLocationRelativeTo(null);
	}
}
