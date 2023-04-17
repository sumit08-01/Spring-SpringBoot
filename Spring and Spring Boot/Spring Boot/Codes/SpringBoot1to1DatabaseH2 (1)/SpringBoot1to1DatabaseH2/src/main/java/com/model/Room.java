package com.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Room {
	
	@Id
	@GeneratedValue
	private Integer roomId;
	private String roomAddress;

	
	public Room() {
		super();
	}


	public Room(String roomAddress) {
		super();
		this.roomAddress = roomAddress;
	}


	public Integer getRoomId() {
		return roomId;
	}


	public void setRoomId(Integer roomId) {
		this.roomId = roomId;
	}


	public String getRoomAddress() {
		return roomAddress;
	}


	public void setRoomAddress(String roomAddress) {
		this.roomAddress = roomAddress;
	}


	@Override
	public String toString() {
		return "Room [roomId=" + roomId + ", roomAddress=" + roomAddress + "]";
	}


	
	
	
	

}
