package co2103.hw2.controller;

import co2103.hw2.model.Department;
import co2103.hw2.repo.DepartmentRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class ListController {
    @GetMapping("/list")
    public String showList(@ModelAttribute Department department) {

        return "list";
    }
}
