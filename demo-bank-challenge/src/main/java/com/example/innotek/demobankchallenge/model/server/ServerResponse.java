package com.example.innotek.demobankchallenge.model.server;


import java.util.ArrayList;
import java.util.List;

public class ServerResponse<T> {
	
	private String requestID  ;
	private List<ServerErrorResponse> errors = new ArrayList<>();
	private T payload;

	
	public static <TPayload> ServerResponse<TPayload> OK ( TPayload payload,  String requestID ) {
		ServerResponse<TPayload> response = new ServerResponse<>();

		response.setRequestID(requestID);
		response.setPayload(payload);
		return response;
	}
	
	public ServerResponse() {
		
		
	}

	public List<ServerErrorResponse> getErrors() {
		return errors;
	}

	public void setErrors(final List<ServerErrorResponse> errors) {
		this.errors = errors;
	}

	public T getPayload() {
		return payload;
	}

	public void setPayload(final T payload) {
		this.payload = payload;
	}

	public String getRequestID() {
		return requestID;
	}

	public void setRequestID(String requestID) {
		this.requestID = requestID;
	}
	
}
