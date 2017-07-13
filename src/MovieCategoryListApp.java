import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Feras on 7/7/2017.
 */
public class MovieCategoryListApp {

    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {


        System.out.println("welcome to the Movie List Application!");
        System.out.println("There are 100 movies in this list");

        //first declare an ArrayList for movies

        ArrayList<Movie> movies;

        //making the array list
        //you can combine these two steps...
        movies = fillMovieList();


        do {
            int category = askUserForCategory();

            ArrayList<Movie> selectedMovies = searchForCategory(movies, category);

            printResults(selectedMovies);

        }while (checkforUserCont());
        System.out.println("Goodbye!");


    }

    private static boolean checkforUserCont(){
        boolean userCont = false;
        boolean validChoice;

        do {
            System.out.println("Would you like to search again? (y/n)");
            String userChoice = input.nextLine();

            if (userChoice.equalsIgnoreCase("y")){
                userCont = true;
                validChoice = true;
            }else if (userChoice.equalsIgnoreCase("n")){
                userCont = false;
                validChoice = true;

            }else  {
                System.out.println("Not a valid choice! Please enter y or n : ");
                validChoice = false;
            }
        } while (!validChoice);
        return userCont;
    }

    private static ArrayList<Movie> fillMovieList() {

        ArrayList<Movie> movies = new ArrayList<>();

        for (int i = 1; i <= 100; i++) {
            movies.add(MovieIO.getMovie(i));
        }

        return movies;
    }

    private static int askUserForCategory() {
        Scanner input = new Scanner(System.in);
        int category;

        System.out.println("what category are you interested in? \n1 SciFi\n2 Musical\n3 Horror\n4 Drama\n5 Animated\n6 for Comedy");

        category = checkForValidChoice();

        return category;
    }

   private static int checkForValidChoice(){

        int category = 0;
        boolean validChoice;

       do {
           if (input.hasNextInt()){
               category=input.nextInt();
               validChoice = true;
               if (category < 1 || category > 6) {
                   System.out.println("Not a valid category option! Please pick a number from the list. ");
                   validChoice= false;
               }
           }else {
               System.out.println("Not an integer! Please enter a number in the list!");
               validChoice = false;

           }
           input.nextLine();

       } while (!validChoice);
       return category;
   }

    private static ArrayList<Movie> searchForCategory(ArrayList<Movie> movies, int category) {
        ArrayList<Movie> selectedMovies = new ArrayList<>();

       for (Movie movie : movies) {
           switch (category){
               case 1:
                   if ("SciFi".equalsIgnoreCase(movie.getCategory())){
                       selectedMovies.add(movie);
                   }
                   break;
               case 2:
                   if ("Musical".equalsIgnoreCase(movie.getCategory())){
                       selectedMovies.add(movie);
                   }
                   break;
               case 3:
                   if ("Horror".equalsIgnoreCase(movie.getCategory())){
                       selectedMovies.add(movie);
                   }
                   break;
               case 4:
                   if ("Drama".equalsIgnoreCase(movie.getCategory())){
                       selectedMovies.add(movie);
                   }
                   break;
               case 5:
                   if ("Animated".equalsIgnoreCase(movie.getCategory())){
                       selectedMovies.add(movie);
                   }
                   break;
               case 6:
                   if ("Comedy".equalsIgnoreCase(movie.getCategory())){
                       selectedMovies.add(movie);
                   }
                   break;
               default:
                   break;

           }

       }

        return selectedMovies;

    }

    private static void printResults(ArrayList<Movie> selectedMovies) {

        Movie x = new Movie();



        for (Movie movie : selectedMovies) {
            System.out.println(movie);


        }
    }

}
