package com.vintech.springbootjpa.controllers.course;



import com.vintech.springbootjpa.controllers.topics.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CourseController {

    @Autowired
    private CourseService courseService;


    @RequestMapping("/topics/{id}/courses")
    public List<Course> getListOfCourses(@PathVariable String id){
        return courseService.getAllCourses(id);
    }

    @RequestMapping("/topics/{topicId}/courses/{Id}")
    public Optional<Course> getCourse(@PathVariable String id){
        return courseService.getCourse(id);
    }

    @RequestMapping(method= RequestMethod.POST, value = "/topics/{topicId}/courses")
    public void postCourse(@RequestBody Course course, @PathVariable String topicId){
        course.setTopic(new Topic(topicId,"",""));
        courseService.addCourse(course);
    }

    @RequestMapping(method=RequestMethod.PUT, value = "/topics/{topicId}/courses/{id}")
    public Course putCourse(@RequestBody Course course, @PathVariable String topicId, @PathVariable String id){
        course.setTopic(new Topic(topicId,"",""));
        return courseService.updateCourse(course);
    }

    @RequestMapping(method=RequestMethod.DELETE, value = "/topics/{topicId}/courses/{id}")
    public void deleteCourse(@PathVariable String id){
        courseService.deleteCourse(id);
    }
}
