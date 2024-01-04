package modelElements

class Scene(
    var id: Int,
    var models: List<PoligonalModel>,
    var flashes: List<Flash>
) {

    fun <T> method1(t: T): T {
        return t
    }

    fun <T> method2(t1: T, t2: T): T? {
        return null
    }
}