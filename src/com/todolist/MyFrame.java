package com.todolist;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.LayoutManager;
import java.awt.GridLayout;
import java.awt.Color;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.BorderFactory;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.ButtonGroup;

class MyFrame extends JFrame {
	MyFrame(BorderLayout layout) {
		super("To-Do-List");

		ImageIcon logo = new ImageIcon("media/logo.png");
		this.setIconImage(logo.getImage());

		// Color definition
		Color midNightBlue = new Color(24, 25, 38);

		// Menu Bar
		JMenuBar menuBar = new JMenuBar();
		JMenu addTask = new JMenu("New Task");
		JMenu search = new JMenu("Search");
		JMenu sort = new JMenu("Sort");

		menuBar.setBackground(midNightBlue);
		addTask.setForeground(Color.WHITE);
		search.setForeground(Color.WHITE);
		sort.setForeground(Color.WHITE);

		// Sort menu
		JRadioButtonMenuItem sortByName = new JRadioButtonMenuItem("By Name");
		JRadioButtonMenuItem sortByDateAdded = new JRadioButtonMenuItem("By Date Added");

		ButtonGroup sortGroup = new ButtonGroup();

		sortGroup.add(sortByName);
		sortGroup.add(sortByDateAdded);

		sort.add(sortByName);
		sort.add(sortByDateAdded);

		// Add menu to menubar
		menuBar.add(addTask);
		menuBar.add(search);
		menuBar.add(sort);

		// Panels
		JPanel mainPanel = new JPanel();
		mainPanel.setBackground(midNightBlue);
		mainPanel.setLayout(new GridLayout(2, 1));

		JPanel todoPanel = new JPanel();
		todoPanel.setBackground(midNightBlue);
		JPanel completedPanel = new JPanel();
		completedPanel.setBackground(midNightBlue);

		// Borders
		Border todoBorder = BorderFactory.createTitledBorder("To-Do");
		if (todoBorder instanceof TitledBorder)
			((TitledBorder) todoBorder).setTitleColor(Color.WHITE);

		Border completedBorder = BorderFactory.createTitledBorder("Completed");
		if (completedBorder instanceof TitledBorder)
			((TitledBorder) completedBorder).setTitleColor(Color.WHITE);

		todoPanel.setBorder(todoBorder);
		completedPanel.setBorder(completedBorder);

		// main panel
		mainPanel.add(todoPanel);
		mainPanel.add(completedPanel);

		// frame
		this.add(mainPanel);
		this.add(menuBar, BorderLayout.NORTH);

		this.setSize(400, 600);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
}
