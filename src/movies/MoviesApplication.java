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
    }

    private static int selectOption() {
        return input.getInt(0,5);
    }

    private static void searchCategory(String categoryName) {
        for (Movie movie : MoviesArray.findAll()) {
            if (movie.getCategory().equalsIgnoreCase(categoryName)){
                System.out.println(movie);
            }
        }
    }
    private static void searchName(String movieName) {
        for (Movie movie : MoviesArray.findAll()) {
            if (movie.getName().equalsIgnoreCase(movieName)){
                System.out.println(movie);
            }
        }
    }

//    private static Movie[] displayMovies(int option) {
//        switch (option) {
//            case 1:
//                return MoviesArray.findAll();
//            case 2:
//                return
//        }
//    }

    public static void main(String[] args) {
        displayOptions();
        displayMovies(selectOption());

    }
}
