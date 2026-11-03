public class Books {
    String title;
    int page;

    Books(String title, int page){
        this.title = title;
        this.page = page;
    }

    void displayinfo(){
        System.out.println(this.title + " (" + this.page + " pages)");
    }
}
