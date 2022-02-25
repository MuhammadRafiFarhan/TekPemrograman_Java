package variables;
/**
* <h1>Variables2</h1>
* Variable is a container that save the value
* during java program execution. Every variable has
* a data type and quantity of value it can hold.
* @author Muhammad Rafi Farhan
* @version 1.0
* @since 2022-02-11
*/
public class Constants2 {
    /**
        *final double CM_PER_INCH placed as a static variable, static 
        *variable is a variable declared using the keyword static 
        *outside the method but still in a class, and declared
        *as constant or fixed value. The characteristic is that
        *there are final keywords after static keyword and variable 
        *names declared with a capital letter.
        **/
    public static final double CM_PER_INCH = 2.54; 
    public static void main(String[] args) {
        double paperWidth = 8.5; 
        double paperHeight = 11; 
        System.out.println("Paper size in centimeters: " + paperWidth *
        CM_PER_INCH + " by " + paperHeight * CM_PER_INCH); 
 } 
}