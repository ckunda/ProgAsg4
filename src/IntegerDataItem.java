public class IntegerDataItem extends GenericItemType {

	private int privateValue;

	public IntegerDataItem() { privateValue=0; }
    public IntegerDataItem(int i) { set(i); }
    public IntegerDataItem(IntegerDataItem iD) { set(iD.get()); }         
    public void set(int i) { privateValue = i; }
    public boolean isLess(GenericItemType git) 
    		{ return ( privateValue < ((IntegerDataItem) git).get()); }
    public boolean isEqual(GenericItemType git)
        	{ return ( privateValue == ((IntegerDataItem) git).get()); }
    public boolean isGreater(GenericItemType git)
        	{ return ( privateValue > ((IntegerDataItem) git).get()); } 
    public int get() { return privateValue; }
    public String toString() {return "" + privateValue;}
	
}              
