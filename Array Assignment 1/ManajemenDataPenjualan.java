public class ManajemenDataPenjualan {
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
    }
}
