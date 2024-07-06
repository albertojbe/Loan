package com.albertojbe.loan.Controller;

import com.albertojbe.loan.Model.DTOs.CustomerRequest;
import com.albertojbe.loan.Model.DTOs.CustomerResponse;
import com.albertojbe.loan.Service.LoanService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class LoanController {

    LoanService loanService;

    public LoanController(LoanService loanService) {
        this.loanService = loanService;
    }

    @PostMapping("/customer-loans")
    public CustomerResponse customerLoan(@RequestBody CustomerRequest customerRequest){
        return loanService.checkLoansAvailable(customerRequest);
    }
}
