import rewardGenerator.fabric.*
import java.util.concurrent.ThreadLocalRandom

fun main() {

    val itemGeneratorList = listOf(
        GemGenerator(1),
        GoldGenerator(3),
        SilverGenerator(10),
        OneGenerator(10),
        TwoGenerator(10),
        ThreeGenerator(10),
        FourGenerator(10),
        FiveGenerator(10)
    )

    GeneratorQueue(itemGeneratorList, 100).getOpenRewards()

}

class GeneratorQueue(private val itemGenerators: List<ItemGenerator>, private val iteration: Int) {

    private val random = ThreadLocalRandom.current()
    private val allScales = itemGenerators.sumOf { it.scale }
    private val itemCount = itemGenerators.size
    private var counter = 0
    private var gemIteration = 0
    private var goldIteration = 0

    fun getOpenRewards() {
        while (counter < iteration) {
            counter++
            val fabric = itemGenerators[random.nextInt(itemCount)]
            when (true) {
                (fabric is GemGenerator) -> {
                    if (gemIteration == 0 || (gemIteration > 0 && counter >= (allScales / fabric.scale) + gemIteration)) {
                        gemIteration = counter
                        fabric.openReward()
                    } else {
                        counter--
                    }
                }
                (fabric is GoldGenerator) -> {
                    if (goldIteration == 0 || (goldIteration > 0 && counter >= (allScales / fabric.scale) + goldIteration)) {
                        goldIteration = counter
                        fabric.openReward()
                    } else {
                        counter--
                    }
                }
                else -> fabric.openReward()
            }
        }

    }

}

// TODO 6 Reward 10:10:10:10:10:10:3:1