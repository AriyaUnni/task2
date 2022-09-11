import java.util.*;

class Employee
{
int empid;
float ass1,ass2,ass3,result,percent;
String name;
Scanner sc = new Scanner(System.in);

Employee()
{
System.out.println("Employee Details");
System.out.println("Employee name:");
name=sc.nextLine();
System.out.println("Employee id:");
empid=sc.nextInt();
System.out.println("Enter 3 marks:");
ass1=sc.nextFloat();
ass2=sc.nextFloat();
ass3=sc.nextFloat();

System.out.println("Employee name: "+name);
System.out.println("Employee id: "+empid);
}

 
void check()
{
if(percent>=70)
{
System.out.println("Promoted");
}
else
{
System.out.println("Demoted");
}
}


void marks()
{
result=ass1+ass2+ass3;
System.out.println("Result: "+result);
percent=(result/300)*100;
System.out.println("Percentage: " +percent);
}
}

public class EmployeeDetails{
public static void main(String[] args){
Employee e = new Employee();
e.marks();
e.check();
}
}


