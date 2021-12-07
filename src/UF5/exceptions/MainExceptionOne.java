package UF5.exceptions;

import java.time.LocalDate;

public class MainExceptionOne {

    public static void main(String[] args){
        try {
            Person p = new Person("Pep", Person.Genere.HOME, LocalDate.of(2022, 10, 10));
        }catch (PersonNotBornException e) {
            e.printStackTrace();
        }
        System.out.println("fi");
    }
}
