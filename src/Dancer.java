public class Dancer extends Person{
    private String groupName;

    public Dancer(String name, String designation, String groupName) {
        super(name, designation);
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @Override
    public String toString() {
        return "Dancer{" + "Name= "+"'"+super.getName()+"'"+",Designation="+ "'"+super.getDesignation()+
                "'"+ ",groupName='" + groupName + '\'' +
                '}';
    }
    public void dancing(){
        System.out.println("Dancer loves to dancing");
    }

    @Override
    public void learn() {
        System.out.println("Dancer loves to learn new types dances");
    }

    @Override
    public void walk() {
        System.out.println("Dancer walking when he came home");
    }

    @Override
    public void eat() {
        System.out.println("Dancer eating hamburger");
    }
}
