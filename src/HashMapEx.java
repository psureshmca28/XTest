import java.util.HashMap;
import java.util.Hashtable;

public class HashMapEx {

	public static void main(String[] args) {
		
		HashMap<Integer , String> hashMap = new HashMap<Integer, String>();
		System.out.println("Before size:"+hashMap.size());
		
		hashMap.put(1, "aaaa");
		hashMap.put(2, "bbbb");
		hashMap.put(3, "cccc");
		hashMap.put(4, "dddd");
		hashMap.put(null, null);
		hashMap.put(null, null);
		hashMap.put(null, null);
		hashMap.put(5, null);
		hashMap.put(6, null);
		
		System.out.println(hashMap);
		
		System.out.println("After size:"+hashMap.size());
		
		Hashtable<Integer , String> hashtable = new Hashtable<Integer, String>();
		
		hashtable.put(null, null);
		
		System.out.println(hashtable);
	}

}
