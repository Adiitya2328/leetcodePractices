class Solution {
    public int countStudents(int[] arr,long pages){
        int students=1;
            long pageStudent =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]+pageStudent<=pages){
                pageStudent+=arr[i];

            }else{
                students+=1;
                pageStudent= arr[i];
            }
        }
        return students;
    }
    public int findPages(int[] arr, int k) {
        // code here
        if(arr.length<k){
            return -1;
        }
        long low=0;
        long high=0;
        for(int i=0;i<arr.length;i++){
            low = Math.max(low,arr[i]);
            high += arr[i];
        }
        while(low<=high){
            long mid=low+(high-low)/2;
            int students = countStudents(arr,mid);
            if(students>k){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return (int)low;
    }
    public int splitArray(int[] nums, int k) {
        return findPages(nums,k);
    }
}