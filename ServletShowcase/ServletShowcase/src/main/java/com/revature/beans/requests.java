package com.revature.beans;


public class requests {
	
	private int requestId;
	private int workerId;
	private String req;
	
	public requests() {
		super();
		// TODO Auto-generated constructor stub
	}
	public requests(int requestId, int workerId, String req) {
		super();
		this.requestId = requestId;
		this.workerId = workerId;
		this.req = req;
	}
	public int getRequestId() {
		return requestId;
	}
	public void setRequestId(int requestId) {
		this.requestId = requestId;
	}
	public int getWorkerId() {
		return workerId;
	}
	public void setWorkerId(int workerId) {
		this.workerId = workerId;
	}
	public String getReq() {
		return req;
	}
	public void setReq(String req) {
		this.req = req;
	}
}