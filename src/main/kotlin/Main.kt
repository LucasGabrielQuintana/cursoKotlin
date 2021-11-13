import java.lang.Exception
import java.lang.NullPointerException

const val PI = 3.1416

fun main(args: Array<String>) {
    println("Hello World!")

    var dinero = 10
    println(dinero)
    dinero = 5
    println(dinero)

    println(PI)

    var boolean = true
    var numeroLargo = 3L
    var double  = 2.7182
    val float  = 1.1f

    val primerValor = 20
    val segundoValor = 10
    val tercerValor = primerValor - segundoValor
    println(tercerValor)

    val apellido = "Quintana"
    val lucas = "Lucas"
    val nombreCompleto = "Mi nombre es $lucas y mi apellido $apellido"
    println(nombreCompleto)

    val nombre: String = ""

    if(nombre.isNotEmpty()){

        println("El largo de nuestra variable nombre es ${nombre.length}")
    }else{
        println("Error, la variable está vacía")
    }

    val mensaje : String = if (nombre.length > 4 ){
        "Tu nombre es largo!"
    }else (if(nombre.isEmpty()) {
        "tienes nombre vacio"
    }else{
        ("Tu nombre es corto")
    }) as String
    println(mensaje)

    val nombreColor = "Camersí"

    when (nombreColor ){
        "Amarillo" -> {
            println("Amarillo color de la alegria")
        }
        "Rojo","Camersí" -> {
            println("Rojo simboliza el calor")
        }
        else -> {
            println("Error. No tengo información del color")
        }
    }

    val code = 200
    when (code){
        in 200..299-> println("Todo ha ido bien")
        in 400..500-> println("Algo ha fallado")
        else -> println("Codigo desconocido, algo ha fallado")
    }

    val tallaDeZapatos = 45

    val mensajeZapato = when(tallaDeZapatos){
        41,43 -> "Tenemos disponibles"
        42,44 -> "Casi no nos quedan"
        45 -> "Lo siento no hay disponible"
        else -> "Solo del 41 al 45"
    }
    println(mensajeZapato)

    var contador = 10

    while (contador > 0){
        println("El contador es $contador")
        contador--
    }

    do {
        println("Generando numero Aleatorio")
        var numeroAleatorio = (1..3).random()
        println("El numero generado es $numeroAleatorio")
    }while(numeroAleatorio!=2)

    val listaDeFrutas = listOf("Manzana", "Pera", "Frambuesa", "Durazno")
    for (fruta in listaDeFrutas){
        println("Hoy voy a comerme una fruta llamada $fruta")
    }
    listaDeFrutas.forEach { fruta ->println("Hoy voy a comerme una fruta nueva y esta es a $fruta") }

    val caracteresDeFruta: List<Int> = listaDeFrutas.map { fruta -> fruta.length }
    println(caracteresDeFruta)

    val listaFiltrada = caracteresDeFruta.filter {largoDeFruta -> largoDeFruta > 5}
    println(listaFiltrada)

    var nombreN : String? = null
    println(nombreN?.length)//Escribe el valor null
    try {
        throw NullPointerException("Referencia Nula")
    }catch(execpcion : NullPointerException){
        println("Ha ocurrido un error")
    }finally {
        println("Finalmente ha ocurrido un error.. cerrando aplicacion")
    }

    val primeroValor  = 10
    val segundovalor = 0
    val resultado = try {
        primeroValor/segundovalor
    }catch (excepcion : Exception) {
        0
    }

    println(resultado)

    var nombreNulo : String? = null
    val caracteresDeNombreNulo : Int = nombreNulo?.length ?: 0
    println(caracteresDeNombreNulo)

    val listaDeNombres = listOf("Juan", "Enrique", "Camila")
    println(listaDeNombres)

    val listaVacia = mutableListOf<String>()
    println(listaVacia)
    listaVacia.add("Lucas")
    println(listaVacia)

    val valorUsandoGet = listaVacia.get(0)
    println(valorUsandoGet)

    val valorUsandoOperador = listaVacia[0]
    println(valorUsandoOperador)

    val primeroDeLaLista = listaDeNombres.first()
    println(primeroDeLaLista)
    listaVacia.removeAt(0)
    val esvacio = listaVacia.firstOrNull();
    println(esvacio)
    println(listaVacia)

    val myArray = arrayOf(1,2,3,4,5)
    println("Mi array $myArray")
    println("Array como lista ${myArray.toList()}")

    val numerosDeLoteria = listOf(11,22,43,56,78,66)
    println(numerosDeLoteria)
    val numerosSorted = numerosDeLoteria.sorted()

    println(numerosSorted)
    var numerosDeLoteriaDescendiente = numerosDeLoteria.sortedDescending()
    println(numerosDeLoteriaDescendiente)

    val ordenarPorMultiplos = numerosDeLoteria.sortedBy{ numero -> numero < 50 }
    println(ordenarPorMultiplos)

    val numeroAleatorio = numerosDeLoteria.shuffled()
    println(numeroAleatorio)

    val numerosEnReversa = numerosDeLoteria.reversed()
    println(numerosEnReversa)

    val mensajesDeNumeros = numerosDeLoteria.map{ numero -> "Tu numero de loteria es $numero" }
    println(mensajesDeNumeros)

    val numerosFiltrados  = numerosDeLoteria.filter { numero -> numero > 45 }
    println(numerosFiltrados)

    ////////////////MAPS///////////////////////
    val edadesDeSuperHeroes = mapOf(
        "IronMan" to 35,
        "Spiderman" to 23,
        "Capitan America" to 99,
    )
    println(edadesDeSuperHeroes)

    val edaddeSuperoHeroesMutable = mutableMapOf(
        "Ironman" to 35,
        "Spiderman" to 23,
        "Capitan America" to 99,
    )
    println(edaddeSuperoHeroesMutable)

    edaddeSuperoHeroesMutable.put("Wolverine", 45)
    println(edaddeSuperoHeroesMutable)
    edaddeSuperoHeroesMutable["Storm"] = 30
    println(edaddeSuperoHeroesMutable)
    val edadIronman = edaddeSuperoHeroesMutable["Ironman"]
    println(edadIronman)
    edaddeSuperoHeroesMutable.remove("Wolverine")
    println(edaddeSuperoHeroesMutable)

    println(edaddeSuperoHeroesMutable.keys)
    println(edaddeSuperoHeroesMutable.values)

    //////////////SETS////////////////////
    val vocalesRepetidas = setOf("a", "e", "i", "o", "u","a","e","i","o","u")
    println(vocalesRepetidas)

    val numerosFavoritos = mutableSetOf(1,2,3,4)
    println(numerosFavoritos)
    numerosFavoritos.add(5)
    println(numerosFavoritos)
    numerosFavoritos.add(5)
    println(numerosFavoritos)

    numerosFavoritos.remove(5)
    println(numerosFavoritos)

    val valorDelSet : Int? = numerosFavoritos.firstOrNull{numero -> numero > 2}
    println(valorDelSet)

    val fraseAleatoria = "En platzi nunca paramos de aprender".randomCase()
    val fraseOrdenadaAleatoriamente = (fraseAleatoria)
    println(fraseOrdenadaAleatoriamente)
    println((fraseAleatoria))
    imprimirFrase(fraseAleatoria)

    imprimirNombre(nombre="Lucas", apellido="Quintana")

    ///////LAMBDA//////////////

    val myLambda : (String) -> Int = {
        valor -> valor.length

    }
    val lambdaEjecutada = myLambda("Hola como te va")
    println(lambdaEjecutada)

    val saludos = listOf("Hello","Hola","Ciao")
    val longitudDeSaludos = saludos.map(myLambda)

    val largoDeValorIniciar = superFuncion(valorInicial = "hola", block= {
        valor -> valor.length
    })
    println(largoDeValorIniciar)

    val lambda: () -> String = funcionInception("Lucas")
    val valorLamda = lambda()
    println(valorLamda)

    var nombreNuloDos : String? = null
    nombreNuloDos = "Lucas"

    nombreNuloDos?.let {
        valorN -> println("El nombre no es nulo, es $valorN")
    }

    val colores = listOf("Azul", "Amarillo", "rojo")
    with(colores){
        println("Nuestros colores son $this")
        println("Esta lista tiene una cantidad de colores de $size")
    }

    val moviles = mutableListOf("Google Pixel 2XL", "Google Pixel 4a", "Huawei Redmi 9", "Xiaomi mia3")
        .run{
            removeIf{ movil -> movil.contains("Google")}
            this
        }
    println(moviles)
    val movilesApply = mutableListOf("Google Pixel 2XL", "Google Pixel 4a", "Huawei Redmi 9", "Xiaomi mia3").apply {
        removeIf{ movil -> movil.contains("Google") }
    }
    println(movilesApply)

    val coloresApply : MutableList<String>? = mutableListOf("Amarillo")
    coloresApply?.apply {
        println("Nuestros colores son $this")
        println("La cantidad de colores es $size")
    }

    val movilesAlso = mutableListOf("Google Pixel 2XL", "Google Pixel 4a", "Huawei Redmi 9", "Xiaomi mia3").also{
        lista -> println("El valor original de la lista es $lista")
    }.asReversed()
    println(movilesAlso)

    


}
//////FUNCIONES/////////
///SE DEBEN CREAR FUERA DE LA FUNCION MAIN Y LLAMARSE DENTRO DE ESTA////////////


fun String.randomCase(): String {
    val numeroAleatorio = 0..99
    val resultadoAleatorio = numeroAleatorio.random()
    return if(resultadoAleatorio.rem(2)==0){
        this.toUpperCase()
    }else{
        this.toLowerCase()
    }
}

fun imprimirFrase(frase : String ) : Unit {
    println("Tu frase es: $frase")
}

fun imprimirNombre(nombre: String,segundoNombre : String ="", apellido: String){
    println("Mi nombre es $nombre $segundoNombre $apellido")
}

fun superFuncion(valorInicial : String, block : (String) -> Int) : Int{
    return block(valorInicial)
}

fun funcionInception(nombre : String) : () -> String{
    return {
        "Hola desde la lambda $nombre"
    }
}