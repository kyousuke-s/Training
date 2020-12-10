import java.util.*;
public class SetQ2{
	public static void main(String[] args){
		String[] strArray = new String[]{
		"emhjopwxaz",
		"ykxfjihxvv",
		"oqsuoeojku",
		"stvzdzdplo",
		"ftrmgkauna",
		"ackzqxlchf",
		"dqttpisosm",
		"kfcrgfxenb",
		"vwappsvdld",
		"gvovlddccr",
		"ybaoyevbsl",
		"thhujdjaqk",
		"luxrfzmlyz",
		"zpewohxhvc",
		"whcddsgogv",
		"hzyjmgrbxw",
		"mjmxnxawrw",
		"hdndjktido",
		"vymqiltdzq"};
		
		Set<String> words=new TreeSet<>(Arrays.asList(strArray));
		//ArrayListやSetはそのまま内容が出力される
		System.out.println(words);
		/*
		Iterator<String> it=words.iterator();
		while(it.hasNext()){
			String e=it.next();
			if(!it.hasNext()){
				System.out.println(e);
			}
		}
		*/
		List<String> list=new ArrayList<>(words);
		System.out.println(list.get(list.size()-1));

		/*
		for(String s:list){
			if(s.StartsWith("m")){
				list.remove();
			}
		}
		*/

		Iterator<String> it=list.iterator();
		while(it.hasNext()){
			String s=it.next();
			if(s.startsWith("m")){
				it.remove();
			}
		}
		System.out.println(list);
	}
}
