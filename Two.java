public class Two {

    public static void main(String[] args) {
        String title = "greetings, humans";

        try {
            System.out.println("[" + (title.length() <= 10 ? title : title.substring(0, 7) + "...") + "]");
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e);
        }

    }

}