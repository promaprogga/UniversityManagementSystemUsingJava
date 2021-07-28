package  Classes;
import java.lang.*;

import Interfaces.FacultyOperations;
import Interfaces.StudentOperations;
import Interfaces.*;

public class University implements StudentOperations, FacultyOperations
{
    private Student student[] = new Student [500];
    private Faculty faculties[] = new Faculty [100];

    public void insertStudent(Student s)
    {
        int flag = 0;
        for(int i=0; i<student.length; i++)
        {
            if(student[i] == null)
            {
                student[i] = s;
                flag = 1;
                break;
            }
        }
        if(flag == 1)
        {
            System.out.println("Student Inserted");
        }
        else
        {
            System.out.println("Can Not Insert");
        }
    }

    public void removeStudent(Student s)
    {
        int flag = 0;
        for(int i=0; i<student.length; i++)
        {
            if(student[i] == s)
            {
                student[i] = null;
                flag = 1;
                break;
            }
        }
        if(flag == 1)
        {
            System.out.println("Student Removed");

        }
        else
        {
            System.out.println("Can Not Remove");

        }
    }
    public void showAllStudent()
    {
        for(Student s : student)
        {
            if(s != null)
            {
                System.out.println("**********************************");
                System.out.println("Student Name: "+ s.getName());
                System.out.println("Student Sid: " + s.getSid());
                System.out.println("----------------------------------");
                s.showAllCourse();
                System.out.println("----------------------------------");
            }
        }
    }
    public Student getStudent(int sid)
    {
        Student s = null;

        for(int i=0; i<student.length; i++)
        {
            if(student[i] != null)
            {
                if(student[i].getSid() == sid)
                {
                    s = student[i];
                    break;
                }
            }
        }
        if(s != null)
        {
            System.out.println("Student Found");
        }
        else
        {
            System.out.println("Student Not Found");
        }
        return s;
    }


    public void insertFaculty(Faculty e)
    {
        int flag = 0;
        for(int i=0; i<faculties.length; i++)
        {
            if(faculties[i] == null)
            {
                faculties[i] = e;
                flag = 1;
                break;
            }
        }
        if(flag == 1)
        {
            System.out.println("Faculty Inserted");
        }
        else
        {
            System.out.println("Can Not Insert");
        }
    }

    public void removeFaculty(Faculty e)
    {
        int flag = 0;
        for(int i=0; i<faculties.length; i++)
        {
            if(faculties[i] == e)
            {
                faculties[i] = null;
                flag = 1;
                break;
            }
        }
        if(flag == 1)
        {
            System.out.println("Faculty Removed");

        }
        else
        {
            System.out.println("Can Not Remove");

        }
    }
    public void showAllFaculty()
    {
        System.out.println("//////////////////////////////////");
        for(Faculty e : faculties)
        {
            if(e != null)
            {
                System.out.println("Faculty Name: "+ e.getName());
                System.out.println("Faculty ID: "+ e.getFId());
                System.out.println("Salary: "+ e.getSalary());
                System.out.println();
            }
        }
        System.out.println("//////////////////////////////////");
    }
    public Faculty getFaculty(String fid)
    {
        Faculty e = null;

        for(int i=0; i<faculties.length; i++)
        {
            if(faculties[i] != null)
            {
                if(faculties[i].getFId().equals(fid))
                {
                    e = faculties[i];
                    break;
                }
            }
        }
        if(e != null)
        {
            System.out.println("Faculty Found");
        }
        else
        {
            System.out.println("Faculty Not Found");
        }
        return e;
    }
}
