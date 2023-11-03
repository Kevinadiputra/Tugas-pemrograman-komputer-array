public class PeringkatFilm {
    public static void main(String[] args) {
        String[][] film = {
            {"The Shawshank Redemption", "Drama", "4.8"},
            {"The Godfather", "Crime", "4.9"},
            {"Pulp Fiction", "Crime", "4.7"},
            {"The Dark Knight", "Action", "4.5"},
            {"Forrest Gump", "Action", "4.6"}
        };

        System.out.println("Daftar Film, Genre, dan Peringkat:");
        for (int i = 0; i < film.length; i++) {
            String title = film[i][0];
            String genre = film[i][1];
            double rating = Double.parseDouble(film[i][2]);
            System.out.println("Judul: " + title + ", Genre: " + genre + ", Peringkat: " + rating);
        }
        double ratingTertinggi = Double.MIN_VALUE;
        String ratingFilmTertinggi = "";

        for (int i = 0; i < film.length; i++) {
            double rating = Double.parseDouble(film[i][2]);
            if (rating > ratingTertinggi) {
                ratingTertinggi = rating;
                ratingFilmTertinggi = film[i][0];
            }
        }

        System.out.println("Film dengan peringkat tertinggi adalah:");
        System.out.println("Judul: " + ratingFilmTertinggi);
        System.out.println("Peringkat: " + ratingTertinggi);
    }
}
