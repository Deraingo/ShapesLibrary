import kotlin.math.abs
import kotlin.test.Test
import kotlin.test.assertEquals
class ShapeLibraryTest {
//    #TODO // Change tests to be less intuitive!!!
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
        val length: Double = abs(point2.y - point1.y)
        val width: Double = abs(point2.x - point1.x)
        val rectangle = Rectangle(point1, point2)
        assertEquals(length * width, rectangle.getArea())
    }

    @Test
    fun testTriangleArea() {
        val point1 = Point(1.0, 2.0)
        val point2 = Point(4.0, 5.0)
        val point3 = Point(2.0, 6.0)
        val triangle = Triangle(listOf(point1, point2, point3))
        assertEquals(4.5, triangle.getArea())
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