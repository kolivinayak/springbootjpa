package com.vintech.springbootjpa.controllers.topics;

import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository <Topic, String> {
	
}
