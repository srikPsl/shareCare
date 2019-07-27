package com.honeywell.demo.entity;

public class MapUserGroupMessage {

	private Integer mugMsgId;
	private MapUserGroup mug;
	private String message ;
	private String status;
	
	public Integer getMugMsgId() {
		return mugMsgId;
	}
	public void setMugMsgId(Integer mugMsgId) {
		this.mugMsgId = mugMsgId;
	}
	public MapUserGroup getMug() {
		return mug;
	}
	public void setMug(MapUserGroup mug) {
		this.mug = mug;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
