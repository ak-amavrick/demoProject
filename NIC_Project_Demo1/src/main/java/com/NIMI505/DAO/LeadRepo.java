package com.NIMI505.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.NIMI505.Lead.Lead;

public interface LeadRepo extends JpaRepository<Lead, Integer> {

}
