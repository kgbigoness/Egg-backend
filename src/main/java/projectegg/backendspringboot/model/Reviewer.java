package projectegg.backendspringboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table
public class Reviewer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;
    
    @Column(name = "email_id")
    private String email;

    @Column(name = "responses")
    private String responses;
    public Reviewer() {

    }

    public Reviewer(String firstName, String lastName, String email, String responses) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.responses = responses;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmailId(String emailId) {
        this.email = emailId;
    } 

    public String getResponses() {
        return this.responses;
    }

    public void setResponses(String responses) {
        this.responses = responses;
    }
    


}
