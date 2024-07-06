package com.albertojbe.loan.Model.DTOs;

public record CustomerRequest(Integer age,
                              String cpf,
                              String name,
                              Double income,
                              String location) {
}
