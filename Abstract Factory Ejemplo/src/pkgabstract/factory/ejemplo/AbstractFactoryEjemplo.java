package pkgabstract.factory.ejemplo;

public class AbstractFactoryEjemplo {

    public static void main(String[] args) {
        // Ejemplos de Shapes normales
        AbstractFactory shapeFactory = FactoryProducer.getFactory(false);
        Shape rectangle = shapeFactory.getShape("RECTANGLE");
        Shape square = shapeFactory.getShape("SQUARE");
        rectangle.draw();
        square.draw();
        
        // Ejemplos de Rounded Shapes
        AbstractFactory roundShapeFactory = FactoryProducer.getFactory(true);
        Shape roundRectangle = roundShapeFactory.getShape("RECTANGLE");
        Shape roundSquare = roundShapeFactory.getShape("SQUARE");
        roundRectangle.draw();
        roundSquare.draw();      
    }

}
