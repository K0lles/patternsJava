package Visitor;

public class ParkPlace extends IPlace{
    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
