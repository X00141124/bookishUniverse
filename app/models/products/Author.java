package models.products;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

@Entity
public class Author extends Model {
    @Id
    private Long id;
    @Constraints.Required
    private String fname;
    @Constraints.Required
    private String lname;

    @OneToMany
    public List<Product> products;

    public Author() {
    }

    public Author(Long id, String fname, String lname, List<Product> products) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.products = products;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFname() {
        return this.fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return this.lname;
    }

    public void setlname(String lname) {
        this.lname = lname;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public static Finder<Long, Author> find = new Finder<Long, Author>(Author.class);

    public static List<Author> findAll() {
        return Author.find.query().where().orderBy("lname asc").findList();
    }
}