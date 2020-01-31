package com.example.searchengine.API;

import com.example.searchengine.Model.Employee;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;


public interface EmployeeApi {
    @GET("employees")
    Call<List<Employee>> getEmployee();
}
