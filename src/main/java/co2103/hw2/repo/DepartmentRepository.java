package co2103.hw2.repo;

import co2103.hw2.model.Department;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DepartmentRepository extends CrudRepository<Department, Integer> {

    public List<Department> findByTitle(String title);

    public List<Department> findByFoundationModule(String code);
}
