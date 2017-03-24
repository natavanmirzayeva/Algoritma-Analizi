/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package agacveriyapısıanaliz;


import static java.lang.Math.random;
import static java.lang.StrictMath.random;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
/**
 *

*
 */


 


public class AgacVeriYapısıAnaliz {

    /**
     * @param args the command line arguments
     */
    
     public static double randomFill(){
        Random rand = new Random();
        int randomNum = rand.nextInt();
        return randomNum;
    }
    
    public static ArrayList<Integer> randomArrayList(int n)
{
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < n; i++)
        {
            list.add(random.nextInt(255));
        }
        return list;
}
    
   public static int height(TreeNode n)
{
    if(n == null)
        return 0;
    return 1 + Math.max(height((TreeNode) n.left), height((TreeNode) n.right));

} 
   
   
    
    
    
    public static void main(String[] args) {
//        Random random = new Random();
//        TreeNode node = new TreeNode("12");
//        TreeNode node1 = new TreeNode();
//        
//        
//        
//        ArrayList<Integer> arrayRandom = new ArrayList<>();
//
//        
//        
//        
//       Set set = new TreeSet(Collections.reverseOrder());
//       for (int i = 0, n = 100; i < n; i++) {
//            node1 = node.addChild((random.nextInt(255)));
//            set.add(node1.data);
//           
//        }
//       
//      
//             System.out.println(height(node1));
//        
//       
//       
//        System.out.println(set);
//        System.out.println(((TreeSet) set).comparator());
        
        
        BinaryTree tree = new BinaryTree();
        BinaryTree tree1 = new BinaryTree();
        Random random = new Random();
        // Let us create a binary tree shown in above diagram
        tree.root = new Node(random.nextInt(255));
        tree.root.left = new Node(random.nextInt(255));
        tree.root.right = new Node(random.nextInt(255));
        tree.root.left.left = new Node(random.nextInt(255));
        tree.root.left.right = new Node(random.nextInt(255));
        System.out.println("Derinlik: " + tree.treeHeight(tree.root));
        int tekrar = 0;
        
        tree1.root = new Node(random.nextInt(255));
        tree1.root.left = new Node(random.nextInt(255));
        tree1.root.right = new Node(random.nextInt(255));
        tree1.root.left.left = new Node(random.nextInt(255));
        tree1.root.left.right = new Node(random.nextInt(255));
        System.out.println("Derinlik: " + tree.treeHeight(tree.root));
        
        
        
        ArrayList<Integer> dizi = new ArrayList<>();
        for (int i = 0; i < dizi.size(); i++) {
            dizi.set(i,tree.root.data);
            System.out.println(dizi.get(i));
        }
        
        
        
        
        
    }
    
}
