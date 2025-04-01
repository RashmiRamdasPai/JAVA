public class recursion2 {
    static int count=0;
 
    static String newString="";
    public static void move(String s,int index,char c){
        if(index==s.length()){
            for(int i =0;i<count;i++)
               newString+=c;
            System.out.println(newString);
          return;}
        if(s.charAt(index)==c)
           count++;
        else 
         newString=newString+s.charAt(index);
         move(s, index+1, c);

    }
    public static void main(String[] args) {
        String str = "axbcxxd";
        move(str,0,'x');
    }
}
