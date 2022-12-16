package Custom;

public class CustomHashMap<K,V> {
	
	
	
	
	
	
	 static class Entry<K,V>{
		private K key;
		private V value;
		private Entry<K,V> next;
		public Entry(K key, V value) {
			
			this.key = key;
			this.value = value;
			
		}
		
		
	}

}
