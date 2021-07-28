package Interfaces;
import Classes.*;

public interface FacultyOperations
{
	//public void setFaculty(Faculty e);
	Faculty getFaculty(String fid);
	void insertFaculty(Faculty e);
	void removeFaculty(Faculty e);
	void showAllFaculty();
}
