# RegistraPreços

Aplicação de console desenvolvida em **Kotlin** para cadastro, listagem e atualização de preços de produtos comprados e usados, focada em boas práticas de arquitetura limpa, tipagem segura e validação de entradas no terminal.

## Funcionalidades

* **Registro de Produtos Comprados:** Cadastro de itens com preço imutável (`val`) e confirmação antes de salvar.
* **Registro de Produtos Usados:** Cadastro de itens com preço editável (`var`) e confirmação antes de salvar.
* **Listagem Organizada:** Exibição numerada a partir de `1` para facilitar a leitura e seleção de itens, com formatação monetária de duas casas decimais (`0.00`).
* **Edição por Índice:** Alteração segura do preço de produtos usados com validação de intervalo e feedback visual imediato.
* **Validação de Entradas:** Tratamento contra entradas nulas, textos em campos numéricos, valores negativos, opções inválidas no menu e suporte tanto para vírgula (`,`) quanto para ponto (`.`) nos valores decimais.

## Tecnologias e Conceitos Aplicados

* **Linguagem:** Kotlin
* **Estruturas de Dados:** `data class` (`ProdutoComprado` e `ProdutoUsado`) e listas mutáveis (`MutableList`) passadas por parâmetro (sem uso de variáveis globais).
* **Controle de Fluxo & Segurança:** Loops `while`, expressões `when`, *null-safety* com `toIntOrNull()` / `toDoubleOrNull()`, *smart casts*, formatação com `String.format(Locale.US, "%.2f", ...)` e manipulação de índices (`index + 1` na exibição e `escolha - 1` no acesso).

## Como Executar

1. Clone este repositório:
   ```bash
   git clone [https://github.com/seu-usuario/RegistraPrecos.git](https://github.com/seu-usuario/RegistraPrecos.git)
   ```
2. Abra o projeto no **IntelliJ IDEA** (ou outra IDE com suporte a Kotlin).
3. Localize o arquivo principal (`Main.kt`) e execute a função `main()`.
4. Utilize as opções numéricas (`0` a `5`) no console para navegar pelo menu.

## Menu da Aplicação

```text
O que deseja fazer:
1 -> Registrar produto comprado
2 -> Registrar produto usado
3 -> Listar produtos comprados
4 -> Listar produtos usados
5 -> Editar preço de um produto usado
0 -> Sair
```

## Autor

Desenvolvido por **Thales Alexandre** como projeto prático de estudos em lógica de programação e desenvolvimento backend com Kotlin.
