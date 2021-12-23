
// public class WeekFive {
//  static int count=0;
//  static int compare(String[] book,String word){
//    if (book==null||word==null||word.equals("")){
//      return -1;
//    }
//      for(String bookword:book){
//        bookword=bookword.toLowerCase().strip();
//        if(bookword.equals(word.toLowerCase().strip())){
//           count++;
//        }
//      }
//      return count;
//    }
 
//     public static void main (String...args) {
//   String[] book={ "The","dog","jumped","in","the","dog","house"};
//   int result=compare(book,"dog");
//   System.out.println(result);
//     }
// }

//Question2 
/*
public class WeekFive {

static class Node{
  Node next;
  int value;
  Node previous;
  Node(int k){
    value=k;
    next=null;
    previous=null;
  }
  Node head;
}
static Node push(Node head,Node new_node){
  new_node.previous=null;
  new_node.next=head;
  if (head!=null){
    head.previous=new_node;
  }
  head=new_node;
  return head;
}
static Node reverselist(Node head,int k)
{
  Node current=head;
  Node next=null;
  Node newHead=null;
  int count=0;

  while(current!=null && count<k){
    next=current.next;
    newHead=push(newHead,current);
    current=next;
    count++;
  }
  if(next!=null){
    head.next=reverselist(next,k);
    head.next.previous=head;
  }
  return newHead;
}
public static void main (String...args) {
Node newNode1=new Node(1);
Node newNode2=new Node(2);
Node newNode3=new Node(3);
Node newNode4=new Node(4);
Node newNode5=new Node(5);
Node newNode6=new Node(6);
Node newNode7=new Node(7);

Node head=newNode1;
newNode1.next=newNode2;
newNode2.next=newNode3;
newNode3.next=newNode4;
newNode4.next=newNode5;
newNode5.next=newNode6;
newNode6.next=newNode7;

head=reverselist(head,3);
while(head!=null){
  System.out.println(head.value);
  head=head.next;
}
    }
}
*/
//question 1 from 10/16/21
// input two arrays
//output one array with intersection of two arrays
//IntersectionOfArrays(nums1, nums2)
// create hashmap1
// create hashmap2
// for nums1
//   add nums1[i] to hashmap1
// for nums2 
//   add nums2[i] to hashmap2
// compare the hashsets
// create outpout array with intersection
// fill output with values from comparison of hashmaps

/*

int[] IntersectionOfArrays(int[] nums1, int[] nums2){
  HashMap <Integer> map1 = new HashMap <Integer>;
  HashMap <Integer> map2 = new HashMap <Integer>;

  for (int i = 0; i < nums1.length(); i++){
    if (map1.containsKey(nums1[i])){
      map1.add(nums1[i], ++);
    }
    else {
      map1.add(nums1[i], 1);
    } 
  }

  for (int i = 0; i < nums2.length(); i++){
    if (map2.containsKey(nums1[i])){
      map2.add(nums1[i], ++)
    }
    else {
      map2.add(nums1[i], 1);
    } 
  }
  



}
// Start at beginning of list
// keep track of value
// compare it to every value that comes after
// when a value is greater than anchor value
// add greater value to new array
// if no value is greater 
// add zero 
// increment anchor value 

// [2, 1, 5]
// [5, 5, 0]

// [2,7,4,3,5]
// [7, 0, 5, 5, 0]

*/

