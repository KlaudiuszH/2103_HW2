package co2103.hw2.repo;

import co2103.hw2.model.Coursework;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CourseworkRepository extends CrudRepository<Coursework, Integer> {

    public List<Coursework> findCourseworkByWeighting(Integer weighting);
}
