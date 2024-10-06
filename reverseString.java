public class Strings{
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("Tony");
        for(int i= 0;i<sb.length()/2;i++){
          int front = i;
          int end = sb.length()-1-i;
          char frontChar = sb.charAt(front);
          char backChar = sb.charAt(end);
          sb.setCharAt(front,backChar);
          sb.setCharAt(end,frontChar);
        }
        System.out.println(sb);
    }
}
        

          



    
