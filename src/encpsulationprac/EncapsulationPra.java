package src.encpsulationprac;
/*idea behind encapsulation is to hide the implementation details from users. 
If a data member is private it means it can only be accessed within the same class. 
No outside class can access private data member (variable) of other class.*/

public class EncapsulationPra {
    private int sno;
    private String empName;
    private int empAge;

    //Getter and Setter methods
    public int getEmpSNo(){
        return sno;
    }

    public String getEmpName(){
        return empName;
    }

    public int getEmpAge(){
        return empAge;
    }

    public void setEmpAge(int newValue){
        empAge = newValue;
    }

    public void setEmpName(String newValue){
        empName = newValue;
    }

    public void setEmpSNo(int newValue){
        sno = newValue;
    }
}

