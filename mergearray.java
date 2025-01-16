import java.util.*;
class mergearray{
    Scanner sc=new Scanner(System.in);
    int arr1[];
    int arr2[];
    mergearray(){}
    mergearray(int[]a,int[]b){
        arr1=a;
        arr2=b;
    }
    int[] merging(){
        int alength=arr1.length;
        int blength=arr2.length;
        int[] c= new int[alength+blength];
        for(int i=0;i<alength;i++){
            c[i]=arr1[i];
            
        }
        for(int j=0;j<blength;j++){
            c[alength+j]=arr2[j];
        }
        return c;
    }
    int[] sortarray(int[]a){
        Arrays.sort(a);
        return a;
    }
    void display(int[] A){
        for(int i=0;i<A.length;i++){
            System.out.print(A[i]+" ");
        }    }
    int[] takeinput(){
        System.out.println("\n Enter the array size");
        int n=sc.nextInt();
        int[]arr=new int[n];
   System.out.println("\n Enter the array elements");
   for(int i=0;i<n;i++){
       arr[i]=sc.nextInt();
   }
   return arr;
    }}
    class Main{

public static void main(String args[]){
    mergearray obj1=new mergearray();
    mergearray obj2=new mergearray();
    int[]a=obj1.takeinput();
    int[]b=obj2.takeinput();
    mergearray obj=new mergearray(a,b);
    int[] d=obj.merging();
    int[] e=obj.sortarray(d);
    obj.display(e);
}
}
