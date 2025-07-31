import factory.ChinaFactory
import phone.apple.iPhone14

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    // for korean
    iPhone14(
        modelNumber = "A2882",
        serialNumber = "KOE113",
        storageCapacity = 128,
        mobileCarrier = null
    ).info()
}