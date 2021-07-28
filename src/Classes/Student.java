package  Classes;
import java.lang.*;

import Interfaces.CourseOperations;
import Interfaces.*;

public class Student implements CourseOperations
{
    private String name;
    private int sid;
    private Course courses[] = new Course [10];


    public void setName(String name)
    {
        this.name = name;

    }
    public void setSid(int sid)

    {
        this.sid = sid;

    }


    public String getName()

    {
        return name;
    }
    public int getSid()
    {
        return sid;
    }

    public void insertCourse(Course c)
    {
        int flag = 0;
        for(int i=0; i<courses.length; i++)
        {
            if(courses[i] == null)
            {
                courses[i] = c;
                flag = 1;
                break;
            }
        }
        if(flag == 1)
        {
            System.out.println("Course Inserted");
        }
        else
        {
            System.out.println("Can Not Insert");
        }
    }

    public void removeCourse(Course c)
    {
        int flag = 0;
        for(int i=0; i<courses.length; i++)
        {
            if(courses[i] == c)
            {
                courses[i] = null;
                flag = 1;
                break;
            }
        }
        if(flag == 1)
        {
            System.out.println("Course Removed");

        }
        else
        {
            System.out.println("Can Not Remove");

        }
    }
    public void showAllCourse()
    {
        for(Course c : courses)
        {
            if(c != null)
            {
                c.showInfo();
            }
        }
    }
    public Course getCourse(int CourseNumber)
    {
        Course c = null;

        for(int i=0; i<courses.length; i++)
        {
            if(courses[i] != null)
            {
                if(courses[i].getCourseNumber() == CourseNumber)
                {
                    c = courses[i];
                    break;
                }
            }
        }
        if(c != null)
        {
            System.out.println("Course Found");
        }
        else
        {
            System.out.println("Course Not Found");
        }
        return c;
    }
}
