fun main() {


    val nome: String = "Marcio"
    val idade: Int = 24
    val salarioBrutoMensal: Double = 3000.0
    val mesesTrabalhados: Int = 12
    val quantidadeProdutosComprados: Int = 10



    val salarioAnualBruto = salarioBrutoMensal * mesesTrabalhados
    val desconto: Double = 6000.0
    val salarioAnualLiquido = salarioAnualBruto - desconto
    val mensagem = "Funcionário: $nome, Salário Anual Líquido: R$$salarioAnualLiquido"


    println("Nome: $nome")
    println("Idade: $idade")
    println("Salário Bruto Mensal: R$$salarioBrutoMensal")
    println("Meses Trabalhados: $mesesTrabalhados")
    println("Quantidade de Produtos Comprados: $quantidadeProdutosComprados")
    println("Salário Anual Bruto: R$$salarioAnualBruto")
    println("Salário Anual Líquido: R$$salarioAnualLiquido")
    println(mensagem)

}