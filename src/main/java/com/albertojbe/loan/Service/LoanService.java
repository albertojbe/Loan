package com.albertojbe.loan.Service;

import com.albertojbe.loan.Model.Customer;
import com.albertojbe.loan.Model.DTOs.CustomerRequest;
import com.albertojbe.loan.Model.DTOs.CustomerResponse;
import com.albertojbe.loan.Model.DTOs.LoanResponse;
import com.albertojbe.loan.Model.Enum.LoanType;
import com.albertojbe.loan.Model.Loan;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LoanService {

    public CustomerResponse checkLoansAvailable(CustomerRequest customerRequest){
        Customer customer = new Customer(customerRequest);
        Loan loan = new Loan(customer);
        List<LoanResponse> loansAvailable = new ArrayList<>();

        if(loan.isPersonalLoanAvailable()){
            loansAvailable.add(new LoanResponse(LoanType.PERSONAL, 4.0));
        }
        if(loan.isGuaranteedLoanAvailable()){
            loansAvailable.add(new LoanResponse(LoanType.GUARANTEED, 3.0));
        }
        if(loan.isConsignmentLoanAvailable()){
            loansAvailable.add(new LoanResponse(LoanType.PERSONAL, 4.0));
            loansAvailable.add(new LoanResponse(LoanType.GUARANTEED, 3.0));
            loansAvailable.add(new LoanResponse(LoanType.CONSIGNMENT, 2.0));
        }
        return new CustomerResponse(customerRequest.name(), loansAvailable);
    }
}
