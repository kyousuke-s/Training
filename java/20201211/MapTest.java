import java.util.*;
public class MapTest{
	public static void main(String[] args){
		Map<String,Integer> prefs=new HashMap<>();
		prefs.put("京都",255);//Mapでのデータの追加はput
		prefs.put("東京",1261);
		prefs.put("熊本",181);
		int tokyo=prefs.get("東京");
		System.out.println("東京の人口は"+tokyo);
		prefs.remove("京都");
		prefs.put("熊本",182);//上書きもput
		int kumamoto=prefs.get("熊本");
		System.out.println("熊本の人口は"+kumamoto);
		//全件取出しのループ処理
		//取り出す順序は保証されないのでLinkedHashMap/TreeMap等を使うと順序が決まる
		for(String key:prefs.keySet()){
			int value=prefs.get(key);
			System.out.println(key+"人工は"+value);
		}
	}
}
