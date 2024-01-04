package modelElements

import Staff.Angle3D
import Staff.Color
import Staff.Point3D

class Flash(
    var power: Float,
    var color: Color
) {

    lateinit var location: Point3D
    lateinit var angle: Angle3D


    fun rotate(angle3D: Angle3D) {
        angle = angle3D
    }

    fun move(point3D: Point3D) {
        location = point3D
    }
}