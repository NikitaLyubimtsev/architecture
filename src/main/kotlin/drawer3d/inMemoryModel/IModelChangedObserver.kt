package drawer3d.inMemoryModel

/**
 * Интерфейс смены наблюдателя
 */
interface IModelChangedObserver {

    fun applyUpdateModel()
}