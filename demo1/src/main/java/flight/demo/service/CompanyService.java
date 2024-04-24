package flight.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import flight.demo.exceptions.ResourceCompanyNotFoundException;
import flight.demo.model.Company;
import flight.demo.repository.CompanyRepository;

@Service
public class CompanyService {

    @Autowired
    CompanyRepository companyRepository;

    public void createCompany(Company company){
        companyRepository.save(company);
    }

    public List<Company> getAllCompanies() {
        return companyRepository.findAll();
    }

    public Optional<Company> findById(Long ID) {
        return companyRepository.findById(ID);
    }

    public Optional<Company> updateCompany(Company company) {
        companyRepository.save(company);
        return companyRepository.findById((company.getID()));
    }

    public void deleteCompany(Long ID) throws ResourceCompanyNotFoundException{
        Company company = companyRepository.findById(ID).orElseThrow(()-> new ResourceCompanyNotFoundException("Company", "ID", ID));
        companyRepository.deleteById(company.getID());
    }

}
