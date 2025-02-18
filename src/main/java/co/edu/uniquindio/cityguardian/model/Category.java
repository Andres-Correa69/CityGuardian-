package co.edu.uniquindio.cityguardian.model;

public class Category {
    //var
    private String id;
    private String name;

    //builder

    public Category(String id, String name) {
        this.id = id;
        this.name = name;
    }

    //empty builder
    public Category() {}

    //getter y setter


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
