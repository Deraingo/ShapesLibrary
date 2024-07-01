class Point(var x: Double, var y: Double) {
    fun clonePoint(): Point {
        return Point(x, y)
    }

    fun movePoint(xDelta: Double, yDelta: Double) {
        // Update the point coordinates
        x += xDelta
        y += yDelta
    }
}