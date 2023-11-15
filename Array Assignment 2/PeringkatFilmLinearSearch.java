import java.util.Scanner;

public class PeringkatFilmLinearSearch {
    public static void main(String[] args) {
        String[][] film = {
            {"The Shawshank Redemption", "Drama", "4.8"},
            {"The Godfather", "Crime", "4.9"},
            {"Pulp Fiction", "Crime", "4.7"},
            {"The Dark Knight", "Action", "4.5"},
            {"Forrest Gump", "Action", "4.6"}
        };

        // Menampilkan Daftar Film, Genre, dan Rating
        System.out.println("Daftar Film, Genre, dan Rating:");
        for (int i = 0; i < film.length; i++) {
            String title = film[i][0];
            String genre = film[i][1];
            double rating = Double.parseDouble(film[i][2]);
            System.out.println("Judul: " + title + ", Genre: " + genre + ", Rating: " + rating);
        }

        // Menampilkan Rating film tertinggi
        double ratingTertinggi = Double.MIN_VALUE;
        String ratingFilmTertinggi = "";

        for (int i = 0; i < film.length; i++) {
            double rating = Double.parseDouble(film[i][2]);
            if (rating > ratingTertinggi) {
                ratingTertinggi = rating;
                ratingFilmTertinggi = film[i][0];
            }
        }

        System.out.println("Film dengan rating tertinggi adalah:");
        System.out.println("Judul: " + ratingFilmTertinggi);
        System.out.println("Rating: " + ratingTertinggi);

        // Melakukan pencarian linear berdasarkan judul atau genre film
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan judul atau genre film yang ingin dicari: ");
        String inputFilm = scanner.nextLine();

        boolean filmDitemukan = false;
        for (int i = 0; i < film.length; i++) {
            if (film[i][0].equalsIgnoreCase(inputFilm) || film[i][1].equalsIgnoreCase(inputFilm)) {
                filmDitemukan = true;
                System.out.println("Film ditemukan!");
                System.out.println("Judul: " + film[i][0]);
                System.out.println("Genre: " + film[i][1]);
                System.out.println("Rating: " + film[i][2]);
            }
        }

        if (!filmDitemukan) {
            System.out.println("Film dengan judul atau genre '" + inputFilm + "' tidak ditemukan.");
        }
    }
}
