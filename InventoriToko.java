import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class ManajementInventoriToko {
    public static void main(String[] args) {
        // Anda adalah pemilik toko dan ingin mengelola inventori toko Anda
        // Anda ingin menyimpan informasi produk, harga, dan jumlah
        // stok produk yang Anda miliki
        String[][] Toko = {
                { "Laptop", "8,000,000", "10" },
                { "Smartphone", "3,500,000", "20" },
                { "Tablet", "4,100,000", "10" },
                { "Headphones", "800,000", "30" },
                { "Printer", "1,200,000", "14" }
        };

        // Set Lokalisasi ke Indonesia (Agar Format "," pada harga berubah menjadi ".")
        Locale indonesia = new Locale("id", "ID");
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(indonesia);
        DecimalFormat df = new DecimalFormat("#,###,###,###.##", symbols);

        System.out.println("Inventori Toko: ");
        for (int i = 0; i < Toko.length; i++) {
            String productname = Toko[i][0];
            String priceStr = Toko[i][1].replaceAll(",", "");
            double price = Double.parseDouble(priceStr);
            int stock = Integer.parseInt(Toko[i][2]);
            String formattedPrice = df.format(price);
            System.out.println("Nama Produk: " + productname + ", Harga: Rp." + formattedPrice + ", Stok: " + stock);
        }
    }
}
