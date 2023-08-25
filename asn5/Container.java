package edu.disease.asn5;

import java.util.Arrays;
import java.util.List;
/**
 * This is a class called Container with generic type<T>.
 * @author DELL
 *
 * @param <T>
 */
public class Container<T> {
	List<T> t;
	/**
	 * This constructor is used to initialize the <List> t.
	 * @param ts
	 */
	public Container(T... ts) {
		if (ts.length==0) {
			throw new IllegalArgumentException("No arguments supplied");
		}
		this.t = Arrays.asList(ts);
	}
	
	/**
	 * This method returns the size of  the <List> t.
	 * @return
	 */
	public int size() {
		return t.size();
	}
	/**
	 * This method returns the value of given index.
	 * @param index
	 * @return
	 */
	public T get(int index) {
		if (index < 0 || index >= t.size()) {
			throw new IllegalArgumentException("Given Index is Not Found");
		}
		return t.get(index);
	}
}




