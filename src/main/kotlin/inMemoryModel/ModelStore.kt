package inMemoryModel

import modelElements.*
import java.awt.Color

class ModelStore(
    private var changedObserver: Array<IModelChangedObserver>
) : IModelChanger {

    var models = mutableListOf(PoligonalModel(listOf(Texture())))
    var flashes = mutableListOf(
        Flash(
            power = 1.23F,
            color = Color.BLACK
        )
    )
    var cameras = mutableListOf(Camera())
    var scenes = mutableListOf(Scene(
        id = 1,
        models = models,
        flashes = flashes,
        cameras = cameras
    ))

    override fun notifyChange(model: IModelChanger) {
        TODO("Not yet implemented")
    }

    fun getScene(id: Int): Scene {
        return scenes[id]
    }

}