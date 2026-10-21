public class User {
    String username;
    String email;
    int age;

    //user did not fill anything    
    User(){
        this.username = "Guest";
        this.email = "Not Provided";
        this.age = 0;
    }
    //if user has only username
    User(String username){
        this.username = username;
        this.email = "Not Provided";
        this.age = 0;
    }
    //if user has everything except age
    User(String username, String email){
        this.username = username;
        this.email = email;
        this.age = 0;
    }
    //user filled everything
    User(String username, String email, int age){
        this.age = age;
        this.email = email;
        this.username = username;
    }

}
