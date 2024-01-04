package drawer3d.modelElements

import drawer3d.staff.Angle3D
import drawer3d.staff.Point3D
import java.awt.Color

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