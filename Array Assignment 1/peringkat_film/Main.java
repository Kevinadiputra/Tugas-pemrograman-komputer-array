package peringkat_film;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<PeringkatFilm> filmList = new ArrayList<>();

        filmList.add(new PeringkatFilm("The Shawshank Redemption", "Drama", 4.8));
        filmList.add(new PeringkatFilm("The Godfather", "Crime", 4.9));
        filmList.add(new PeringkatFilm("Pulp Fiction", "Crime", 4.7));
        filmList.add(new PeringkatFilm("The Dark Knight", "Action", 4.5));
        filmList.add(new PeringkatFilm("Forrest Gump", "Action", 4.6));

        PeringkatFilm topRatedFilm = filmList.get(0);
        for (PeringkatFilm film : filmList) {
            if (film.getRating() > topRatedFilm.getRating()) {
                topRatedFilm = film;
            }
        }

        System.out.println("Film dengan ratting tertinggi adalah " + topRatedFilm.getTitle() + " dengan ratting " + topRatedFilm.getRating());
    }
}