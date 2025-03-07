package com.qks.makerSpace.controller;

import com.qks.makerSpace.entity.User;
import com.qks.makerSpace.service.EmployeeService;
import com.qks.makerSpace.service.UserService;
import com.qks.makerSpace.util.JWTUtils;
import com.qks.makerSpace.util.MyResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    private Map<String, Object> getOneEmployee(@PathVariable String id) {
        return employeeService.getOneEmployee(id);
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    private Map<String, Object> getAllEmployee() {
        return employeeService.getAllEmployee();
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    private Map<String, Object> AddEmployee(@RequestBody Map<String, Object> map) {
        return employeeService.AddEmployee(map);
    }

    @RequestMapping(value = "", method = RequestMethod.PUT)
    private Map<String, Object> UpdateEmployee(@RequestBody Map<String, Object> map) {
        return employeeService.UpdateEmployee(map);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    private Map<String, Object> DeleteEmployee(@PathVariable String id) {
        return employeeService.DeleteEmployee(id);
    }

}
