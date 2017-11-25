
public class Main {

	public static void main(String[] args) {
		
	    GenericContainer gC = new GenericContainer();
	    
	    /*
	     * Pseudocode:
	     * 
	     * Test Integer Data Items
	     * 		Create a new collection for Integer Data Items
	     * 		Add a few integers to the collection
	     * 		Sort the integer collection
	     * 		Search for few integers to ensure binary search method works
	     * Test String Data Items
	     * 		Create a new collection for String Data Items
	     * 		Add a few Strings to the collection
	     * 		Sort the String collection
	     * 		Search for few String to ensure binary search method works
	     * Test Students
	     * 		Create a new collection for Students Data Items
	     * 		Add a few Students to the collection
	     * 		Sort the Students collection
	     * 		Search for few Students to ensure binary search method works
	     */

	    gC.add(new IntegerDataItem(13));
	    gC.add(new IntegerDataItem(-30)); 
	    gC.add(new IntegerDataItem(100));
	    gC.add(new IntegerDataItem(70));
	    gC.add(new IntegerDataItem(45));
	    gC.sort();
	    System.out.printf("Sorted Integer Collection:\n");
	    gC.Iterator_Start();
	    while (gC.Iterator_hasNext())  {
	       IntegerDataItem nextOne = (IntegerDataItem )(gC.Iterator_getNext());   
	       System.out.printf("  %5d", nextOne.get());
	       if (!(gC.Iterator_hasNext())) System.out.printf("\n\n");
	    }
	    System.out.println("binarySearching for -130; found at index: " +
	    		gC.binarySearch(new IntegerDataItem(-130)));
	    System.out.println("binarySearching for -30; found at index: " +
	    		gC.binarySearch(new IntegerDataItem(-30)));
	    System.out.println("binarySearching for 45; found at index: " +
	    		gC.binarySearch(new IntegerDataItem(45)));
	    System.out.println("binarySearching for 100; found at index: " +
	    		gC.binarySearch(new IntegerDataItem(100)));
	    System.out.println("binarySearching for 130; found at index: " +
	    		gC.binarySearch(new IntegerDataItem(130)));
	    System.out.println("binarySearching for 0; found at index: " +
	    		gC.binarySearch(new IntegerDataItem(0)) + "\n");

	    GenericContainer sgC = new GenericContainer();
	    sgC.add(new StringDataItem("johnson"));
	    sgC.add(new StringDataItem("dixon")); 
	    sgC.add(new StringDataItem("adams"));
	    sgC.add(new StringDataItem("Baker"));
	    sgC.add(new StringDataItem("Lee"));
	    sgC.add(new StringDataItem("Camille"));
	    sgC.sort();
	    System.out.printf("Sorted String Collection:\n");
	    sgC.Iterator_Start();
	    while (sgC.Iterator_hasNext())  {
	       StringDataItem nextOne = (StringDataItem) (sgC.Iterator_getNext());   
	       System.out.printf("  %s", nextOne.get());
	       if (!(sgC.Iterator_hasNext())) System.out.printf("\n\n");
	    }
	    System.out.println("binarySearching for 'Aron'; found at index: " +
	    		sgC.binarySearch(new StringDataItem("Aron")));
	    System.out.println("binarySearching for 'Baker'; found at index: " +
	    		sgC.binarySearch(new StringDataItem("Baker")));
	    System.out.println("binarySearching for 'adams'; found at index: " +
	    		sgC.binarySearch(new StringDataItem("adams")));
	    System.out.println("binarySearching for 'johnson'; found at index: " +
	    		sgC.binarySearch(new StringDataItem("johnson")));
	    System.out.println("binarySearching for 'zed'; found at index: " +
	    		sgC.binarySearch(new StringDataItem("zed")) + "\n");
	    
	    GenericContainer studentGc = new GenericContainer();
	    studentGc.add(new Student(1, "Chakra", 3.1f));
	    studentGc.add(new Student(2, "Jeb", 3.2f));
	    studentGc.add(new Student(3, "Chan", 3.3f));
	    studentGc.add(new Student(5, "May", 3.4f));
	    studentGc.add(new Student(6, "augustus", 3.5f));
	    studentGc.sort();
	    System.out.printf("Sorted Student Collection by Name:\n");
	    studentGc.Iterator_Start();
	    while (studentGc.Iterator_hasNext())  {
	       Student nextOne = (Student) (studentGc.Iterator_getNext());   
	       System.out.printf("  %s\n", nextOne.get());
	       if (!(studentGc.Iterator_hasNext())) System.out.printf("\n");
	    }
	    System.out.println("binarySearching for 'April'; found at index: " +
	    		studentGc.binarySearch(new Student(1, "April", 3.1f)));
	    System.out.println("binarySearching for 'Chakra'; found at index: " +
	    		studentGc.binarySearch(new Student(1, "Chakra", 3.1f)));
	    System.out.println("binarySearching for 'Jeb'; found at index: " +
	    		studentGc.binarySearch(new Student(1, "Jeb", 3.1f)));
	    System.out.println("binarySearching for 'augustus'; found at index: " +
	    		studentGc.binarySearch(new Student(1, "augustus", 3.1f)));
	    System.out.println("binarySearching for 'zed'; found at index: " +
	    		studentGc.binarySearch(new Student(1, "zed", 3.1f)));
	}   
}
