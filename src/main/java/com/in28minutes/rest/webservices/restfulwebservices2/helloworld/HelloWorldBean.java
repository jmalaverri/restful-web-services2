package com.in28minutes.rest.webservices.restfulwebservices2.helloworld;

public class HelloWorldBean {

	private String message;

	public HelloWorldBean(String message) {
		this.message = message;
	}
	
	//Importante adicionar o metodo GET, se não estiver presente
	//um erro Whitelabel será mostrado
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "HelloWorldBean [message=" + message + "]";
	}

}
