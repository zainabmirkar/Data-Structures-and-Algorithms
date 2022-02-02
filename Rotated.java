public class Rotated {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(Search(arr, 6));
    }
        
        static int Search(int nums[], int target){

            // finding pivot 
            int pivot = FindPivot(nums);

        // case 1 : if you didnt find the pivot then the array is not rotated
        if(pivot==-1){
              // then do normal bonary search
            BinarySearch(nums, target, 0, nums.length-1);
   }
            // if pivot is found then you have 2 ascending sorted arrays
            // case 1 : target is the pivot itself
            if(nums[pivot]==target){
                return pivot;
            }
            // case 2: target is greater than start
            if(target>nums[0]){
                BinarySearch(nums, target, 0, pivot-1);
               
            }
            // case 3: target is smaller than start
         
             return  BinarySearch(nums, target, pivot+1, nums.length-1);
            
        }

    

    static int BinarySearch(int[] arr, int target, int start, int end){
        
        while(start <= end) {
            // find the middle element
           //   int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
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

    static int FindPivot(int[] arr){
        int start = 0;
        int end = arr.length-1;
        

        while(start<=end){
            int mid = start+(end-start)/2;
            
            // if pivot is the mid
            if(arr[mid]>arr[mid+1] && mid<end ){
                return mid;
            }
             if(arr[mid] < arr[mid-1] && mid>start){
                return mid;
            }
             if(arr[mid]<=arr[start]){
                end = mid-1;
            }else{
                start = mid+1;
            }
             


        }
        return -1;
    }
}
