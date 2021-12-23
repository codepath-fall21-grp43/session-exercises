import java.util.Stack;
import java.lang.*;

public class WeekSix{
/*
public static void main(String...args){

  //String str="512+4*+3-"
  String str="5";
  Stack<Integer> stack=new Stack<>();
   
  for(int i=0;i < str.length();i++){
    char curr=str.charAt(i);
    if(str.length()==1)
      System.out.println(curr);
    if((curr=='*')||(curr=='+')||(curr=='/')||(curr=='-')){
      int num2=stack.pop();
      int num1=stack.pop();
       int result=0;
       switch(curr){
         case '+':
          result=num1+num2;
          break;
          case '-':
          result=num1-num2;
          break;
          case '*':
          result=num1*num2;
          break;
          case '/':
          result=num1/num2;
          break;
        
       }
       stack.push(result);
    }
    else
    stack.push(Character.getNumericValue(curr));
    }
    System.out.println("Elements"+stack);
  }

}
*/

//understand:
// only open brackets = false/
// only closed closed brackets = false
// empty input = false
// non matching brackets = false
// matching paired brackets = true
//match:
// use stack
//plan:when open braces push it to stack
//Iterate the string and when it comes close braces pop the stack 
//check whether stack is empty
//if it is empty it returns true
//otherwise false


// public static void main(String...args){
// Stack<Character> stack = new Stack<>();
// String str = "()";
// for (int i = 0; i < str.length(); i++){
//   if (str.charAt(i) == '(' || str.charAt(i) == '[' || str.charAt(i) == '{'){
//     stack.push(str.charAt(i));
//   }
  
// }


// switch (str.charAt(i))
//  case ')':
//  check=stack.pop();
//  if (check=='{'||check=='[')
//  return false;

//  case '}':
//  check = stack.pop();
//   if (check=='('||check=='[')
//     return false;
  
  
// }

//Understand 
//stacks are lifo
//queues are fifo
// creating a queue class that uses stacks and be able to call push, pop, peek and empty
//Match 
//Plan 
 //create 2 stacks- main and side stack

 //how to push
 //push main stack into side stack
 //how to pop
 //pop all elements from main to side
 //pop the top element in the side stack
 //push elements from side back to main 

//how to peek
//peek the bottom element of main

//how to check if empty
 //if both stacks are empty return true

//implementation of myQueue is in its own file
 
   public static void main(String...args){

     MyQueue myQueue = new MyQueue();
     myQueue.push(1); // queue is: [1]
     myQueue.push(2); // queue is: [1, 2] (leftmost is front of the queue)
    System.out.println(myQueue.peek()); // return 1
     System.out.println(myQueue.pop()); // return 1, queue is [2]
    System.out.println( myQueue.empty()); // return false
   }

 } 