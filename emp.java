import java.util.*;
import java.io.*;
class employee
{
static int empNo;
static double salary,totalSalary;
employee(double salary)
{
empNo++;
this.salary=salary;
totalSalary=salary+totalSalary;
}
void show()
{
System.out.println("Employee Number: "+empNo);
System.out.println("Total Salary: "+totalSalary);
}
}


class emp
{
public static void main(String[] args)
{
float s1,s2,s3,s4;
System.out.println("Enter the First person salary");
Scanner sc = new Scanner(System.in);
s1=sc.nextFloat();
employee e1= new employee(s1);
e1.show();
System.out.println("Enter the second person salary");
s2=sc.nextFloat();
employee e2= new employee(s2);
e2.show();
System.out.println("Enter the third person salary");
s3=sc.nextFloat();
employee e3= new employee(s3);
e3.show();
System.out.println("Enter the fourth person salary");
s4=sc.nextFloat();
employee e4= new employee(s4);
e4.show();
}
}