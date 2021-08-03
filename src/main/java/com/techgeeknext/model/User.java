package com.techgeeknext.model;

public class User {

//	private String name;
	private int id;
//	private String FSD0003;  // Created Date (should be a date field)
//	private String FSD0005;  // Agent
//	private int FSK0101;     // Claim No.
//	private String FSK0102;  //Claim Date (should be a date field)
//	private String FSK0103;  //ClaimRegDate (should be a date field)
	private String FSK0109;  //Claim Status
//	private int FPO0101;

	public User() {		
	}
	
	//public User(int id,String FSD0003,String FSD0005,int FSK0101,String FSK0102,String FSK0103,String FSK0109,int FPO0101) {
	public User(int id,String FSK0109) {
	    this.id = id;
//		this.FSD0003 = FSD0003;
//		this.FSD0005 = FSD0005;
//		this.FSK0101 = FSK0101;
//		this.FSK0102 = FSK0102;
//		this.FSK0103 = FSK0103;
		this.FSK0109 = FSK0109;
//		this.FPO0101 = FPO0101;
	}

	public int getId() {
		return id;
	}

//	public void setId(int id) {
//		this.id = id;
//	}
//
//	public String getFSD0003() {
//		return FSD0003;
//	}
//
//	public void setFSD0003(String FSD0003) {
//		this.FSD0003 = FSD0003;
//	}
//
//	public String getFSD0005() {
//		return FSD0005;
//	}
//
//	public void setFSD0005(String FSD0005) {
//		this.FSD0005 = FSD0005;
//	}
//
//	public int getFSK0101() {
//		return FSK0101;
//	}
//
//	public void setFSK0101(int FSK0101) {
//		this.FSK0101 = FSK0101;
//	}
//
//	public String getFSK0102() {
//		return FSK0102;
//	}
//
//	public void setFSK0102(String FSK0102) {
//		this.FSK0102 = FSK0102;
//	}
//
//	public String getFSK0103() {
//		return FSK0103;
//	}
//
//	public void setFSK0103(String FSK0103) {
//		this.FSK0103 = FSK0103;
//	}

	public String getFSK0109() {
		return FSK0109;
	}

	public void setFSK0109(String FSK0109) {
		this.FSK0109 = FSK0109;
	}

//	public int getFPO0101() {
//		return FPO0101;
//	}
//
//	public void setName(int FPO0101) {
//		this.FPO0101 = FPO0101;
//	}
		
	@Override
	public String toString() {
		//return "User {Id=" + id + "}, {FSD0003="+FSD0003+"}, {FSD0005="+FSD0005+"}, {FSK0101="+FSK0101+"}, {FSK0102="+FSK0102+"}, {FSK0103="+FSK0103+"}, {FSK0109="+FSK0109+"}, {FPO0101="+FPO0101+"}";
		return "User {Id=" + id + "}, {FSK0109="+FSK0109+"}";
	}


}
