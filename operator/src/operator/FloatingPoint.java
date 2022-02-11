package operator;
/**
* <h1>Operator</h1>
* There are six types of operator  
* groups in Java programming:
* <p>
* >> Arithmetic Operators
* <p>
* >> Assignment Operators
* <p>
* >> Comparison Operators
* <p>
* >> Logic Operators
* <p>
* >> Bitwise Operators
* <p>
* >> Ternary Operators
* @author Muhammad Rafi Farhan
* @version 1.0
* @since 2022-02-10
*/
public class FloatingPoint{
/**
* Math Class contains various math functions
* as in the example above on Math.round(x)
* @param args
*/
    public static void main(String[] args) {
    double x = 92.98; 
    int nx = (int) Math.round(x);
    /**
     *pada kasus ini nilai nx setelah menggunakan Math.round(x)
     *akan dibulatkan dari bilangan desimal 92.98 ke bilangan bulat
     *terdekat yaitu 93
     * 
     *cast(int) required in using Math.round(x) because variable nx is integer 
     *if cast in is not used, an error will appear because of a conversion error 
     *from long to int.We have two solutions for this problem, the first one by 
     * using cast(int) on the use of Math.round(), and the second one is by 
     * using data type long for nx.
     */
    System.out.println(nx);
    } 
}
