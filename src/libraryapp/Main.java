package libraryapp;
import libraryapp.book.Book;
import mu.edu.todolist.tasks.Task;
import mu.edu.todolist.tasks.WorkTask;

import libraryapp.library.Library;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WorkTask workTask = new WorkTask("Pay bills", "Pay the utility bills.");
		System.out.println("Description: " + workTask.getDescription());
	}

}
