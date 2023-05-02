import java.util.*;

public class Stack_example{
    public static void main(String args[]){
        //Declaration of Stack
		Stack<Integer> arr=new Stack<Integer>();
		
		//Insert Operation
        arr.add(10);
        arr.add(20);
        arr.add(40);
        arr.pop();
        System.out.println(arr.peek());
        
        //Remove work with 0-index not with values
        arr.remove(1);
        System.out.println(arr);
        
        //Update Operation
        arr.set(0,22);
        System.out.println(arr);
        
        //Read operation
        System.out.println(arr.contains(22));
        
        //search Index of element
        System.out.println(arr.indexOf(22));
        
        //size of stack
        System.out.println(arr.size());
        
        
        //clear the stack
        arr.empty();
        System.out.println(arr);
        
        //size of stack
        System.out.println(arr.size());
        
    }

} 
