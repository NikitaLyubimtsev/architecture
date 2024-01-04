package inMemoryModel

import Staff.Color
import modelElements.*

class ModelStore(
    private var changedObserver: Array<IModelChangedObserver>
) : IModelChanger {

    var models = mutableListOf(PoligonalModel(listOf(Texture())))
    var scenes = mutableListOf(Scene(
        id = 1,
        models = listOf(PoligonalModel(listOf(Texture()))),
        flashes = listOf(
            Flash(
                power = 2.34F,
                color = Color()
            )
        )
    ))
    var flashes = mutableListOf(
        Flash(
            power = 1.23F,
            color = Color()
        )
    )
    var cameras = mutableListOf(Camera())

    override fun notifyChange(model: IModelChanger) {
        TODO("Not yet implemented")
    }

    fun getScene(id: Int): Scene {
        return scenes[id]
    }

}