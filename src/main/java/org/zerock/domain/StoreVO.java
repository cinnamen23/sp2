package org.zerock.domain;

import java.sql.Timestamp;

public class StoreVO {
	
	private int sno, score;
	
	
	private String sname;
	private double lat, lng;
	private String info, gubun;
	private Timestamp regdate, updatedate;
	
	
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public double getLat() {
		return lat;
	}
	public void setLat(double lat) {
		this.lat = lat;
	}
	public double getLng() {
		return lng;
	}
	public void setLng(double lng) {
		this.lng = lng;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public String getGubun() {
		return gubun;
	}
	public void setGubun(String gubun) {
		this.gubun = gubun;
	}
	public Timestamp getRegdate() {
		return regdate;
	}
	public void setRegdate(Timestamp regdate) {
		this.regdate = regdate;
	}
	public Timestamp getUpdatedate() {
		return updatedate;
	}
	public void setUpdatedate(Timestamp updatedate) {
		this.updatedate = updatedate;
	}
	@Override
	public String toString() {
		return "StoreVO [sno=" + sno + ", score=" + score + ", sname=" + sname + ", lat=" + lat + ", lng=" + lng
				+ ", info=" + info + ", gubun=" + gubun + ", regdate=" + regdate + ", updatedate=" + updatedate + "]";
	}
	
	
	
}
