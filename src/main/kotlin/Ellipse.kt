
open class Ellipse(private val center: Point, private val majorRadius: Double, private val minorRadius: Double) {
    init {
        require(majorRadius > 0 && minorRadius > 0) { "Invalid ellipse: major and minor radii must be positive" }
    }

    fun getArea(): Double {
        return 2 * Math.PI * majorRadius * minorRadius
    }

    fun moveEllipse(xDelta: Double, yDelta: Double) {
        center.movePoint(xDelta, yDelta)
    }
}
