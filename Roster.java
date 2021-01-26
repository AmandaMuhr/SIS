import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;
import java.io.*;

public class Roster {
    private ArrayList<Student> studentList = new ArrayList<>();// ArrayList containing the list of students
    
    public void fillStudentList() throws IOException //Gets student names, creates Student objects, assigns Student name,and puts them in studentList
    {
	Scanner studentFile = new Scanner(new File("StudentList.txt"));//Scanner that grabs the Student List 
	
	for(int i = 0; i < 24; i++)
	{
	   String firstName = studentFile.next();
	   String lastName = studentFile.next();
	   studentFile.nextLine();
	   addNewStudent(firstName + " " + lastName);
	}
	for(Student i: studentList)
	{
	    System.out.println(i.getName());
	}
    }
    
    ///////////////////////
    // GETTERS & SETTERS //
    ///////////////////////

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }

    public Student getStudent(int index) {
        return studentList.get(index);
    }

    public void setStudent(int index, Student element) {
        studentList.set(index, element);
    }

    public void addStudent(Student e) {
        studentList.add(e);
    }

    public void addStudent(int index, Student e) { // Overidden
        studentList.add(index, e);
    }

    public void addNewStudent(String name) {
        studentList.add(new Student(name));
    }

    public void addNewStudent(int index, String name) { // Overidden
        studentList.add(index, new Student(name));
    }

    /////////////
    // METHODS //
    /////////////

}
