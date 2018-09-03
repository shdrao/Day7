package com.capgemini.day7;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.LinkedList;

public class Assignment {
	private File assignmentFile;
	private LocalDate dueDate;

	public Assignment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Assignment(File assignmentName, LocalDate dueDate) {
		super();
		this.assignmentFile = assignmentName;
		this.dueDate = dueDate;
	}

	@Override
	public String toString() {
		return "Assignment [assignmentName=" + assignmentFile + ", dueDate=" + dueDate + "]";
	}

static LinkedList<Assignment> object = new LinkedList<>();

	public static boolean add(Assignment a) throws IOException {
		// TODO Auto-generated method stub
		
		return object.add(a);
	}

	public static boolean remove(Assignment b) {
		// TODO Auto-generated method stub
		return object.remove(b);
	}

	public static Assignment earliestAssignment() {
		int result = 0;
		Assignment early = object.getFirst();
		for (Assignment assignments : object) {
			if (early.equals(assignments))
				continue;

			result = assignments.dueDate.compareTo(early.dueDate);
			if (result < 0) {
				early = assignments;
			}

		}
							
		System.out.println(object);
		return early;
	}
	
	
}
