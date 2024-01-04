package inMemoryModel

/**
 * Интерфейс смены наблюдателя
 */
interface IModelChangedObserver {

    fun applyUpdateModel()
}