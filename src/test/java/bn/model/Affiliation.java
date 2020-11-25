package bn.model;

public class Affiliation {

    private String id;
    private String name;

    public String getId() {
        return id;
    }

    public Affiliation withId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Affiliation withName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return "Affiliation{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
