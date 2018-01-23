/**
 * Created by User on 17.01.2018.
 */
public class Book {
    private String title;
    private String author;
    private int nrOfFiles;
    private int yearOfPublishing;
    private String editedBy;
    private boolean newBook;
    private boolean readBook;
    private int nrOfReadFiles;

    public int getNrOfReadFiles() {
        return nrOfReadFiles;
    }

    public void setNrOfReadFiles(int nrOfReadFiles) {
        this.nrOfReadFiles = nrOfReadFiles;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNrOfFiles() {
        return nrOfFiles;
    }

    public void setNrOfFiles(int nrOfFiles) {
        this.nrOfFiles = nrOfFiles;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    public String getEditedBy() {
        return editedBy;
    }

    public void setEditedBy(String editedBy) {
        this.editedBy = editedBy;
    }

    public Boolean getNewBook() {
        return newBook;
    }

    public void setNewBook(Boolean newBook) {
        this.newBook = newBook;
    }

    public Boolean getReadBook() {
        return readBook;
    }

    public void setReadBook(Boolean readBook) {
        this.readBook = readBook;
    }

    public int numberOfPagesLeft (int nrOfFiles, int nrOfReadFiles){
        int nr = nrOfFiles - nrOfReadFiles;
        return nr;
    }
}
