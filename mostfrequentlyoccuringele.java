class frequency {
    public static int mostFrequentElement(int[] nums) {
     int n=nums.length;
     int[] hash = new int[n+1];
     for(int i=0;i<n;i++){
        hash[nums[i]]++;
     }
     int max=hash[0];int maxi=0;
     for(int i=0;i<hash.length;i++){
        if(hash[i] > max){
          max = hash[i];
          maxi=i;
          
     }}
     return maxi;
    }
    public static void main(String args[]){
        int[] arr = {1,1,1,5,5,5,5,6,6,6,6,6};
        int ans=mostFrequentElement(arr);
        System.out.println(ans);
    }
}
