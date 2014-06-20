/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import DAO.CartDAO;
import java.text.NumberFormat;
import java.util.ArrayList;

/**
 *
 * @author it3530103
 */
public class Cart 
{
    private ArrayList<ListingBean> items;
    
    public Cart()
    {
        items = new ArrayList<ListingBean>();
    }
    
   
    public int getNumItemsInCart()
    {
        return getItems().size();
    }
    
    public String displayItemsInCart(String username)
    {
         String itemList = "<h1>Cart</h1><table border=\"2\">";
        for(int i = 0; i<getItems().size(); i++)
        {
            int numItem = i+1;
            itemList+="<tr><td>"+ numItem + ")<br> Listing Title: " + getItems().get(i).getTitle()+ "<br></td>"
                    + "<td><form><input type=\"hidden\" value=\""+ getItems().get(i).getListingID() + "\" name =\"listingid\"> "
                    + "<input type =\"hidden\" value=\"" + username + "\" name = \"username\">"
                    + "<input type =\"submit\" value=\"Remove\"/></form></tr>";
        }
        
        if(itemList.equals("<h1>Cart</h1><table border=\"2\">")) //if no items in cart
            return "You have no items in your cart.</table>";
        else
            return itemList +="</table>";
       
    }
    
    public String addUpPrices()
    {
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        double total=0;
        for(int i = 0; i<items.size(); i++)
        {
            total+=items.get(i).getPrice();
        }
        String totalPrice = nf.format(total);
        return "Total Price: " + totalPrice;
    }
    
    public String addToCart(ListingBean listing, String username)
    {
      
        if(CartDAO.addItem(listing, username))
        {  
            getItems().add(listing);
            return "Listing added to cart!";
        }
        return "Item already in cart.";
    }

    public ArrayList<ListingBean> getItems() {
        return items;
    }

    public void setItems(ArrayList<ListingBean> items) {
        this.items = items;
    }
}
