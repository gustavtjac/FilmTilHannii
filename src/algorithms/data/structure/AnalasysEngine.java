package algorithms.data.structure;

import java.util.Scanner;

public class AnalasysEngine {

    public static void Ui(){
        System.out.println("1. Se alle film");
        System.out.println("2. Vis film med længste navn");
        System.out.println("3. Søg efter film og se antal med søgeord");
        System.out.println("4. Gennemsnitslægnde");
        System.out.println("5. Vis film med max antal ord");
        System.out.println("6. Hvor mange film har vundet priser");
        System.out.println("7. Hvilket år flest priser");
    }



    public static void main(String[] args) {
        FileReader.loadFilm();
        while(true) {
            Ui();
            Scanner sc = new Scanner(System.in);
            String svar = sc.nextLine();
            switch (svar) {
                case "1":
                    FileReader.visAlleFilm();
                    break;
                case "2":
                    Movie.visLængsteNavn();
                    break;
                case "3":
                    Movie.starTrekCount();
                    break;
                case "4":
                    Movie.gennemsnitLængde();
                    break;
                case "5":
                    Movie.maxAntalOrd();
                    break;
                case "6":
                    Movie.hvorMangeHarPriser();
                    break;
                case "7":
                    Movie.hvilketÅrFlestPriser();
                    break;
            }
        }
    }
}
