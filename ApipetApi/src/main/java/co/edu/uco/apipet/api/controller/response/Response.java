package co.edu.uco.apipet.api.controller.response;

import java.util.List;

import java.util.ArrayList;

import co.edu.uco.apipet.crosscutting.helper.ObjectHelper;
import co.edu.uco.apipet.crosscutting.messages.Message;

public class Response <T>{

	 private List<Message> messageList;
	    private List<T> data;

	    public Response() {
	        setMessageList(new ArrayList<>());
	        setData(data);
	    }

	    public Response(List<Message> messages, List<T> data){
	        super();
	        setMessageList(messages);
	        setData(data);
	    }

	    public List<Message> getMessageList() {
	        return messageList;
	    }

	    public void setMessageList(List<Message> messageList) {
	        this.messageList = ObjectHelper.getDefaultIfNull(messageList, new ArrayList<>());
	    }

	    public List<T> getData() {
	        return data;
	    }

	    public void setData(List<T> data) {
	        this.data = ObjectHelper.getDefaultIfNull(data, new ArrayList<>());
	    }

	    public void addFatalMessage(final String content){
	        getMessageList().add(Message.createFatalMessage(content));
	    }

	    public void addErrorMessage(final String content){
	        getMessageList().add(Message.createErrorMessage(content));
	    }

	    public void addWarningMessage(final String content){
	        getMessageList().add(Message.createWarningMessage(content));
	    }

	    public void addInfoMessage(final String content){
	        getMessageList().add(Message.createInfoMessage(content));
	    }

	    public void addSuccesMessage(final String content){
	        getMessageList().add(Message.createSuccesMessage(content));
	    }
}
