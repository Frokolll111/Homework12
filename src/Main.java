public class Main {


    public static void main(String[] args) {
        task1 ();
    }
    public static void task1 () {
        System.out.println("Задача 1");
        Author author1 = new Author("Энн", "Фрейзер");
        Book book1 = new Book("Найди меня",new Author(author1.getName(), author1.getSurname()),2022);
        System.out.println("Книга автора - " + book1.getTitle());
        System.out.println("Автор книги - " + book1.getAuthor().getName()+" " + book1.getAuthor().getSurname());
        System.out.println("Год издания книги - " + book1.getYear());
        book1.setYear(2023);
        System.out.println("Год переиздания книги - " + book1.getYear());
        Author author2 = new Author("Барри", "Берд");
        Book book2 = new Book("Java для чайников", new Author(author2.getName(), author2.getSurname()), 2019);
        System.out.println("Книга автора - " + book2.getTitle());
        System.out.println("Автор книги - " + book2.getAuthor().getName()+" " + book2.getAuthor().getSurname());
        System.out.println("Год издания книги - " + book2.getYear());
        book2.setYear(2020);
        System.out.println("Год переиздания книги - " + book2.getYear());
    }
}