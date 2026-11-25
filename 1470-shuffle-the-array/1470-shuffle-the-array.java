class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] arr= new int[2*n];
        int j=0, k=1;
        for(int i=0;i<n;i++){
            arr[j]=nums[i];
            j=j+2;
        }
        for(int i=0;i<n;i++){
            arr[k]=nums[i+n];
            k=k+2;
        }
        return arr;
    }
}