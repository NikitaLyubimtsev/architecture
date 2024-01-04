package rewardGenerator.fabric

abstract class ItemGenerator {

    abstract val scale: Int

    abstract fun createItem():  IGameItem

    fun openReward() {
        createItem().open()
    }
}