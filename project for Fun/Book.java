public class Book {
    private int book_id;
    private String title;
    private double price;

   Book(){}

   Book(int book_id,String title,double price){
    this.book_id = book_id;
    this.title = title;
    this.price = price;
   }

    public int getBook_Id(){
        return book_id;
    }

    public String getTitle(){
        return title;
    }

    public double getPrice(){
        return price;
    }

    public void setBook_Id(int book_id){
        this.book_id = book_id;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setPrice(double price){
        if (price >= 0){
            this.price = price;
        }
        else {
            System.out.println("\nPrice cannot be negative");
        }
    }
}