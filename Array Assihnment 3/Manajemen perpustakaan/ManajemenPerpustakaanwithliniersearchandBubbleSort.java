import java.util.Scanner;

public class ManajemenPerpustakaanwithliniersearchandBubbleSort {

    public static void main(String[] args) {
        // Inisialisasi data buku dalam perpustakaan
        String[][] perpustakaan = {
            { "Java Programming", "John Smith", "2020", "Tersedia" },
            { "Data Structures and Algorithms", "Alice Johnson", "2019", "Tidak Tersedia" },
            { "Introduction to AI", "Robert Williams", "2022", "Tersedia" },
            { "Database Management", "Emily Davis", "2018", "Tersedia" },
            { "Web Development", "Michael Brown", "2021", "Tersedia" }
        };

        Scanner scanner = new Scanner(System.in);

        boolean exitSystem = false;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tampilkan Data Buku");
            System.out.println("2. Cari Data Buku");
            System.out.println("3. Sort Data Buku ");
            System.out.println("4. Keluar");

            System.out.print("Pilih menu (1/2/3/4): ");
            int choice = scanner.nextInt();
            scanner.nextLine();  

            switch (choice) {
                case 1:
                    tampilkanDataBuku(perpustakaan);
                    break;
                case 2:
                    cariBuku(perpustakaan);
                    break;
                case 3:
                    bubbleSortDataBuku(perpustakaan);
                    break;
                case 4:
                    exitSystem = true;
                    System.out.println("Terima kasih! Sampai jumpa.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih menu yang benar.");
            }

        } while (!exitSystem);
    }

    // Method untuk menampilkan informasi buku
    public static void tampilkanDataBuku(String[][] perpustakaan) {
        System.out.println("Data Buku: ");
        for (int i = 0; i < perpustakaan.length; i++) {
            String judul = perpustakaan[i][0];
            String pengarang = perpustakaan[i][1];
            int tahunTerbit = Integer.parseInt(perpustakaan[i][2]);
            String statusKetersediaan = perpustakaan[i][3];
            System.out.println("Judul: " + judul + " | Pengarang: " + pengarang + " | Tahun Terbit: " + tahunTerbit + " | Status: " + statusKetersediaan);
        }
    }

    // Method untuk linear search buku berdasarkan judul
    public static void cariBuku(String[][] perpustakaan) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nCari data buku berdasarkan judul:");
        String searchTitle = scanner.nextLine();

        boolean bookFound = false;

        for (String[] buku : perpustakaan) {
            if (buku[0].equalsIgnoreCase(searchTitle)) {
                bookFound = true;
                System.out.println("Buku ditemukan! Detail Buku:");
                System.out.println("Judul: " + buku[0]);
                System.out.println("Pengarang: " + buku[1]);
                System.out.println("Tahun Terbit: " + buku[2]);
                System.out.println("Status Ketersediaan: " + buku[3]);
                break;
            }
        }

        if (!bookFound) {
            System.out.println("Buku dengan judul '" + searchTitle + "' tidak ditemukan.");
        }
    }

    // Method untuk Bubble Sort data buku berdasarkan judul
    public static void bubbleSortDataBuku(String[][] perpustakaan) {
        int n = perpustakaan.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                String title1 = perpustakaan[j][0];
                String title2 = perpustakaan[j + 1][0];

                if (title1.compareToIgnoreCase(title2) > 0) {
                    // Swap
                    String[] temp = perpustakaan[j];
                    perpustakaan[j] = perpustakaan[j + 1];
                    perpustakaan[j + 1] = temp;
                }
            }
        }
        System.out.println("Data Buku Setelah diurutkan : ");
        tampilkanDataBuku(perpustakaan);
    }
}
