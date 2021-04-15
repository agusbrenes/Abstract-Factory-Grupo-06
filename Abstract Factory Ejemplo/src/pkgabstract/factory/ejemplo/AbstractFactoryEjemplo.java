package pkgabstract.factory.ejemplo;

import java.util.Scanner;

public class AbstractFactoryEjemplo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which type of Figures do you wish for?\n1: Rounded\n2: Normal");
        int type = scanner.nextInt();
        boolean isRounded = (type == 1) ? true : false;
        // Ejemplos de Shapes normales
        AbstractFactory shapeFactory = FactoryProducer.getFactory(isRounded);
        Shape rectangle = shapeFactory.getShape("RECTANGLE");
        Shape square = shapeFactory.getShape("SQUARE");
        rectangle.draw();
        square.draw();
        
        // Ejemplos de Rounded Shapes
        /*AbstractFactory roundShapeFactory = FactoryProducer.getFactory(true);
        Shape roundRectangle = roundShapeFactory.getShape("RECTANGLE");
        Shape roundSquare = roundShapeFactory.getShape("SQUARE");
        roundRectangle.draw();
        roundSquare.draw();  */    
    }

}
