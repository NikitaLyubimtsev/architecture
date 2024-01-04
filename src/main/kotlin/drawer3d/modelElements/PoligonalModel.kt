package drawer3d.modelElements

import drawer3d.staff.Point3D

class PoligonalModel(
    var textures: List<Texture>
) {

    var poligons = mutableListOf(Poligon(listOf(Point3D())))

}
