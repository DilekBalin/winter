package day32_dateTime;

import java.time.LocalDateTime;

public class C03_LocalDateTime {
    public static void main(String[] args) {
         LocalDateTime tarihSaat=LocalDateTime.now();
        System.out.println(tarihSaat); //2022-03-31T20:35:42.557974600

        System.out.println(tarihSaat.plusYears(3).plusMonths(2).plusDays(10).plusHours(5).plusMinutes(5));
        //2025-06-11T01:42:31.057661700


    }
}
