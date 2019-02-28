package com.arpita.restpractice.messenger.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.arpita.restpractice.messenger.model.Message;
import com.arpita.restpractice.messenger.service.MessageService;

@Path("/messages")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class MessageResource {

	MessageService msgService = new MessageService();
	
	/*
	 * @GET
	 * 
	 * @Produces(MediaType.TEXT_PLAIN) public String getMessage() {
	 * 
	 * return "Hello World!!" ; }
	 */

	@GET
	@Path("/{messageID}")
	public Message getMessage(@PathParam(value = "messageID") int messageID) {

		return msgService.getMessage(messageID);
	}
	

	@GET
	public List<Message> getAllMessages() {

		return msgService.getAllMessages();
	}

	
	@POST
	public List<Message> addMessage(Message message) {
		return msgService.addMessage(message);
	}
	
	
	@PUT
	@Path("/{messageID}")
	public Message editMessage(@PathParam(value="messageID") int id, Message message) {
		return msgService.updateMessage(id, message);
	}
	
	
	
}
