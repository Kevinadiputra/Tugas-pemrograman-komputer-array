public class ManajemenInventoriToko {
    public static void main(String[] args) {
        String[][] inventory = {
            {"Laptop", "8000000", "10"},
            {"Smartphone", "3500000", "20"},
            {"Tablet", "4100000", "10"},
            {"Headphones", "800000", "30"},
            {"Printer", "1200000", "14"}
        };

        // Menampilkan inventori awal
        System.out.println("Inventori Toko:");
        for (int i = 0; i < inventory.length; i++) {
            String productName = inventory[i][0];
            double productPrice = Double.parseDouble(inventory[i][1]);
            int productStock = Integer.parseInt(inventory[i][2]);

            System.out.println("Nama Produk: " + productName + ", Harga: " + productPrice + ", Stok: " + productStock);
        }

        // Menambahkan stok untuk "Laptop"
        // Yang ini gweh ngetes doang awokoakowkak
        String[] ProdukTambahStok = {"Laptop", "Smartphone", "Tablet"};
        int[] JumlahPenambahanStok = {20,20,40};
        for (int i = 0; i < ProdukTambahStok.length; i++) {
            for (int j = 0; j < inventory.length; j++) {
                if (ProdukTambahStok[i].equals(inventory[j][0])) {
                    int currentStock = Integer.parseInt(inventory[j][2]);
                    inventory[j][2] = String.valueOf(currentStock + JumlahPenambahanStok[i]);
                    break; // Produk ditemukan, keluar dari loop
                }
            }
        }

        // Menampilkan inventori setelah penambahan stok
        System.out.println("\nInventori setelah penambahan stok:");
        for (int i = 0; i < inventory.length; i++) {
            String productName = inventory[i][0];
            double productPrice = Double.parseDouble(inventory[i][1]);
            int productStock = Integer.parseInt(inventory[i][2]);

            System.out.println("Nama Produk: " + productName + ", Harga: " + productPrice + ", Stok: " + productStock);

        // Selamat anda kena frenk
        }
    }
}
