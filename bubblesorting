import java.util.*;
public class arrays{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] =new int[size];
        for(int i=0;i<size;i++){
            numbers[i]=sc.nextInt();

        }
        
        for(int i=0;i<size;i++){
            if(numbers[i]>numbers[i+1]){
                int t=numbers[i];
                numbers[i]=numbers[i+1];
                numbers[i+1]=t;
                break;
            }
            

        }
         for(int i=0;i<size;i++){
            System.out.println(numbers[i]);
         }
    }
}
