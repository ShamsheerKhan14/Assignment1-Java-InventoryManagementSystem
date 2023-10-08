/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shamsheerkhan;

/**
 * Date completed: 24 September 2022
 * Student Id: 991661386
 * @author Shamsheer Khan
 * 
 * Below is the inventory method containing all the other methods required for 
 * the assignment which also consist of constructor inventory inevntory method with 3 variables passed
 * and inventory method with 5 variables passed
 * and also mentions the use of all the required accessor and mutator methods 
 * for all the variables used in order to set the values and if conditions not met then throw a exception
 * It also consists of a toString method to print the output after taking inputs from the user.
 * 
 */
public class Inventory {
    /**
     * These are the instance variables for name, Id, quantity on hand(qoh),
     * re-order point(rop) and selling price for the item
     */
    private String id;
    private String name;
    private int qoh;
    private int rop;
    private double sellPrice;
    /**
     * The inventory class uses the below constructor method which initializes all
     * the instance variables its default value
     */
    public Inventory(){
            id = "ABC-1234";
            name = "New Item";
            qoh = 0;
            rop = 25;
            sellPrice = 0.0;
    }
    /**
     * This is a constructor method for the class inventory to which one can
     * pass values for Item id, Item name and selling price
     * @param id is the item Id
     * @param name is the item name
     * @param sellprice is the seeling price of the item 
     */
    public Inventory (String id, String name, double sellprice){
        this.id = id;
        this.name = name;
        this.sellPrice = sellPrice;
    }
    /**
     * This is a constructor method for the class inventory to which one can
     * pass values for Item id, quantity on hand, Item name, re-order point and 
     * selling price
     * @param id is the item Id
     * @param name is the item name
     * @param qoh is the quantity on hand
     * @param rop is the re-order point of the item
     * @param sellprice is the seeling price of the item 
     */
    public Inventory (String id, String name, int qoh, int rop, double sellprice){
        this.id = id;
        this.name = name;
        this.sellPrice = sellPrice;
        this.qoh = qoh;
        this.rop = rop;
    }
    /**
     * This is a method to get Item id  as a string from the user and this is 
     * a accessor method
     * @param id is the item Id
     * @return will return the item Id as a string
     */
    public String getId(String id){
        return id;
    }
    /**
     * below is the mutator method to set and validate the value entered by the user 
     * for variable id
     * @param id is the Item id and will be validated by this method
     */
    public void setId(String id){
        if (id.matches("[a-zA-Z]{3}-[\\d]{4}")){
        this.id = id;
        }
        else{
            throw new IllegalArgumentException("Error: ID must be in the form ABC-1234");
        }
    }
    /**
     * This is a method to get the name of the item as a string from private
     * variable name
     * this is a accessor method
     * @return this will return the name as string
     */
    public String getName(String name){
        return name;
    }
    /**
     * below is the mutator method to set and validate the value entered by the user 
     * for variable name
     * @param name is the Item name and will be validated by this method
     */
    public void setName(String name){
        if(name == null){
            throw new IllegalArgumentException("Error: You have to enter a item name.");
        }
        else {
            this.name = name;
        }
    }
    /**
     * This is a method to get the quantity on hand from the user for the item 
     * as a int from private variable qoh
     * this is a accessor method
     * @return this will return the quantity on hand as a Int
     */
    public int getQoh(int qoh){
        return qoh;
    }
    /**
     * below is the mutator method to set and validate the value entered by the user 
     * for variable qoh
     * @param qoh is the quantity on hand which will be validated by this mutator
     * method
     */
    public void setQoh(int qoh){
        if(qoh < 0){
            throw new IllegalArgumentException("Error: QOH must be 0 or more.");
        }
        else{
               this.qoh = qoh;     
        }
    }
    /**
     * This is a method to get the re-order point from the user for the item 
     * as a int from private variable rop
     * this is a accessor method
     * @param rop is the re-order point
     * @return this returns the re-order point as a Int
     */
    public int getRop(int rop){
        return rop;
    }
    /**
     * below is the mutator method to set and validate the value entered by the user 
     * for variable rop
     * @param rop is the re-order point which will be validated by this mutator
     * method
     */
    public void setRop(int rop){
        if(rop < 0){
            throw new IllegalArgumentException("Error: ROP must be greater than 0.");
        }
        else{
            this.rop = rop;
        }           
    }
    /**
     * This is a method to get the Selling price from the user for the item 
     * as a double from private variable sellPrice
     * this is a accessor method
     * @param sellPrice is the selling price of the item
     * @return this returns the selling price as a Double
     */
    public double getSellPrice(double sellPrice){
        return sellPrice;
    }
    /**
     * below is the mutator method to set and validate the value entered by the 
     * user for variable sellPrice 
     * @param sellPrice is the selling price of the item which will be validated 
     * by this mutator method
     */
    public void setSellPrice(double sellPrice){
        if(sellPrice < 0){
            throw new IllegalArgumentException("Error: Selling price must be greater than 0.");
        }
        else{
            this.sellPrice = sellPrice;
        }            
    }
    /**
     * This method is used to format the output after taking the inputs from user
     * @return this returns the output in the below format.
     */
    public String toString(){
        return(this.id + " " + "(" + this.name + "), QOH: " + this.qoh + " Price: " + this.sellPrice);
    }
    
}

