package com.manoriega.batchpersona.dao;

import com.manoriega.batchpersona.entities.FileToProcess;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IFileToProcess extends JpaRepository<FileToProcess, Long> {
}
