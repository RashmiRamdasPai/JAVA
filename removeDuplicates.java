import java.util.*;

public class recursion2 {
   public static boolean[] map = new boolean[26];
   static  String newString = "";
   public static void remove(String str,int indx){
    if(indx == str.length()){
        System.out.println(newString);
        return;
    }
    char curChar = str.charAt(indx);
    if(map[curChar-'a'] == true){
        remove(str,indx+1);
    }
    else{
        newString+=curChar;
        map[curChar-'a'] = true;
        remove(str,indx+1);
    }

   }
   public static void main(String[] args) {
       System.out.println("Enter the string");
       Scanner sc = new Scanner(System.in);
       String input = sc.next();
       remove(input,0);

   }
}
