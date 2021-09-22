package academy.learnprogramming.classstructure;

public class DataEncapsulation {

    public static void main(String[] args) {
        Company company  = new Company();
        company.setName("MyCompany");
        company.addEmployee("John");
        company.addEmployee("Anthony");
        company.addEmployee(null);
        company.setName(null);
        company.setName("");

        company.printSorted();


    }
}
