package myclasses;

public class Author {
    private String name;
    private String lastname;

    public Author() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return "Author{" 
                + "name=" 
                + name 
                + ", lastname=" 
                + lastname + '}';
    }
    
}
