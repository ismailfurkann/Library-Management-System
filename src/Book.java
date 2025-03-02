class Book {
    private String title;
    private String author;
    private String isbn;
    private int quantity;


    public Book(String title, String author, String isbn, int quantity) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.quantity = quantity;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", ISBN: " + isbn + ", Quantity: " + quantity;
    }
}