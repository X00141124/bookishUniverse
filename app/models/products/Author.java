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
    @Constraints.Required
    private String phone;

    @OneToMany
    public List<Product> products;
}