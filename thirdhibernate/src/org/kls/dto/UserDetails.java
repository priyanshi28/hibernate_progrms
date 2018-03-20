package org.kls.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="USER_TABLE")
public class UserDetails
{
@Id
@Column(name="USER_ID")
private int    userId;

@Column(name="USER_NAME")
private String userName;

public void setUserId(int userId) {
this.userId = userId;
}
public String getUserName() {
return userName;
}
public void setUserName(String userName) {
this.userName = userName;
}
public String toString()
{
return "[User Name: "+userName+"User Id: "+userId+"]";
}
}