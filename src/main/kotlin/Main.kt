fun main() {
    val pointA = Point(1.0, 2.0)
    val pointB = Point(4.0, 5.0)
    val lineAB = Line(pointA, pointB)

    println("Line AB length: ${lineAB.getLength()}")
    println("Slope of line AB: ${lineAB.getSlope()}")

    // Create other shape instances and test their methods
    // ...

    // Example for moving a point:
    pointA.movePoint(0.5, 1.0)
    println("New coordinates of point A: (${pointA.x}, ${pointA.y})")
}