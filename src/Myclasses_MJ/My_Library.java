package Myclasses_MJ;

class Library {

    public String[] listofbooks = new String[10];
    public int NoofBookPresent = 0;
    public int NoofBookIssued = 0;
    public String[] issuedBooks = new String[10];

    public void returnBook(String book) {

        for (int i = 0; i < NoofBookIssued; i++) {
            if (issuedBooks[i] == book) {
                listofbooks[NoofBookPresent] = book;
                NoofBookPresent++;
                for (int j = i; j < NoofBookIssued; j++) {
                    issuedBooks[j] = issuedBooks[j + 1];
                }
                NoofBookIssued--;
                break;
            } else {
                System.out.println("Book is not returned!");
                break;
            }
        }
    }

    public void addBook(String book) {
        listofbooks[NoofBookPresent] = book;
        NoofBookPresent++;
    }

    public void issueBook(String book) {
        for (int i = 0; i < NoofBookPresent; i++) {
            if (book == listofbooks[i]) {
                issuedBooks[NoofBookIssued] = book;
                NoofBookIssued++;
                System.out.println("Book is issued!");
                for (int j = i; j < NoofBookPresent; j++) {
                    listofbooks[j] = listofbooks[j + 1];

                }
                NoofBookPresent--;
                break;
            }
        }
    }

    public void removeBook(String book) {
        for (int i = 0; i < 20; i++) {
            if (book == listofbooks[i]) {
                System.out.println("Book is removed!");
                for (int j = i; j < NoofBookPresent; j++) {
                    listofbooks[j] = listofbooks[j + 1];
                }
                break;
            }
        }
        NoofBookPresent -= 1;
    }

    public void showPresentLibrary() {
        System.out.println("show present library status");
        System.out.println("NO of book present " + NoofBookPresent);
        System.out.println("No of book issued " + NoofBookIssued);
        System.out.println("List of book present");
        for (int i = 0; i < NoofBookPresent; i++) {

            System.out.println(listofbooks[i]);
        }
        System.out.println("List of Books Issued from the Library:");
        int i;
        for (i = 0; i < NoofBookIssued; i++) {
            System.out.println(issuedBooks[i]);
        }
        System.out.println("------------------------------------------------- \n");
    }
}

public class My_Library {
    public static void main(String[] args) {
        Library L = new Library();
        L.showPresentLibrary();
        L.addBook("Phuyr");
        L.showPresentLibrary();
        L.addBook("cHemistry");
        L.showPresentLibrary();
        L.removeBook("cHemistry");
        L.showPresentLibrary();
        L.issueBook("Phuyr");
        L.showPresentLibrary();
        L.returnBook("Phuyr");
        L.showPresentLibrary();
    }
}
