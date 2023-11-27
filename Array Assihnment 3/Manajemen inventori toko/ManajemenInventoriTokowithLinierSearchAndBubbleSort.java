import java.util.Scanner;

public class ManajemenInventoriTokowithLinierSearchAndBubbleSort {

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
            System.out.println("\nMenu:");
            System.out.println("1. Tampilkan Inventori");
            System.out.println("2. Cari Produk");
            System.out.println("3. Sorting");
            System.out.println("4. Keluar");

            System.out.print("Pilih menu (1/2/3/4): ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    tampilkanInventori(inventory, "Inventori Toko:");
                    break;
                case 2:
                    cariProduk(inventory);
                    break;
                case 3:
                    bubbleSortInventori(inventory);
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

    // Method untuk menampilkan inventori
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

    // Method untuk Bubble sort
    public static void bubbleSortInventori(String[][] inventory) {
        int n = inventory.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                String productName1 = inventory[j][0];
                String productName2 = inventory[j + 1][0];

                if (productName1.compareToIgnoreCase(productName2) > 0) {
                    String[] temp = inventory[j];
                    inventory[j] = inventory[j + 1];
                    inventory[j + 1] = temp;
                }
            }
        }
        System.out.println("Data setelah sorting:");
        tampilkanInventori(inventory, "Inventori Toko:");           
    }
}
