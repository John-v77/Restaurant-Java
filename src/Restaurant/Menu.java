package Restaurant;
import java.time.LocalDate;
import java.util.ArrayList;
import  java.util.Date;
public class Menu {
    Date lastUpdateMenu = new Date();
    private ArrayList<String> menuCategories = new ArrayList<>();
    private ArrayList<MenuItem> appetizers = new ArrayList<>();
    private ArrayList<MenuItem> main_courses = new ArrayList<>();
    private ArrayList<MenuItem> deserts = new ArrayList<>();

    public Menu(ArrayList menuCategories, ArrayList appetizers, ArrayList main_courses, ArrayList deserts){
        this.menuCategories = menuCategories;
        this.appetizers = appetizers;
        this.main_courses = main_courses;
        this.deserts = deserts;
//        this.lastUpdateMenu = Date.getDate();
    }

    public Date getLastUpdateMenu() {
        return lastUpdateMenu;
    }

    public void setLastUpdateMenu(Date lastUpdateMenu) {
        this.lastUpdateMenu = lastUpdateMenu;
    }

    public ArrayList<String> getMenuCategories() {
        return menuCategories;
    }

    public void setMenuCategories(ArrayList<String> menuCategories) {
        this.menuCategories = menuCategories;
    }

    public ArrayList<MenuItem> getAppetizers() {
        return appetizers;
    }

    public void setAppetizers(ArrayList<MenuItem> appetizers) {
        this.appetizers = appetizers;
    }

    public ArrayList<MenuItem> getMain_courses() {
        return main_courses;
    }

    public void setMain_courses(ArrayList<MenuItem> main_courses) {
        this.main_courses = main_courses;
    }

    public ArrayList<MenuItem> getDeserts() {
        return deserts;
    }

    public void setDeserts(ArrayList<MenuItem> deserts) {
        this.deserts = deserts;
    }
}
