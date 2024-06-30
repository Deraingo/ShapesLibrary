class Square(point1: Point, point2: Point) : Rectangle(point1, point2) {
    init {
        require(length == width) { "Invalid square dimensions" }
    }
}