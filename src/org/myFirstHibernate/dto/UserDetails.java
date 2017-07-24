package org.myFirstHibernate.dto;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "tbl_userDetails")
public class UserDetails {

    @Id
    private int userID;
    private String username;
    @Temporal (TemporalType.DATE) //(TemporalType.TIME) only to save the Time
    private Date date;
    @Lob //Large Object is used to store the whatever size of varChars in the table, by default it was 255
    private String description;
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