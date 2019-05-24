package com.manoriega.batchpersona.batch;

import com.manoriega.batchpersona.dao.IPersonDao;
import com.manoriega.batchpersona.entities.Person;
import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.listener.JobExecutionListenerSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class JobPersonCompletionNotificationListener extends JobExecutionListenerSupport {


    private final JdbcTemplate jdbcTemplate;
    private IPersonDao personDao;

    @Autowired
    public JobPersonCompletionNotificationListener(JdbcTemplate jdbcTemplate, IPersonDao personDao) {
        this.jdbcTemplate = jdbcTemplate;
        this.personDao = personDao;
    }

    @Override
    public void beforeJob(JobExecution jobExecution) {
        super.beforeJob(jobExecution);
        jdbcTemplate.execute("delete from person");
    }

    @Override
    public void afterJob(JobExecution jobExecution) {
        if (jobExecution.getStatus() == BatchStatus.COMPLETED) {

            List<Person> personList = jdbcTemplate.query("SELECT id, first_name, last_name FROM person ", (resultSet, i) -> {
                Person person = new Person();
                person.setId(resultSet.getLong("id"));
                person.setFirstName(resultSet.getString("first_name"));
                person.setLastName(resultSet.getString("last_name"));
                return person;
            });
            System.out.println(personList.size());
        }
    }


}