class ShapeLibraryTest {
    @Test
    fun testRectangleArea() {
        val point1 = Point(1.0, 2.0)
        val point2 = Point(4.0, 5.0)
        val rectangle = Rectangle(point1, point2)
        assertEquals(9.0, rectangle.getArea())
    }
}