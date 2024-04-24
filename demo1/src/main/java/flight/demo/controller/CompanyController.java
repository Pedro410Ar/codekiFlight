package flight.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import flight.demo.exceptions.ResourceCompanyNotFoundException;
import flight.demo.model.Company;
import flight.demo.service.CompanyService;

@RestController
@RequestMapping("/company")
public class CompanyController {

    @Autowired
    CompanyService companyService;

    @PostMapping("/add")
    public void createCompany(@RequestBody Company company){
        companyService.createCompany(company);
    }

    @GetMapping("")
    public List<Company> getAllCompanies(){
        return  companyService.getAllCompanies();
    }
    @GetMapping("/{id}")
    public Optional<Company> searchCompanyId(@PathVariable  Long id){
        return companyService.findById(id);
    }

    @PutMapping("/update")
    public Optional<Company> updateCompany(@RequestBody Company company){
        return companyService.updateCompany(company);
    }

    @DeleteMapping("/delete/{ID}")
    public String deleteCompany(@PathVariable Long ID){
        try{
            companyService.deleteCompany(ID);
            return "Delete Company was OK";
        }catch(ResourceCompanyNotFoundException e){
            System.out.println(e.getMessage());
            return "No se encontro la compañia";
        }
       
    }

}
