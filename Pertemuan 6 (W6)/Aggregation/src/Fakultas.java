import java.io.*;
import java.util.*;

/* Class Fakultas berisi objek yang diambil
dari class Universitas dengan menggunakan list
yang mengasosiasikan class Universitas melalui
objek yang terkandung di dalamnya*/
public class Fakultas {
   
    String fakultasName;
    /* Mengakses list pada class Universitas*/
    private List<Universitas> universitas;
    
    Fakultas(String fakultasName,List<Universitas> universitas){
        this.fakultasName = fakultasName;
        this.universitas = universitas;
    }
    /* Menghitung total mahasiswa pada class Univeristas*/
    public int getTotalMahasiswaInFakultas(){
        int noOfMahasiswa = 0;
        List<Mahasiswa> mahasiswa;
        for(Universitas univ : universitas){
            mahasiswa = univ.getMahasiswa();
            for(Mahasiswa m : mahasiswa){
                noOfMahasiswa++;
            }
        }
        return noOfMahasiswa;
    }
    
    /* Menghitung total dosen pada class Univeristas*/
     public int getTotalDosenInFakultas(){
        int noOfDosen = 0;
        List<Dosen> dosen;
        for(Universitas univ : universitas){
            dosen = univ.getDosen();
            for(Dosen d : dosen){
                noOfDosen++;
            }
        }
        return noOfDosen;
    }
}
