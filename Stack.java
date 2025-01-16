import java.util.*;
class StackException extends Exception{
    StackException(String s1){
        super(s1);
    }
}
class Stack{
    private final int[]stk;
    private int top;
    Stack(int size){
        stk=new int[size];
        top=-1;
    }
    void push(int item) throws StackException{
        if(top==stk.length-1)
          throw new StackException("Stack Overflow");
         else
           stk[++top]=item;
    }
    int pop() throws StackException{
        if(top==-1)
           throw new StackException("Stack Underflow");
        else
           return stk[top--];
    }
    void display() {
        if(top>-1){
            System.out.println("Stack elements are");
            for(int i=top;i>-1;i--)
               System.out.println(stk[i]+" ");
        }
        else
           System.out.println("Stack Underflow");
        }
        void peek(){
            if(top==-1){
                System.out.println("Stack underflow");
                
            }
            else
              System.out.println(stk[top]);
        }
    }

class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
         System.out.println("Enter the size");
         Stack obj=new Stack(sc.nextInt());
         int ch;
         do{
             System.out.println("Menu \n 1.Push \n 2.Pop \n 3.Peek \n 4.display \n5.exit");
             System.out.println("Enter your choice");
              ch=sc.nextInt();
             switch(ch){
                 case 1:try{
                     System.out.println("Enter the itemto be pushed");
                     obj.push(sc.nextInt());
                 }
                 catch(StackException e){
                     System.out.println("caught stackException "+e);
                 }
                 break;
                 case 2:try{
                     System.out.println("The popped element is "+obj.pop());
                       
                 }
                  catch(StackException e){
                     System.out.println("caught stackException "+e);
                 }
                 
                break;
                case 3:obj.peek();
                      break;
                case 4:obj.display();
                      break;
                case 0:break;
             }
         }while(ch!=0);
             
             
             
         }
    }
