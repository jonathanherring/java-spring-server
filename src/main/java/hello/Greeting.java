package hello;

import java.lang.annotation.Inherited;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Greeting {
    @ManyToOne
    private Account account;

    @Id 
    @GeneratedValue
    private Long id;

    private final String content;

    public Greeting(Account account,long id, String content){
        this.content = content;
    }

    public Account getAccount() {
        return account;
    }

    public Long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

}