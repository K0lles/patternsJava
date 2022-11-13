package Visitor;

public class HolidayMaker extends IVisitor{
    public String places;

    @Override
    public void visit(IPlace place) {
        if (place.getClass().getSimpleName().equals("CafePlace")) {
            this.places = "Was in Cafe";
        }
        else if (place.getClass().getSimpleName().equals("ParkPlace")) {
            this.places = "Was in Park";
        }
        else if (place.getClass().getSimpleName().equals("CinemaPlace")) {
            this.places = "Was in Cinema";
        }
    }
}
