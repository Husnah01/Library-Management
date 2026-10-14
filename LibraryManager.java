import java.util.ArrayList;
import java.util.List;

public class LibraryManager{

    List<Book> books ;


    public LibraryManager () {
        this.books = new ArrayList<>();


    }

    public void addBook(Book book){

        if (book.getAuthor().isEmpty() || book.getTitle().isEmpty() ||book.getCategory().isEmpty()){
            System.out.println("We can't add this book to the collection due to the emptness of one of the attributes");

            return;
        }

        for(Book existingBook : books){
            if(existingBook.getId() == book.getId() ){
                System.out.println("The ID :" + book.getId() + " already exist");
                 return;
            }
           
            
        }

        books.add(book);
        System.out.println("The book with ID: " + book.getId() + " has been added to the collection");

    }

    public List<Book> getBooks() {
        return books;
    }

    public int countAvailableBooks() {
        int availableCount = 0;
        for (Book book : books) {
            if (book.isAvailable()) {
                availableCount++;
            }
        }
        return availableCount;
    }

   public Book searchById(int id) {
       for (Book currentBook : books) {
            if (currentBook.getId() == id) {
              return currentBook; 
            }
        }
 
       System.out.println("No book with such ID was found");
       return null; 
    }

    public List<Book> searchByTitle(String  title){

        List<Book> sametitle = new ArrayList<>();

        for(Book currentBook : books){
            if ((currentBook.getTitle()).equals(title)){
                sametitle.add(currentBook);
            }
          

        }

        return sametitle ;
    }
     public List<Book> searchByAuthor(String  authorname){

        List<Book> sameAuthor = new ArrayList<>();

        for(Book currentBook : books){
            if ((currentBook.getAuthor()).equals(authorname)){

                // System.out.print(currentBook.getAuthor());
        
                sameAuthor.add(currentBook);
            }
            

        }

        return sameAuthor;
    }

      public List<Book> filterByCategory(String  category){

        List<Book> categorizedBook = new ArrayList<>();

        for(Book currentBook : books){
            if ((currentBook.getCategory()).equalsIgnoreCase(category)){

                // System.out.print(currentBook.getAuthor());
        
                categorizedBook.add(currentBook);
            }
            

        }

        return categorizedBook;
    }


    public void updateBook(int id , String category ,boolean available){
        Book book = searchById(id);

        book.setCategory(category);
        book.setAvailable(available);
        
    }
    public void removeBook(int id ){
        Book book = searchById(id);

        books.remove(book);
        
    }

    public void borrowBook(int id){
        Book book = searchById(id);

        /// if (true) , while(true)
        if(book.isAvailable()){
            book.setAvailable(false);
            System.out.println("the book =" + " " + book.getTitle() + " is borrowed right away");
        }
        else{
            System.out.println("THE BOOK IS NOT AVAILABLE IN THE MEANTIME");
        }
    }

    public void returnBook(int id){
        Book book = searchById(id);

        if(book == null){
            return;
        }

        if(!book.isAvailable()){
            book.setAvailable(true);
            System.out.println("the book =" + book.getTitle() + " has been returned");
        }
        else{
            System.out.println("THE BOOK IS ALREADY AVAILABLE");
        }
    }




}