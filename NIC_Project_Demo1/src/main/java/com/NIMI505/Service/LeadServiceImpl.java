package com.NIMI505.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.NIMI505.DAO.LeadRepo;
import com.NIMI505.Lead.Lead;

@Service
public class LeadServiceImpl implements LeadService {
	
	@Autowired
	private LeadRepo leadrepo;

	@Override
	public void LeadNimiInfo(Lead lead)throws RuntimeException {
	leadrepo.save(lead);
	}

}
