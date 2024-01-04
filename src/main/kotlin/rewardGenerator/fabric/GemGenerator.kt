package rewardGenerator.fabric

import rewardGenerator.product.GemReward

class GemGenerator(override val scale: Int) : ItemGenerator() {

    override fun createItem(): IGameItem {
        return GemReward()
    }
}