public class lesson10_stringmethods {
    public static void main(String[] args){
        String name = "         Zufarjon            ";

        int length = name.length();
        char letter = name.charAt(0);
        int index = name.indexOf("Z");
        int lastindex = name.lastIndexOf("o");

        name = name.toLowerCase();
        name = name.toUpperCase();
        name = name.trim();
        name = name.replace("Z", "A");

        System.out.println(name);
    }
}
