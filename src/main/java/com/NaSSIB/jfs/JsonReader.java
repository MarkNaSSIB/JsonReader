package com.NaSSIB.jfs;

/**
 * Hello world!
 *
 */
public class JsonReader {
  public static void main(String[] args) {

    // instantiate film objects
    Film film1 = new Film(1, "Star Wars", 121, "May 5 1977", "George Lucas");
    Film film2 = new Film(2, "Inception", 148, "July 16 2010", "Christopher Nolan");
    Film film3 = new Film(3, "Batman Begins", 140, "June 15 2005", "Christopher Nolan");
    Film film4 = new Film(4, "Raiders of the Lost Ark", 115, "June 12 1981", "George Lucas");
    Film film5 = new Film(5, "The Fault in our Stars", 126, "June 6 2014", "John Green");
    Film film6 = new Film(6, "Harry Potter and the Philosophers Stone", 152, "November 10 2001",
        "JK Rowling");
    Film film7 = new Film(7, "Star Wars: Revenge of the Sith", 140, "May 19 2005", "George Lucas");
    Film film8 = new Film(8, "Interstellar", 169, "November 5 2014", "Christopher Nolan");
    Film film9 =
        new Film(9, "Harry Potter and the Half-Blood Prince", 153, "July 15 2009", "JK Rowling");


    int status = -1;

    status = JsonMan.Write("film.json", film7);

    if (status == 1) {
      System.out.println("write success!");
    } else {
      System.out.println("write failure");
    }

    /*
     * Film filmFromFile = new Film(-1);
     * 
     * filmFromFile = JsonMan.Read("target/film.json"); if (filmFromFile.getId() != -1) {
     * System.out.println("read success!"); System.out.println(filmFromFile.toString()); } else {
     * System.out.println("read failure"); }
     */


  }
}
