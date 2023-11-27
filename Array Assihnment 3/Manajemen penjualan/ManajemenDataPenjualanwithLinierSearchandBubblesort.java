import java.util.Scanner;

public class ManajemenDataPenjualanwithLinierSearchandBubblesort {

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
    public static void tampilkanDataPenjualan(String[] data, String label) {
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
                System.out.println("Data ditemukan!");
                tampilkanDataPenjualan(data, "Detail Data Penjualan:");
                break;
            }
        }

        if (!dayFound) {
            System.out.println("Data penjualan untuk hari " + searchDay + " tidak ditemukan.");
        }
    }

    // Method untuk Bubble sort
    public static void bubbleSortDataPenjualan(String[][] dataPenjualan) {
        int n = dataPenjualan.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                String day1 = dataPenjualan[j][0];
                String day2 = dataPenjualan[j + 1][0];

                if (day1.compareToIgnoreCase(day2) > 0) {
                    String[] temp = dataPenjualan[j];
                    dataPenjualan[j] = dataPenjualan[j + 1];
                    dataPenjualan[j + 1] = temp;
                }
            }
        }
        System.out.println("Data Penjualan Setelah disorting: ");
         for (String[] data : dataPenjualan) {
            tampilkanDataPenjualan(data, "Data Penjualan:");
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
            System.out.println("3. Sorting");
            System.out.println("4. Keluar");

            System.out.print("Pilih menu (1/2/3/4): ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Data Penjualan Harian:");
                    for (String[] data : dataPenjualan) {
                        tampilkanDataPenjualan(data, "Data Penjualan:");
                        totalPenjualanMinggu += Integer.parseInt(data[1]);
                    }
                    System.out.println("Total Penjualan Selama Seminggu: " + totalPenjualanMinggu);
                    break;
                case 2:
                    cariHarian(dataPenjualan);
                    break;
                case 3:
                    bubbleSortDataPenjualan(dataPenjualan);
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
}
