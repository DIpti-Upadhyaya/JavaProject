package src.encpsulationprac;

public class EncapsTest {
    public static void main(String args[]) {
        EncapsulationPra obj = new EncapsulationPra();
        obj.setEmpName("Dipti");
        obj.setEmpAge(50);
        obj.setEmpSNo(112233);
        System.out.println("Employee Name: " + obj.getEmpName());
        System.out.println("Employee SNo: " + obj.getEmpSNo());
        System.out.println("Employee Age: " + obj.getEmpAge());
    }
}
