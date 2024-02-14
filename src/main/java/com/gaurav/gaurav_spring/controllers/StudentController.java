package com.gaurav.gaurav_spring.controllers;

import com.gaurav.gaurav_spring.models.Student;
import com.gaurav.gaurav_spring.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// to mark this class as a controller.
// and return the output as json directly
@RestController
public class StudentController {

    // not a good idea to use repositories inside controllers

    // automatically wire an instance of repo to this class -> Autowired
    @Autowired
    private StudentRepository studentRepository;

    // actual url to which you're serving the response
    @RequestMapping("/getStudents")
    public List<Student> getStudent(){

        return studentRepository.findAll();
    }

    @RequestMapping(value = "/addStudents",method = RequestMethod.PUT)
    public Student addStudent(@RequestBody  Student s){
        return studentRepository.save(s);
    }
    @RequestMapping(value = "/delete/{id}",method = RequestMethod.DELETE)
    public void deleteStudent(@PathVariable Long id){
         studentRepository.deleteById(id);
    }

    @RequestMapping(value = "/getStudent",method = RequestMethod.GET)
    public Student getStudent(@RequestParam String name){
        return studentRepository.findByName(name);
    }


    // Transactions 1 and 2 completely.

}
