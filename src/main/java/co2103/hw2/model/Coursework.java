package co2103.hw2.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Coursework {
    @Id
    @GeneratedValue
    private int id;

    private int weighting;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getWeighting() {
        return weighting;
    }

    public void setWeighting(int weighting) {
        this.weighting = weighting;
    }

    @Override
    public String toString() {
        return "Coursework{" +
                "id=" + id +
                ", weighting=" + weighting +
                '}';
    }
}
