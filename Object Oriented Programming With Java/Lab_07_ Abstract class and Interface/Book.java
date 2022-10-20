public class Book{
    private String author_name;
}
class Book_Publication extends Book{
    private String title;
    Book_Publication(String title){
        this.title = title;
        void printTitle(){
            System.out.println(this.title);
        }
    }
}
class Paper_Publication extends Book{
    private String title;
    Paper_Publication(String title){
        this.title = title;
        void printTitle(){
        System.out.println(this.title);
        }
    }

}