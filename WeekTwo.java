import java.util.Hashtable;

public class WeekTwo {
    public static void main (String...args) {
        System.out.println("--- WEEK TWO ---");
        int[] array = {8, 7, 9, 6, 7, 5, 1};
        int k = 2;
        int value = findElementWithFreq(array, k);
        System.out.println(value + " occurs " + k + " times.");
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
}