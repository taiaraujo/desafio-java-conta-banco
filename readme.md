# Sintaxe - Desafio
> Vamos exercitar todo o conteúdo apresentado no módulo de Sintaxe codificando o seguinte cenário.

O projeto ContaBanco recebe dados via terminal contendo as características de uma conta em banco conforme os 
atributos descritos abaixo:

| Atributo	     | Tipo | Exemplo |
|---------------|:----:|--------:|
| Numero        | Inteiro	|   1021  |
| Agencia       |	Texto	|   067-8 |
| Nome Cliente	 | Texto	| MARIO ANDRADE |
| Saldo	| Decimal | 237.48 |

O projeto permite que os dados sejam inseridos via terminal sendo que o usuário receberá a mensagem de qual informação será solicitada, 
exemplo:
> "Por favor, digite o número da Agência !"
Usuário: 1021 (depois ENTER para o próximo campo)

Depois de todas as informações terem sido inseridas, o sistema exibirá a seguinte mensagem:

> "Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está disponível para saque".