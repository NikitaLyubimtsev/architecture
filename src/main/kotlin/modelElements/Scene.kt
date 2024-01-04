package modelElements

class Scene(
    var id: Int,
    var models: List<PoligonalModel>,
    var flashes: List<Flash>,
    var cameras: List<Camera>
) {

    init {
        require(models.isNotEmpty() || cameras.isNotEmpty()) { "At least one of the lists (models, cameras) must be non-empty." }
    }

    fun <T> method1(t: T): T {
        return t
    }

    fun <T> method2(t1: T, t2: T): T? {
        return null
    }
}