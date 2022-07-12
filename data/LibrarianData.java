package library.data;

public abstract class LibrarianData {

    final private String firstName="Odilov";
    final private String lastName="Erkinjon";
    final private String birthday="2004.07.08";
    final private String gender="M";
    final private String salary="1000";
    final private String login ="123";
    final private String password="123";

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    @Override
     public String toString() {
          return "LibrarianData{" +
                  "firstName='" + firstName + '\'' +
                  ", lastName='" + lastName + '\'' +
                  ", birthday='" + birthday + '\'' +
                  ", gender='" + gender + '\'' +
                  ", salary='" + salary + '\'' +
                  '}';
     }
}
