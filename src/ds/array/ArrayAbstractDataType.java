package ds.array;

public interface ArrayAbstractDataType {
	
	void add(int data);
	
	boolean modifyAt(int position, int data);

	int readFromAPosition(int position);
}
