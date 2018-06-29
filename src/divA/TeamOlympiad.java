package divA;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class TeamOlympiad {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
		map.put(1, new ArrayList<>());
		map.put(2, new ArrayList<>());
		map.put(3, new ArrayList<>());
		for(int i = 1;i <= n;i++){
			int num = scn.nextInt();
			map.get(num).add(i);
		}
		int min = Math.min(map.get(1).size(), Math.min(map.get(2).size(), map.get(3).size()));
		System.out.println(min);
		for(int i = 0;i < min;i++){
			System.out.println("" + map.get(1).get(i) + " " + map.get(2).get(i) + " " + map.get(3).get(i));
		}

	}

}
