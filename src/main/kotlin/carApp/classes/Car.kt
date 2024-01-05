package carApp.classes

import carApp.enumiraters.BodyType
import carApp.enumiraters.FuelType
import carApp.enumiraters.GearBoxType
import carApp.enumiraters.Mark
import java.awt.Color

abstract class Car {
    
    protected abstract val mark: Mark
    protected abstract val model: String
    protected abstract val bodyType: BodyType
    protected abstract val numberWheels: Int
    protected abstract val fuelType: FuelType
    protected abstract val gearBoxType: GearBoxType
    protected abstract val bodyColor: Color
    protected abstract val engineCap: Float
    
    fun movement() {
        
    }
    
    fun maintenance() {
        
    }
    
    fun turnLight(): Boolean {
        return false
    }
    
    fun turnWrappers(): Boolean {
        return false
    }
}