package com.arpita.restpractice.messenger.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.arpita.restpractice.database.DatabaseClass;
import com.arpita.restpractice.messenger.model.Message;


public class MessageService {

	Map<Integer, Message> messages = DatabaseClass.getMessages();
	
	public MessageService() {
		Message msg1 = new Message(1, "Hello World", new Date(), "admin");
		Message msg2 = new Message(2, "Yes World", new Date(), "admin");
		Message msg3 = new Message(3, "You rock!", new Date(), "arpita");
		
		messages.put(msg1.getId(), msg1);
		messages.put(msg2.getId(), msg2);
		messages.put(msg3.getId(), msg3);
		
		/* Example of pagination
		 * ArrayList<Message> list = new ArrayList<Message>(messages.values());
		 * list.subList(fromIndex, toIndex);
		 */
	}
	
	
	
	public List<Message> getAllMessages() {
		return new ArrayList<Message>(messages.values());
	}
	
	
	public Message getMessage(Integer id) {
		return messages.get(id);
	}
	
	
	public List<Message> addMessage(Message message) {
		
		int size = messages.size() + 1;
		message.setId(size);
		messages.put(size, message);
		return new ArrayList<Message>(messages.values());
	}
	
	public boolean deleteMessage(String id) {
		return false;
	}
	
	
	
	public Message updateMessage(int id, Message message) {
		
		message.setId(id);
		messages.put(id, message);
		
		return messages.get(id);
	}

}
