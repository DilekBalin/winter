package day34_deneme;

import day34_AccessModifier_encapsulation.C01;

public class DenemeChild extends C01 { //extends yapinca ulasabildik
    public static void main(String[] args) {
        System.out.println(halkaAcikSayi);
        halkaAcikSayi=30;
        C01.aileyeOzel=25;  //static oldugu icin protected oldugu halde baska bir class'tan obje ismiyle ulastim


    }

    }

