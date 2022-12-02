package co2103.hw2.repo;

import co2103.hw2.model.Department;
import co2103.hw2.model.Module;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DepartmentRepository extends CrudRepository<Department, Integer> {

    public Department findByTitle(String title);

    public Department findByFoundationModuleCode (String code);
}
