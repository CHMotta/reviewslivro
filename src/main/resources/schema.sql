create table if not exists usuario(
	id bigserial primary key,
	nome varchar (50) not null,
	senha varchar(50) not null,
	perfil varchar (30) not null,
	bio varchar (256) not null
)

create table if not exists livro(
	id bigserial primary key,
	titulo varchar (256) not null,
	subtitulo VARcHAR (255),
	autor varchar (256) not null,
	thumbnail varchar (256),
	sinopse varchar (256) not null,
	genero varchar (50) not null,
	statusSugestao varchar (30) not null 
)


create table if not exists review(
	id bigserial primary key,
	conteudo varchar(256) not null,
	nota numeric not null,
	livro_id BIGINT NOT NULL,
		CONSTRAINT fk_livro
		FOREIGN KEY (livro_id)
		REFERENCES livro(id)
	usuario_id BIGINT NOT NULL,
		CONSTRAINT fk_usuario
		FOREIGN KEY (usuario_id)
		REFERENCES usuario(id)
)
