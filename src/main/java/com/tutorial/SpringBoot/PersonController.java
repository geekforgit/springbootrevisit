package com.tutorial.SpringBoot;

import com.tutorial.SpringBoot.dao.Person;
import com.tutorial.SpringBoot.dao.PersonDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class PersonController {
    @Autowired
    PersonDAO personDAO;
    @GetMapping("/{id}")
    public Optional<Person> getPerson(@PathVariable Long id){
        return personDAO.findById(id);
    }

    @GetMapping("/generateMockData")
    public Person generateMockData(){
        Person person = Person.builder()
                .id(1L)
                .firstName("Gaurav")
                .lastName("Jha")
                .Address("bengaluru").build();
        return personDAO.save(person);
    }


}
