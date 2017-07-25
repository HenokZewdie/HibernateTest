package org.myFirstHibernate.dto;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "tbl_userDetails")
public class UserDetails {

    @Id
    private int userID;
    private String username;
    /*what if the person has 2 addresses
    @Embedded
    private Address homeAddress;*/
    @Embedded
    @AttributeOverrides(value = {
            @AttributeOverride(name = "street", column = @Column(name = "HOME_STREET_NAME")),
            @AttributeOverride(name = "city", column = @Column(name = "HOME_CITY_NAME")),
            @AttributeOverride(name = "state", column = @Column(name = "HOME_STATE_NAME")),
            @AttributeOverride(name = "zipcode", column = @Column(name = "HOME_ZIP_CODE"))})
    private Address homeAddress;
    private Address officeAddress;
    @Temporal (TemporalType.DATE) //(TemporalType.TIME) only to save the Time
    private Date date;
    @Lob //Large Object is used to store the whatever size of varChars in the table, by default it was 255
    private String description;

    public Address getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(Address homeAddress) {
        this.homeAddress = homeAddress;
    }

    public Address getOfficeAddress() {
        return officeAddress;
    }

    public void setOfficeAddress(Address officeAddress) {
        this.officeAddress = officeAddress;
    }

    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public int getUserID() {
        return userID;
    }
    public void setUserID(int userID) {
        this.userID = userID;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
}