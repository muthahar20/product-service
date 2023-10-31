package com.mtr.productservice.model;

import java.util.Objects;

public class Product {
  
	  private int id;
	    private String name;
	    private int quantity;
	    private double price;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getQuantity() {
			return quantity;
		}
		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		
		@Override
		public int hashCode() {
			return Objects.hash(id, name, price, quantity);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Product other = (Product) obj;
			return id == other.id && Objects.equals(name, other.name)
					&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
					&& quantity == other.quantity;
		}
		public Product(int id, String name, int quantity, double price) {
			super();
			this.id = id;
			this.name = name;
			this.quantity = quantity;
			this.price = price;
		}
	    
	    
	    
	    
}
    
    

