package com.arpita.restpractice.database;

import java.util.HashMap;
import java.util.Map;

import com.arpita.restpractice.messenger.model.Message;

public class DatabaseClass {
	
	private static Map<Integer, Message> messages = new HashMap<Integer, Message>();

	public static Map<Integer, Message> getMessages() {
		return messages;
	}

	public void setMessages(Map<Integer, Message> messages) {
		this.messages = messages;
	}

}
