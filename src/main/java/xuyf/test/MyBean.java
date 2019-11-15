package xuyf.test;

import org.springframework.stereotype.Component;

@Component
public class MyBean {
	private String name;
	MyBean(){
		System.out.println("MyBean");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
