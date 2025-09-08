package stackdemo;
import java.util.Scanner;

public class Librarybook{
	 public static void main(String[] args) 
	 {
	      Scanner sc = new Scanner(System.in);
	      Stack st = null;
	      System.out.println(" Choose how to initialize the stack:");
	      System.out.println("1. Empty stack with size");
	      System.out.println("2. Stack initialized with an array");
	      int choice = sc.nextInt();

	        if (choice == 1)
	        {
	            System.out.print("Enter size of stack: ");
	            int size = sc.nextInt();
	            st = new Stack(size);
	        }
	        else if (choice == 2) 
	        {
	            System.out.print("Enter the number of elements: ");
	            int n = sc.nextInt();
	            int arr[] = new int[n];
	            System.out.println("Enter the elements: ");
	            for (int i = 0; i < n; i++) 
	            {
	                arr[i] = sc.nextInt();
	            }
	            st = new Stack(arr);
	        }

	        int option;
	        
	        do {
	            System.out.println("\n Stack Menu");
	            System.out.println("1 Push one element");
	            System.out.println("2 Push two elements");
	            System.out.println("3 Pop one element");
	            System.out.println("4 Pop multiple elements");
	            System.out.println("5 Display full stack");
	            System.out.println("6 Display only top n elements");
	            System.out.println("7 Exit");
	            System.out.print(" Enter choice: ");
	            option = sc.nextInt();

	            switch(option) {
	                case 1:
	                      System.out.print("Enter any element: ");
	                      int val = sc.nextInt();
	                      st.push(val);
	                      break;

	                case 2:
   	                      System.out.print("Enter two elements: ");
	                      int v1 = sc.nextInt();
	                      int v2 = sc.nextInt();
	                      st.push(v1, v2);
	                      break;

	                case 3:
	                      int popped = st.pop();
	                      if (popped != -1)
	                      System.out.println(" Popped: " + popped);
	                      break;

	                case 4:
	                      System.out.print("Enter the number of elements to pop: ");
	                      int n = sc.nextInt();
	                      st.pop(n);
	                      break;

	                case 5:
	                      st.display();
	                      break;

	                case 6:
	                      System.out.print("Enter the number of top elements: ");
	                      int topN = sc.nextInt();
	                      st.display(topN);
	                      break;
 
	                case 7:
	                      System.out.println("Exit!");
	                      break;

	                default:
	                      System.out.println("wrong choice!");
	    }
	            
	    } 
	          while(option != 7);

	        sc.close();
	    }
	
        }

