package date;
import date.util.*;
import date.*;

public class DateMain{
    public static void main(String[] args) {

        System.out.println("beginning of main from date.DateMain");   
        Date date1 = new Date(8,Month.JANUARY,1995);
        System.out.println("Salah est née le "+date1);
        Date date2 = new Date(16,Month.FEBRUARY,2020);
        System.out.println("Nous supposons être le "+date2);
        System.out.println("Somme nous le jour de sa naissance? La réponse est "+date1.equals(date2));
        System.out.println("Depuis combien de jours est il donc sur terre ? Il est sur terre depuis "+date1.diffInDays(date2));
        System.out.println("Dans 666 jours nous serons le "+date2.daysLater(666));
        System.out.println("end of main from date.DateMain");
    }
}