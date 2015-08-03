package jrnnlm.utils;

public class Pair<K, V> {
	private K mKey;
	private V mValue;
	
	public Pair(K key, V value) {
		mKey = key;
		mValue = value;
	}
	
	public K getKey() {
		return mKey;
	}
	
	public void setKey(K key) {
		mKey = key;
	}
	
	public V getValue() {
		return mValue;
	}
	
	public void setValue(V value) {
		mValue = value;
	}
	
}
