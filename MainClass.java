package pemrograman.pkg2;

/**
 *
 * @author WINDOWS 10
 */
public class MainClass {
    
    public static void main(String[] args) {
       
        Mahasiswa mhs1 = new Mahasiswa("Andi Pratama", "231001", "Pendidikan Teknologi Informasi");
        Mahasiswa mhs2 = new Mahasiswa("Siti Rahma", "231002", "Pendidikan Teknologi Informasi");

        
        mhs1.tampilkanData();
        mhs2.tampilkanData();
    }
}

