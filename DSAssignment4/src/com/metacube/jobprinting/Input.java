package com.metacube.jobprinting;

import java.util.HashMap;

public class Input {
	HashMap<String, Integer> priorityMap = new HashMap<>();
	
	public Input(){
	priorityMap.put("chairman", 4);
	priorityMap.put("professors", 3);
	priorityMap.put("graduate", 2);
	priorityMap.put("undergraduates", 1);
	}
	
	public HashMap<String, Integer> getPriorityMap() {
		return priorityMap;
	}
	public void setPriorityMap(HashMap<String, Integer> priorityMap) {
		this.priorityMap = priorityMap;
	}
	
}
