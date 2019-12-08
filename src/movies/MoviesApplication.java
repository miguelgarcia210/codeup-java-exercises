package movies;

import util.Input;

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

    private static void userSelection(int option) {
        switch (option) {
            case 0:
                System.out.println("Goodbye!");
                break;
            case 1:
                displayAllMovies();
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
                break;
            default:
                System.out.println("displayMovies method broke!");
                break;
        }
    }

    private static Movie[] getAllMovies() { //
        return MoviesArray.findAll();
    }

    private static void displayAllMovies() {
        for (Movie movie : getAllMovies()) {
            System.out.printf("%s -- %s%n", movie.getName(), movie.getCategory());
        }
    }

    private static void searchCategory(String categoryName) {
        for (Movie movie : getAllMovies()) {
            if (movie.getCategory().equalsIgnoreCase(categoryName)) {
                System.out.printf("%s -- %s%n", movie.getName(), movie.getCategory());
            }
        }
        System.out.println();
    }

    private static void runSearch() {
        displayOptions(); // Display selection options to the user
        userSelection(selectOption()); // Pass user's selected option into displayMovies
    }

    public static void main(String[] args) {
        runSearch();
    }
}
