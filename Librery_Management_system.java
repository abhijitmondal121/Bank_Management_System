class librery{
    String[] books;
    int no_of_books;
    librery(){
        this.books=new String[100];
        this.no_of_books=0;
    }
    void addbook(String book){
        this.books[no_of_books]=book;
        no_of_books++;
        System.out.println(book + " has been addes!");
    }
    void showavalaiblebook(){
        System.out.println("*********Avalaible books are : **********");
        for(String book : this.books){
            if(book==null){
                continue;
            }
            System.out.println("* " + book);
        }
    }
    void issueBook(String book){
        for(int i=0;i<this.books.length;i++){
            if(this.books[i]==book){
                System.out.println("The book has been issued!");
                this.books[i]=null;
                return;
            }
        }
        System.out.println("This book doesnot exits!");

    }


    void returnbook(String book){
        addbook(book);
    }
}

public class Librery_Management_system {
    public static void main(String[] args) {
        librery centrallibrery=new librery();
        centrallibrery.addbook("Think and grow rich");
        centrallibrery.addbook("java");
        centrallibrery.addbook("python");
        centrallibrery.addbook("c++");
        centrallibrery.showavalaiblebook();
        centrallibrery.issueBook("java");
        centrallibrery.showavalaiblebook();
        centrallibrery.returnbook("java");
        centrallibrery.showavalaiblebook();
    }
}
