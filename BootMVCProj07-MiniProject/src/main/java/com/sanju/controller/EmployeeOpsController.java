package com.sanju.controller;

import com.sanju.model.Employee;
import com.sanju.service.IEmployeeMgmtService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Map;

@Controller
public class EmployeeOpsController {
    @Autowired
    private IEmployeeMgmtService service;

    @GetMapping("/")
    public String showHome() {
        return "home";
    }

    @GetMapping("/emp_report")
    public String showEmployeeReport(Map<String, Object> map) {
        Iterable<Employee> employees = service.getAllEmployees();
        map.put("empsList", employees);
        return "show_employee_report";
    }

    @GetMapping("/emp_add")
    public String showFormPageForSaveEmployee(@ModelAttribute("emp") Employee emp) {
        return "register_employee";
    }

    //    @PostMapping("/emp_add")
//    public String saveEmployee(@ModelAttribute("emp") Employee emp, HttpSession session){
//        String msg = service.registerEmployee(emp);
//        Iterable<Employee> employees = service.getAllEmployees();
//        session.setAttribute("resultMsg",msg);
//        return "redirect:emp_report";
//    }
    @PostMapping("/emp_add")
    public String saveEmployee(@ModelAttribute("emp") Employee emp, RedirectAttributes attrs) {
        String msg = service.registerEmployee(emp);
        Iterable<Employee> employees = service.getAllEmployees();
        attrs.addFlashAttribute("resultMsg", msg);
//        map.put("empsList", employees);
//        map.put("resultMsg", msg);
//        return "show_employee_report";
        return "redirect:emp_report";
    }

    @GetMapping("/emp_edit")
    public String showEditEmployeeFormPage(@RequestParam("no") int no, @ModelAttribute("emp") Employee emp) {
        Employee employee1 = service.getEmployeeByID(no);
        BeanUtils.copyProperties(employee1, emp);
        return "update_employee";
    }

    @PostMapping("/emp_edit")
    public String editEmployee(RedirectAttributes attributes, @ModelAttribute Employee employee) {
        String msg = service.updateEmployee(employee);
        attributes.addFlashAttribute("resultMsg", msg);
        return "redirect:emp_report";

    }

    @GetMapping("/emp_delete")
    public String deleteEmployee(RedirectAttributes attributes, @RequestParam int no) {
        String msg = service.deleteEmployeeByID(no);
        attributes.addFlashAttribute("resultMsg", msg);
        return "redirect:emp_report";
    }
}
