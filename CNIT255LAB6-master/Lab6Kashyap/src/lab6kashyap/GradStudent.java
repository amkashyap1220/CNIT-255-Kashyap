/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6kashyap;

/**
 *
 * @author alex
 */

public class GradStudent extends Student {
    private String ThesisTitle, AdvisorName;
    public GradStudent(String first, String middle, String last,String streetAddress, String streetAddress2,String city,String state, String zipCode,String country,String Day, String Month,String Year,String Major, String FavClass, String GraduationDate,String Hogwarts,String ThesisTitle, String AdvisorName){
        super(first,middle, last, streetAddress, streetAddress2,city,state,  zipCode, country,Day,  Month,Year, Major,  FavClass,  GraduationDate, Hogwarts);
        this.ThesisTitle = ThesisTitle;
        this.AdvisorName = AdvisorName;
    }

    /**
     * @return the ThesisTitle
     */
    public String getThesisTitle() {
        return ThesisTitle;
    }

    /**
     * @param ThesisTitle the ThesisTitle to set
     */
    public void setThesisTitle(String ThesisTitle) {
        this.ThesisTitle = ThesisTitle;
    }

    /**
     * @return the AdvisorName
     */
    public String getAdvisorName() {
        return AdvisorName;
    }

    /**
     * @param AdvisorName the AdvisorName to set
     */
    public void setAdvisorName(String AdvisorName) {
        this.AdvisorName = AdvisorName;
    }
    
}
