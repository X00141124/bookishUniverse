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

    @OneToMany
    public List<Product> products;
}