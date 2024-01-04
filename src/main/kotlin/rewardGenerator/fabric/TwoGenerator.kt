package rewardGenerator.fabric

import rewardGenerator.product.TwoReward

class TwoGenerator(override val scale: Int) : ItemGenerator() {

    override fun createItem(): IGameItem {
        return TwoReward()
    }
}