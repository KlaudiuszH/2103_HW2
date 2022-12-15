package co2103.hw2.controller;

import co2103.hw2.Hw2Application;
import co2103.hw2.model.Department;
import co2103.hw2.repo.CourseworkRepository;
import co2103.hw2.repo.DepartmentRepository;
import co2103.hw2.repo.ModuleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DeleteController {
    @Autowired
    private DepartmentRepository repoD;

    @Autowired
    private ModuleRepository repoM;

    @Autowired
    private CourseworkRepository repoC;

    @GetMapping("/deleteDepartment")
    public String deleteDepartment(@RequestParam int id) {
        if (repoD.findById(id).isPresent()) {
            repoD.delete(repoD.findById(id).get());
        }
        return "redirect:/list";
    }
    @GetMapping("/deleteModule")
    public String deleteModule(@RequestParam String module) {
        /*if (repoM.findModuleByCode(module)) {
            repoM.delete(repoM.findById(module).get());
        }*/
        return "redirect:/list";
    }
    @GetMapping("/deleteCoursework")
    public String deleteCoursework(@RequestParam int id) {
        if (repoC.findById(id).isPresent()) {
            repoC.delete(repoC.findById(id).get());
        }
        return "redirect:/list";
    }
}
