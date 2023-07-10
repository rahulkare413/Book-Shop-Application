package application2;

import java.util.Scanner;

public class MainApp {

    static Scanner sc = new Scanner(System.in);
    static Service service = new Service();
    public static void main(String[] args) {

            for (int i = 0 ;; i++)
            {
                System.out.println("1. ADD BOOK ");
                System.out.println("2. DISPLAY BOOK ");
                System.out.println("3. DELETE BOOK ");
                System.out.println("4. UPDATE PRICE  ");
                System.out.println("5. RECYCLE BIN ");
                int ch = sc.nextInt();

                switch (ch)
                {

                    case 1 :
                        addBook();
                        break;
                    case 2 :
                        service.displayBook();
                        break;
                    case 3 :
                      deleteBook();
                        break;
                    case 4 :
                        updatePrice();
                        break;
                    case 5 :
                        restoreBook();
                        break;

                    default:
                        System.out.println("INVALID INPUT !!");

                }

            }

    }

    public static void addBook()
    {
        System.out.println("ENTER BOOK ID ");
        int id = sc.nextInt();
        System.out.println("ENTER BOOK NAME ");
        String name = sc.next();
        System.out.println("ENTER AUTHOR NAME ");
        String author = sc.next();
        System.out.println("ENTER BOOK PRICE ");
        double price = sc.nextDouble();

        Book b1 = new Book(id,name,author,price);
        service.addBook(b1);



    }
    public static void deleteBook()
    {
        System.out.println("ENTER ID ");
        int id = sc.nextInt();

        service.deleteBook(id);
    }

    public static void updatePrice()
    {
        System.out.println("ENTER THE BOOK ID ");
        int id = sc.nextInt();
        System.out.println("ENTER THE NEW PRICE ");
        double newPrice = sc.nextDouble();

        service.updatePrice(id,newPrice);
    }

    public static void restoreBook()
    {
        System.out.println("ENTER ID ");
        int id = sc.nextInt();

        service.restoreBook(id);
    }








}
