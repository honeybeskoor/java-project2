package stackdemo;
import java.util.Scanner;

class Stack {
    private int arr[];   
    private int top;     
    private int capacity;

    Stack(int size)
    {
        capacity = size;
        arr = new int[capacity];
        top = -1; 
      }

    Stack(int[] inputArr)
   {
        capacity = inputArr.length;
        arr = new int[capacity];
        top = capacity - 1;
        for (int i = 0; i < capacity; i++)
        {
            arr[i] = inputArr[i];
        }
    }

    void push(int x) 
       {
        if (top == capacity - 1)
          {
            System.out.println(" Stack is full Cannot push " + x);
            return;
        }
        arr[++top] = x;
        System.out.println("Pushed: " + x);
    }

    void push(int x, int y)
    {
        push(x);
        push(y);
    }

    int pop()
    {
        if (top == -1)
        
        {
            System.out.println("Stack is empty! Nothing to pop");
            return -1;
        }
        return arr[top--];
    }
    void pop(int n) 
    
    {
        if (n > top + 1)
        {
            System.out.println("Cannot pop " + n + " elements Only " + (top + 1) + " items are available in the stack");
            return;
        }
        System.out.print("Popped elements: ");
        for (int i = 0; i < n; i++) 
        {
            System.out.print(pop() + " ");
        }
        System.out.println();
    }

    void display()
    {
        if (top == -1)
        {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.print(" Stack (top → bottom): ");
        for (int i = top; i >= 0; i--)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    void display(int n)
    {
        if (n > top + 1) 
        {
            System.out.println(" Only " + (top + 1) + " elements are in the stack");
            n = top + 1;
        }
        if (top == -1)
        {
            System.out.println(" Stack is empty");
            return;
        }
        System.out.print(" Top " + n + " elements: ");
        for (int i = top; i > top - n; i--) 
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}