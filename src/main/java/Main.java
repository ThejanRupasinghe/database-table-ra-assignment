import java.util.List;

public class Main {

    public static void main(String[] args) {
        Table movie = createMovieTable();
        Table movie_select = movie.select(new KeyType("Star_Wars"));
        System.out.println(movie_select.getTableSize());
        List<Comparable[]> starWars = movie_select.getTuples();
        System.out.println("done");
    }

    public static Table createMovieTable()
    {
        Table movie = new Table ("movie", "title year length genre studioName producerNo",
                "String Integer Integer String String Integer", "title year");
        Comparable [] film0 = { "Star_Wars", 1977, 124, "sciFi", "Fox", 12345 };
        Comparable [] film1 = { "Star_Wars_2", 1980, 124, "sciFi", "Fox", 12345 };
        Comparable [] film2 = { "Rocky", 1985, 200, "action", "Universal", 12125 };
        Comparable [] film3 = { "Rambo", 1978, 100, "action", "Universal", 32355 };
        movie.insert (film0);
        movie.insert (film1);
        movie.insert (film2);
        movie.insert (film3);
        return movie;
    }
}
