package co2103.hw2.repo;

import co2103.hw2.model.Coursework;
import org.springframework.data.repository.CrudRepository;

public interface CourseworkRepository extends CrudRepository<Coursework, Integer> {

    public Coursework FindByWeighting(Integer weighting);
}
