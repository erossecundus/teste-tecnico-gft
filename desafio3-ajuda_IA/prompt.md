## prompt sugerido:
```
Contexto: estou trabalhando em um projeto backend para o setor financeiro. Há um trecho de código que processa pagamentos de clientes e salva informações no MongoDB.
Código:

public class PagamentoService
{
    private readonly string connectionString =
        // aqui vai string de conexão com usuario e senha
    public bool ProcessarPagamento(decimal valor, string cpfCliente)
    {
        if (valor > 10000)
        {
            throw new Exception("Limite excedido");
        }
        // TODO: lógica para salvar no MongoDB
        return true;
    }
}


Tarefa: identifique possíveis problemas no código, incluindo lógica de validação, tratamento de erros e interação com o banco. Sugira alterações ou implementações que permitam processar pagamentos de forma segura e correta. Explique seu raciocínio passo a passo.
```