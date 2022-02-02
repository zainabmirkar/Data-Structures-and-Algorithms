public class RBS {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(FindPivot(arr));
    }

    static int search(int[] nums, int target){
        // find pivot using the findpivot function
         int pivot = FindPivot(nums);
       
        //  if you did not find the pivot do binary search because array is not rotated
        if(pivot== -1){
           return BinarySearch(nums, target, 0, nums.length-1);
        }

        // if pivot is found then 3 cases
        if(pivot==target){
            return pivot;
        }
        if(target>nums[0]){
            return BinarySearch(nums, target, 0, pivot-1);
        }else{
            return BinarySearch(nums, target, pivot+1, nums.length-1);
        }
        
    }

    // binary search
    
    static int BinarySearch(int[] arr, int target, int start, int end){
        
        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // ans found
                return mid;
            }
        }
        return -1;
}



    // function to write pivot
    static int FindPivot(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            // 4 cases here
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[mid]<=arr[start]){
                end = mid-1;
            }
            else{
                start= mid+1;
            }
            
        }
        // element not found
        return -1;
    }
}
