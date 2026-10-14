sealed class CoffeeMachineState {
    // cafetera inactiva, esperando moneda
    class E1_Idle(val timestamp: Long = System.currentTimeMillis()) : CoffeeMachineState()

    // selección de bebida (1 al 6)
    object E2_SeleccionBebida : CoffeeMachineState()

    // bebida no disponible
    data class E3_BebidaNoDisponible(val bebidaId: Int) : CoffeeMachineState()

    // selección de azúcar (Sí / No)
    data class E4_SeleccionAzucar(val bebidaId: Int) : CoffeeMachineState()

    // preparación de café sin azúcar
    data class E5_PreparacionSinAzucar(val bebidaId: Int) : CoffeeMachineState()

    // selección de cantidad de azúcar (niveles 1 a 5)
    data class E6_SeleccionCantidadAzucar(val bebidaId: Int) : CoffeeMachineState()

    // azúcar no disponible
    data class E7_AzucarNoDisponible(val bebidaId: Int) : CoffeeMachineState()

    // preparación de café con azúcar
    data class E8_PreparacionConAzucar(val bebidaId: Int, val nivelAzucar: Int) : CoffeeMachineState()

    // recoger café (estado final)
    data class E9_RecogidaCafe(val bebidaId: Int, val conAzucar: Boolean, val nivelAzucar: Int = 0) : CoffeeMachineState()
}