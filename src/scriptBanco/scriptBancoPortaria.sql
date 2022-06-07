create database banco_portaria_infernal;

use banco_portaria_infernal;

create table tb_porteiro (
	id_porteiro int auto_increment,
    nome_porteiro varchar(45) not null,
    senha_porteiro varchar(45) not null,
    vida_porteiro smallint default 100,
    mana_porteiro mediumint default 0,
    dia_servico_porteiro smallint not null,
    
    primary key (id_porteiro)
);

create table tb_prestador(
	id_prestador int auto_increment,
    nome_prestador varchar(45) not null,
    cpf_prestador varchar(11) not null,
    contato_prestador varchar(10),
    
    primary key (id_prestador, nome_prestador)
);

create table tb_residente (
	id_residente int auto_increment,
    id_casa int,
    nome_residente varchar(50),
    raca_residente varchar(15),
    temperamento_residente varchar(10),
    vivo_residente bool default true,
    vida_residente smallint not null,
    fora_residente bool default true,
    
    primary key(id_residente)
);

create table tb_evento (
	id_evento int not null,
    nome_evento varchar(20),
    id_residente_evento int,
    id_prestador_evento int,
    taxa_perigo_evento tinyint,
    
    primary key (id_evento, nome_evento, id_residente_evento, id_prestador_evento),
    foreign key (id_residente_evento) references tb_residente(id_residente),
    foreign key (id_prestador_evento) references tb_prestador(id_prestador)
);

create table tb_servico(
	id_servico int auto_increment,
    tipo_servico varchar(100),
    contratante_servico varchar(50),
    data_agendada_servico date,
    data_realizada_servico date,
    nome_prestador_servico varchar(45),
    
    primary key (id_servico)
    
);

create table tb_correspondencia (
	id_correspondencia int auto_increment,
    tipo_correspondencia varchar(30),
    recebido_correspondencia datetime,
    entregador_correspondencia varchar(50),
    cpf_entregador_correspondencia varchar(11),
    
    primary key (id_correspondencia)
);

-- adicionar tabela agenda

create table tb_admin (
	id_admin int auto_increment,
    nome_admin varchar(50),
    senha_admin varchar(50),
    ativo_admin boolean,
    primary key (id_admin)
);