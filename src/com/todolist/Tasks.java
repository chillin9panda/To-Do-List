package com.todolist;

import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JButton;

class Tasks {
	private boolean exists = false;
	private boolean isComplete = false;

	// Colors
	Color midNightBlue = com.todolist.MyFrame.midNightBlue;
	Color dimNight = new Color(32, 40, 63);

	// Fonts
	Font addTaskFont = new Font("Times New Roman", Font.PLAIN, 19);

	popUp addTaskPopUp;
	popUp search;

	void addTasks() {
		addTaskPopUp = new popUp(new BorderLayout());
		addTaskPopUp.setTitle("New Task");
		addTaskPopUp.setSize(300, 150);

		// Panels
		JPanel taskAddArea = new JPanel();
		JPanel buttonsArea = new JPanel();

		// taskAddArea Components
		JPanel taskAddAreaLayout = new JPanel(new GridLayout(2, 1));
		taskAddAreaLayout.setBackground(midNightBlue);

		JLabel taskNameLabel = new JLabel("Task Name");
		taskNameLabel.setForeground(Color.WHITE);
		taskNameLabel.setFont(addTaskFont);

		JTextArea taskTitle = new JTextArea();
		taskTitle.setFont(addTaskFont);

		taskAddArea.setBackground(midNightBlue);
		buttonsArea.setBackground(dimNight);

		taskAddAreaLayout.add(taskNameLabel);
		taskAddAreaLayout.add(taskTitle);
		taskAddArea.add(taskAddAreaLayout);

		// buttonsArea Components
		JButton add = new JButton("Add Task");
		JButton cancel = new JButton("Cancel");

		buttonsArea.add(add);
		buttonsArea.add(cancel);

		addTaskPopUp.add(taskAddArea);
		addTaskPopUp.add(buttonsArea, BorderLayout.SOUTH);

	}

	void removeTask() {
	}

	void searchTask() {
	}

	void setAsComplete() {
	}

	void sortByName() {
	}

	void sortByAddDate() {
	}
}
