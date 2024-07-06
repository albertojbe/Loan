package com.albertojbe.loan.Model.DTOs;

import java.util.List;

public record CustomerResponse(String customer, List<LoanResponse> loans) {
}
