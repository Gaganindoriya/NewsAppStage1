package indoriya.gagan.com.newsappstage1;

public class News {
    private String Title;
    private String Category;
    private String Date;
    private String Url;
    private String Author;

    public News(String title, String category, String date, String url, String author) {
        Title = title;
        Category = category;
        Date = date;
        Url = url;
        Author = author;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getUrl() {
        return Url;
    }

    public void setUrl(String url) {
        Url = url;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }
}
