import java.util.HashMap;
// import java.util.

public class WeekSeven{
  
   public static void main(String...args) {
    //  int[] array = {1, 3, 2, 0, -1, 7, 10};
    //  System.out.println("output:" + probOne(array));
     
  String s1 = "123"; 
  String s2 = "-6172";

  int test1 = stringConversion(s1);
  int test2 = stringConversion(s2);
  
  System.out.println(test1);
  System.out.println(test2); 

   }

  //  public static int probOne(int[] array){
  //    int count = 0;
  //    int n = array.length;
  //    int i = 0;
  //    int front = array[i];
  //    int next = array[i+1];
  //    while (front < next){
  //      i++;
  //      front = array[i];
  //      next = array[i+1];
       
  //    }
  //    int j = n-1;
  //    int back = array[j];
  //    int before = array[j-1];
  //    while (before < back){
  //      j--;
  //      back = array[j];
  //      before = array[j-1];
  //    }
  //    count = (j - i)+1;
  //    int min = 0;
  //    for (int a = i; a <= j; a++){
  //      min = array[a];
  //      if (min > array[a+1]){
  //        min = array[a+1];
  //      }
  //    }
  //    int max = 0;
  //    for (int a = i; a <= j; a++){
  //     max = array[a];
  //      if (max < array[a+1]){
  //        max = array[a+1];
  //      }
  //    }
  //    for (int b = 0; b < i; b++){
  //      if (array[b] > min){
  //        count++;
  //      }
  //    }
  //    for (int c = j+1; c < n; c++){
  //      if (array[c] < max){
  //        count++;
  //      }
  //    }
  //    return count;

  //  } 

  // Understand: Convert a string to an integer 
  // without using built in function
  // Account for negative values

  // Match: Other string manipulation problems

  // Plan: If first character is '-'
  // make variable isNegative = true; 
  
  //Pull one character off at a time.
  // Get length of string
  // if isNegative set index to 1
  // else set index variable to zero
  // while index <= length:
  // map key is 10 ^ length - 1 
  // and value is (character pulled off - '0') * map key
  // once done with loop, add all key values together. 
  // if isNegative return -sum
  // else return sum  
  

  public static int stringConversion(String s) {

    boolean isNegative = false; 
    int index = 0; 
    int sum = 0; 

    if(s.charAt(0) == '-') {
      index = 1; 
      isNegative = true; 
    }

    while(index < s.length()) {
      sum *= 10; 
      sum += s.charAt(index) - '0'; 
      //sum: 1 -> 10
      //sum 12 -> 120 
      // sum 3 -> 123 
      index++;

    }
    if (isNegative) return -1 * (sum);
    return sum;

  }



}