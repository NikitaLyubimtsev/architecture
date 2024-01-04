package rewardGenerator.fabric

import rewardGenerator.product.OneReward

class OneGenerator(override val scale: Int) : ItemGenerator() {

    override fun createItem(): IGameItem {
        return OneReward()
    }
}