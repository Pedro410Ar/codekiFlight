package com.codoacodo.vuelosapi.controller;

import com.codoacodo.vuelosapi.models.Company;
import com.codoacodo.vuelosapi.models.Flight;
import com.codoacodo.vuelosapi.services.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/company")
public class CompanyController {

    @Autowired
    CompanyService companyService;

    @PostMapping("/add")
    public void createCompany(@RequestBody Company company){ companyService.createCompany(company);
    }

    @GetMapping("/{id}")
    public Optional<Company> findCompanyById(@PathVariable Long ID){
        return companyService.findById(ID);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteCompany(@PathVariable Long ID){ companyService.delete(ID);
    }

}
