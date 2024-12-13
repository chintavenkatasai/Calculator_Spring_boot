package com.api.sai.Calculator.Service;

import org.springframework.stereotype.Service;

import com.api.sai.Calculator.Model.Data;

@Service
public class DataService {

	public int addition(int number1, int number2) {
		int sum=number1+number2;
		return sum;
	}

	public int subtraction(int number1, int number2) {
     int total=number1-number2;
		
		return total; 
	}

	public int multipication(Data data) {
		return data.getNumber1()*data.getNumber2();
	}

	    public String division(Data data) {
	        double result=0;
	        String message="";
	    	try
	        {
	        if (data.getNumber2() == 0) {
	            throw new ArithmeticException("Division by zero is not allowed");
	        }
	        result=(double) data.getNumber1() / data.getNumber2();
	        }
	    	catch(Exception e){
                message=e.getMessage();
	    		return message;
	    	}
	        return "Division of two numbers is  "+result;
	    }
	}
	

