
public class WeekThree {
    public static void main(String...args) {
        System.out.println("--- WEEK THREE ---");

        // TODO

        //Problem 1: Remove Duplicates

        // Given a sorted linked list, delete all duplicates such that each element appear only once.

        // Examples:

        // Input: 1->1->2  
        // Output: 1->2  

        // Input: 1->1->2->3->3  
        // Output: 1->2->3  

        // Understand
        // Only integers no other types
        // Duplicates can appear more than twice

        // Match
        // Two pointers for current and previous, pointed to positions next to each other and compare

        // Plan 
        // Edge Case 1: Empty list should return null pointer
        // Edge Case 2: An list with a single item should just return a list with a single item
        // Edge Case 3: A list that doesn't have any Duplicates
        
        // if head = null
        //    return null
        
        // if head.next = null
        //    return head

        // currPointer = head
        // prevPointer = null

        // while (currPointer.next != null)
            // if (currPointer.value == prevPointer.value) 
              // prevPointer.next = currPointer.next
            // prevPointer = currPointer
            // currPointer = currPointer.next
        // return linkedlist

        

        //Problem 2: Linked List Cycle

        // Given a linked list, determine if it has a cycle in it. For simplicity, assume the linked list cannot have more than 1000 nodes in it.

        // Edge Case: If only one item, there is no loop

        // Match
        // Use two pointers with different speeds (slow, fast) one ahead of the other

        // Plan
        // 0. Check to see if head.next is null and then return False
        // 1. Instantiate two pointers a slow and a fast near the head of the list
        // 2. Iterate over linked list while (slow != fast)
        //    a) If fast.next or fast.next.next is Null, return False
        //    b) Move slow node one forward
        //    c) Move fast node two forward
        // 3. Return True (found a loop where fast and slow meet)


        // Problem #3 Merge Two Sorted Lists
        // Merge two sorted linked lists.

        // Examples:

        // Input: 1->2->4, 1->3->4  
        // Output: 1->1->2->3->4->4

        // Understand
        
        // Edge Case: One list is empty, return the other list
        // Edge Case: Both lists are empty, return empty list
        // Edge Case: One list is longer than the other, once you reach the end of the first list, you can simply append the rest of the second list

        // Match
        // Creating a new list. 
        // Using a pointer solution with a pointer to each list
        
        // Plan
        // 0. If head1 or head2 are null, return the other list
        // 0b. If head1 and head2 are null, return empty list
        // 1. Instantiate a new list
        // 2. Have pointers (head1 and head2) to each input list
        // 3. Iterate over lists 
        //      a. If head1 and head2 are not null, then compare them and append the smaller one to the new list
        //      b. If head1.value was smaller, then move to the next element of input list 1
        //      c. If head2.value was smaller, then move to the next element of input list 2
        //      d. If head1.value = null, then append inputlist2 to new list
        //      e. If head2.value = null, then append inputlist1 to new list
        // 4. Return new list



        System.out.println();
    }
}