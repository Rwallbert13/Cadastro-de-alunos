public class aluno {
    public String nome, sexo, endereco, cidade, estado, nomeDoPai, nomeDaMae;
    public int CEP, rg, grauDeEscolaridade, telefone, dataDeNascimento;
    
    public static void main(String[] args) {
        aluno aluno1 = new aluno();
        aluno1.nome = "André Martins";
        aluno1.sexo = "Masculino";
        aluno1.endereco = "Rua Santo Antonio , 29 - Centro";
        aluno1.cidade = "São Paulo";
        aluno1.estado = "SP";
        aluno1.nomeDoPai = "João Martins";
        aluno1.nomeDaMae = "Maria Martins";
        aluno1.telefone = 2344565;
        aluno1.CEP = 102456827;
        aluno1.rg = 345644334;
        aluno1.dataDeNascimento = 71281;
        aluno1.grauDeEscolaridade = 2;
        
        System.out.println("Nome do aluno: "+ aluno1.nome);
        System.out.println("Sexo: "+ aluno1.sexo);
        System.out.println("Endereço: "+ aluno1.endereco);
        System.out.println("Cidade: "+ aluno1.cidade);
        System.out.println("Estado: "+ aluno1.estado);
        System.out.println("Nome do pai: "+ aluno1.nomeDoPai);
        System.out.println("Nome da mãe: "+ aluno1.nomeDaMae);
        System.out.println("Telefone: "+ aluno1.telefone);
        System.out.println("CEP: "+ aluno1.CEP);
        System.out.println("RG: "+ aluno1.rg);
        System.out.println("Data de nascimento: "+ aluno1.dataDeNascimento);
        System.out.println("Grau de escolaridade: "+ aluno1.grauDeEscolaridade);
    }
}
