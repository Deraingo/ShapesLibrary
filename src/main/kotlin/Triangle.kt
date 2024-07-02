import kotlin.math.abs

class Triangle(val points: List<Point>) {
    var area: Double = calculateArea()

    private fun calculateArea(): Double {
        val x1 = points[0].x
        val y1 = points[0].y
        val x2 = points[1].x
        val y2 = points[1].y
        val x3 = points[2].x
        val y3 = points[2].y

        return 0.5 * abs((x1 * (y2 - y3)) + (x2 * (y3 - y1)) + (x3 * (y1 - y2)))
    }

    fun moveTriangle(deltaX: Double, deltaY: Double) {
        points.forEach { it.movePoint(deltaX, deltaY) }
    }
}