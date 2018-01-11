//package com.spring.model;
//
//import java.io.Serializable;
//
//import javax.persistence.FetchType;
//import javax.persistence.GeneratedValue;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.OneToOne;
//
//public class Cart implements Serializable{
//
//	@Id
//	@GeneratedValue
//	private int cartId;
//	
//	private int cartProductID;
//	
//	@OneToOne(fetch=FetchType.LAZY)
//	@JoinColumn(name="userMailId")
//	private User cartUserDetails;
//	
//	private double cartPrice;
//	private int cartStock;
//	private String cartImage;
//	private String cartProductName;
//	
//	public Cart()
//	{
//		
//	}
//	public Cart(int cartId,int cartProductID,User cartUserDetails,Double cartPrice,int cartStock,String cartProductName)
//
//	{
//		this.cartId=cartId;
//		this.cartProductID=cartProductID;
//		this.cartUserDetails=cartUserDetails;
//		this.cartPrice=cartPrice;
//		this.cartStock=cartStock;
//	}
//	public void setCartPrice(Double price) {
//		// TODO Auto-generated method stub
//		
//	}
//	public void setCartProductID(int pid) {
//		// TODO Auto-generated method stub
//		
//	}
//	public void setCartStock(int qty) {
//		// TODO Auto-generated method stub
//		
//	}
//	public void setCartProductName(String pname) {
//		// TODO Auto-generated method stub
//		
//	}
//	public void setCartImage(String imagName) {
//		// TODO Auto-generated method stub
//		
//	}
//	public void setCartUserDetails(User u) {
//		// TODO Auto-generated method stub
//		
//	}
//	public Object getCartId() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//	public int getCartStock() {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//	public void setCartId(Object cartId2) {
//		// TODO Auto-generated method stub
//		
//	}
//}
