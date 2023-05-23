import java.util.Scanner;

class Mahasiswa {
    private String nama;
    private int nim;
    private double nilai;

    public Mahasiswa(String nama, int nim, double nilai) {
        this.nama = nama;
        this.nim = nim;
        this.nilai = nilai;
    }

    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Nilai: " + nilai);
    }
}


class MahasiswaReguler extends Mahasiswa {
    public MahasiswaReguler(String nama, int nim, double nilai) {
        super(nama, nim, nilai);
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Status: Mahasiswa Reguler");
    }
}


class MahasiswaPascasarjana extends Mahasiswa {
    private String programStudi;

    public MahasiswaPascasarjana(String nama, int nim, double nilai, String programStudi) {
        super(nama, nim, nilai);
        this.programStudi = programStudi;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Status: Mahasiswa Pascasarjana");
        System.out.println("Program Studi: " + programStudi);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama mahasiswa reguler: ");
        String namaReguler = scanner.nextLine();
        System.out.print("Masukkan NIM mahasiswa reguler: ");
        int nimReguler = scanner.nextInt();
        System.out.print("Masukkan nilai mahasiswa reguler: ");
        double nilaiReguler = scanner.nextDouble();
		
		System.out.println();

        scanner.nextLine(); // Membersihkan newline

        System.out.print("Masukkan nama mahasiswa pascasarjana: ");
        String namaPascasarjana = scanner.nextLine();
        System.out.print("Masukkan NIM mahasiswa pascasarjana: ");
        int nimPascasarjana = scanner.nextInt();
        System.out.print("Masukkan nilai mahasiswa pascasarjana: ");
        double nilaiPascasarjana = scanner.nextDouble();
        scanner.nextLine(); // Membersihkan newline
        System.out.print("Masukkan program studi mahasiswa pascasarjana: ");
        String programStudi = scanner.nextLine();

        MahasiswaReguler mahasiswaReguler = new MahasiswaReguler(namaReguler, nimReguler, nilaiReguler);
        MahasiswaPascasarjana mahasiswaPascasarjana = new MahasiswaPascasarjana(namaPascasarjana, nimPascasarjana, nilaiPascasarjana, programStudi);

	System.out.println();
	
    System.out.println("Data Mahasiswa Reguler:");
    mahasiswaReguler.tampilkanInfo();
    System.out.println();

    System.out.println("Data Mahasiswa Pascasarjana:");
    mahasiswaPascasarjana.tampilkanInfo();
    System.out.println();
}

}