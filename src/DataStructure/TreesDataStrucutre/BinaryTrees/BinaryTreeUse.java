package DataStructure.TreesDataStrucutre.BinaryTrees;

import java.util.Scanner;

public class BinaryTreeUse {
    public static BinaryTreeNode<Integer> takeTreeInputBetter(boolean isRoot, int parentData, boolean isLeft) {
        if (isRoot) {
            System.out.println("Enter Root data");
        } else {
            if (isLeft) {
                System.out.println("Enter the left data of " + parentData);
            } else {
                System.out.println("Enter the right data of " + parentData);
            }
        }


        Scanner s = new Scanner(System.in);
        int rootData = s.nextInt();

        if (rootData == -1) {
            return null;
        }

        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
        BinaryTreeNode<Integer> leftChild = takeTreeInputBetter(false, rootData, true);
        BinaryTreeNode<Integer> rightChild = takeTreeInputBetter(false, rootData, false);

        root.left = leftChild;
        root.right = rightChild;


        return root;
    }

    public static BinaryTreeNode<Integer> takeTreeInput() {
        System.out.print("Inter the Root Node :");
        Scanner s = new Scanner(System.in);
        int rootData = s.nextInt();

        if (rootData == -1) {
            return null;
        }

        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
        BinaryTreeNode<Integer> leftChild = takeTreeInput();
        BinaryTreeNode<Integer> rightChild = takeTreeInput();

        root.left = leftChild;
        root.right = rightChild;


        return root;
    }

    public static void printTreeDetailed(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return;
        }
//      System.out.println(root.data+":L"+root.left.data+",R"+root.right.data); This is a totally wrong statement because if suppose root.left.data== null then this will show nullPointer exception

        System.out.print(root.data + ":");
        if (root.left != null) {
            System.out.print("L" + root.left.data + ",");
        }
        if (root.right != null) {
            System.out.print("R" + root.right.data);
        }
        System.out.println();

        printTreeDetailed(root.left);
        printTreeDetailed(root.right);
    }

    public static void printTree(BinaryTreeNode<Integer> root) {
        //TODO Take care of base case

//        Method 1 This will not work if the root is null generate null pointer exception:
//        System.out.println(root.data);
//        if (root.left != null){
//            printTree(root.left);
//        }
//        if (root.right != null){
//            printTree(root.right);
//        }

//        Method 2

        if (root == null) {
            return;
        }
        System.out.println(root.data);
        printTree(root.left);
        printTree(root.right);


    }
    public static int numNodes(BinaryTreeNode<Integer> root){
        if (root==null){
            return 0;
        }

        int leftCount=numNodes(root.left);
        int rightCount=numNodes(root.right);

        return leftCount+rightCount+1;


    }
    public static int sumNodes(BinaryTreeNode<Integer> root){
        if (root==null){
            return 0;
        }

        int leftSum=sumNodes(root.left);
        int rightSum=sumNodes(root.right);

        return leftSum+rightSum+root.data;


    }

    public static int largest(BinaryTreeNode<Integer> root){
        if (root == null){
            return -1;
        }

        int leftLargest=largest(root.left);
        int rightLargest=largest(root.right);
        return Math.max(root.data,Math.max(leftLargest,rightLargest));


    }

    public static int height(BinaryTreeNode<Integer> root){
        if (root ==null){
            return 0;
        }

        int leftHeight=height(root.left);
        int rightHeight=height(root.right);

        return 1+Math.max(leftHeight,rightHeight);

    }

    public static int leafNodes(BinaryTreeNode<Integer> root){

        if (root == null){

            return 0 ;
        }

        if (root.left == null &&  root.right == null){
            return 1;
        }

       return leafNodes(root.left)+leafNodes(root.right);



    }

    public  static void printAtDeptK(BinaryTreeNode<Integer> root , int k){
        if (root==null){
            return;
        }

        if (k== 0){
            System.out.print(root.data+"");
            return;
        }

        printAtDeptK(root.left,k-1);
        printAtDeptK(root.right,k-1);

    }
    public static int countNodesGreaterThanX(BinaryTreeNode<Integer> root, int x) {
        //Your code goes here
        if (root == null) {
            return 0;
        }

        int smallOutput = countNodesGreaterThanX(root.left, x) + countNodesGreaterThanX(root.right, x);
        if (root.data > x) {
            return smallOutput + 1;
        } else {
            return smallOutput;
        }
    }
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(1);
        BinaryTreeNode<Integer> rootLeft = new BinaryTreeNode<>(2);
        BinaryTreeNode<Integer> rootRight = new BinaryTreeNode<>(3);
        BinaryTreeNode<Integer> rlRightChild = new BinaryTreeNode<>(4);
        BinaryTreeNode<Integer> rrLeftChild = new BinaryTreeNode<>(5);
        root.left = rootLeft;
        root.right = rootRight;
        rootLeft.right = rlRightChild;
        rootRight.left = rrLeftChild;
        System.out.println("Number of Nodes "+numNodes(root));
        System.out.println("Sum of Nodes "+sumNodes(root));
        System.out.println("Largest Node "+largest(root));
        System.out.println("Height of tree " + height(root));
        System.out.println("Number of leaf Nodes "+ leafNodes(root));
        printAtDeptK(root,2);
        System.out.println(" "+countNodesGreaterThanX( root,2)+" ");

//        printTree(root);
//        printTreeDetailed(root);

        /*
                     (1)
                    /   \
                   /     \
                (2)       (3)
                  \       /
                  (4)    (5)
         */


//        BinaryTreeNode<Integer> root = takeTreeInput();
//        BinaryTreeNode<Integer> root = takeTreeInputBetter(true, 0, true);
//        printTreeDetailed(root);


    }
}
