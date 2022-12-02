package co2103.hw2.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Entity
public class Department {
    @Id
    @GeneratedValue
    private int id;

    private String title;
    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private List<Module> modules = new ArrayList<>();
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Module foundationModule;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Module> getModules() {
        return modules;
    }

    public void setModules(List<Module> modules) {
        this.modules = modules;
    }

    public Module getFoundationModule() {
        return foundationModule;
    }

    public void setFoundationModule(Module foundationModule) {
        this.foundationModule = foundationModule;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", modules=" + modules +
                ", foundationModule=" + foundationModule +
                '}';
    }
}
