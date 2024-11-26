package com.files.Collectiontype;

import java.util.*;

public class Eployee {
	
	private List<String> vechile;
	private Set<String> email;
	private Map<String,String> name;
	
	public List<String> getVechile() {
		return vechile;
	}
	public void setVechile(List<String> vechile) {
		this.vechile = vechile;
	}
	public Set<String> getEmail() {
		return email;
	}
	public void setEmail(Set<String> email) {
		this.email = email;
	}
	public Map<String, String> getName() {
		return name;
	}
	public void setName(Map<String, String> name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Eployee [vechile=" + vechile + ", email=" + email + ", name=" + name + "]";
	}
	
	
	

}
