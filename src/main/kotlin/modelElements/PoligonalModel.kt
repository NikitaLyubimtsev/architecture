package modelElements

import Staff.Point3D

class PoligonalModel(
    var textures: List<Texture>
) {

    var poligons = mutableListOf(Poligon(listOf(Point3D())))

}
