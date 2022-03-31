package day32_dateTime;

import java.time.LocalDate;
import java.time.ZoneId;

public class C01_LocalDate {
    public static void main(String[] args) {
        LocalDate trh=LocalDate.now(); //objenin olusturulduguu tarihi trh 'ye atar assign eder
        LocalDate baskaTrh=LocalDate.of(1972,1,18);
        //istedigimiz yil,ay ve gun degerlerine gore bize obje olustrur

        System.out.println(trh); //2022-03-31
        //get'li methodlarla tarihle ilgili detayli bilgiler alabiliriz
        System.out.println(trh.getDayOfMonth()); //31
        System.out.println(trh.getDayOfWeek()); //THURSDAY
        System.out.println(trh.getMonthValue());//3
        System.out.println(trh.getYear()); //2022

        //bir tarihten istedgimiz kadar ileri ve geri gidebiliriz
        System.out.println(trh.minusWeeks(20)); //2021-11-11 20 hafta onceki tarih
        System.out.println(trh.minusWeeks(5).minusDays(3)); //2022-02-21    //5 hafta 3 gun once
        System.out.println(trh.plusMonths(9).plusDays(10));//v 2023-01-10

        //Istedigimiiz ulkeninn o andaki tarihini elde etmek istersek
        LocalDate trhZone=LocalDate.now(ZoneId.of("Japan"));
        System.out.println(trhZone);//2022-04-01

        //is ile baslayan methodlar boolean sonuclar dondurur
        System.out.println(LocalDate.now().isLeapYear()); //false
        System.out.println(trh.isAfter(baskaTrh));//true



            }
}
