package Exposicion

class Sets {
    private val numerosLectura = setOf(1, 2, 3)
    private val numerosLectura2 = setOf(4, 5, 6)
    private var numerosMutables = mutableSetOf(1,2,3,4,5)

    fun imprimir() {
        //Set Solo Lectura
        println("Numeros antes de mutar $numerosMutables");
        println("Tus numeros son: $numerosLectura");

        // Exposicion.Sets Mutables
        numerosMutables.add(6);
        println("Tus numeros nuevos son $numerosMutables");

        // Union Function
        println("Numeros unidos ${numerosLectura union numerosLectura2}")

    }

}

