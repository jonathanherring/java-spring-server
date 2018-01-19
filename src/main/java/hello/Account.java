package hello;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.sun.javafx.beans.IDProperty;

import java.util.HashSet;
import java.util.Set;
@Entity
public class Account {

    @OneToMAny(mappedBy = "account")
    private Set<Greeting> greetings = new HashSet<>();

    @Id 
    @GeneratedValue
    private Long id;

    public Set<Greeting> getGreetings(){
        return greetings;
    }

    public Long getId() {
        return id;
    }
    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }
    public Account(String name, String password) {
        this.username = name;
        this.password = password;
    }
}