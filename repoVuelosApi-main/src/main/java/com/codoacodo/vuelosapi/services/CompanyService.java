package com.codoacodo.vuelosapi.services;

import com.codoacodo.vuelosapi.models.Company;
import com.codoacodo.vuelosapi.models.Flight;
import com.codoacodo.vuelosapi.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CompanyService {

    @Autowired
    CompanyRepository companyRepository;

    public void createCompany(Company company){
        companyRepository.save(company);
    }

    public Optional<Company> findById(Long ID) {
        return companyRepository.findById(ID);
    }

    public void delete(Long ID) {
        companyRepository.deleteById(ID);
    }


}
