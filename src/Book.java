public class Book {
    /** 本のタイトル */
    private String title;
    /** 本の著者 */
    private String author;
    /** 本の貸出日 */
    private String loanDate;
    /** 本の返却日 */
    private String returnDate;
    /** 本の価格 */
    private int price;

    Book (String title,String author,String loanDate,String returnDate,int price){
        this.title = title;
        this.author = author;
        this.loanDate = loanDate;
        this.returnDate = returnDate;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }
    public String getAuthor(){return author;}
    public String getLoanDate() {return loanDate;}
    public String getReturnDate() {return returnDate;}
    public int getPrice(){return price;}
}