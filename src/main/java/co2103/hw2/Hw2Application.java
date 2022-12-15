package co2103.hw2;

import co2103.hw2.model.Coursework;
import co2103.hw2.model.Department;
import co2103.hw2.model.Module;
import co2103.hw2.repo.CourseworkRepository;
import co2103.hw2.repo.DepartmentRepository;
import co2103.hw2.repo.ModuleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;

@SpringBootApplication
public class Hw2Application implements CommandLineRunner {

    @Autowired
    private CourseworkRepository repoC;

    @Autowired
    private DepartmentRepository repoD;

    @Autowired
    private ModuleRepository repoM;

    public static void main(String[] args) {
        SpringApplication.run(Hw2Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Department depInf = new Department();
        depInf.setTitle("Informatics");
        depInf = repoD.save(depInf);

        Module m1 = new Module();
        m1.setCode("CO2137");
        m1 = repoM.save(m1);
        depInf.setModules(new ArrayList<>());
        depInf.getModules().add(m1);
        depInf.setFoundationModule(m1);
        depInf = repoD.save(depInf);

        Coursework c1 = new Coursework();
        c1.setWeighting(30);
        c1 = repoC.save(c1);
        m1.setCoursework(new ArrayList<>());
        m1.getCoursework().add(c1);
        m1.setExam(c1);
        m1 = repoM.save(m1);
    }
}
