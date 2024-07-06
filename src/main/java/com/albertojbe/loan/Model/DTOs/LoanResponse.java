package com.albertojbe.loan.Model.DTOs;

import com.albertojbe.loan.Model.Enum.LoanType;

public record LoanResponse (LoanType type, Double interest_rate){
}
