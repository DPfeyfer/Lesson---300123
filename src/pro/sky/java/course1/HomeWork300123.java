package pro.sky.java.course1;

public class HomeWork300123 {
    public static void main(String[] args) {
        Author anton = new Author();
        Author fedor = new Author("Fedor", "Mihaylovich", "Dostoevskiy");

        anton.setName("Anton");
        anton.setSurName("Pavlovich");
        anton.setFamilyName("Chehov");
        System.out.println(anton.getName() + " " + anton.getSurName() + " " + anton.getFamilyName());
        System.out.println();


        System.out.println("fedor.getName() = " + fedor.getName());
        System.out.println("fedor.getSurName() = " + fedor.getSurName());
        System.out.println("fedor.getFamilyName() = " + fedor.getFamilyName());
        System.out.println();

        Book kashtanka = new Book("Kashtanka", anton, 1887);
        Book idiot = new Book();
        System.out.println("kashtanka.getBookName() = " + kashtanka.getBookName());
        System.out.println("kashtanka.getAuthorName() = " + kashtanka.getAuthorName());
        System.out.println("kashtanka.getYearBook() = " + kashtanka.getYearBook());
        System.out.println();

        idiot.setYearBook(1931);
        idiot.setBookName("Idiot");
        idiot.setAuthorName(fedor);
        System.out.println("idiot.getYearBook() = " + idiot.getYearBook());
        System.out.println("idiot.getBookName() = " + idiot.getBookName());
        System.out.println("idiot.getAuthorName() = " + idiot.getAuthorName());
        System.out.println();

        System.out.println("idiot.getBookName() = " + idiot.getBookName());
        System.out.println("idiot.getAuthorName() = " + idiot.getAuthorName());
        System.out.println("idiot.getYearBook() = " + idiot.getYearBook());
    }
}
