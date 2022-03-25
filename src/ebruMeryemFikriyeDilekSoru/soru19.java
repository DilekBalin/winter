package ebruMeryemFikriyeDilekSoru;

public class soru19 {
    public static void main(String[] args) {
        //Kullanicidan gun ismini alip haftaici veya hafta sonu yazdiralim


        String gunAdi= "pazartesi";
        switch(gunAdi){
            case "pazartesi":
            case "sali":
            case"carsamba":
            case "persembe":
            case"cuma":
                System.out.println("hafta ici");break;
            case "cumartesi":
            case "pazar":
                System.out.println("hatta sonu");break;
            default:
                System.out.println("hatali gun girdiniz");





        }



    }
}
