package phone.apple

import phone.MobileCarrier
import phone.Type

class iPhone14(
    override val modelNumber: String,
    override val serialNumber: String,
    override val storageCapacity: Long,
    override val mobileCarrier: MobileCarrier?,
): iPhone(
    modelName = MODEL_NAME,
    modelNumber = modelNumber,
    serialNumber = serialNumber,
    type = Type.BAR,
    batteryCapacity = BATTERY_CAPACITY,
    storageCapacity = storageCapacity,
    mobileCarrier = mobileCarrier,
) {

    companion object {
        private const val MODEL_NAME = "IPHONE17"
        private const val BATTERY_CAPACITY = "3279mAh"
    }
}