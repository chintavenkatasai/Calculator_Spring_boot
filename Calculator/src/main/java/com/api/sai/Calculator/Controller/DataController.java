package com.api.sai.Calculator.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.api.sai.Calculator.Model.Data;
import com.api.sai.Calculator.Service.DataService;

@RestController
public class DataController {
@Autowired
DataService dataservice;

@GetMapping("/sum")
public int adding1(@RequestParam int number1,@RequestParam int number2)
{
	return dataservice.addition(number1,number2);
}
@PostMapping("/sub/{number1}/{number2}")

public int sub(@PathVariable int number1,@PathVariable int number2) {

   return dataservice.subtraction(number1,number2); 
}
@PostMapping("/mul")
public int mul(@RequestBody Data data)
{
	return dataservice.multipication(data);
}
@PostMapping("/div")
public String div(@RequestBody Data data)
{
   return dataservice.division(data);
}
}
