package br.com.junior;

public class Greeting {
	
	private final Long id;
	private final String content;
	
	public Greeting(Long id, String content) {
		super();
		this.id = id;
		this.content = content;
	}

	public String getContent() {
		return content;
	}

	public Long getId() {
		return id;
	}
	

}
