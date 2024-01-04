package rewardGenerator.fabric

import rewardGenerator.product.ThreeReward

class ThreeGenerator(override val scale: Int) : ItemGenerator() {

    override fun createItem(): IGameItem {
        return ThreeReward()
    }
}