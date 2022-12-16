package co2103.hw2.repo;

import co2103.hw2.model.Module;
import org.springframework.data.repository.CrudRepository;
import java.util.Optional;


public interface ModuleRepository extends CrudRepository<Module, String> {

    public Optional<Module> findModuleByCode(String code);
}
