import java.util.Scanner;

public class ManajemenInventoriTokowithLinierSearch {

    public static void main(String[] args) {
        String[][] inventory = {
                {"Laptop", "8000000", "10"},
                {"Smartphone", "3500000", "20"},
                {"Tablet", "4100000", "10"},
                {"Headphones", "800000", "30"},
                {"Printer", "1200000", "14"}
        };

        Scanner scanner = new Scanner(System.in);

        boolean exitSystem = false;

        do {
            // Menampilkan inventori
            tampilkanInventori(inventory, "Inventori Toko:");

            // melakukan pencarian
            cariProduk(inventory);

            // Minta input untuk keluar atau lanjutkan
            System.out.println("\nApakah Anda ingin keluar dari sistem? (y/n)");
            String exitChoice = scanner.nextLine();

            if (exitChoice.equalsIgnoreCase("y")) {
                exitSystem = true;
                System.out.println("Terima kasih! Sampai jumpa.");
            }

        } while (!exitSystem);
    }

    // method untuk menampilkan inventori
    public static void tampilkanInventori(String[][] inventory, String label) {
        System.out.println(label);
        for (String[] product : inventory) {
            String productName = product[0];
            double productPrice = Double.parseDouble(product[1]);
            int productStock = Integer.parseInt(product[2]);

            System.out.println("Nama Produk: " + productName + "| Harga: " + productPrice + "| Stok: " + productStock);
        }
    }

    // Method untuk linear search
    public static void cariProduk(String[][] inventory) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nCari produk berdasarkan nama:");
        String searchProduct = scanner.nextLine();

        boolean productFound = false;

        for (String[] product : inventory) {
            if (product[0].equalsIgnoreCase(searchProduct)) {
                productFound = true;
                System.out.println("Produk ditemukan! Detail Produk:");
                System.out.println("Nama Produk: " + product[0]);
                System.out.println("Harga: " + product[1]);
                System.out.println("Stok: " + product[2]);
                break;
            }
        }

        if (!productFound) {
            System.out.println("Produk tidak ditemukan.");
        }
    }
}
