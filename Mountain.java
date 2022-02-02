public class Mountain {
    public static void main(String[] args) {
        
    }

    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end= arr.length-1;
        while(start<end){
            int mid = start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                // that means you are in the decreasing part of the array
                // look in the left
                // mid can be the answer thats why not writing mid-1
                end = mid;           
            }else{
                // now you are in acending part of the array
                start = mid+1;
            }
            // in the end start==end i.e the largest number
            //start and end are always finding the largest element thats why at the last they are pointing to the same element then it is largest
        }
        return start;
    }
}
