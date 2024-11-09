package am.bgd.jdbctask.companypassengerlist;

import am.bgd.jdbctask.exceptions.DatabaseException;
import am.bgd.jdbctask.model.Company;
import am.bgd.jdbctask.service.CompanyService;
import am.bgd.jdbctask.service.serviceimpl.CompanyServiceImpl;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by User on 18.09.2020.
 */
public class CompanyController {
    private CompanyService companyService;
    private CompanyPassengerList companyPassengerList;

    public CompanyController() {
        this.companyService = new CompanyServiceImpl();
        this.companyPassengerList = new CompanyPassengerList();
    }

    public void addCompaniesFromFileList() throws DatabaseException, SQLException {
        List<Company> list = companyPassengerList.getCompaniesList();
        for (Company company : list) {
            this.companyService.save(company);
        }
    }

    public static void main(String[] args) throws DatabaseException, SQLException {
        CompanyController companyController = new CompanyController();
        companyController.addCompaniesFromFileList();
    }
}
