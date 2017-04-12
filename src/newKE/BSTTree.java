package newKE;

import java.util.*;

public class BSTTree{
	static TreeNode root=null;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            int[] nums= new int[n];
            for(int i=0;i<n;i++){
                nums[i]=sc.nextInt();
            }
            BSTTree m=new BSTTree();
            m.createBST(nums);
            System.out.println();
            m.firstOrder(root);
            System.out.println();
            m.middleOrder(root);
            System.out.println();
            m.backOrder(root);
            System.out.println();
        }
    }
    
    
    class TreeNode{
        public TreeNode left;
        public TreeNode right;
        public int value;
    }
    
    public void firstOrder(TreeNode root){
    	if(root==null)
    		return;
        System.out.print(root.value+" ");
        firstOrder(root.left);
        firstOrder(root.right);
    }
    public void middleOrder(TreeNode root){
    	if(root==null)
    		return;
        middleOrder(root.left);
        System.out.print(root.value+" ");
        middleOrder(root.right);
    }
    
    public void backOrder(TreeNode root){
    	if(root==null)
    		return;
        backOrder(root.left);
        backOrder(root.right);
        System.out.print(root.value+" ");
    }
    
    
    public void createBST(int[] num){
        int len=num.length;
       // if(len<1)
       //     return null;
        //TreeNode root=new TreeNode();
        //root.value=num[0];
        for(int i=0;i<len;i++){
            insertTree(num[i]);
        }
    }
    
    public boolean insertTree(int n){
    	TreeNode tn=new TreeNode();
    	tn.value=n;
    	if(root == null){  
            root = tn;
            return true;  
        }  
    	
        TreeNode current = root;  
        while(current != null){ 
        	if(n==current.value){
        		return false;
        	}else if(n > current.value){  
                if(current.right == null){  
                    current.right = tn;  
                    return true;  
                }  
                current = current.right;  
            }else{  
                if(current.left == null){  
                    current.left = tn;  
                    return true;  
                }  
                current = current.left;  
            }  
        }  
        return false;  
    }      

}