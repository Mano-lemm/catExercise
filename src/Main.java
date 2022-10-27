import Animal.Animal;
import Animal.Felis.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // oefening 2
        PersianCat pcat = new PersianCat("Pieter-Jan", 2, 333, 22);
        SiameseCat scat = new SiameseCat("Jerom", 3, 333, 22);
        NorwegianForestCat nwfcat = new NorwegianForestCat("Emmanuel", 4, 22, 333, "appelblauwzeegroen");
        TurkishVanCat tVanCat = new TurkishVanCat("Jonanthan", 5, 33, 2, "Jan");
        AndeanMountainCat amcat = new AndeanMountainCat("Cheddar", 99, 'b', "bald");
        PersianCat ppcat = new PersianCat("Emmanuel", 6, 1, 3);
        TurkishVanCat ttvancat = new TurkishVanCat("Amadeus", 8, 22, 321, "mozart");
        
        Felis[] cats = {pcat, scat, nwfcat, tVanCat, amcat, ppcat, ttvancat};
        System.out.println("alle katten: ");
        for (Felis felis : cats) {
            System.out.println("\t" + felis/*Impliciet gebruik van toString()*/);
        }
        System.out.println();

        // oefening 3
        // pcat en scat hebben hetzelfde shelter nummer en badge nummer
        // ppcat en pcat hebben niet dezelfe shelter nummer en badge nummer
        System.out.println("vergelijkingen tussen enkelen:");
        System.out.printf("\tPcat.equals(scat) == %B\n",pcat.equals(scat));
        System.out.printf("\tPcat.equals(ppcat) == %B\n",pcat.equals(ppcat));

        // oefening 4
        System.out.println("losse vragen:");
        System.out.printf("\tamcat(Andean Mountain Cat).isAlive() == %B\n", amcat.isAlive());
        System.out.printf("\tHet aantal dieren is %d, via Animal.getAnimalCount().\n", Animal.getAnimalCount());
        System.out.printf("\tHet aantal gevaccineerde katten is %d, via Felis.getNoOfVaccinatedCats().\n", Felis.getNoOfVaccinatedCats());
        System.out.println("\tHet aantal gevaccineerde katten is een minder omdat er exact 1 andean mountain cat is.\n");

        // BONUS
        pcat = new PersianCat("Jantje", 99, 2000, -3);
        System.out.println("pcat = new PersianCat(\"Jantje\", (age)99, (shelterNo)2000, (badgeNo)-3);");
        System.out.printf("pcat.getShelterNo() => %d \npcat.getBadgeMo() => %d\n", pcat.getShelterNo(), pcat.getBadgeNo());
    }
}
