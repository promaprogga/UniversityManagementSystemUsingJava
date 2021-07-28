package Classes;

import java.lang.*;

import Interfaces.CourseTransactions;
import Interfaces.*;

public abstract class Course implements CourseTransactions
{
    protected int  courseNumber;
    protected int  credit;


    public void setCourseNumber(int courseNumber)
    {
        this.courseNumber = courseNumber;
    }
    public void setCredit(int credit)
    {
        this.credit = credit;
    }
    public int getCourseNumber()
    {
        return courseNumber;
    }
    public int getCredit()
    {
        return credit;
    }
    public abstract void showInfo();

    public void adding(int quantity)
    {
        if(quantity>0)
        {
            System.out.println("Credit: "+credit);
            System.out.println("Adding Quantity: "+quantity);
            credit += quantity;

            System.out.println("Existing Credit: "+credit);
        }
        else
        {
            System.out.println("can not Adding");
        }


    }
    public void dropping(int quantity)
    {
        if(quantity>0 && quantity<=credit)
        {
            System.out.println("Credit: "+credit);
            System.out.println("dropping Quantity: "+quantity);
            credit -= quantity;
            System.out.println("Existing Credit: "+credit);

        }
        else
        {
            System.out.println("Can not Dropping");
        }
    }



}
