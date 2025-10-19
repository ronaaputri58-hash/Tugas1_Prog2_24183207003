package pemrograman.pkg2;

public class Mahasiswa {
    private String nama;
    private String npm;
    private String prodi;

  
    public Mahasiswa(String nama, String npm, String prodi) {
        this.nama = nama;
        this.npm = npm;
        this.prodi = prodi;
    }

   
    public void tampilkanData() {
        System.out.println("=== Data Mahasiswa ===");
        System.out.println("Nama   : " + nama);
        System.out.println("NPM    : " + npm);
        System.out.println("Prodi  : " + prodi);
        System.out.println();
    }
}

