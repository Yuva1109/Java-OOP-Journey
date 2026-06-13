class Movie {

    String movieName;
    double rating;

    // Constructor
    Movie(String movieName, double rating) {
        this.movieName = movieName;
        this.rating = rating;
    }

    void display() {
        System.out.println("Movie Name : " + movieName);
        System.out.println("Rating     : " + rating);
    }
}

public class Main {

    public static void main(String[] args) {

        Movie m1 = new Movie("Interstellar", 8.9);
        Movie m2 = new Movie("3 Idiots", 8.4);

        m1.display();

        System.out.println();

        m2.display();
    }
}
