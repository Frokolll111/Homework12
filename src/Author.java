public class Author {
    private final String name;
    private final String Surname;

    public Author(String name, String surname){
        this.name = name;
        this.Surname = surname;
    }

    public String getName (){
        return name;
    }

    public String getSurname () {
        return Surname;
    }
}
