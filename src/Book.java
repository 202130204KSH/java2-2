public class Book{
    String ti;
    String aut;

    void show() { System.out.println(ti+""+aut);}

    public Book(){
        this("","");
        System.out.println("생성자 호출됨");
    }

    public Book(String ti){
        this(ti,"작자미상");
    }
    public Book(String t,String a){
        this.ti=t;
        this.aut=a;
    }
    /*public Book(String t){
        ti=t;
        aut="작자미상";
    }
    public Book(String t,String a){
        ti=t;
        aut=a;
    }*/
    public static void main(String[]args){
        Book littlePrince = new Book("어린왕자","셰익스피어");
        Book loveStory = new Book("춘향전");
        Book emptyBook = new Book();
        loveStory.show();
       /* System.out.println(littlePrince.ti+""+littlePrince.aut);
        System.out.println(loveStory.ti+""+loveStory.aut);*/
    }
}