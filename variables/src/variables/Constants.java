
package variables;
/**
* <h1>Variables</h1>
* Variable is a container that save the value
* during java program execution. Every variable has
* a data type and quantity of value it can hold.
* @author Muhammad Rafi Farhan
* @version 1.0
* @since 2022-02-11
*/
public class Constants {
    public static void main(String[] args) {
        /**
        *final double CM_PER_INCH placed as a local variable 
        *and declared as constant or fixed value. The characteristic  
        *is that there are final keywords and variable names 
        *declared with a capital letter.
        **/
        final double CM_PER_INCH = 2.54; 
        double paperWidth = 8.5; 
        double paperHeight = 11; 
        System.out.println("Paper size in centimeters: " + 
        paperWidth * CM_PER_INCH + " by " + paperHeight * 
    CM_PER_INCH); 
    } 
}
