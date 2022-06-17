package com.vintech.springbootjpa.controllers.topics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;

@RestController
public class TopicController {

    @Autowired
    private TopicService topicService;

    @RequestMapping("/topics")
    public String getAllTopics() {
        return "All topics";
    }

    @RequestMapping("/listoftopics")
    public List<Topic> getListOfTopics(){

        System.out.println("Vinayak listoftopics ");
        return topicService.getAllTopics();
    }

    @RequestMapping("/topics/{id}")
    public Optional<Topic> getTopic(@PathVariable String id){
        return topicService.getTopic(id);
    }

    @RequestMapping(method=RequestMethod.POST, value = "/topics")
    public void postTopic(@RequestBody Topic topic){
        topicService.addTopic(topic);
    }

    @RequestMapping(method=RequestMethod.PUT, value = "/topics/{id}")
    public Topic postTopic(@RequestBody Topic topic, @PathVariable String id){
        return topicService.updateTopic(topic,id);
    }

    @RequestMapping(method=RequestMethod.DELETE, value = "/topics/{id}")
    public void deleteTopic(@PathVariable String id){
        topicService.deleteTopic(id);
    }

}
