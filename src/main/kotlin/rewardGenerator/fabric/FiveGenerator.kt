package rewardGenerator.fabric

import rewardGenerator.product.FiveReward

class FiveGenerator(override val scale: Int) : ItemGenerator() {

    override fun createItem(): IGameItem {
        return FiveReward()
    }
}