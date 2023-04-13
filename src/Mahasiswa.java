import java.util.HashMap;
import java.util.Scanner;

public class Mahasiswa {
    String nama, kelas, matkulPraktikum;
    int nim;

    
    public Mahasiswa(String nm, String kl, String mat, int ni) {
        nama = nm;
        kelas = kl;
        matkulPraktikum = mat;
        nim = ni;
    }


    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        HashMap<String, Mahasiswa> mhs = new HashMap<>();
        String input;
        Mahasiswa data;

        mhs.put("1", new Mahasiswa("Putri", "3H", "Struktur Data", 202220000));
        mhs.put("2", new Mahasiswa("Agus", "3A", "Sistem Operasi", 202220001));
        mhs.put("3", new Mahasiswa("Arro", "3D", "Basis Data", 202220002));

        System.out.print("Masukkan ID: ");
        input = scan.nextLine();
        data = mhs.get(input);
        if (data != null) {
            System.out.println("Data Mahasiswa\t: "+data.nama);
            System.out.println("Kelas\t\t: "+data.kelas);
            System.out.println("MatKul Praktikum: "+data.matkulPraktikum);
            System.out.println("nim\t\t: "+data.nim);
        }
        scan.close();
    }
}
