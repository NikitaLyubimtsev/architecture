package drawer3d.inMemoryModel

/**
 * Интерфейс смены модели
 */
interface IModelChanger {

    /**
     * Регистрация изменений
     */
    fun notifyChange(model: IModelChanger)
}