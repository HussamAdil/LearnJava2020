public class Capitalize {
    public static void main(String[] args) {

        StringBuilder name = new StringBuilder( "hussam");

        String firstLetter = name.substring(0,1).toUpperCase();

        System.out.println(firstLetter);

       name.deleteCharAt(0);

       name.insert(0,firstLetter);

       System.out.println(name);
    }
}
