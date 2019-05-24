package com.manoriega.batchpersona;

import com.manoriega.batchpersona.entities.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BatchPersonaApplicationTests {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    public void contextLoads() {
        AtomicInteger id = new AtomicInteger();
        int limit = 10;

        int plistsize = 0;
        do {
            StringBuilder sql = new StringBuilder();
            sql.append("select p.id, p.first_name, p.last_name from person p  where p.id > " + id + " limit " + limit);
            List<Person> personList = jdbcTemplate.query(sql.toString(), (resultSet, i) -> {
                Person person = new Person();
                id.set(resultSet.getInt("id"));
                person.setFirstName(resultSet.getString("first_name"));
                person.setLastName(resultSet.getString("last_name"));
                return person;
            });
            plistsize = personList.size();
        } while (id.get() == plistsize);

    }

}
