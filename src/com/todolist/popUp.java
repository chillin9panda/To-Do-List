package com.todolist;

class popUp extends JFrame {
	popUp(String title) {
		super(title);

		this.setResizable(false);
		this.serDefaultCloseOpoeration(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
}
