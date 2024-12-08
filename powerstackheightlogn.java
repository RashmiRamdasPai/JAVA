import java.util.*;
public class recursion{

    public static int calcPow(int x,int n){
        if(n==0)
          return 1;
        if(x==0)
          return 0;
        if(n%2==0){
            int xpow=calcPow(x, n/2) *calcPow(x, n/2);
            return xpow;
        }
        else{
            int xpow=calcPow(x, n/2)*calcPow(x, n/2)*x;
            return xpow;
        }
    }

       
       
    public static void main (String args[]){
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter the base");
           int base=sc.nextInt();
           System.out.println("Enter the index");
           int index=sc.nextInt();
           int answer=calcPow(base,index);
           System.out.println(answer);
        }
    }
