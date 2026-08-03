class Solution {
    public int FirstO(int[] arr,  int x){//created a different function to return the first index of the element 
        int low =0;
        int high = arr.length-1;
        int first =-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==x){
                first = mid;
                high =mid-1;
            }else if(arr[mid]<x){
                low=mid+1;
            }else{
                high=mid-1;
            }
            
        }
        return first;
    }//created the second function to find the last occurence of the element 
    public int LastO(int[] arr,  int x){
        int low =0;
        int high = arr.length-1;
        int last =-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==x){
                last = mid;
                low =mid+1;
            }else if(arr[mid]<x){
                low=mid+1;
            }else{
                high=mid-1;
            }
            
        }
        return last;
    }
    public int[] searchRange(int[] nums, int target) {
        int first = FirstO(nums , target);
        if(first ==-1){//made this condition only to reduce complexity when there will be no first element it should not check for the occurence of the last element directly return [-1,-1]
            return new int[]{-1,-1};
        }
        int last = LastO(nums, target);
        return new int[]{first,last};
    }
}