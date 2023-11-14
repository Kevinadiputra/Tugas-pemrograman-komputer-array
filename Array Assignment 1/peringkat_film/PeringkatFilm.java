package peringkat_film;

public class PeringkatFilm {
    private String title;
    private String genre;
    private double rating;

    public PeringkatFilm(String title, String genre, double rating) {
        this.title = title;
        this.genre = genre;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public double getRating() {
        return rating;
    }
}