package rewardGenerator.fabric

import rewardGenerator.product.SilverReward

class SilverGenerator(override val scale: Int) : ItemGenerator() {

    override fun createItem(): IGameItem {
        return SilverReward()
    }
}