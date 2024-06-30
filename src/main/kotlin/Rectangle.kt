class Rectangle(val point1: Point, val point2: Point) {
    val length: Double = Math.abs(point2.y - point1.y)
    val width: Double = Math.abs(point2.x - point1.x)

    fun getArea(): Double {
        return length * width
    }

    fun moveRectangle(xDelta: Double, yDelta: Double) {
        point1.movePoint(xDelta, yDelta)
        point2.movePoint(xDelta, yDelta)
    }
}
