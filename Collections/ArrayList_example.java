import java.util.*;

public class ArrayList_example{
    public static void main(String args[]){
        //Declaration of ArrayList
		ArrayList<Integer> arr=new ArrayList<Integer>();
		
		//Insert Operation
        arr.add(10);
        arr.add(20);
        arr.add(40);
        System.out.println(arr);
        
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

        //size of array
        System.out.println(arr.size());
        
        //clear the array
        arr.clear();
        System.out.println(arr);
    }

} 
