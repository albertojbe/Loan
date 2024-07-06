package com.albertojbe.loan.Model;

import com.albertojbe.loan.Model.DTOs.CustomerRequest;

public class Customer {
    private Integer age;
    private String cpf;
    private String name;
    private Double income;
    private String location;

    public Customer(CustomerRequest customerRequest) {
        this.age = customerRequest.age();
        this.cpf = customerRequest.cpf();
        this.name = customerRequest.name();
        this.income = customerRequest.income();
        this.location = customerRequest.location();
    }

    public boolean isIncomeLowerOrEqualThat(Double value){
        return this.income <= value;
    }
    public boolean isIncomeBetweenThat(Double minValue, Double maxValue){
        return this.income >= minValue && this.income <= maxValue;
    }
    public boolean isIncomeUpperOrEqualThat(Double value){
        return this.income >= value;
    }
    public boolean isAgeLowerThat(Integer value){
        return this.age < value;
    }
    public boolean IsCustomerLivesAt(String location){
        return this.location.equals(location);
    }
}
