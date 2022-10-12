public class Singer extends Person{
    private String bandName;

    public Singer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName = bandName;
    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    @Override
    public String toString() {
        return "Singer{" +"Name="+"'"+super.getName()+"',"+"Designation="+"'"+super.getDesignation()+"',"+
                "bandName='" + bandName + '\'' +
                '}';
    }
    public void singning(){
        System.out.println("singing for a singer is his job ");
    }
    public void playGitar(){
        System.out.println("I think every singer can plan gitar");
    }

    @Override
    public void learn() {
        System.out.println("Singer loves to learn plan in a new music instrument");;
    }

    @Override
    public void walk() {
        System.out.println("Singer walking after his concert");;
    }

    @Override
    public void eat() {
        super.eat();
    }
}
