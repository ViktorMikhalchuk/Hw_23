package furniture;

public class Application {
    public static void main(String[] args) {
        FurnitureFactory chairFactory = new ChairFactory();
        Furniture chair = chairFactory.createFurniture();
        chair.assemble();

        FurnitureFactory tableFactory = new TableFactory();
        Furniture table = tableFactory.createFurniture();
        table.assemble();
    }
}
