/**
 * Created by Feras on 7/7/2017.
 */
public class Movie {

    private String title;
    private String category;

    //building a constructor, when we create an instance/object this is the part that tells us what properties the object takes for each instance.
    //constructors have the same name as the class...can get confusing

    public Movie(){} //Default constructor

    public Movie(String title, String category) {
        this.title = title;
        this.category = category;
    }

    //we need to get the category variable in order to compare it in another method, we do this using the getter (right click, generate)
    public String getCategory() {
        return category;
    }

@Override
    public String toString() {
        return "\n" + "Title: " + title + "\n" + "Category: " + category;
    }
}
