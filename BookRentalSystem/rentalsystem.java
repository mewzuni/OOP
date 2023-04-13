import java.util.Scanner;
public class rentalsystem {
	
    public static void main(String[] args) {
        Book[] books = {
                new Book("In Search of Lost Time", "Marcel Proust", 1),
                new Book("War and Peace", "Leo Tolstoy", 2),
                new Book("Lolita", "Vladimir Nabokov", 3)
        };

        System.out.println("Book Rental System");
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");

        for (int x = 0; x < books.length; x++) {
            System.out.println(x);
            System.out.println("Book Name: " + books[x].getName());
            System.out.println("Author: " + books[x].getAuthor());
            System.out.println();
        }

        Scanner sc = new Scanner(System.in);
        boolean end = false;

        while (!end) {
            System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
            System.out.println("Enter a Book ID to rent a book:");
            int choice = sc.nextInt();
            try {
                books[choice].rentBook();
                System.out.println("Rent Again? (Y/N)");
                String c = sc.next();
                if (c.equalsIgnoreCase("N")) {
                    end = true;
                }
            } catch (ArrayIndexOutOfBoundsException ex) {
                System.out.println("Invalid Book ID. Please Try Again");
            }
        }

        System.out.println("End");
    }
}
