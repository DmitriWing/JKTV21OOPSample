/*
1 Создайте класс Book и Author
2 Книгу могут написать много авторов (в классе Book есть поле Author[] authors)
3 Создайте конструкторы, get/set (где необходимо сделайте проверку), также метод toString()
4 Создайте массив из 5 книг
*/
package jktv21oopsample;
//import java.util.Arrays;

//import myclasses.Author;
//import myclasses.Book;

public class JKTV21OOPSample {
    
    public static void main(String[] args) {
//        Author author1 = new Author();
//        author1.setName("Lev");
//        author1.setLastname("Tolstoi");
//        // Author[] authors1 = new Author[1];
//        // authors1[0] = author1;
//        Book book = new Book();
//        book.setTitle("War and Peace");
//        //book.setAuthors(authors1);    // without method addAuthor in class book
//        book.addAuthor(author1);        // using method addAuthor in class book
//        System.out.println(book.toString());
//        System.out.printf("Book{authors = %s, title = %s}", Arrays.toString(book.getAuthors()),book.getTitle());        // this is using getter in method toString of class Book
//    //------------------------------------------------------------------------------------------
//        Author author2 = new Author();              // create variable. Class variable = new constructor
//        Author author3 = new Author();              // create variable
//        author2.setName("Ilja");                    // set value for variable. Object.method(method's parametr)
//        author2.setLastname("Ilf");                 // set value for variable
//        author3.setName("Evgeniy");                 // set value for variable
//        author3.setLastname("Petrov");              // set value for variable
//        // Author[] authors2 = new Author[2];          // create an array                   // without method addAuthor in class book
//        // authors2[0] = author2;                      // write value to index 0 of array   // without method addAuthor in class book
//        // authors2[1] = author3;                      // write value to index 1 of array   // without method addAuthor in class book
//        Book book2 = new Book();                    // create variable
//        book2.setTitle("Twelve chairs");            // set value for variable
//        book2.addAuthor(author2);                   // using method addAuthor in class book
//        book2.addAuthor(author3);                   // using method addAuthor in class book
//        // book2.setAuthors(authors2);                 // set value for variable            // without method addAuthor in class book
//        System.out.println(book2.toString());       // print out. toString - method from class Book
        //---------------------------------------------------------------------------------------------
        
        // using class App. All above can be transferred to the class App.
        App app = new App();
        app.run();
        
    }   // public static void main(String[] args)

}   // public class JKTV21OOPSample
