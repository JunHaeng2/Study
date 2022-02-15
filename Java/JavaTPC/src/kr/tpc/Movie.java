package kr.tpc;

public class Movie {
    private String title;
    private int price;
    private String author;
    private int level;
    private float time;

    public Movie() {};
    public Movie(String title, int price, String author, int level, float time) {
        this.title = title;
        this.price = price;
        this.author = author;
        this.level = level;
        this.time = time;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public void setTime(float time) {
        this.time = time;
    }

    public float getTime() {
        return time;
    }

    public String toString() {
        return title + price + author + level + time;
    }
}
