package com.neoflex.calculate.controller;

import com.neoflex.calculate.calculation.CalculateProcess;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculateController {
    @GetMapping("/calculate/{averageSalary}")
    public String getCalculate(@PathVariable String averageSalary){
        return CalculateProcess.getCalculations(averageSalary);
    }
}