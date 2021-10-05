import java.util.Hashtable;
import java.util.HashSet;

public class WeekTwo {
    public static void main (String...args) {
        System.out.println("--- WEEK TWO ---");
        int[] array = {8, 7, 9, 6, 7, 5, 1};
        int k = 2;
        int value = findElementWithFreq(array, k);
        System.out.println(value + " occurs " + k + " times.");
        int[] array2 = {1, 9, 3, 10, 4, 20 , 2};
        System.out.println(longestSequence(array2));

        
        //int[] array3 = null;//array null
        int array3[]={3,2,6,9,5};
        //int array3[]={4,5,6,1};
        //int  array3[]=new int[0]; //empty set
        int sum = 9;
        System.out.println(arraySum(array3, sum));

        System.out.println();
    }

    /**
    * What happens if more than one element occurs k times?
    * Return the first one we find
    * What if there are no occurrences?
    * return -1
    * What if k = 0?
    * return -1
    * if array is empty?
    * return -1
    * What if k is longer than array?
    * return -1
    *
    */
    public static int findElementWithFreq(int[] array, int k) {
        // create hashtable
        Hashtable<Integer, Integer> hashTable = new Hashtable<>();
        // go through edge cases
        if (k == 0 
            || array.length == 0
            || k > array.length)
            return -1;

        int arrayVal = -1;
        // define loop structure, we iterate over the array
        // eg: {8, 7, 9, 6, 7, 5, 1}
        for (int i = 0; i < array.length; i++) {  // O(n) complexity
            // - counter variable 
            Integer valCoutner = hashTable.get(array[i]);
            if (valCoutner == null) {  // first time seeing this value
                hashTable.put(array[i], 1);
            } else { // we have seen this value before
                // increment val
                valCoutner++;
                // check if it occurs k times
                if (valCoutner == k) {
                    arrayVal = array[i];
                    break;
                } else {
                    hashTable.replace(array[i], valCoutner);
                }
            }
        }

        return arrayVal;
    }

    /**
    * Required runtime? O(n)
    * 
    *
    */
    public static int longestSequence(int[] array) {
        HashSet<Integer> set = new HashSet<>();
        int maxSequence = 0;

        for(int x : array)
            set.add(x);

        for(int x : set) {
            int count = 1;
            if(set.contains(x-1)) continue;
            while(set.contains(++x))
                count++;
            maxSequence = Math.max(maxSequence, count);
        }

        return maxSequence;
    }

    // function signature here
    //   Edge case:
    //   Input 0
    //   sum doesn't exist
    //   empty array
    //   no duplicates 
    //
    //   plan:
    //   Brute force:o(n^2)
    //   Hashset:O(N)
    //
    //   Create a hashset
    //   iterate through the array and check the element in set adds upto the sum
    //
    //   if it is in the set return element in set and element in the array
    //   else return null
    //
    //   Implement:
    static String arraySum(int[] array,int k){
        HashSet<Integer> set=new HashSet<>();
        String S = "Null";
        if (array == null)
        return S;

        if (array.length == 0)
        return S;

        for(int i = 0; i < array.length; i++){
            int rem = k - array[i];
            if (set.contains(rem)) {
                S= rem + " " + array[i];
            }
            else{
                set.add(array[i]);
            }
        } //for loop
        return S;  
    } //method arraySum
} //class