public class recursion{
    public static void towerOfHanoi(int n,String src,String hlper,String dest){
        if(n==1){
            System.out.println("Transfer disc "+n+"from "+src+" to "+dest);
            return;
        }
        towerOfHanoi(n-1,src,dest,hlper);
        System.out.println("Transfer disc "+n+" from "+src+" to "+dest);
        towerOfHanoi(n-1, hlper, src, dest);
    }

    public static void main(String[] args) {
        int n=3;
        towerOfHanoi(n, "S", "H", "D");
    }
}

    
