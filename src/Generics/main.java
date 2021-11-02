package Generics;

import java.util.ArrayList;
import java.util.List;

class Store<T> {
	 private T item;
	  public void setItem(T item) {
		  this.item = item;
	  }
	  
	  public Object getItem() {
		  return this.item;
	  }
	  
	
}

class HashTable<K,V> {
	private K key;
	private V value;
	
	public HashTable(K k, V v) {
		this.key = k;
		this.value = v;
	}

	@Override
	public String toString() {
		return "HashTable [key=" + key + ", value=" + value + "]";
	}
	
	
}

public class main {

	public static void main(String[] args) {
		Store store = new Store<>();
	
		store.setItem("hello");
		
		HashTable<String,Integer> hashTable = new HashTable<>("hello", 23);
		System.out.println(hashTable);
		
	
		System.out.println(store.getItem());

	}

}
