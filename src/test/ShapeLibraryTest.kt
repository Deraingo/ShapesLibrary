class ShapeLibraryTest {
    @Test
    fun testRectangleArea() {
        val point1 = Point(1.0, 2.0)
        val point2 = Point(4.0, 5.0)
        val rectangle = Rectangle(point1, point2)
        assertEquals(9.0, rectangle.getArea())
    }

    @Test
    fun testTriangleArea() {
        val point1 = Point(1.0, 2.0)
        val point2 = Point(4.0, 5.0)
        val point3 = Point(2.0, 6.0)
        val triangle = Triangle(listOf(point1, point2, point3))
        assertEquals(3.0, triangle.getArea()) // Adjust expected value based on your actual triangle
    }

    fun testEllipseArea() {
        val center = Point(1.0, 1.0)
        val majorRadius = 4.0
        val minorRadius = 2.0
        val ellipse = Ellipse(center, majorRadius, minorRadius)
        assertEquals(Math.PI * majorRadius * minorRadius, ellipse.getArea())
    }

    @Test
    fun testClonePoint() {
        val point = Point(1.0, 2.0)
        val clonedPoint = point.clonePoint()
        assertEquals(point.x, clonedPoint.x)
        assertEquals(point.y, clonedPoint.y)
    }

    @Test
    fun testMovePoint() {
        val point = Point(1.0, 2.0)
        point.movePoint(3.0, 4.0)
        assertEquals(4.0, point.x)
        assertEquals(6.0, point.y)
    }

    @Test
    fun testRectangleArea() {
        val point1 = Point(1.0, 2.0)
        val point2 = Point(4.0, 5.0)
        val rectangle = Rectangle(point1, point2)
        assertEquals(9.0, rectangle.getArea())
    }

    @Test
    fun testTriangleArea() {
        val point1 = Point(1.0, 2.0)
        val point2 = Point(4.0, 5.0)
        val point3 = Point(2.0, 6.0)
        val triangle = Triangle(listOf(point1, point2, point3))
        // Adjust expected value based on your actual triangle
        assertEquals(3.0, triangle.getArea())
    }

    @Test
    fun testEllipseArea() {
        val center = Point(1.0, 1.0)
        val majorRadius = 4.0
        val minorRadius = 2.0
        val ellipse = Ellipse(center, majorRadius, minorRadius)
        assertEquals(2 * Math.PI * majorRadius * minorRadius, ellipse.getArea())
    }
}