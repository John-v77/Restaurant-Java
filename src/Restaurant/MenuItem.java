package Restaurant;

public class MenuItem {
    private Double price;
    private String description;
    private String category;
//    appetizer, main course, desert
    private  Boolean isNewItem;

    public MenuItem(Double price, String description, String category, Boolean isNewItem){
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNewItem = isNewItem;
    }

    public MenuItem(Double price, String description, String category){
        this(price, description, category, false);
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Boolean getNewItem() {
        return isNewItem;
    }

    public void setNewItem(Boolean newItem) {
        isNewItem = newItem;
    }
}
