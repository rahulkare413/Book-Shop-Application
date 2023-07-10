package application2;

import java.util.ArrayList;


public class Service {
    ArrayList<Book> bookList = new ArrayList<>();
   ArrayList<Book> recycleBin = new ArrayList<>();

    {
        bookList.add(new Book(1011 ,"THE GUIDE" ,"R.K.NARAYAN" , 550 ));
        bookList.add(new Book(1022 ,"The Vicar of Wakefield" ,"Oliver Goldsmith" , 1500 ));
        bookList.add(new Book(1033 ,"Time Machine" ,"H.G. Wells" , 2000 ));
        bookList.add(new Book(1044 ,"Adventures of Sherlock Holmes" ,"Arthur Conan Doyle" , 2500 ));
        bookList.add(new Book(1055 ,"Alice in Wonderland" ,"Lewis Carrol" , 3000 ));


    }

    public void addBook(Book b)
    {
        bookList.add(b);
    }

    public void displayBook()
    {
       for (Book b : bookList)
       {
           System.out.println(b);
        }


    }
    public void deleteBook(int id)
    {
        for (int i = 0 ; i<bookList.size() ; i++)
        {
            Book b1 = null;
            if (bookList.get(i).getBookId() == id)
            {
                b1 = bookList.get(i);
                bookList.remove(i);
                recycleBin.add(b1);
            }


        }
        System.out.println(recycleBin);
    }

    public void updatePrice(int id , double newPrice)
    { for (Book book : bookList) {
        if (book.getBookId() == id) {
            book.setBookPrice(newPrice);
            break;
        }
    }

    }
    public void restoreBook(int id)
    {
        for (int i = 0 ; i< recycleBin.size() ; i++)
        {
            Book b1 = recycleBin.get(i);
            recycleBin.remove(i);
            bookList.add(b1);
        }
    }



    }





