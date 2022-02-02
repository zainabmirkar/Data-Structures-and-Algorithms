public class ceilingbs {
     public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18}; 
        int target = 15;
        int ans = BinarySearch(arr, target);
        System.out.println(ans);
    } 
    
    // return ceiling smallest number greater than equal to target
    // return end for floor (opposite of ceiling)
    static int BinarySearch(int[] arr, int target){
            int start = 0;
            int end = arr.length-1;
            while(start<=end){
                int mid = start+(end-start)/2;

                if(target<arr[mid]){
                    end = mid-1;
                }else {
                    start=mid+1;
                }
            }
            return start;
    }

}
