import java.io.*;
import java.util.*;

/* Class Universitas berisi objek mahasiswa
dan dosen yang dipanggil dengan menggunakan
list yang mengasosiasikan data mahasiswa dan
dosen dari objeknya.*/
public class Universitas{
    String nama;
    /* Memanggil list mahasiswa*/
    private List<Mahasiswa> mahasiswa;
    /* Memanggil list dosen*/
    private List<Dosen> dosen;
    
    Universitas(String nama, List<Mahasiswa> mahasiswa, List<Dosen> dosen){
        this.nama = nama;
        this.mahasiswa = mahasiswa;
        this.dosen = dosen;
    }
    
    public List<Mahasiswa> getMahasiswa(){
        return mahasiswa;
    }
    public List<Dosen> getDosen(){
        return dosen;
    }
}
