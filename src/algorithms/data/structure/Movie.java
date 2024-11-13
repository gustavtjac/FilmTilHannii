package algorithms.data.structure;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Movie {
    int Year;
    int Length;
   String Title;
    String Subject;
    int Popularity;
    String Awards;
    public Movie(int Year, int Length, String Title, String Subject, int Popularity, String Awards) {
        this.Year = Year;
        this.Length = Length;
        this.Title = Title;
        this.Subject = Subject;
        this.Popularity = Popularity;
        this.Awards = Awards;
    }
    public String filmToString(){
        return this.Title +" "+ this.Year +" "+ this.Length +" "+ this.Subject +" "+ this.Popularity +" "+ this.Awards;
    }

    public String getTitle() {
        return this.Title;
    }

    public static void visLængsteNavn(){
        String længsteNavn = "";
        for (Movie m : FileReader.film){
            if (m.getTitle().length()>længsteNavn.length()){
                længsteNavn = m.getTitle();
            }
        }
        System.out.println("Filmen med det længste navn er: " + længsteNavn + " med hele "+ længsteNavn.length()+ " tegn i lægnde");

    }
    public static void starTrekCount(){
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Skriv dit søgeord");
        String tempSvar = sc.nextLine();
        String pcSvar = "";

        for (Movie m : FileReader.film){
            pcSvar = m.getTitle().toLowerCase();
            if(pcSvar.contains(tempSvar)){
                System.out.println(m.getTitle());
                count++;
            }
        }
        System.out.println("Der blev fundet: " + count + " film fra søgeordet: "+ tempSvar);
    }
    public static void gennemsnitLængde(){
int længde = 0;
for (Movie m : FileReader.film){
    længde += m.getLength();
}
        System.out.println("Alle filmene varer tilsammen: "+ længde + " Minutter");
        System.out.println("Der er i alt " + FileReader.film.size() + " film");
        System.out.println("Gennemsnitslængden er: " + længde/FileReader.film.size() + " Minutter");
        System.out.println("____________________________________________________________________________");
    }

    public static void maxAntalOrd(){
        int antal = 0;
        String maxTitel = "";
        for (Movie m : FileReader.film){
            String[] splitNavn = m.getTitle().split(" ");
            if (splitNavn.length>antal){
                antal = splitNavn.length;
                maxTitel = m.getTitle();
            }
        }
        System.out.println("Filmen med flest ord i er " + maxTitel + " med hele " + antal + " ord");
    }
    public static void hvorMangeHarPriser(){
        int count = 0;
        for (Movie m : FileReader.film){

            if (m.getAwards().equalsIgnoreCase("yes")){
                count++;
            }

        }
        System.out.println("Ud af listen har " + count + " film vundet priser");
        System.out.println("______________________________________________________");
    }
    public static void hvilketÅrFlestPriser(){
        Map<Integer, Integer> awardsTæller = new HashMap<>();
        for (Movie m : FileReader.film){
            if (m.getAwards().equalsIgnoreCase("yes")){
awardsTæller.put(m.getYear(), awardsTæller.getOrDefault(m.getYear(), 0) + 1);
            }
        }
        int maxYear = -100;
        int maxAwards = 0;
        for (Map.Entry<Integer, Integer> entry : awardsTæller.entrySet()) {
            if (entry.getValue() > maxAwards) {
                maxAwards = entry.getValue();
                maxYear = entry.getKey();
            }
        }
        System.out.println("Året med flest awards er: " + maxYear + " Med hele " + maxAwards + " awards");
    }
public String getAwards(){
        return Awards;
}
public int getLength() {
        return this.Length;
}
public int getYear() {
        return this.Year;
}

}