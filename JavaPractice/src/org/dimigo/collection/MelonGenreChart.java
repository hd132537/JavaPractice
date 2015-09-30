package org.dimigo.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MelonGenreChart {

	public static void main(String[] args) {
		
		List<Music> list_Ballad = new ArrayList<Music>();
		list_Ballad.add(new Music("내 첫사랑", "베리굿"));
		list_Ballad.add(new Music("또 다시 사랑", "임창정"));
		list_Ballad.add(new Music("부산에 가면", "박진영"));
		
		
		List<Music> list_Dance = new ArrayList<Music>();
		list_Dance.add(new Music("커피", "유재환, 김예림"));
		list_Dance.add(new Music("다 잘될거야", "쿨"));
		
		
		Map<String, List<Music>> map = new HashMap<String, List<Music>>();
		map.put("발라드", list_Ballad);
		map.put("댄스", list_Dance);
		
		System.out.println("<< 멜론 장르 별 차트 >>");
		printMap(map);
		
		System.out.println("<< 발라드 3위 곡 변경 >>");
		list_Ballad.set(2, new Music("지우고 지워도", "차수경"));
		printMap(map);
		
		System.out.println("<< 전체 리스트 삭제 >.");
		list_Ballad.remove(0);
		printMap(map);

		System.out.println("<< 전체 리스트 삭제 >>");
		map.clear();
		printMap(map);
	}
	
	public static void printMap(Map<String, List<Music>> map){

		for(String key : map.keySet()){
			System.out.println("[" +key+ "]");
			
			for(int i=0; i<map.get(key).size(); i++){
				Music e = (Music) map.get(key).get(i);
				System.out.println(i+1 +". "+ e.toString());
			}
		}
		System.out.println("");
	}
}
