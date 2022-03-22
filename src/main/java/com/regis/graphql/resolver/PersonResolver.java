package com.regis.graphql.resolver;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.regis.graphql.input.PersonInput;
import com.regis.graphql.model.Person;
import com.regis.graphql.repository.PersonRepository;

@Component
public class PersonResolver implements GraphQLQueryResolver, GraphQLMutationResolver {

	@Autowired
	private PersonRepository repository;
	
	public Collection<Person> findAllPeople() {
		return repository.findAll(); 
	}
	
	public Person savePerson(PersonInput input) {
		return repository.save(new Person(input.getName(), input.getAge(), input.getGender()));
	}
	
}
