package lab6kashyap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alex
 */
public class Student extends Person{
    private String Major,Favclass, GraduationDate, Hogwarts;
    
    public Student(String first, String middle, String last,String streetAddress, String streetAddress2,String city,String state, String zipCode,String country,String Day,String Month, String Year,String Major, String FavClass, String GraduationDate,String Hogwarts){
        super(first, middle, last, streetAddress, streetAddress2, city, state, zipCode,country,Day,Month,Year);
        this.Major = Major;
        this.Favclass = FavClass;
        this.GraduationDate = GraduationDate;
        this.Hogwarts = Hogwarts;
    }

    /**
     * @return the Major
     */
    public String getMajor() {
        return Major;
    }

    /**
     * @param Major the Major to set
     */
    public void setMajor(String Major) {
        this.Major = Major;
    }

    /**
     * @return the Favclass
     */
    public String getFavclass() {
        return Favclass;
    }

    /**
     * @param Favclass the Favclass to set
     */
    public void setFavclass(String Favclass) {
        this.Favclass = Favclass;
    }

    /**
     * @return the GraduationDate
     */
    public String getGraduationDate() {
        return GraduationDate;
    }

    /**
     * @param GraduationDate the GraduationDate to set
     */
    public void setGraduationDate(String GraduationDate) {
        this.GraduationDate = GraduationDate;
    }

    /**
     * @return the Hogwarts
     */
    public String getHogwarts() {
        return Hogwarts;
    }

    /**
     * @param Hogwarts the Hogwarts to set
     */
    public void setHogwarts(String Hogwarts) {
        this.Hogwarts = Hogwarts;
    }
    
}
