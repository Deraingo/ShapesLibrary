class Line(val start: Point, val end: Point) {
    init {
        require(start != end) { "Invalid line: start and end points are the same" }
    }

    fun getSlope(): Double {
        return (end.y - start.y) / (end.x - start.x)
    }

    fun getLength(): Double {
        val dx = end.x - start.x
        val dy = end.y - start.y
        return Math.sqrt(dx * dx + dy * dy)
    }
}