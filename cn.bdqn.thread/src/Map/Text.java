package Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Text {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("CN", "�й�");
		map.put("USA", "����");
		map.put("FR", "����");
		Set<String> keys = map.keySet();// ���ؽ��ļ���
		for (String string : keys) {
			System.out.println(string + "====");
			// ��ȡvalues
			String coutry = map.get(string);
			System.out.println(coutry);
		}

		// ͨ��key����values
		String count = map.get("FR");
		System.out.println(count);
		map.remove("CN");
		Collection<String> collection =  map.values();
		for(String value:collection){
			
			
			System.out.println(value);
		}
		Set<Entry<String, String>> entrySet = map.entrySet();
		
		Iterator<String> key = keys.iterator();
		while (key.hasNext()) {
			String kString = key.next();
			String jia = map.get(kString);
			System.out.println(jia);
		}
	}
}
