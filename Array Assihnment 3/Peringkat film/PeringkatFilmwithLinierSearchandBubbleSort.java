import java.util.Scanner;

public class PeringkatFilmwithLinierSearchandBubbleSort {
    public static void main(String[] args) {
        // Inisialisasi data film
        String[][] film = {
            {"The Shawshank Redemption", "Drama", "4.8"},
            {"The Godfather", "Crime", "4.9"},
            {"Pulp Fiction", "Crime", "4.7"},
            {"The Dark Knight", "Action", "4.5"},
            {"Forrest Gump", "Action", "4.6"}
        };

        Scanner scanner = new Scanner(System.in);

        boolean exitSystem = false;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tampilkan Daftar Film");
            System.out.println("2. Cari Film");
            System.out.println("3. Film dengan Rating Tertinggi");
            System.out.println("4. Sorting berdasarkan rating");
            System.out.println("5. Keluar");

            System.out.print("Pilih menu (1/2/3/4/5): ");
            int choice = scanner.nextInt();
            scanner.nextLine();  

            switch (choice) {
                case 1:
                    tampilkanDaftarFilm(film);
                    break;
                case 2:
                    cariFilm(film);
                    break;
                case 3:
                    tampilkanFilmTertinggi(film);
                    break;
                case 4:
                    bubbleSortFilm(film);
                    break;
                case 5:
                    exitSystem = true;
                    System.out.println("Terima kasih! Sampai jumpa.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih menu yang benar.");
            }

        } while (!exitSystem);
    }

    // Method untuk menampilkan daftar film, genre, dan peringkat
    public static void tampilkanDaftarFilm(String[][] film) {
        System.out.println("Daftar Film, Genre, dan Peringkat:");
        for (int i = 0; i < film.length; i++) {
            String judul = film[i][0];
            String genre = film[i][1];
            double peringkat = Double.parseDouble(film[i][2]);
            System.out.println("Judul: " + judul + " | Genre: " + genre + " | Peringkat: " + peringkat);
        }
    }

    // Method untuk linear search film berdasarkan judul
    public static void cariFilm(String[][] film) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nCari data film berdasarkan judul:");
        String searchTitle = scanner.nextLine();

        boolean movieFound = false;

        for (String[] movie : film) {
            if (movie[0].equalsIgnoreCase(searchTitle)) {
                movieFound = true;
                System.out.println("Film ditemukan! Detail Film:");
                System.out.println("Judul: " + movie[0]);
                System.out.println("Genre: " + movie[1]);
                System.out.println("Peringkat: " + movie[2]);
                break;
            }
        }

        if (!movieFound) {
            System.out.println("Film dengan judul '" + searchTitle + "' tidak ditemukan.");
        }
    }

    // Method untuk menampilkan film dengan peringkat tertinggi
    public static void tampilkanFilmTertinggi(String[][] film) {
        double peringkatTertinggi = Double.MIN_VALUE;
        String judulFilmTertinggi = "";

        for (int i = 0; i < film.length; i++) {
            double peringkat = Double.parseDouble(film[i][2]);
            if (peringkat > peringkatTertinggi) {
                peringkatTertinggi = peringkat;
                judulFilmTertinggi = film[i][0];
            }
        }

        System.out.println("Film dengan peringkat tertinggi adalah:");
        System.out.println("Judul: " + judulFilmTertinggi);
        System.out.println("Rating: " + peringkatTertinggi);
    }

    // Method untuk Bubble Sort data film berdasarkan peringkat
    public static void bubbleSortFilm(String[][] film) {
        int n = film.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                double rating1 = Double.parseDouble(film[j][2]);
                double rating2 = Double.parseDouble(film[j + 1][2]);

                if (rating1 < rating2) {
                    String[] temp = film[j];
                    film[j] = film[j + 1];
                    film[j + 1] = temp;
                }
            }
        }
        System.out.println("Data Film Setelah diurutkan : ");
        tampilkanDaftarFilm(film);
    }
}
