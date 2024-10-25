class insertionsort{
    public static void main(String args[]){
        int array[] = {2,1,3,5,4};
        
        
        for(int i=1;i<array.length;i++){
            int current = array[i];
            int j=i-1;
        while(j>=0 && current<array[j]){
            array[j+1]=array[j];
            j--;
        }
        
        array[j+1]=current;

    }
for(int i=0;i<array.length;i++){
    System.out.println(array[i]);
}}
}
