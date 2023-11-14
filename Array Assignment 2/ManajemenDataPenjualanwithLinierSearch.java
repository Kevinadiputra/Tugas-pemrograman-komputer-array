import java.util.Scanner;

public class ManajemenDataPenjualanwithLinierSearch {

    // Method untuk menghitung rata-rata penjualan perhari
    public static double hitungRataRataHarian(String[] data) {
        double totalHarian = 0;
        for (int j = 1; j < data.length; j++) {
            double penjualanHarian = Double.parseDouble(data[j]);
            totalHarian += penjualanHarian;
        }
        return totalHarian / (data.length - 1); 
    }

    // Method untuk menampilkan penjualan perhari dan total perhari
    public static void tampilkanDataPenjualan(String[] data) {
        String hari = data[0];
        double rataRataHarian = hitungRataRataHarian(data);

        System.out.print(hari + ": ");
        int totalPenjualanHarian = 0;
        for (int j = 1; j < data.length; j++) {
            int penjualanHarian = Integer.parseInt(data[j]);
            System.out.print(penjualanHarian + " ");
            totalPenjualanHarian += penjualanHarian;
        }
        System.out.println("Rata-rata Harian: " + rataRataHarian);
        System.out.println("Total Harian: " + totalPenjualanHarian);
    }

    // Method untuk linear search
    public static void cariHarian(String[][] dataPenjualan) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nCari data penjualan berdasarkan hari:");
        String searchDay = scanner.nextLine();

        boolean dayFound = false;

        for (String[] data : dataPenjualan) {
            if (data[0].equalsIgnoreCase(searchDay)) {
                dayFound = true;
                tampilkanDataPenjualan(data);
                break;
            }
        }

        if (!dayFound) {
            System.out.println("Data penjualan untuk hari " + searchDay + " tidak ditemukan.");
        }
    }

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

        Scanner scanner = new Scanner(System.in);

        boolean exitSystem = false;

        int totalPenjualanMinggu = 0;

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
                        totalPenjualanMinggu += Integer.parseInt(data[1]);
                    }
                    System.out.println("Total Penjualan Selama Seminggu: " + totalPenjualanMinggu);
                    break;
                case 2:
                    cariHarian(dataPenjualan);
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
}
