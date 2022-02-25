/**
* <h1>Item Class</h1>
* <p>
* This class contains the method to print the item
* name that will be used at the UpinIpin class.
* <p>
* @author Muhammad Rafi Farhan
* @version 1.0
* @since 2022-02-24
*/
public class Item {
    /**
    * Both variable are set as private
    * to encapsulate the variables.
    */
    private String name;
    /**
    * Set the value of name as Ipin with
    * the constructor Item() that set as
    * a local variable.
    */
    private Item() {
        name = "Ipin";
    }
    
public Item(String name) { 
     /**
    * Because the output ask for 'ipin' instead
    * of 'Ipin', we use ToLowerCase() to lower
    * all the letter output.
    */
    System.out.println(this.name = new Item().name.toLowerCase());
    }
}