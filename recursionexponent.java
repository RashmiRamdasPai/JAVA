import java.util.*;

public class recursion {
    public static void main(String args[]){
    
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter the value of base");
    int x=sc.nextInt();
    System.out.println("Enter the value of exponent");
    int n=sc.nextInt();
    int answer=exp(x,n);
     System.out.println(answer);
    }

    public static int exp(int x,int n){
          if(n==0){
            return 1;}
      if(x==0){
         return 0;}
      int xpo=exp(x,n-1);
      int xpo1=x*xpo;
      return xpo1;
      }
}
