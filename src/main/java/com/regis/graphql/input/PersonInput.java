package com.regis.graphql.input;

import com.regis.graphql.model.Gender;

import graphql.schema.GraphQLInputType;
public class PersonInput implements GraphQLInputType {

	private String name;
	private Integer age;
	private Gender gender;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

}
