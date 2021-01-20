package com.vaadin.telros.app.data.repository;

import com.vaadin.telros.app.data.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Long> {}
