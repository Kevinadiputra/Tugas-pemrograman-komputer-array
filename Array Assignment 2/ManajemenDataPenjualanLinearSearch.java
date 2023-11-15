import java.util.Scanner;

public class ManajemenDataPenjualanLinearSearch {
    public static void main(String[] args) {
        String[][] dataPenjualan = {
            {"Senin", "120", "150", "130", "200", "180"},
            {"Selasa", "100", "110", "120", "130", "140"},
            {"Rabu", "90", "95", "100", "110", "120"},
            {"Kamis", "80", "85", "90", "95", "100"},
            {"Jumat", "150", "160", "170", "180", "190"},
            {"Sabtu", "70", "75", "80", "85", "90"},
            {"Minggu", "200", "210", "220", "230", "240"},
        };

        int totalPenjualan = 0;

        System.out.println("Data Penjualan Harian:");
        for (int i = 0; i < dataPenjualan.length; i++) {
            String hari = dataPenjualan[i][0];
            int totalHarian = 0;

            System.out.print(hari + ": ");
            for (int j = 1; j < dataPenjualan[i].length; j++) {
                int penjualanHarian = Integer.parseInt(dataPenjualan[i][j]);
                totalHarian += penjualanHarian;
                totalPenjualan += penjualanHarian;
                System.out.print(penjualanHarian + " ");
            }
            System.out.println("Total Harian: " + totalHarian);
        }

        int jumlahHari = dataPenjualan.length;
        int rataRataPenjualanHarian = totalPenjualan / (jumlahHari * (dataPenjualan[0].length - 1));

        System.out.println("Rata-rata Penjualan Harian: " + rataRataPenjualanHarian);
        System.out.println("Total Penjualan Selama Seminggu: " + totalPenjualan);

        // Panggil method untuk linear search
        cariHarian(dataPenjualan, rataRataPenjualanHarian);
    }

    // Method untuk linear search
    public static void cariHarian(String[][] dataPenjualan, int rataRataPenjualanHarian) {
        Scanner scanner = new Scanner(System.in);

        boolean exitSystem = false;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tampilkan Data Penjualan Harian");
            System.out.println("2. Cari Data Penjualan Harian");
            System.out.println("3. Keluar");

            System.out.print("Pilih menu (1/2/3): ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Data Penjualan Harian:");
                    for (String[] data : dataPenjualan) {
                        tampilkanDataPenjualan(data);
                    }
                    break;
                case 2:
                    System.out.println("\nCari data penjualan berdasarkan hari:");
                    String searchDay = scanner.nextLine();
                    boolean dayFound = false;

                    for (String[] data : dataPenjualan) {
                        if (data[0].equalsIgnoreCase(searchDay)) {
                            dayFound = true;
                            tampilkanDataPenjualan(data);
                            int totalHarian = hitungTotalHarian(data);
                            System.out.println("Total Harian: " + totalHarian);
                            System.out.println("Rata-rata: " + rataRataPenjualanHarian);
                            break;
                        }
                    }

                    if (!dayFound) {
                        System.out.println("Data penjualan untuk hari " + searchDay + " tidak ditemukan.");
                    }
                    break;
                
                case 3:
                    exitSystem = true;
                    System.out.println("Terima kasih! Sampai jumpa.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih menu yang benar.");
            }

        } while (!exitSystem);
    }

    // Method untuk menampilkan data penjualan
    public static void tampilkanDataPenjualan(String[] data) {
        System.out.print("Data Penjualan untuk " + data[0] + ": ");
        for (int i = 1; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    // Method untuk menghitung total penjualan harian
    public static int hitungTotalHarian(String[] data) {
        int totalHarian = 0;
        for (int i = 1; i < data.length; i++) {
            totalHarian += Integer.parseInt(data[i]);
        }
        return totalHarian;
    }
}
