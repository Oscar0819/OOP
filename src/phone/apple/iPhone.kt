package phone.apple

import phone.MobileCarrier
import phone.MobilePhone
import phone.OperationSystem
import phone.Type

open class iPhone(
    override val modelName: String,
    override val modelNumber: String,
    override val serialNumber: String,
    override val type: Type,
    override val batteryCapacity: String,
    override val storageCapacity: Long,
    override val mobileCarrier: MobileCarrier?,
): MobilePhone() {
    override val manufacturer: String = APPLE
    override val os: OperationSystem = OperationSystem(OS_NAME)

    companion object {
        private const val APPLE = "Apple"
        private const val OS_NAME = "iOS"
    }
}