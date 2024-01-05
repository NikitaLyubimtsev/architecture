package carApp.classes

import carApp.enumiraters.BodyType
import carApp.enumiraters.FuelType
import carApp.enumiraters.GearBoxType
import carApp.enumiraters.Mark
import carApp.interfaces.ICaeWash
import carApp.interfaces.IFuelStation
import java.awt.Color

class Pickup(
    override val mark: Mark,
    override val model: String,
    override val numberWheels: Int,
    override val fuelType: FuelType,
    override val gearBoxType: GearBoxType,
    override val bodyColor: Color,
    override val engineCap: Float,
    private var loadCap: Int
) : Car(), IFuelStation, ICaeWash {

    override val bodyType = BodyType.PICKUP

    override fun fuel() {
        TODO("Not yet implemented")
    }

    override fun wipWindshield() {
        TODO("Not yet implemented")
    }

    override fun wipHeadlights() {
        TODO("Not yet implemented")
    }

    override fun wipMirrors() {
        TODO("Not yet implemented")
    }
}