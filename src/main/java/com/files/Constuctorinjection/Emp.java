package com.files.Constuctorinjection;

public class Emp {
	private String eName;
	private int eId;
	private double eSal;
	private Dept dept;
	
	public Emp(String eName, int eId, double eSal, Dept dept) {
		this.eName = eName;
		this.eId = eId;
		this.eSal = eSal;
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Emp [eName=" + eName + ", eId=" + eId + ", eSal=" + eSal + ", dept=" + dept + "]";
	}
	
}
