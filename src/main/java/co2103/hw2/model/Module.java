package co2103.hw2.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Entity
public class Module {
    @Id
    private String code;
    @ManyToMany(mappedBy = "modules")
    private List<Department> departments;
    @OneToMany(cascade = {CascadeType.MERGE, CascadeType.REMOVE}, fetch = FetchType.EAGER)
    @JoinColumn
    private List<Coursework> courseworks = new ArrayList<>();
    @OneToOne
    private Coursework exam;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }

    public List<Coursework> getCoursework() {
        return courseworks;
    }

    public void setCoursework(List<Coursework> courseworks) {
        this.courseworks = courseworks;
    }

    public Coursework getExam() {
        return exam;
    }

    public void setExam(Coursework exam) {
        this.exam = exam;
    }

    @Override
    public String toString() {
        return "Module{" +
                "code='" + code + '\'' +
                ", courseworks=" + courseworks +
                ", exam=" + exam +
                '}';
    }
}
