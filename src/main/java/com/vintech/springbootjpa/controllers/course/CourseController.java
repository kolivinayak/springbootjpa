package com.vintech.springbootjpa.controllers.course;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CourseController {

    @Autowired
    private CourseService courseService;


    @RequestMapping("/listofcourses")
    public List<Course> getListOfCourses(){
        return courseService.getAllCourses();
    }

    @RequestMapping("/courses/{id}")
    public Optional<Course> getCourse(@PathVariable String id){
        return courseService.getCourse(id);
    }

    @RequestMapping(method= RequestMethod.POST, value = "/courses")
    public void postCourse(@RequestBody Course course){
        courseService.addCourse(course);
    }

    @RequestMapping(method=RequestMethod.PUT, value = "/courses/{id}")
    public Course putCourse(@RequestBody Course course, @PathVariable String id){
        return courseService.updateCourse(course,id);
    }

    @RequestMapping(method=RequestMethod.DELETE, value = "/course/{id}")
    public void deleteCourse(@PathVariable String id){
        courseService.deleteCourse(id);
    }

}
