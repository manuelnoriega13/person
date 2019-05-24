package com.manoriega.batchpersona.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name="files_to_process")
@Getter
@Setter
@ToString
public class FileToProcess {

    @Id
    private Long id;
    private String fileName;
    private String extension;
    private String path;
    private Date process;
    private Date add;
    private Double size;
    private Long totalLines;
}
