package modelElements

import staff.Angle3D
import staff.Point3D

class Camera {

    lateinit var location: Point3D
    lateinit var angle: Angle3D

    fun rotate(angle3D: Angle3D) {
        angle = angle3D
    }

    fun move(point3D: Point3D) {
        location = point3D
    }
}