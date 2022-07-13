package chap13;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test13_1 {

	public static void main(String[] args) {
		
		//1. O, O, O, X
		
		//2. O, O, X, O
		
		//3. O, O, O, X
		
		//4. 4
		
		//5.
		
		//6.
		
		//7.
		BoardDao dao = new BoardDao();
		List<Board> list = dao.getBoardList();
		for(Board board : list) {
			System.out.println(board.getTitle() + "-"
					+ board.getContent());
		}
		
		//8.
		Set<Student> set = new HashSet<>();
		
		set.add(new Student(1, "홍길동"));
		set.add(new Student(2, "신용권"));
		set.add(new Student(1, "조민우"));
		
		Iterator<Student> iterator = set.iterator();
		while(iterator.hasNext()) {
			Student student = iterator.next();
			System.out.println(student.studentNum + ":" + student.name);
		}
		
		//9.
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		
		String name = null;
		int maxScore = 0;
		int totalScore = 0;
		
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		for(Map.Entry<String, Integer> entry : entrySet) {
			if(entry.getValue() > maxScore) {
				name = entry.getKey();
				maxScore = entry.getValue();
			}
			totalScore += entry.getValue();
		}
		
		int avgScore = totalScore / map.size();
		System.out.println("평균점수: " + avgScore);
		
		System.out.println("최고점수: " + maxScore);
		System.out.println("최고점수를 받은 아이디:" + name);
		

	}

}
