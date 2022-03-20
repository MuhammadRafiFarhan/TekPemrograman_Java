import java.io.*;
import java.util.*;

public class MainAggregation {
    public static void main (String[] args){
        /* Memasukan data mahasiswa sesuai inisiasi pada class Mahasiswa*/
        Mahasiswa m1 = new Mahasiswa("Fajar Fernanda Riyadi", 2015012022, "KEDOKTERAN");
        Mahasiswa m2 = new Mahasiswa("Raden Muhammad Rizal", 1822113401, "PERIKANAN");
        Mahasiswa m3 = new Mahasiswa("Fadhillah Akmal", 1911150410, "GEOFISIKA");
        Mahasiswa m4 = new Mahasiswa("Muhammad Ikhsan", 2021150911, "KEDOKTERAN");
        
        /* Memasukan data dosen sesuai inisiasi pada class Dosen*/
        Dosen d1 = new Dosen("Achmad Effendi", 2022150, "ANATOMI");
        Dosen d2 = new Dosen("Zainal Abidin", 1997256, "BIOLOGI");
        Dosen d3 = new Dosen("Zachary Miftah", 1998110, "FISIKA DASAR");
        Dosen d4 = new Dosen("Nyoman Bagus Setiadi", 2022151, "FARMAKOLOGI");

        /* Membuat list mahasiswa jurusan kedokteran*/
        List <Mahasiswa> kedokteran_mahasiswa = new ArrayList<Mahasiswa>();
        kedokteran_mahasiswa.add(m1);
        kedokteran_mahasiswa.add(m4);
        
        /* Membuat list mahasiswa jurusan lainya*/
        List <Mahasiswa> lainnya_mahasiswa = new ArrayList<Mahasiswa>();
        lainnya_mahasiswa.add(m2);
        lainnya_mahasiswa.add(m3);
        
        /* Membuat list dosen mata kuliah biologi*/
        List <Dosen> biologi_dosen = new ArrayList<Dosen>();
        biologi_dosen.add(d1);
        biologi_dosen.add(d2);
        biologi_dosen.add(d4);
        
        /* Membuat list dosen mata kuliah lainnya*/
        List <Dosen> fisika_dosen = new ArrayList<Dosen>();
        fisika_dosen.add(d3);
        
        Universitas Kesehatan = new Universitas("Kedokteran", kedokteran_mahasiswa, biologi_dosen);
        Universitas Lainnya = new Universitas("Lainnya", lainnya_mahasiswa, fisika_dosen);
        
        List <Universitas> universitas = new ArrayList<Universitas>();
        universitas.add(Kesehatan);
        universitas.add(Lainnya);

        Fakultas fakultas = new Fakultas("BITS",universitas);
        System.out.print("Total mahasiswa in fakultas: ");
        System.out.print(fakultas.getTotalMahasiswaInFakultas());
        
        Fakultas fakultas2 = new Fakultas("BITS",universitas);
        System.out.print("\nTotal dosen in fakultas: ");
        System.out.print(fakultas2.getTotalDosenInFakultas());
        System.out.print("\n");
    }
}
