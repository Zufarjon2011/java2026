public class OOP15_aggregation {
    public static void main(String[] args){
        /*
        Aggregation - Represents a "has-a" relationship between object.
                      One object contains another object as part of its structure,
                      but the contained object/s can exist independently.
         */
        Books book1 = new Books("The Atomic Habits", 320);
        Books book2 = new Books("Psychology of Money", 256);
        Books book3 = new Books("Rich Dad Poor Dad", 290);

        Books[] books = {book1, book2, book3};
        Library library = new Library("Library of Congress", 1800, books);

        library.displayinfo();
    }
}
