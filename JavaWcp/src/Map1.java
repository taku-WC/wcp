import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Map1 {
	public static void main(String[] args) {
		Map<Integer, String> map1 = new HashMap<Integer, String>();
		Map<String, String> map2 = new TreeMap<String, String>();

		map1.put(0, "ぶどう");
		map1.put(3, "もも");

		map1.get(0);

		for (int i =0; i < map1.size(); i++) {
			System.out.println(map1.get(i));
		}
	}
}
