//TI
public class Main {
    public static void main(String[] args) {
        Book fictionBook = new Book(1, "The Great Gatsby", "F. Scott Fitzgerald", "Fiction", true); 

        Book cartoonBook = new Book(2, "Mickey Mouse", "Walt Disney", "Cartoon", true);

        Book scienceBook = new Book(3, "A Brief History of Time", "Stephen Hawking", "Fiction", true);

        Book historyBook = new Book(1, "timbuktu", "Yuval Noah Harari", "History", true);

        Book geographBook = new Book(101, "THE GLOBE", "F. Scott Fitzgerald", "GEOGRAPHY", false);



        LibraryManager libraryManager = new LibraryManager();




    System.out.println("All the books in the collection:");

        System.out.println(libraryManager.getBooks());

        libraryManager.addBook(fictionBook);

        libraryManager.addBook(cartoonBook);        libraryManager.borrowBook(2);
        System.out.println(libraryManager.getBooks());
        
        libraryManager.returnBook(2);
        System.out.println(libraryManager.getBooks());

        libraryManager.addBook(scienceBook);

        libraryManager.addBook(geographBook);

        System.out.println("All the books in the collection:");
        System.out.println(libraryManager.getBooks());

        libraryManager.addBook(historyBook);
        System.out.println("All the books in the collection:");
        System.out.println(libraryManager.getBooks());



        // System.out.println("THE BOOK WITH ID 2 =   " + libraryManager.searchById(10));




      
         System.out.println(libraryManager.filterByCategory("FICTION"));


         libraryManager.updateBook(3 , "Animation",false);


         System.out.println(libraryManager.getBooks());
         libraryManager.removeBook(1);

         System.out.println("the remaining books after the removal");
         System.out.println(libraryManager.getBooks());



         libraryManager.borrowBook(2);


         System.out.println(libraryManager.getBooks());
         libraryManager.borrowBook(2);

            libraryManager.borrowBook(2);
         System.out.println(libraryManager.getBooks());

            libraryManager.returnBook(2);
            System.out.println(libraryManager.getBooks());

    }
}