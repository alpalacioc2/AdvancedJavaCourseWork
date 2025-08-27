// imports
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

// * ***********************************************************************************************
// * Class Name    : Person.java                                                                   *
// * Description   : A data model class representing a person with name, age, and email.           *
// *                 Supports JAXB annotations for XML serialization.                              *
// * Author        : Alejandro Palacio Caro                                                        *
// * Date Written  : July 6, 2025                                                                  *
// * References    : JAXB API Documentation                                                        *
// * ***********************************************************************************************
@XmlRootElement(name = "person")
public class Person {
    private String name;
    private int age;
    private String email;

    // constructor used for JAXB
    public Person() {
    }

    // Parameterized constructor -initializes person object with name,age,email
    public Person(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    // Getters with @XmlElement annotations
    @XmlElement
    public String getName() {
        return name;
    }

    @XmlElement
    public int getAge() {
        return age;
    }

    @XmlElement
    public String getEmail() {
        return email;
    }

    // Setters (required for JAXB per requirements)
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
