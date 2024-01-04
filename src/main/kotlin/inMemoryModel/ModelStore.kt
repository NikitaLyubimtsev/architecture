package inMemoryModel

import modelElements.Camera
import modelElements.Flash
import modelElements.PoligonalModel
import modelElements.Scene

class ModelStore(
    private var changedObserver: Array<IModelChangedObserver>
) : IModelChanger {

    var models = mutableListOf(PoligonalModel())
    var scenes = mutableListOf(Scene())
    var flashes = mutableListOf(Flash())
    var cameras = mutableListOf(Camera())

    override fun notifyChange(model: IModelChanger) {
        TODO("Not yet implemented")
    }

    fun getScene(id: Int): Scene {
        return scenes[id]
    }

}