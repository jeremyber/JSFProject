package model;

import DAO.UserDAO;
import java.io.Serializable;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author bmsalm
 */
@ManagedBean
@SessionScoped
public class UserBean implements Serializable
{
    private String username;
    private String email;
    private String firstname;
    private String lastname;  
    private int permissions;
    private ArrayList<String> emails;
    
    public UserBean()
    {
        username = "";
        email = "";
        firstname = "";
        lastname = "";  
        permissions = 2;
    }   

    public String getUsername() {
        return username;
    }
    public String getEmail() {
        return email;
    }
    public String getFirstname() {
        return firstname;
    }
    public String getLastname() {
        return lastname;
    }
    public int getPermissions() {
        return permissions;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public void setPermissions(int permissions) {
        this.permissions = permissions;
    }
    
    
    public void setEmails(ArrayList<String> emails)
    {
        this.emails = emails;
    }
    public ArrayList<String> getEmails()
    {
        ArrayList<String> emailList = UserDAO.getAllEmails();
        this.emails = emailList;
        return emailList;
    }
    @Override
    public String toString()
    {
        return
        "Username: " + username + "<br/>" + 
        "Email: " + email + "<br/>" + 
        "First Name: " + firstname + "<br/>" + 
        "Last Name: " + lastname + "<br/>" + 
        "Permissions: " +permissions + "<br/>";
    }
}
