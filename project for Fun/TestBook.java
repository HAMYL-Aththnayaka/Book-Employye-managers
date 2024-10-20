public class TestBook{
    public static void main(String args[]){
        Book book1 = new Book(1234,"The green bay tree",230);
        book1.setBook_Id(8989);
        book1.setTitle("The Gangaster");
        book1.setPrice(-550.25);

        System.out.println("Book id: " +book1.getBook_Id());
        System.out.println("Book Title: " +book1.getTitle());
        System.out.println("Price of the book: "+book1.getPrice());
    }
}