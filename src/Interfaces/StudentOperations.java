package Interfaces;
import Classes.Student;
import Classes.*;
public interface StudentOperations
{
	//public void setStudent(Student s);
	Student getStudent(int sid);
    void insertStudent(Student s);
	void removeStudent(Student s);
	void showAllStudent();
}
