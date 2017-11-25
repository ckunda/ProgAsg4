
public class GenericContainer {
	
    private final int MAXSIZE = 30; 
    private short sizeLIMIT, inDEX, entriesCount;
    private GenericItemType[] collection;
	
	public GenericContainer()
		{ sizeLIMIT=30; entriesCount=0; collection = new GenericItemType[MAXSIZE]; }
    
	public GenericContainer(short size) {
    		entriesCount = 0;
        if (size <= MAXSIZE)
        		sizeLIMIT = size;
        else
            sizeLIMIT = MAXSIZE;
    }
    public GenericContainer(GenericContainer gc) {
    		entriesCount = 0;
          /* Shallow COPY: collection =  gc; */
        gc.Iterator_Start(); // Deep COPY
        	while (gc.Iterator_hasNext()) collection[inDEX]=gc.Iterator_getNext();
    }
    public void init() {
    		Iterator_Start();
        while (Iterator_hasNext()) collection[inDEX] = null;
    }
    public void add(GenericItemType it) {
    		if (entriesCount < sizeLIMIT)
    			collection[entriesCount++] = it;
    }
    public void remove(GenericItemType it) { }
    public void search(GenericItemType it) { }
    
    public int binarySearch(GenericItemType it) {
    		return binarySearch(it, 0, entriesCount-1);
    }
    public int binarySearch(GenericItemType it, int left, int right) {
        if (left > right) return -1;
        int middle = (left + right) / 2;
        if (collection[middle].isEqual(it)) return middle;
        else if (collection[middle].isGreater(it))
              return binarySearch(it, left, middle - 1);
        else
              return binarySearch(it, middle + 1, right);           
    }
    public void sort() { // bubble sort algorithm
    		short outer, inner;
    		for (outer = 0; outer < entriesCount; outer++)
    			for(inner = 0; inner < entriesCount-1; inner++) {
    				if (collection[inner].isGreater(collection[inner+1])) {
    					GenericItemType temp = collection[inner];
                    collection[inner] = collection[inner+1];
                    collection[inner+1] = temp;
    				}
    			}
    }
    public void Iterator_Start() { inDEX = 0;}
    public boolean Iterator_hasNext() { return inDEX <= entriesCount-1; }
    public GenericItemType Iterator_getNext() { return collection[inDEX++]; }
}
