/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author bmsalm
 */

@ManagedBean
@ViewScoped 
public class LoginBean {
    
    private String username;
    private String password;
    private String securityq;
    private String securitya;
    
    public LoginBean(){
        username = "";
        password = "";
        securityq = "";
        securitya = "";
    }

    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }
    public String getSecurityq() {
        return securityq;
    }
    public String getSecuritya() {
        return securitya;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setSecurityq(String securityq) {
        this.securityq = securityq;
    }
    public void setSecuritya(String securitya) {
        this.securitya = securitya;
    }
    
    @Override
    public String toString()
    {
        return 
        "Username: " + username + "<br/>" + 
        "Password: " + password + "<br/>" + 
        "Security question: " + securityq + "<br/>" + 
        "Security answer: " + securitya + "<br/>";
    }
}

