package org.demo.lombokdemo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor

public @Data class LombokDemo {

	private int age;
	private String name;
	
	public void test()
	{
		System.out.println("form test() "+ age +" "+ name);
	}
	
	
	LombokDemo(int age)
	{
		this.age = age;
	}

}
