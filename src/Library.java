import java.util.*;

class Library {
    private ArrayList<Book> books;
    private ArrayList<User> users;
    private HashMap<String, LinkedList<Integer>> loans;

    public Library() {
        books = new ArrayList<>();
        users = new ArrayList<>();
        loans = new HashMap<>();
    }


    public void addBook(String title, String author, String isbn, int quantity) {
        books.add(new Book(title, author, isbn, quantity));
    }

    public void removeBook(String isbn) {
        books.removeIf(book -> book.getIsbn().equals(isbn));
    }

    public void displayBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public Book findBookByISBN(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        return null;
    }


    public void addUser(String name, int userId) {
        users.add(new User(name, userId));
    }

    public void removeUser(int userId) {
        users.removeIf(user -> user.getUserId() == userId);
    }

    public void displayUsers() {
        for (User user : users) {
            System.out.println(user);
        }
    }


    public void checkoutBook(String isbn, int userId) {
        Book book = findBookByISBN(isbn);
        if (book != null && book.getQuantity() > 0) {
            book.setQuantity(book.getQuantity() - 1);
            loans.computeIfAbsent(isbn, k -> new LinkedList<>()).add(userId);
            System.out.println("kitap ödünç verilmiştir.");
        } else {
            System.out.println("Bu kitab şu an bulunamamaktadır.");
        }
    }

    public void returnBook(String isbn, int userId) {
        LinkedList<Integer> loanList = loans.get(isbn);
        if (loanList != null && loanList.remove(Integer.valueOf(userId))) {
            Book book = findBookByISBN(isbn);
            if (book != null) {
                book.setQuantity(book.getQuantity() + 1);
            }
            System.out.println("Book returned successfully.");
        } else {
            System.out.println("No record of this loan.");
        }
    }
}
