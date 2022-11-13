package Visitor;

public class CafePlace extends IPlace{
    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
