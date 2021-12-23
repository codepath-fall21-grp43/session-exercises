import java.util.Stack;
import java.lang.*;
//this is the queue class from week 6
public class MyQueue{
  private Stack<Integer> mainstack;
  private Stack<Integer> second;
   public  MyQueue(){
     mainstack = new Stack<>();
     second = new Stack<>();
   }
   public int pop(){
     while (mainstack.empty() != true){
       int x = mainstack.pop();
       second.push(x);
     }
     int y = second.pop();
    while (second.empty() != true){
       int x = second.pop();
       mainstack.push(x);
     }
     return y;
   }

   public int peek(){
     while (mainstack.empty() != true){
       int x = mainstack.pop();
       second.push(x);
     }
     int y = second.peek();
     //second.push(y);
    while (second.empty() != true){
       int x = second.pop();
       mainstack.push(x);
     }
     return y;
   }

   public boolean empty(){
     if (mainstack.empty() == true){
       return true;
     }
     return false;
   }

   public void push(int x){
     mainstack.push(x);
   }
}