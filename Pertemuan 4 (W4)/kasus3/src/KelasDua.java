/**
* <h1>KelasDua Class</h1>
* <p>
* This class will printout the number from its own class
* and the number from the KelasSatu class that called by
* using construct.
* <p>
* @author Muhammad Rafi Farhan
* @version 1.0
* @since 2022-02-24
*/

class KelasDua
{
    {
        /** 
        * This will be the last to be printed on the overall
        * and only will be executed if the KelasDua class get
        * constructed.
        */
        System.out.println(5);
    }
    
    public static void main(String[] args) {
		System.out.println(6); /* This will be the first to be printed*/
		KelasSatu satu = new KelasSatu(); /*This will construct the object without parameter*/
		KelasSatu dua = new KelasSatu(10); /*This will construct the object with parameter*/
                KelasDua tiga = new KelasDua();
	}
}
