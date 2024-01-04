package rewardGenerator.fabric

import rewardGenerator.product.FourReward

class FourGenerator(override val scale: Int) : ItemGenerator() {

    override fun createItem(): IGameItem {
        return FourReward()
    }
}