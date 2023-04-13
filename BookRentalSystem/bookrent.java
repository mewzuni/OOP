import java.util.Scanner;

class Book {
    String name;
    String author;
    int copy;

    public Book(String name, String author, int copy) {
        this.name = name;
        this.author = author;
        this.copy = copy;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getCopy() {
        return copy;
    }

    public void rentBook() {
        if (copy > 0) {
            System.out.println("Book Rent Succesfully!");
            System.out.println(">> " + name + " by " + author);
            copy--;
        } else {
            System.out.println(name + " Not Available");
        }
    }
}
