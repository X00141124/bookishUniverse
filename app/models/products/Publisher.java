package models.products;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

@Entity
public class Publisher extends Model {
    @Id
    private Long id;
    @Constraints.Required
    private String name;
    @Constraints.Required
    private String address;
    @Constraints.Required
    private String country;

    @OneToMany
    public List<Product> products;

    public Publisher(Long id, String name, String address, String country, List<Product> products) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.country = country;
        this.products = products;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public static Finder<Long, Publisher> find = new Finder<Long, Publisher>(Publisher.class);

    public static List<Publisher> findAll() {
        return Publisher.find.query().where().orderBy("name asc").findList();
    }
}