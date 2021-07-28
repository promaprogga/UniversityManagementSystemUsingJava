package Interfaces;
import java.lang.*;
import Classes.*;

public interface CourseOperations
{
	 void insertCourse(Course c);
	 void removeCourse(Course c);
	 Course getCourse(int CourseNumber);
	 void showAllCourse();
}
