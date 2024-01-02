package furniture;

public class TableFactory implements FurnitureFactory{
    @Override
    public Furniture createFurniture() {
        return new Table();
    }
}
