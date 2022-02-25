/**
* <h1>KelasSatu Class</h1>
* <p>
* This class will printout the number from its own class
* and will be called by the main class as a new type.
* <p>
* @author Muhammad Rafi Farhan
* @version 1.0
* @since 2022-02-24
*/

class KelasSatu
{
    {
        /**
        * This will be printed every time after one
        * number from the KelasSatu class get printed
        * because it is act as the static initialization 
        * block .
        */
        System.out.println(11); 
    }
    
    static
    {
        System.out.println(2); /* This will be the second to be printed*/
    }
        
    public KelasSatu(int i)
    {
        System.out.println(3); /* This will be the third to be printed*/
    }
    
    public KelasSatu()
    {
        /**
         * This will be the fourt to be printed in the overall
         * and will be the last number to be printed from the
         * KelasSatu class. This block also doesn't have any
         * parameter.
         */
        System.out.println(4);
    }
}