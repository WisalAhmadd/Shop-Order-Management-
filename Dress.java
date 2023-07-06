/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ShopStop;

/**
 *
 * @author Wisal Khattak
 */
public class Dress {
    private String size;
    private int amount;
    double price;



    public Dress(String size, int amount){
        super();
        this.size = size;
        this.amount = amount;
        price = 0.0;
    }


    public String getSize(){
        return size;
    }
    public void setSize(String size){
        this.size = size;
    }

    public double getPrice(){
        return price;
    }
    public void setPrice(Double price){
        this.price = price;
    }

    public int getAmount(){
        return amount;
    }
    public void setAmount(int amount){
        this.amount = amount;
    }

    @Override
    public String toString(){
        return String.format("%d %s Dress >> ", this.getAmount(), this.getSize());
    }
}
