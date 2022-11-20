import java.util.Objects;

public class Passport {
    private String numberPassport;
    private String firstName ;
    private String lastName;
    private String patronymic;

    public Passport(String numberPassport, String firstName, String lastName, String patronymic) {
        this.numberPassport = numberPassport;
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
    }

    public Passport (String numberPassport, String firstName, String lastName) {
        this (numberPassport, firstName, lastName, null);
    }

    public String getNumberPassport() {
        return numberPassport;
    }

    public void setNumberPassport(String numberPassport) {
        this.numberPassport = numberPassport;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passport passport = (Passport) o;
        return Objects.equals(numberPassport, passport.numberPassport);}


    @Override
    public int hashCode() {
        return Objects.hash(numberPassport);
    }

    @Override
    public String toString() {
        return "Паспорт" + "  " +
                "номер паспорта - " + numberPassport  + "  " +
                "Имя - " + firstName  + "  " +
                "Фамилия - " + lastName  + "  " +
                "Отчество - " + ( patronymic == null? "нет инофрмации ": patronymic )  + "\n" ;
    }


}
