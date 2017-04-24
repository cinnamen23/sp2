package org.zerock.domain;

import java.util.Date;

public class MessageVO {

	private String sender;
	private String receiver;
	private String msg;
	private Date regdate;
	private Date readdate;
	public String getSender() {
		return sender;
	}
	public void setSender(String sender) {
		this.sender = sender;
	}
	public String getReceiver() {
		return receiver;
	}
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	public Date getReaddate() {
		return readdate;
	}
	public void setReaddate(Date readdate) {
		this.readdate = readdate;
	}
	@Override
	public String toString() {
		return "MessageVO [sender=" + sender + ", receiver=" + receiver + ", msg=" + msg + ", regdate=" + regdate
				+ ", readdate=" + readdate + "]";
	}
	
}
