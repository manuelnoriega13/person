package com.manoriega.batchpersona.processors;

import com.manoriega.batchpersona.entities.Person;
import org.springframework.batch.item.ItemProcessor;

public class PersonItemProcessor implements ItemProcessor<Person, Person> {
    @Override
    public Person process(final Person person) throws Exception {

        if (person.getFirstName().equals("manuel")) {
            final String firstName = person.getFirstName().toUpperCase();
            final String lastName = person.getLastName().toUpperCase();

            Person transformedPerson = new Person();
            transformedPerson.setFirstName(firstName);
            transformedPerson.setLastName(lastName);
            return transformedPerson;
        }
        return null;

    }
}
