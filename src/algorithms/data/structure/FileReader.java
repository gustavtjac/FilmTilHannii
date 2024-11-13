package algorithms.data.structure;

import java.io.File;

import java.io.FileNotFoundException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;



public class FileReader {
public static ArrayList<Movie> film = new ArrayList<>();



public static void loadFilm(){

try{
    File filmFile = new File("C:\\Users\\Gustavo Rock\\Desktop\\skuul\\FILMANALYSE\\ressourcer\\src\\film-imdb.csv");

Scanner sc = new Scanner(filmFile);
sc.nextLine();
 while(sc.hasNextLine()){
     String movieDetails = sc.nextLine();
    String[] moveInfo = movieDetails.split(";");
film.add(new Movie(Integer.parseInt(moveInfo[0]),Integer.parseInt(moveInfo[1]),moveInfo[2],moveInfo[3],Integer.parseInt(moveInfo[4]),moveInfo[5]));

 }

  }catch(FileNotFoundException e){

System.out.println("Could not find file");

}catch (Exception e){
    e.printStackTrace();
}

 }
 public ArrayList<Movie> getFilm(){
    return film;
 }

 public static void visAlleFilm(){
    for (Movie m : film){
        System.out.println(m.filmToString());
    }
 }

 }