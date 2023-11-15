import java.util.Scanner;

public class ManajemenInventoriTokoLinearSearch {
    public static void main(String[] args) {
        String[][] inventory = {
                {"Laptop", "8000000", "10"},
                {"Smartphone", "3500000", "20"},
                {"Tablet", "4100000", "10"},
                {"Headphones", "800000", "30"},
                {"Printer", "1200000", "14"}
        };

        // Menampilkan inventori toko
        System.out.println("Inventori Toko:");
        for (int i = 0; i < inventory.length; i++) {
            String namaProduk = inventory[i][0];
            double hargaProduk = Double.parseDouble(inventory[i][1]);
            int stokProduk = Integer.parseInt(inventory[i][2]);

            System.out.println("Nama Produk: " + namaProduk + ", Harga: " + hargaProduk + ", Stok: " + stokProduk);
        }

        // Melakukan pencarian linear berdasarkan nama produk
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nama produk yang ingin dicari: ");
        String inputProduk = scanner.nextLine();

        boolean produkDitemukan = false;
        for (int i = 0; i < inventory.length; i++) {
            if (inventory[i][0].equalsIgnoreCase(inputProduk)) {
                produkDitemukan = true;
                System.out.println("Produk ditemukan!");
                System.out.println("Nama Produk: " + inventory[i][0]);
                System.out.println("Harga: " + inventory[i][1]);
                System.out.println("Stok: " + inventory[i][2]);
            }
        }

        if (!produkDitemukan) {
            System.out.println("Produk dengan nama '" + inputProduk + "' tidak ditemukan.");
        }
    }
}
