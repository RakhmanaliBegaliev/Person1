public class Programmer extends Person{
    private String companyName;

    public Programmer(String name, String designation, String companyName) {
        super(name, designation);
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return "Programmer{"+"Name="+"'"+super.getName()+"',"+" Designation="+"'"+super.getDesignation()+"',"+
                "companyName='" + companyName + '\'' +
                '}';
    }

    public void codding(){
        System.out.println("Programmer loves codding, when he do new project");
    }
    @Override
    public void learn() {
        System.out.println("Programmer learning new languages of codding");
    }

    @Override
    public void walk() {
        System.out.println("Programmer walking when he have free time");
    }

    @Override
    public void eat() {
        System.out.println("Programmer eating pizza when he hungry");
    }
}

