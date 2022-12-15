package co2103.hw2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import co2103.hw2.repo.DepartmentRepository;

@Controller
public class ListController {
    @Autowired
    private DepartmentRepository repo;

    @GetMapping("/list")
    public String showList(Model model) {
        model.addAttribute("departments", repo.findAll());
        return "list";
    }
}
