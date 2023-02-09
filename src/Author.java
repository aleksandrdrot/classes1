public class Author {
    private String lastName;
    private String firstName;
    private String middleName;

    public Author(String lastName, String firstName, String middleName){
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
    }
    public String getLastName(){
        return this.lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getMiddleName() {
        return this.middleName;
    }
}
