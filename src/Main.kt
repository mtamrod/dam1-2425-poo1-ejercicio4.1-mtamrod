/*
Ejercicio 4.1
Crear una clase Rectángulo, con atributos base y altura. La clase debe disponer del constructor y los métodos para calcular el área y el perímetro. Los atributos no se podrán modificar, aunque si consultar. Por último, tendrán que ser mayor que 0.

Opcionalmente, se puede crear el méto.do toString() para mostrar información sobre el rectángulo: override fun toString() = "". (Pulsa Ctrl+o)

En el programa principal, crear varios rectángulos. Mostrarlos y mostrar por pantalla sus áreas y perímetros.
 */

class Rectangulo(val base: Float, val altura: Float) {

    init {
        require(base > 0) { "La base debe de ser mayor a 0" }
        require(altura > 0) { "La altura debe de ser mayor a 0" }
    }

    //Métod-o para calcular el perímetro del rectágulo
    fun calcularPerimetro(): Float {
        return base * 2 + altura * 2
    }

    //Métod-o para calcular el área de un rectágulo
    fun calcularArea(): Float {
        return base * altura
    }

    override fun toString(): String {
        return "Base: $base, Altura: $altura, Perímetro: ${calcularPerimetro()}, Área: ${calcularArea()})"
    }
}

fun main() {
    val rectangulo = Rectangulo(base = 7.5f, altura = 10.0f)
    val rectangulo2 = Rectangulo(base = 4.0f, altura = 10.0f)

    println("Rectángulos creados exitosamente:")
    println("------------------------------------")
    println("Rectángulo 1 --> $rectangulo")
    println("Rectángulo 2 --> $rectangulo2")
    println("------------------------------------")
}