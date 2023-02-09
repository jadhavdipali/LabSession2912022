package FinalEx;
import java.util.Scanner;

public class Employee {

 int empid;
 String name;
 float salary;
 
 public void getInput() {
 
  Scanner in = new Scanner(System.in);
  System.out.print("Enter the empid :: ");
  empid = in.nextInt();
  System.out.print("Enter the name :: ");
  name = in.next();
  System.out.print("Enter the salary :: ");
  salary = in.nextFloat();
 }
 
 public void display() {
  
  System.out.println("Employee id = " + empid);
  System.out.println("Employee name = " + name);
  System.out.println("Employee salary = " + salary);
 }
 
 public static void main(String[] args) {
 
  Employee e[] = new Employee[5];
  
  for(int i=0; i<5; i++) {
   
   e[i] = new Employee();
   e[i].getInput();
  }
  
  System.out.println("**** Data Entered as below ****");
  
  for(int i=0; i<5; i++) {
   
   e[i].display();
  }
  
  System.out.println("*** Enter Programming Languages***");
  System.out.println("Python");
  System.out.println("Java");
  System.out.println("Perl");
  System.out.println("c/cpp");
  System.out.println("HTML");
  
  System.out.println("****Enter Programming Skill****");
  System.out.println("Paython Developer");
  System.out.println("Java Developer");
  System.out.println("Web Developer");
  
  
    
  
 }
}