import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class PassportDataBase {
    private static Set<Passport> passports = new HashSet<>();


    public PassportDataBase(Set<Passport> passports) {
        this.passports = passports;
    }

    public static Set<Passport> getPassports() {
        return passports;
    }

    public void setPassports(Set<Passport> passports) {
        this.passports = passports;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PassportDataBase that = (PassportDataBase) o;
        return Objects.equals(passports, that.passports);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passports);
    }

    @Override
    public String toString() {
        return "База данных - ";
    }

    public static void addPerson(Passport е) {
        if (passports.contains(е)) {
            for (Passport passport : passports) {
                if (passport.equals(е)) {
                    passport.setFirstName(е.getFirstName());
                    passport.setLastName(е.getLastName());
                    passport.setPatronymic(е.getPatronymic());
                }
            }
        } else passports.add(е);

    }

    public static void printInfoPerson(String numberPassport) {
        for (Passport passport : passports)
            if (passport.getNumberPassport().equals(numberPassport)) {
                System.out.println(passport.getFirstName() + " " + passport.getLastName() + " " + passport.getPatronymic());
                break;
            }
        }
    }

