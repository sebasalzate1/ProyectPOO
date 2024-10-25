
package blockbuster;

/**
 *
 * @author USER
 */
public class Person {

    private String name;
    private String id;

    //Person class constructor 
    public Person(String name, String id) {
        this.name = name;
        this.id = id;
    }
    
    //Setters and getters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
