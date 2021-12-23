
import java.util.*;

class Treenode{
   int val;
   Treenode left;
   Treenode right;
   Treenode root;
  //  Treenode(){
  //    root=null;
  //  }
   Treenode(int val){
     this.val=val;
   }

}
public class WeekTen{
  private static boolean issametree(Treenode p,Treenode q){
    //boolean result=false;
    if (p==null && q==null){
      return true;
    }
     if (p==null || q==null){
      return false;
    }
     if(p.val==q.val && issametree(p.left,q.left)&&issametree(p.right,q.right)){
       return true;
     }
     return false;
  }   

  // insertion into a binary tree
  // U: 
  // - where in the tree does the node belong 
  // insert 2; insert 6; insert 5
  //     7 
  //    / \
  //   5   9
  //  / \
  // 2   6
  //    /
  //   5
  // 
  // - can we have duplicates?
  // - what if the tree is empty?  
  //
  // Match - similar to a linked list and how we  // insert there

   public void insert(int val, TreeNode head) {
        TreeNode newNode = new Treenode(val);
        // check edge case if null
        if (head == null) 
            head = newNode;
   }
  
   public static void main(String...args) {
     
     Treenode p= new Treenode(4);
     p.left=new Treenode(2);
     p.right=new Treenode(7);
     p.left.left=new Treenode(1);
     p.left.right=new Treenode(7);

     Treenode q= new Treenode(4);
     q.left=new Treenode(2);
     q.right=new Treenode(6);
     q.left.left=new Treenode(1);
     q.left.right=new Treenode(7);
     System.out.println(issametree(null,q));

   }
}
//pseudocode:

//if both tree's root are null
//return true;
//if one of the  tree's root is null
////return false
//if node values are equal in each tree 
//return true

//print leaf nodes

// inorder traversal
// check whether the root is null if yes return
// If root is not null
// then
// if both left and right child is null print node value
// else
//  recursively check the left child

//  recursively check the right child
 
/**
* Print all root to leaf paths
*
* U: 
* - Is it a single root node?
*   Yes
* - If root is null?
*   No paths / empty
* M: 
* - 
*
*
* P: 
* // class member variable
* Queue<Integer> q = new ArrayList<>();
* 
* printPaths(TreeNode node) {
      if (node == null)
          return; 

*     q.push(node.val);
*     if (node.left == null && node.right == null) {
*         print(q.toString());
*     }
*     
*     // recursion
*     printPaths(node.left);
*     printPaths(node.right);
*     
*     // pop last elem of q
*     q.pop();
* }
*/