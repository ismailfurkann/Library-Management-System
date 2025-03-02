public class Main {
    public static void main(String[] args) {
        Library library = new Library();


        library.addBook("Simyacı", "Paulo Coelho", "12345", 3);
        library.addBook("Nutuk", "Mustafa Kemal Atatürk", "67890", 2);
        library.addBook("Kürk Mantolu Madonna", "Sabahattin Ali", "67891", 2);



        library.addUser("Hasan", 4242);
        library.addUser("İsmail", 4241);
        library.addUser("Necip", 3030);
        library.addUser("Furkan", 3130);



        System.out.println("Tüm Kitaplar:");
        library.displayBooks();


        System.out.println("\nkitap ödünç alınıyor:");
        library.checkoutBook("12345", 4242);


        System.out.println("\nkitap ödünç alınıyor:");
        library.checkoutBook("12346", 4242);


        System.out.println("\nÖdünç Alındıktan Sonraki Tüm Kitaplar:");
        library.displayBooks();



        System.out.println("\nBir kitap iade ediliyor:");
        library.returnBook("12345", 4242);



        System.out.println("\nİade Edildikten Sonraki Tüm Kitaplar:");
        library.displayBooks();


        System.out.println("\nkullanıcılar : ");
        library.displayUsers();

        System.out.println("Kullanıcıyı kaldırmak için bu methodu kullanıyoruz ");
        library.removeUser(3030);


        library.removeBook("67890");

    }
}
