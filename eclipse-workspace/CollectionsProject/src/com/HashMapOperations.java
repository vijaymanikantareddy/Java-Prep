package com;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HashMapOperations {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("ABC", 32);
		map.put("DEF", 123);
		map.put("Hii", 98);
		map.put("Hello", null);
		map.put(null, null);
		map.put(null, 2);
		System.out.println(map);

		System.out.println(map.get("ABC"));
		System.out.println(map.get("vij"));
		System.out.println(map.containsKey("DEF"));
		map.remove("Hii");
		System.out.println(map);

		Set<String> ks = map.keySet();
		System.out.println(ks);
		System.out.println(map.values());

		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " --> " + entry.getValue());
		}

		TreeMap<String, Integer> tmp = new TreeMap<>();
		tmp.put("ABC", 32);
		tmp.put("DEF", 123);
		tmp.put("Hii", 98);
		tmp.put("Hello", null);
//		tmp.put(null,  null);
//		tmp.put(null,  2);
		System.out.println(tmp);

		LinkedHashMap<String, Integer> lhmp = new LinkedHashMap<>();
		lhmp.put("ABC", 32);
		lhmp.put("DEF", 123);
		lhmp.put("Hii", 98);
		lhmp.put("Hello", null);
		lhmp.put(null, null);
		lhmp.put(null, 2);
		System.out.println(lhmp);

		Driver d1 = new Driver(1, "driver1", 12.31);
		Driver d2 = new Driver(2, "driver2", 762.31);
		Driver d3 = new Driver(3, "driver3", 1312.21);
		Driver d4 = new Driver(4, "driver4", 312.31);

		HashMap<Integer, Driver> hmp = new HashMap<>();
		hmp.put(d1.id, d1);
		hmp.put(d2.id, d2);
		hmp.put(d3.id, d3);
		hmp.put(d4.id, d4);

		for (Map.Entry<Integer, Driver> entry : hmp.entrySet()) {
			System.out.println(entry.getKey() + " --> " + entry.getValue());
		}

	}
}

class Driver {
	int id;
	String name;
	double distanceTravelled;

	public Driver(int id, String name, double distanceTravelled) {
		super();
		this.id = id;
		this.name = name;
		this.distanceTravelled = distanceTravelled;
	}

	@Override
	public String toString() {
		return "Driver [id = " + id + ", name = " + name + ", distanceTravelled = " + distanceTravelled + "]";
	}

}
