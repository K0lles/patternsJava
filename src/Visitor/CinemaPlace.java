package Visitor;

public class CinemaPlace extends IPlace{
    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
