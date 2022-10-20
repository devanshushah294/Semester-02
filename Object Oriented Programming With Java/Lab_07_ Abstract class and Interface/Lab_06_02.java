public class Lab_06_02{
    public static void main(String[] args) {
        if(args[0].equalsIgnoreCase("bookpublication")){
            Book b1 = new Book_Publication("Book_Publication");
        }
        else if(args[0].equalsIgnoreCase("paperpublication")){
            Book b1 = new Paper_Publication("Paper_publication");
        }
        b1.printTitle();

    }
}