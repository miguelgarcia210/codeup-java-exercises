package movies;

import util.Input;

import java.util.Arrays;

public class MoviesApplication {
    private static Input input = new Input();

    private static void displayOptions() {
        System.out.printf("What would you like to do?%n");
        System.out.printf("0 - exit%n");
        System.out.printf("1 - view all movies%n");
        System.out.printf("2 - view movies in the animated category%n");
        System.out.printf("3 - view movies in the drama category%n");
        System.out.printf("4 - view movies in the horror category%n");
        System.out.printf("5 - view movies in the sci-fi category%n");
        System.out.printf("6 - add a movie to the list%n");
    }

    private static int selectOption() {
        System.out.printf("Enter your choice: %n");
        return input.getInt(0, 5);
    }

    private static void searchCategory(String categoryName) {
        for (Movie movie : MoviesArray.findAll()) {
            if (movie.getCategory().equalsIgnoreCase(categoryName)) {
                System.out.printf("%s -- %s%n", movie.getName(), movie.getCategory());
            }
        }
        System.out.println();
    }

    private static void displayMovies(int option) {
        switch (option) {
            case 1:
                System.out.println(Arrays.toString(MoviesArray.findAll()));
                break;
            case 2:
                searchCategory("animated");
                break;
            case 3:
                searchCategory("drama");
                break;
            case 4:
                searchCategory("horror");
                break;
            case 5:
                searchCategory("scifi");
            case 6:
                // TODO: Create method to allow addition to movie list
                break;
            default:
                System.out.println("displayMovies method broke!");
        }
    }

//    private static Movie addMovie(Movie movie) {
//        String movieName = input.getString("Enter movie name.");
//        if (movieName.equals("") || movieName.startsWith(" ")){
//
//        };
//        Movie[] newMovieArr = Arrays.copyOf(MoviesArray.findAll(),MoviesArray.findAll().length + 1);
//        newMovieArr[newMovieArr.length] = movie;
//    }

    private static void runSearch() {
        displayOptions(); // Display selection options to the user
        displayMovies(selectOption()); // Pass user's selected option into displayMovies
    }

    public static void main(String[] args) {
        runSearch();
    }
}
