import java.util.*;

public class Employee{
  Scanner sc=new Scanner(System.in);
  String name,deptName;
  int id;
  double basicPay,grossPay,DA,HRA;
  void read(){
    System.out.println("\n Enter the employee's name");
    name=sc.nextLine();
    System.out.println("\n Enter the id of the Employee");
    id=sc.nextInt();
    System.out.println("\n Enter the employee's department name");
    deptName=sc.nextLine();
    System.out.println("\n Enter the employee's basic pay");
    basicPay=sc.nextFloat();}
  void calculategrossPay(){
      DA=(0.58)*basicPay;
      HRA=(0.16)*basicPay;
      grossPay=basicPay+DA+HRA;

    }
  }
  interface incomeTax{
    void calculateIncometax();

    
  }
  class calculation extends Employee implements incomeTax{
      double Tax,NetPay;
      public void calculateIncometax(){
      if(grossPay<=200000){
         Tax=0;}
      else if(grossPay>200000 && grossPay<=300000){
        Tax=0.10*grossPay;}
      else if(grossPay>300000 && grossPay<=500000){
        Tax=0.15*grossPay;}
      else{
        Tax=0.30*grossPay;
        Tax+=0.02*Tax;
        
      }
      }
      public void calculateNet(){
        
        NetPay=grossPay-Tax;
      }
      void display(){
        System.out.println();
        System.out.println("NAME "+name);
        System.out.println("ID "+id);
        System.out.println("Department Name "+deptName);
        System.out.println("Basic Pay "+basicPay);
        System.out.println("Gross Pay "+grossPay);
        System.out.println("Net Pay "+NetPay);
        System.out.println("Tax "+Tax);
      }
      
      
    }
class EmployerDetails{
    public static void main (String args[]){
       Scanner sc =new Scanner(System.in);
       System.out.println("\n Enter the number of Employee");
       int n=sc.nextInt();
       calculation[] employees=new calculation[n];
       for(int i=0;i<n;i++){
        System.out.println("\n Enter the details of Employee "+(i+1));
        employees[i]=new calculation();
        employees[i].read();
        employees[i].calculategrossPay();
        employees[i].calculateIncometax();
        employees[i].calculateNet();
       }
       for(int j=0;j<n;j++)
        employees[j].display();

       }

    }
  
  








