class Book {
    private String title;
    private String author;
    private int totalPages;
    private int currentPage = 0;
    public Book(String title, String author, int totalPages) {
        this.title = title;
        this.author = author;
        this.totalPages = totalPages;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public int getTotalPages() {
        return totalPages;
    }
    public int getCurrentPage() {
        return currentPage;
    }
    public void readPages(int n) {
        if(currentPage + n > totalPages) {
            System.out.println("Can't read that far because not enough pages left");
        }
        else {
            currentPage += n;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Book myBook = new Book("Dune", "Frank Herbert", 412);
        myBook.readPages(100);
        System.out.println(myBook.getCurrentPage());
        myBook.readPages(50);
        System.out.println(myBook.getCurrentPage());
        myBook.readPages(9999);
        System.out.println(myBook.getCurrentPage());
    }
}
