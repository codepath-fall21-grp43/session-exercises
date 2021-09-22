class WeekOne {

    
    public static void main(String...args) {
        System.out.println("--- WEEK ONE ---");
        probOne();
        boolean isSubstr = probTwo("laboratory", "rat");
        System.out.println("is substring? " + isSubstr);
        System.out.println();
    }

    /**
    * Is the input always string or will there be nums?
    * Yes it can be mixed
    * What about empty string? - return it as-is
    * What about single chars? - return it as-is
    *
    * Edge case: null, empty str, single chars
    * Test case #1: ""
    * Test case #2: "a"
    * Test case #3: "Hello World!"
    * Test case #4: ""
    * 
    * Plan: start at the end (string.length()) and add to new string
    * 
    * Space complexity: O(n)
    * Time complexity: O(n)
    */
    public static void probOne() {
    // implementation
    // test cases
    String testCase = "43 Hello World!";  // len = 15
    System.out.println("Reversing string: " + testCase);
    StringBuilder sb = new StringBuilder(testCase.length());
    // loop 
    for (int i = testCase.length() - 1; i >= 0; i--) {  // O(n)
        sb.append(testCase.charAt(i));  // O(1)
    }

    System.out.println(sb);  // O(1)
    }

    /**
    * laboratory, rat => true
    * cat, meow => false
    * assuming: no null output 
    * 
    * Test 1: "", ""
    * Test 2: "laboratory", "rat"

    * Plan: Can leverage String's contains() method
    * 
    * Time complexity: 
    * Space complexity: 
    *
    */
    public static boolean probTwo(String a, String b) {
        // cannot use built-in functions; preserving for study
        // if (a.contains(b)) {
        //   return true;    
        // }
        // return false; 

        if (a.equals("") || b.equals(""))
            return false;
        else {
            loop1: for (int i = 0; i < a.length(); i++) {
                // if the first character of the second string 
                // matches, see if the rest matches
                if (a.charAt(i) == b.charAt(0)) {
                    // loop through both in parallel
                    // for main string, x: 
                    //     we have a match at i, so x needs to be i+1
                    // for sub string, j: 
                    //     we have a match at 0, so j needs to be 1 
                    for (int j = 1, x = i+1; j < b.length(); j++, x++) {
                        if (a.charAt(x) != b.charAt(j))
                            // do not break loop, just continue from main
                            // outer loop, not inner loop, hence the label
                            continue loop1; 
                        // otherwise if we reach the end of the second string
                        // we have a valid substring
                        else if (j == b.length()-1)
                            return true;
                    }
                }
            }
        }
        return false; // no match found
    }
} // end main