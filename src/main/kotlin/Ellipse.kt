class Ellipse(private val center: Point, private val majorRadius: Double, private val minorRadius: Double) {
    fun getArea(): Double {
        return Math.PI * majorRadius * minorRadius
    }

    fun moveEllipse(xDelta: Double, yDelta: Double) {
        center.movePoint(xDelta, yDelta)
    }
}