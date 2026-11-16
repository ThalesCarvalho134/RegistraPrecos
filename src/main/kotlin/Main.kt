data class ProdutoComprado(
    val produto: String,
    val preco: Double?
)

data class ProdutoUsado(
    val produto: String,
    var preco: Double
)

fun main() {
    val listaComprados =mutableListOf<ProdutoComprado>()
    val listaUsados =mutableListOf<ProdutoUsado>()

    menu(listaComprados, listaUsados)
}

fun menu(comprados: MutableList<ProdutoComprado>, usados: MutableList<ProdutoUsado>) {
    var rodando = true
    while (rodando) {
        println("Oque deseja fazer: ")
        println("1 -> Registrar produto comprado")
        println("2 -> Registrar produto usado")
        println("3 -> Listar produtos comprados")
        println("4 -> Listar produtos usados")
        println("5 -> Editar preço de um produto usado")
        println("0 -> Sair")
        var escolha = readln()
        while (escolha !in listOf("1", "2", "3", "4", "5", "0")) {
            println("Ops! opção invalida, tente novamente")
            print(":")
            escolha = readln()
        }

        when (escolha) {
            "1" -> registrarComprado(comprados)
            "2" -> registrarUsado(usados)
            "3" -> listarComprados(comprados)
            "4" -> listarUsados(usados)
            "5" -> editarUsados(usados)
            "0" -> sair()
        }
    }
}

fun registrarComprado(comprados: MutableList<ProdutoComprado>) {
    print("Digite o nome do produto comprado: ")
    val nomeProduto = readln()
    print("Digite o preço do produto comprado: R$")
    var valorProduto = readln().replace(",", ".").toDoubleOrNull()
    while (valorProduto == null) {
        print("Valor inválido! Digite apenas números: R$")
        valorProduto = readln().replace(",", ".").toDoubleOrNull()
    }
    println("---Resumo do produto---")
    println("$nomeProduto ----- R$$valorProduto")
    println("Deseja adicionar esse produto? (S/N)")
    val confirma = readln().uppercase()
    if (confirma == "S") {
        comprados.add(ProdutoComprado(nomeProduto, valorProduto))
        println("$nomeProduto foi adicionado a lista de comprados")
        println("Voltando para o inicio...")
    }
    else{
        println("$nomeProduto não foi adicionado a lista de comprados")
        println("Voltando para o inicio...")
    }
}

fun registrarUsado(usados: MutableList<ProdutoUsado>) {
    print("Digite o nome do produto usado: ")
    val nomeProduto = readln()
    print("Digite o preço do produto usado: R$")
    var valorProduto = readln().replace(",", ".").toDoubleOrNull()
    while (valorProduto == null) {
        print("Valor inválido! Digite apenas números: R$")
        valorProduto = readln().replace(",", ".").toDoubleOrNull()
    }
    println("---Resumo do produto---")
    println("$nomeProduto ----- R$$valorProduto")
    println("Deseja adicionar esse produto? (S/N)")
    val confirma = readln().uppercase()
    if (confirma == "S") {
        usados.add(ProdutoUsado(nomeProduto, valorProduto))
        println("$nomeProduto foi adicionado a lista de usados")
        println("Voltando para o inicio...")
    }
    else{
        println("$nomeProduto não foi adicionado a lista de usados")
        println("Voltando para o inicio...")
    }
}

fun listarComprados(comprados: MutableList<ProdutoComprado>) {}

fun listarUsados(usados: MutableList<ProdutoUsado>) {}

fun editarUsados(usados: MutableList<ProdutoUsado>) {}

fun sair() {

}