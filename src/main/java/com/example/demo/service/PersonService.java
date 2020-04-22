package com.example.demo.service;

import com.example.demo.dao.PersonDao;
import com.example.demo.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class PersonService {

    private static PersonDao personDao;

    @Autowired
    public PersonService(@Qualifier("fakeDao") PersonDao personDao) {

       PersonService.personDao = personDao;
    }

    public static int addPerson(Person person) {
        return personDao.insertPerson(person);
    }

    public static List<Person> getAllPeople() {
        return personDao.selectAllPeople();
    }

    public static Optional<Person> getPersonById(UUID id) {
        return personDao.selectPersonById(id);
    }
}
