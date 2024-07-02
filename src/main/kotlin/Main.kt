fun main() {
    val pointA = Point(1.0, 2.0)
    val pointB = Point(4.0, 5.0)
    val lineAB = Line(pointA, pointB)

    val point1 = Point(1.0, 2.0)
    val point2 = Point(4.0, 5.0)
    val point3 = Point(2.0, 6.0)
    val triangle = Triangle(listOf(point1, point2, point3))

    println("Line AB length: ${lineAB.getLength()}")
    println("Slope of line AB: ${lineAB.getSlope()}")

    println("Triangle area: ${triangle.getArea()}")
    println("Original points: (${point1.x}, ${point1.y}), (${point2.x}, ${point2.y}), (${point3.x}, ${point3.y})")

    triangle.moveTriangle(1.0, 1.0)
    println("New points for triangle after moving: (${point1.x}, ${point1.y}), (${point2.x}, ${point2.y}), (${point3.x}, ${point3.y})")


    pointA.movePoint(0.5, 1.0)
    println("New coordinates of point A: (${pointA.x}, ${pointA.y})")

    val centerCircle = Point(0.0, 0.0)
    val circle = Circle(centerCircle, 3.0)
    println("Circle area: ${circle.getArea()}")
    println("Circle center: (${centerCircle.x}, ${centerCircle.y})")
    circle.moveEllipse(1.0, -0.5)

    println("New center of circle after moving: (${centerCircle .x}, ${centerCircle .y})")

    val centerEllipse = Point(2.0, 3.0)
    val majorRadius = 5.0
    val minorRadius = 3.0
    val ellipse = Ellipse(centerEllipse, majorRadius, minorRadius)

    println("Ellipse area: ${ellipse.getArea()}")
    println("Original center of ellipse: (${centerEllipse.x}, ${centerEllipse.y})")

    ellipse.moveEllipse(1.0, -0.5)

    println("New center of ellipse after moving: (${centerEllipse.x}, ${centerEllipse.y})")

    val rectanglePoint1 = Point(1.0, 2.0)
    val rectanglePoint2 = Point(4.0, 5.0)
    val rectangle = Rectangle(rectanglePoint1, rectanglePoint2)

    println("Rectangle area: ${rectangle.getArea()}")
    rectangle.moveRectangle(1.0, 1.0)
    println("New points for rectangle after moving: (${rectanglePoint1.x}, ${rectanglePoint1.y}), (${rectanglePoint2.x}, ${rectanglePoint2.y})")
}