create table aluno(
	cpf varchar(11) primary key,
	nome varchar(60),
	telefone varchar(10),
	dataNascimento date,
	dataCadastro date,
	id_turma integer references turma(id)
);

create table turma(
	id serial primary key,
	nomeProfessor varchar(60),
	tipo varchar(60),
	aula varchar(60)
);