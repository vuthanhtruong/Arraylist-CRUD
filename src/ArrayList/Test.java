package ArrayList;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Arraylist arrayList = new Arraylist();
        
        // Adding elements to the list
        arrayList.addLast(10);
        arrayList.addLast(20);
        arrayList.addLast(30);
        arrayList.addLast(40);
        
        System.out.println("Arraylist after adding elements at the end:");
        arrayList.Print();
        
        // Adding element at the first position
        arrayList.addFirt(5);
        System.out.println("Arraylist after adding element at the first position:");
        arrayList.Print();
        
        // Adding element at a specific index
        arrayList.addIndex(2, 15);
        System.out.println("Arraylist after adding element at index 2:");
        arrayList.Print();
        
        // Updating an element
        arrayList.Update(25, 3);
        System.out.println("Arraylist after updating element at index 3:");
        arrayList.Print();
        
        // Deleting an element by index
        arrayList.DeleteIndex(2);
        System.out.println("Arraylist after deleting element at index 2:");
        arrayList.Print();
        
        // Deleting an element by value
        arrayList.DeleteValue(40);
        System.out.println("Arraylist after deleting element with value 40:");
        arrayList.Print();
        
        // Searching for an element
        Arraylist searchResult = arrayList.Search(10);
        System.out.println("Search results for value 10:");
        searchResult.Print();
        
        // Printing the list in reverse order
        System.out.println("Arraylist in reverse order:");
        arrayList.PrintReverse();
        
        // Deleting all elements
        arrayList.DeleteAll();
        System.out.println("Arraylist after deleting all elements:");
        arrayList.Print();


	}

}
