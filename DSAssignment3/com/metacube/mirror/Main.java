package com.metacube.mirror;
import java.util.Scanner;

public class Main {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static  void main(String[] args) {
		
		BinaryTree tree = new BinaryTree();
		BinaryTree mirrorTree = new BinaryTree();
		Scanner scan = new Scanner(System.in);
		
		while(true){
			System.out.println("\n1. ADD MULTIPLE ELEMENTS");
			System.out.println("2. CREATE MIRROR ");
			System.out.println("3. CHECK MIRROR ");
			System.out.println("4. EXIT ");
			System.out.println("\nEnter your choice");
			int choice = scan.nextInt();
			
			switch(choice){
			case 1:
				System.out.println("Enter number of elements you want to add to the binary tree");
				int num = scan.nextInt();
				for(int index = 0 ; index < num ; index++){
					System.out.println("Enter the element");
					int data = Integer.parseInt(scan.next());
					tree.insert(data);
				}
				break;
			case 2:
				System.out.println("Enter number of elements you want to add to the binary tree");
				num = scan.nextInt();
				for(int index = 0 ; index < num ; index++){
					System.out.println("Enter the element");
					int data = Integer.parseInt(scan.next());
					mirrorTree.insertInMirror(data);
				}
				break;
			case 3:
				if(tree.mirror(mirrorTree.getRoot(),tree.getRoot() )){
					System.out.println("Trees are mirror images");
				}
				else{
					System.out.println("Trees are not mirror images");
				}
				break;
			case 4:
				tree.printInOrder(tree.getRoot());
				mirrorTree.printInOrder(mirrorTree.getRoot());
				scan.close();
				
				break;
			}
		}
	}

}

