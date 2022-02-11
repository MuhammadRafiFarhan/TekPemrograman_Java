
package operator1;
/**
* <h1>Operator1</h1>
* The following program converts large 
* to small data types (long to int to
* short) and (double to float to bytes).
* @author Muhammad Rafi Farhan
* @version 1.0
* @since 2022-02-10
*/
public class ConvertDataType {
    static short methodOne(long l) {
        int i = (int) l;
        return (short)i;
    }
        public static void main(String[] args) {
            double d = 10.25;
            float f = (float) d; 
            byte b = (byte) methodOne((long) f);
            /**
             *output nilai yang akan dikeluarkan dari 
             *variabel b bernilai 10 dengan tipe data 
             *byte (8-bit signed integer). 
             * 
             *pertama dari variabel d ke variabel f akan 
             *mengkonversi tipe data double menjadi float,
             *cast(float) diperlukan agar tidak ada error
             *dalam konversi dari double ke float.
             * 
             *selanjutnya, konversi dari float f ke long f.
             *cast(long) diperlukan agar tidak ada error
             *dalam konversi dari float ke double.
             * 
             *selanjutnya, konversi dari long f ke short f
             *dengan menggunakan variabel static methodOne
             *yang telah dideklarasikan di luar method tapi
             *tetap didalam class. sama seperti sebelumnya
             *cast(short) diperlukan agar tidak ada error
             *dalam konversi dari long ke short.
             * 
             *terakhir, konversi dari short f ke byte b
             *cast(byte) diperlukan agar tidak ada error
             *dalam konversi dari short ke byte.
             */
            System.out.println(b);
        }
}
