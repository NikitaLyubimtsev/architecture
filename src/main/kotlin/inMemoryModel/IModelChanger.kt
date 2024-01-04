package inMemoryModel

/**
 * Интерфейс смены модели
 */
interface IModelChanger {

    /**
     * Регистрация изменений
     */
    fun notifyChange(model: IModelChanger)
}