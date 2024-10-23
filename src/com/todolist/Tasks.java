package com.todolist;

import java.util.ArrayList;
import java.util.Scanner;

class Tasks {
	ArrayList<String> todo = new ArrayList<String>();
	ArrayList<String> done = new ArrayList<String>();

	Scanner s = new Scanner(System.in);

	private String task;
	private boolean exists = false;
	private boolean isComplete = false;

	private void addTask() {
		task = s.nextLine();
		todo.add(task.toLowerCase());
	}

	private void removeTask() {
		task = s.nextLine();
		todo.remove(task.toLowerCase());
	}

	private void searchTask() {
		task = s.nextLine();
		todo.contains(task.toLowerCase());

		if (exists == true) {
			System.out.println("Task " + task + " exist.");
		} else {
			System.out.println("Task " + task + " doesn't exist.");
		}
	}

	private void setAsComplete() {
		task = s.nextLine();
		todo.remove(task.toLowerCase());
		done.add(task.toLowerCase());
	}

	private void Exit() {
		System.out.println("Exiting the program...");
	}

	private String choice, Lchoice;

	public void TodoList() {
		Scanner st = new Scanner(System.in);

		do {
			choice = st.nextLine();
			Lchoice = choice.toLowerCase();

			switch (Lchoice) {
				case "add": {
					addTask();
					break;
				}
				case "remove": {
					removeTask();
					break;
				}
				case "quit": {
					Exit();
					break;
				}
				case "exit": {
					Exit();
					break;
				}
				default: {
					System.out.println("Option Not Found!");
				}
			}
		} while (Lchoice != exit || quit);

		st.close();
	}

}
