package com.vintech.springbootjpa.controllers.topics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TopicService {
   
	@Autowired 
	private TopicRepository topicRepository;
	
	//private List<Topic> topics = new ArrayList<>(Arrays.asList(new Topic("one", "Spring", "Springboot topic"), new Topic("two", "Java", "Java topic"), new Topic("three", "C++", "C++ topic"), new Topic("four", "Selenium", "Selenium topic")));

    public List<Topic> getAllTopics() {

    	List<Topic> topics = new ArrayList<>();
    	topicRepository.findAll().forEach(topics::add);
        System.out.println(topicRepository.findAll());
        System.out.println(topics);
    	return topics;
    }

/*    public Topic getTopic(String id) {
       // return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }
    }
    */

    public Optional<Topic> getTopic(String id) {

        return topicRepository.findById(id);
    }

    public void addTopic(Topic topic) {
       // topics.add(topic);
        topicRepository.save(topic);
    }

    public Topic updateTopic(Topic topic, String id) {
    	return topicRepository.save(topic);
    }
    
	/*
	 * public Topic updateTopic(Topic topic, String id) { Topic updatedTopic = null;
	 * for (int i = 0; i < topics.size(); i++) { Topic t = topics.get(i); if
	 * (t.getId().equals(id)) { topics.set(i, topic); updatedTopic = topics.get(i);
	 * break; } } return updatedTopic; }
	 */
    public void deleteTopic(String id) {
        
    	//topics.removeIf(t -> t.getId().equals(id));
        topicRepository.deleteById(id);
    }
}

