package phone


enum class Type {
    BAR, FOLDABLE, SLIDER, FLIP
}

abstract class MobilePhone {
    abstract val manufacturer: String
    abstract val os: OperationSystem
    abstract val modelName: String
    abstract val modelNumber: String
    abstract val serialNumber: String
    abstract val type: Type

    abstract val batteryCapacity: String
    abstract val storageCapacity: Long

    abstract val mobileCarrier: MobileCarrier?

    fun powerOn() {
        println("power on")
    }

    fun makeCall(number: String) {
        println("Calling $number")
    }

    fun info() {
        println(
            "manufacturer=$manufacturer, " +
                    "os=$os, " +
                    "modelName=$modelName, " +
                    "modelNumber=$modelNumber, " +
                    "serialNumber=$serialNumber, " +
                    "type=$type, " +
                    "batteryCapacity=$batteryCapacity, " +
                    "storageCapacity=$storageCapacity, " +
                    "mobileCarrier=$mobileCarrier"
        )
    }
}

data class MobilePhoneInfo(
    val manufacturer: String,
    val os: OperationSystem,
    val modelName: String,
    val modelNumber: String,
    val serialNumber: String,
    val type: Type,
    val batteryCapacity: Long,
    val storageCapacity: Long,
    val mobileCarrier: MobileCarrier?,
)

class OperationSystem(val name: String) {
    // TODO
}

class MobileCarrier() {
    // TODO
    val networkGeneration: String = "AT&T"
}
