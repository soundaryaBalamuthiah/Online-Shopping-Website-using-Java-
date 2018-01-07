package ccpackage;


import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Soundarya BM
 */
public class Cart {
     HashMap<String, Integer> cartItems;
    public Cart(){
     cartItems = new HashMap<>();
      
    }
    public HashMap getCartItems(){
        return cartItems;
    }
    public void addToCart(String itemId,int quantity){
        cartItems.put(itemId,quantity);
        System.out.println("cart java" + cartItems);
    }
    public void deleteFromCart(String itemId){
        cartItems.remove(itemId);
    }
         
}
