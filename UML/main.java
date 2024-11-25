public class main {
	public static void main(String[] args) {
		Pessoa aluno1 = new Pessoa();
		
		aluno1.nome = "Diego";
		aluno1.idade = 18;
		aluno1.matricula = "SP3161048";
		aluno1.telefone = "11123456789";
		aluno1.nota = 9;
		
		aluno1.exibirAluno();

		Professor professor1 = new Professor();
		professor1.nome = "Wendel";
		professor1.idade = 30;
		professor1.endereco = "Rua do IFSP";
		professor1.telefone = "987654321";
		professor1.email = "wendel.professor@ifsp";
		
		professor1.exibirProfessor();
		
		Funcionário func1 = new Funcionário();
		func1.nome = "Mauro";
		func1.idade = 47;
		func1.funcao = "Segurança";
		func1.telefone = "11555777";
		func1.email = "maurosegurança@funcionario.ifsp.edu.br";
		
		func1.exibirFuncionario();

	}
}
