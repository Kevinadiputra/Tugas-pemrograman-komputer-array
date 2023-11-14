public class ManajemenPerpustakaan {

    public static void main(String[] args) {
        /**
         * Anda adalah seorang pustakawan di perpustakaan universitas. Anda ingin
         * mengelola data buku yang ada di perpustakaan Anda. Anda ingin menyimpan
         * informasi tentang judul buku, pengarang, tahun terbit, dan status ketersediaan
         * buku.
         */

        String[][] Perpustakaan = {
                { "Java Programming", "John Smith", "2020", "Tersedia" },
                { "Data Structures and Algorithms", "Alice Johnson", "2019", "Tidak Tersedia" },
                { "Introduction to AI", "Robert Williams", "2022", "Tersedia" },
                { "Database Management", "Emily Davis", "2018", "Tersedia" },
                { "Web Development", "Michael Brown", "2021", "Tersedia" }
        };

        System.out.println("Data Buku: ");
        for (int i = 0; i < Perpustakaan.length; i++) {
            String title = Perpustakaan[i][0];
            String founder = Perpustakaan[i][1];
            int year = Integer.parseInt(Perpustakaan[i][2]);
            String status = Perpustakaan[i][3];
            System.out.println("Judul: " + title + ", Author: " + founder + ", Tahun: " + year + ", Status: " + status);
        }
    }
}
