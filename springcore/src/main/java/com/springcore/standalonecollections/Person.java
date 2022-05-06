package com.springcore.standalonecollections;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person {

	private List<String> friends;
	private Map<String,Integer> feestruct;
	private Properties pro;

	public Properties getPro() {
		return pro;
	}

	public void setPro(Properties pro) {
		this.pro = pro;
	}

	public List<String> getFriends() {
		return friends;
	}

	public Map<String, Integer> getFeestruct() {
		return feestruct;
	}

	public void setFeestruct(Map<String, Integer> feestruct) {
		this.feestruct = feestruct;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

	@Override
	public String toString() {
		return "Person [friends=" + friends + ", feestruct=" + feestruct + ", pro=" + pro + "]";
	}
	
	
	
}
