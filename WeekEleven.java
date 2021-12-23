public class WeekEleven {

    public static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

    public static void main() { 
        int[] preorder = {3,9,20,15,7};
        TreeNode root = constructTree(preorder);
    }

    public static TreeNode constructTree(int[] preorder, int[] inorder) {
        TreeNode headPtr, node; 

        for (int i = 0; i < preorder.length; i++) {
            // insert head
            if (i == 0) {
                node = new TreeNode(preorder[i]);
                headPtr = node; 
            }

            // insert left

            // insert right 
        }

        return null; 
    }

    public static int Left(int i) {
        return 2 * i;
    }

    public static int Right(int i) {
        return (2 * i) + 1;
    }
 

//   public static void insertNode(TreeNode root, int value) {

//     if(root == null) {
//       root = new TreeNode(value);  
//     }
//     if(root.val < value) {
//       if(root.right != null) {
//         insertNode(root.right, value);
//       }
//       root.right = new TreeNode(value); 
//     }
//     else {
//       if(root.left != null) {
//         insertNode(root.left, value);
//       }
//       root.left = new TreeNode(value);
//     }

//   }


  
}

// Algorithm:
// Root is null--return null
// If either one of  p or q is the root,then return the node that is root
// check both left and right branch recursively,if either both of them not null,then return root
// if either left or right branch is null,return the one that is not null



//  public static void main(String...args){

//   }

//   public static TreeNode BTLCA{TreeNode root,TreeNode p,TreeNode q)
//    if(root ==null) return null;
//    if(root ==p ||root==n2)
//     return root;
//     TreeNode left=BTLCA(root.left,p,q)
//     TreeNode right=BTLCA(root.right,p,q)
//     if


//   }