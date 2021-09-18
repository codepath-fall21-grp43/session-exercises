class Main {

    
  public static void main(String[] args) {
    //probOne();
    boolean isSubstr = probTwo("laboratory", "rat");
    System.out.println("is substring? " + isSubstr);

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
    if (a.contains(b)) {
      return true;    
    }

    return false; 
  }

} // end main