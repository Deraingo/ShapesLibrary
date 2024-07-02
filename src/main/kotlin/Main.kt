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

    println("Triangle area: ${triangle.area}")
    println("Original points: (${point1.x}, ${point1.y}), (${point2.x}, ${point2.y}), (${point3.x}, ${point3.y})")

    triangle.moveTriangle(1.0, 1.0)
    println("New points for triangle after moving: (${point1.x}, ${point1.y}), (${point2.x}, ${point2.y}), (${point3.x}, ${point3.y})")


    pointA.movePoint(0.5, 1.0)
    println("New coordinates of point A: (${pointA.x}, ${pointA.y})")

    val centerCircle = Point(0.0, 0.0)
    val circle = Circle(centerCircle, 3.0)
    println("Circle area: ${circle.getArea()}")
    println("Circle center: (${centerCircle.x}, ${centerCircle.y})")
}