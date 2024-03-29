package models.users;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

import models.shopping.*;


// This is a user of type Customer


// Customer inherits from the User class
@Entity
@DiscriminatorValue("customer")
public class Customer extends User{
	
	private String street1;
	private String street2;
    private String town;
    private String postCode;
    private String creditCard;

    // Customer has one basket.
    // Customer is the owner (foreign key will be added to Basket
    @OneToOne(mappedBy="customer", cascade = CascadeType.ALL)
    private Basket basket;

    // Customer can has many ShopOrders.
    // Customer is the owner (forieng key will be added to Basket
    @OneToMany(mappedBy="customer", cascade = CascadeType.ALL)
    private List<ShopOrder> orders;
	
    public Customer(){
    }
    
    public Customer(String email, String role, String name, String password, String street1, String town, String postCode, String creditCard)
	{
		super(email, role, name, password);
        this.street1 = street1;
        this.town = town;
        this.postCode = postCode;
		this.creditCard = creditCard;
	}

    public String getStreet1() {
        return street1;
    }

    public void setStreet1(String street1) {
        this.street1 = street1;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(String creditCard) {
        this.creditCard = creditCard;
    }
    public Basket getBasket() {
        return basket;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
    }

    public List<ShopOrder> getOrders() {
        return orders;
    }

    public void setOrders(List<ShopOrder> orders) {
        this.orders = orders;
    }

}