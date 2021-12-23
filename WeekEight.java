
import java.util.Arrays;
public class WeekEight{
  static int kthsmallest(int[] arr,int k)
  {
    Arrays.sort(arr);
    return arr[k-1];
  }
  static List<int[]> mergeIntervals(List<int[]> intervals) {
    Arrays.sort(intervals);
    List<int[]> mergedIntervals = new ArrayList<>;
    int index = 0; 
    for (int i=0; i<intervals.length; i++){
      if(intervals.get(index)[1] > intervals.get(index+1)[0]) {
        int[] merged = {intervals.get(index)[0], intervals.get(index+1)[1]}; 
        mergedIntervals.put(merged); 
      }
    }
  }

  
   public static void main(String...args) {
     int arr[]={7, 10, 4, 3, 20, 15};
     int k=4;
     int result=kthsmallest(arr,k);
     System.out.println(result);

     int[] test1 = {[[1,4], [2,5], [7,9]]}; 
     int[] test2 = {[[6,7], [2,4], [5,9]]};
     int[] test3 = {[[1,4], [2,6], [3,5]]};

     List<int[]> test1 = new ArrayList<>([1,4], [2,5], [7,9]); 
     // Sort intervals from 0 element
     // Make empty new List of inervals 
     // for interval in intervals
     // if second element is greater than first element
     // of next inerval set
     // then add new interval to list with first element
     // of first set as first element, and second
     // element of second set as second element 

   }


}