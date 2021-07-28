package com.company;

import java.lang.*;
import java.util.*;
import Classes.*;
import Interfaces.*;
import FileIO.*;

public class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        University u = new University();
        FileReadWriteDemo frwd = new FileReadWriteDemo();

        System.out.println("-----Welcome To United International University-----");

        boolean repeat = true;

        while(repeat)
        {
            System.out.println("What do you want?\n");
            System.out.println("	1. Faculty Management");
            System.out.println("	2. Student Management");
            System.out.println("	3. Course  Transactions");
            System.out.println("	4. Exit\n");

            System.out.print("Your Choice: ");
            //Scaner class (choice)
            int choice = sc.nextInt();

            switch(choice)
            {
                case 1:

                    System.out.println("--------------------------------");
                    System.out.println("You have selected Faculty Management");

                    System.out.println("Select any Option\n");
                    System.out.println("	1. Insert New Faculty");
                    System.out.println("	2. Remove Existing Faculty");
                    System.out.println("	3. Show All Faculty");
                    System.out.println("	4. Going Back\n");

                    System.out.print("Your Option: ");
                    int option1 = sc.nextInt();



                    //nested switch method
                    switch(option1)
                    {
                        case 1:

                            System.out.println("*******************");
                            System.out.println("Insert New Faculty");

                            System.out.print("Enter Faculty ID: ");
                            String fid1 = sc.next();
                            System.out.print("Enter Faculty Name: ");
                            String name1 = sc.next();
                            System.out.print("Enter Faculty Salary: ");
                            double salary1 = sc.nextDouble();

                            Faculty f1 = new Faculty();
                            f1.setFId(fid1);
                            f1.setName(name1);
                            f1.setSalary(salary1);

                            u.insertFaculty(f1);

                            System.out.println("**********************");
                            break;


                        case 2:

                            System.out.println("************************");
                            System.out.println("Remove  Existing Faculty");

                            System.out.print("Enter Faculty ID: ");
                            //	fid2 scaner class object
                            String fid2 = sc.next();

                            Faculty f2 = u.getFaculty(fid2);

                            if(f2 != null)
                            {
                                u.removeFaculty(f2);
                            }
                            System.out.println("**********************");
                            break;

                        case 3:

                            System.out.println("********************");
                            System.out.println("Show All Faculty");
                            u.showAllFaculty();
                            System.out.println("*********************");
                            break;

                        case 4:

                            System.out.println("************************");
                            System.out.println("Going Back......");
                            System.out.println("************************");
                            break;

                        default:

                            System.out.println("************************");
                            System.out.println("Invalid Option");
                            System.out.println("************************");
                            break;
                    }

                    System.out.println("--------------------------------");
                    break;


                case 2:

                    System.out.println("--------------------------------");
                    System.out.println("You have Selected Student Management");

                    System.out.println("Select any  Option:\n");
                    System.out.println("	1. Insert New Student");
                    System.out.println("	2. Remove  Existing Student");
                    System.out.println("	3. Show All Student");
                    System.out.println("	4. Going Back\n");

                    System.out.print("Your Option: ");
                    int option2 = sc.nextInt();

                    switch(option2)
                    {
                        case 1:

                            System.out.println("************************");
                            System.out.println("Insert New Student");

                            System.out.print("Enter Student ID: ");
                            int sid1 = sc.nextInt();
                            System.out.print("Enter Student Name: ");
                            String name1 = sc.next();


                            Student s1 = new Student();
                            s1.setSid(sid1);
                            s1.setName(name1);

                            u.insertStudent(s1);

                            System.out.println("************************");
                            break;



                        case 2:

                            System.out.println("************************");
                            System.out.println("Remove  Existing Student");

                            System.out.print("Enter Student ID: ");
                            int sid2 = sc.nextInt();

                            Student s2 = u.getStudent(sid2);

                            if(s2 != null)
                            {
                                u.removeStudent(s2);
                            }
                            System.out.println("************************");
                            break;

                        case 3:

                            System.out.println("************************");
                            System.out.println("Show All Student");
                            u.showAllStudent();
                            System.out.println("************************");
                            break;

                        case 4:

                            System.out.println("************************");
                            System.out.println("Going Back......");
                            System.out.println("************************");
                            break;

                        default:

                            System.out.println("************************");
                            System.out.println("Invalid Option");
                            System.out.println("************************");
                            break;
                    }

                    System.out.println("--------------------------------");
                    break;



                case 3:

                    System.out.println("--------------------------------");
                    System.out.println("You have Selected Course Transactions");

                    System.out.println("Select any  Option:\n");
                    System.out.println("	1.Adding Course");
                    System.out.println("	2.Dropping Course");
                    System.out.println("	3. Show Course Transaction History");
                    System.out.println("	4. Going Back\n");
                    System.out.print("Your Option: ");
                    int option3 = sc.nextInt();

                    switch(option3)
                    {
                        case 1:
                            System.out.println("**********************");
                            System.out.println("Adding Course");
                            System.out.print("Enter Student ID: ");
                            int sid1 = sc.nextInt();
                            System.out.print("Enter Course Number: ");
                            int cn1 = sc.nextInt();
                            System.out.print("Enter Adding Quantity: ");
                            int quantity1 = sc.nextInt();

                            if(quantity1>0)
                            {
                                u.getStudent(sid1).getCourse(cn1).adding(quantity1);
                                frwd.writeInFile("$"+quantity1+" has been Adding in Course Number "+ cn1);

                            }
                            System.out.println("***************************");
                            break;

                        case 2:

                            System.out.println("******************************");
                            System.out.println("Dropping Course");
                            System.out.print("Enter Student ID: ");
                            int sid2 = sc.nextInt();
                            System.out.print("Enter Course Number: ");
                            int cn2 = sc.nextInt();
                            System.out.print("Enter Dropping Quantity: ");
                            int quantity2 = sc.nextInt();

                            if(quantity2>0 && quantity2<=u.getStudent(sid2).getCourse(cn2).getCredit())
                            {
                                u.getStudent(sid2).getCourse(cn2).dropping(quantity2);
                                frwd.writeInFile("$"+quantity2+" has been Dropping from Course Number "+ cn2);
                            }
                            System.out.println("**************************");
                            break;



                        case 3:

                            System.out.println("**************************");
                            System.out.println("Show Transaction History\n");
                            frwd.readFromFile();
                            System.out.println("\n*********************");
                            break;

                        case 4:

                            System.out.println("**************************");
                            System.out.println("Going Back");
                            System.out.println("**************************");
                            break;

                        default:

                            System.out.println("********************");
                            System.out.println("Invalid Option");
                            System.out.println("**************************");
                            break;

                    }

                    System.out.println("--------------------------------");
                    break;

                case 5:

                    System.out.println("--------------------------------");
                    System.out.println("You have Selected  Exit");
                    repeat = false;
                    System.out.println("--------------------------------");
                    break;

                default:

                    System.out.println("--------------------------------");
                    System.out.println("Invalid Choice");
                    System.out.println("--------------------------------");
                    break;
            }


        }


    }
}
