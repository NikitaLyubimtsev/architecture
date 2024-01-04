package inMemoryModel

import modelElements.*
import java.awt.Color

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
                color = Color.CYAN
            )
        )
    ))
    var flashes = mutableListOf(
        Flash(
            power = 1.23F,
            color = Color.BLACK
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