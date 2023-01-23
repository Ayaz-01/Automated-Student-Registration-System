package com.masai.model;

public class Course {
	
	private int cid;
	private String name;
	private int fee;
	private String duration;
	
	public Course() {
		// TODO Auto-generated constructor stub
	}

	public Course(int cid, String name, int fee, String duration) {
		super();
		this.cid = cid;
		this.name = name;
		this.fee = fee;
		this.duration = duration;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getFee() {
		return fee;
	}

	public void setFee(int fee) {
		this.fee = fee;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "Course [cid=" + cid + ", name=" + name + ", fee=" + fee + ", duration=" + duration + "]";
	}
	
	

}
