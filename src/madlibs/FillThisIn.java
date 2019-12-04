package madlibs;

abstract class FillThisIn {
    public String name;
    public String color;
    public String randomObject;
    public String location;

    public abstract String greeting();
    public abstract String goToLocation();
    public abstract String pickUpObject();

}
