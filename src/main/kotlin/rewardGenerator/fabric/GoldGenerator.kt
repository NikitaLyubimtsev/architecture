package rewardGenerator.fabric

import rewardGenerator.product.GoldReward

class GoldGenerator(override val scale: Int) : ItemGenerator() {

    override fun createItem(): IGameItem {
        return GoldReward()
    }
}