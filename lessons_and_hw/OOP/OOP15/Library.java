public class Library {
    String name;
    int year;
    Books[] books;

    Library(String name, int year, Books[] books){
        this.name = name;
        this.year = year;
        this.books = books;
    }

    void displayinfo(){
        System.out.println(this.year + " " + this.name);
        System.out.println("Avaible Books: ");
        for(Books book : books){
            book.displayinfo();
        }
    }
}
