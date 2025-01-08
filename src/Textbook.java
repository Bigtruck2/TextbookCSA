public class Textbook extends Book{
    private int edition;
    public Textbook(String bookTitle, double bookPrice, int edition) {
        super(bookTitle, bookPrice);
        this.edition = edition;
    }

    @Override
    public String getBookInfo() {
        return super.getBookInfo()+"-"+edition;
    }
    public boolean canSubstituteFor(Textbook book){
        return book.getEdition()<edition &&getTitle().equals(book.getTitle());
    }
    public int getEdition() {
        return edition;
    }
}
