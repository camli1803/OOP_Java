package hust.soict.hedspi.aims.media;

abstract public class Media {
    protected String title;
    protected String category;
    protected float cost;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public float getCost() {
        return cost;
    }



    public Media(String title) {
        this.title = title;
    }

    public Media(String title, String category, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
    }

    public Media(String title, String category) {
        this.title = title;
        this.category = category;
    }

    public boolean equals(Media mediaItem) {
        if(this.title.equals(mediaItem.title) && this.category.equals(mediaItem.category) && this.cost == mediaItem.getCost())
           return true;
        else return false;

    }
}
