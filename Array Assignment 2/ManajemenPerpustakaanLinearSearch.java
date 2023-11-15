import java.util.Scanner;

public class ManajemenPerpustakaanLinearSearch {

    public static void main(String[] args) {

        String[][] Perpustakaan = {
                { "Java Programming", "John Smith", "2020", "Tersedia" },
                { "Data Structures and Algorithms", "Alice Johnson", "2019", "Tidak Tersedia" },
                { "Introduction to AI", "Robert Williams", "2022", "Tersedia" },
                { "Database Management", "Emily Davis", "2018", "Tersedia" },
                { "Web Development", "Michael Brown", "2021", "Tersedia" }
        };

        // Menampilkan Informasi Buku
        System.out.println("Data Buku: ");
        for (int i = 0; i < Perpustakaan.length; i++) {
            String judul = Perpustakaan[i][0];
            String author = Perpustakaan[i][1];
            int tahun = Integer.parseInt(Perpustakaan[i][2]);
            String status = Perpustakaan[i][3];
            System.out.println("Judul: " + judul + ", Author: " + author + ", Tahun: " + tahun + ", Status: " + status);
        }

        // Melakukan pencarian linear berdasarkan judul, author, tahun, atau status
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan judul, author, tahun, atau status buku yang ingin dicari: ");
        String inputBuku = scanner.nextLine();

        boolean bukuDitemukan = false;
        for (int i = 0; i < Perpustakaan.length; i++) {
            if (Perpustakaan[i][0].equalsIgnoreCase(inputBuku) ||
                Perpustakaan[i][1].equalsIgnoreCase(inputBuku) ||
                Perpustakaan[i][2].equalsIgnoreCase(inputBuku) ||
                Perpustakaan[i][3].equalsIgnoreCase(inputBuku)) {
                bukuDitemukan = true;
                System.out.println("Buku ditemukan!");
                System.out.println("Judul: " + Perpustakaan[i][0]);
                System.out.println("Author: " + Perpustakaan[i][1]);
                System.out.println("Tahun: " + Perpustakaan[i][2]);
                System.out.println("Status: " + Perpustakaan[i][3]);
            }
        }

        if (!bukuDitemukan) {
            System.out.println("Buku dengan judul, author, tahun, atau status '" + inputBuku + "' tidak ditemukan.");
        }
    }
}
