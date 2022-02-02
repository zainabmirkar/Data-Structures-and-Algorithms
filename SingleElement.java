public class SingleElement {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,3,4,4,8,8};
        
        
    }
    static int[] singleNonDuplicate(int[] nums){
        int start = 0;
        int end = nums.length-1;
        
        while(start<=end){
            int mid = start+(end-start)/2;
            // if mid is the unique element 
            if(nums[mid] != nums[mid-1] && nums[mid] != nums[mid+1] ){
                return nums[mid];
            }
            
            // if mid is not the unique element then do binary search
            
            // if mid is on the odd index then start searching in right
            if(mid%2==0 && nums[mid]==nums[mid-1]){
                start = mid-1;
                
            }
            else{
                 start = mid+1;
                
            }
        }
        return -1;
    }
}
