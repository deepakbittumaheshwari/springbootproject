package deepakspringboot.springboot.examples;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class EmployeeRESTAPI {
	@RequestMapping("/hello")
	String home() {
		return "hello";
	}

	@RequestMapping(value = "", produces = { "application/json" })
	@ResponseBody
	Employee retreiveAaEmp() {
		Employee emp = new Employee();
		emp.setEmpId("123213");
		emp.setName("Deepak");
		emp.setSal("500");
		return emp;
	}

	@RequestMapping(value = "/empId/{id}")
	String retreiveEmpInfo(@PathVariable("id") String id) {
		return "hello " + id;
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(EmployeeRESTAPI.class, args);
	}

}
