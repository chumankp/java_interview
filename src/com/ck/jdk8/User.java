package com.ck.jdk8;

public class User {
	private int slNo;
	private String fristName;
	private String lastName;
	private String mobileNumber;

	public User(int slNo, String fristName, String lastName, String mobileNumber) {
		super();
		this.slNo = slNo;
		this.fristName = fristName;
		this.lastName = lastName;
		this.mobileNumber = mobileNumber;
	}

	public int getSlNo() {
		return slNo;
	}

	public void setSlNo(int slNo) {
		this.slNo = slNo;
	}

	public String getFristName() {
		return fristName;
	}

	public void setFristName(String fristName) {
		this.fristName = fristName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	@Override
	public String toString() {
		return "User [slNo=" + slNo + ", fristName=" + fristName + ", lastName=" + lastName + ", mobileNumber="
				+ mobileNumber + "]";
	}

}
