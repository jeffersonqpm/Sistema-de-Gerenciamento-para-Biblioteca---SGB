package MySQL;

////problema no XAMP: https://www.youtube.com/watch?v=XH8wOgkSukk
//
//
////===========================================================================
//
//CREATE DATABASE `biblioteca` /*!40100 COLLATE 'utf8mb4_general_ci' */
//CREATE TABLE `autor` (
//	`idautor` INT(11) NOT NULL AUTO_INCREMENT,
//	`nome` VARCHAR(100) NULL DEFAULT NULL COLLATE 'utf8mb4_general_ci',
//	PRIMARY KEY (`idautor`) USING BTREE
//)
//COLLATE='utf8mb4_general_ci'
//ENGINE=InnoDB
//AUTO_INCREMENT=5
//;
//
//CREATE TABLE `editora` (
//	`ideditora` INT(11) NOT NULL AUTO_INCREMENT,
//	`nome` VARCHAR(100) NULL DEFAULT NULL COLLATE 'utf8mb4_general_ci',
//	PRIMARY KEY (`ideditora`) USING BTREE
//)
//COLLATE='utf8mb4_general_ci'
//ENGINE=InnoDB
//AUTO_INCREMENT=4
//;
//
//CREATE TABLE `leitor` (
//	`idleitor` INT(11) NOT NULL AUTO_INCREMENT,
//	`nome` VARCHAR(100) NULL DEFAULT NULL COLLATE 'utf8mb4_general_ci',
//	`dataNascimento` VARCHAR(10) NULL DEFAULT NULL COLLATE 'utf8mb4_general_ci',
//	`cpf` VARCHAR(11) NULL DEFAULT NULL COLLATE 'utf8mb4_general_ci',
//	`telefone` VARCHAR(11) NULL DEFAULT NULL COLLATE 'utf8mb4_general_ci',
//	`email` VARCHAR(100) NULL DEFAULT NULL COLLATE 'utf8mb4_general_ci',
//	`endereco` VARCHAR(100) NULL DEFAULT NULL COLLATE 'utf8mb4_general_ci',
//	`numero` VARCHAR(6) NULL DEFAULT NULL COLLATE 'utf8mb4_general_ci',
//	`bairro` VARCHAR(45) NULL DEFAULT NULL COLLATE 'utf8mb4_general_ci',
//	`cidade` VARCHAR(25) NULL DEFAULT NULL COLLATE 'utf8mb4_general_ci',
//	`uf` VARCHAR(2) NULL DEFAULT NULL COLLATE 'utf8mb4_general_ci',
//	`cep` VARCHAR(7) NULL DEFAULT NULL COLLATE 'utf8mb4_general_ci',
//	`complemento` VARCHAR(45) NULL DEFAULT NULL COLLATE 'utf8mb4_general_ci',
//	`usuario` VARCHAR(45) NULL DEFAULT NULL COLLATE 'utf8mb4_general_ci',
//	`senha` VARCHAR(45) NULL DEFAULT NULL COLLATE 'utf8mb4_general_ci',
//	PRIMARY KEY (`idleitor`) USING BTREE
//)
//COLLATE='utf8mb4_general_ci'
//ENGINE=InnoDB
//AUTO_INCREMENT=12
//;
//
//CREATE TABLE `livro` (
//	`idlivro` INT(11) NOT NULL AUTO_INCREMENT,
//	`titulo` VARCHAR(100) NULL DEFAULT NULL COLLATE 'utf8mb4_general_ci',
//	`autor` VARCHAR(100) NULL DEFAULT NULL COLLATE 'utf8mb4_general_ci',
//	`editora` VARCHAR(100) NULL DEFAULT NULL COLLATE 'utf8mb4_general_ci',
//	`anoEdicao` VARCHAR(4) NULL DEFAULT NULL COLLATE 'utf8mb4_general_ci',
//	`quantidade` INT(10) NULL DEFAULT NULL,
//	PRIMARY KEY (`idlivro`) USING BTREE
//)
//COLLATE='utf8mb4_general_ci'
//ENGINE=InnoDB
//AUTO_INCREMENT=8
//;
//
//CREATE TABLE `usuario` (
//	`idusuario` INT(11) NOT NULL AUTO_INCREMENT,
//	`usuario` VARCHAR(45) NULL DEFAULT NULL COLLATE 'utf8mb4_general_ci',
//	`senha` VARCHAR(100) NULL DEFAULT NULL COLLATE 'utf8mb4_general_ci',
//	`nivelHierarquico` VARCHAR(20) NULL DEFAULT NULL COLLATE 'utf8mb4_general_ci',
//	PRIMARY KEY (`idusuario`) USING BTREE
//)
//COLLATE='utf8mb4_general_ci'
//ENGINE=InnoDB
//AUTO_INCREMENT=7
//;
//
//
//
//CREATE TABLE `emprestimo` (
//	`idemprestimo` INT(11) NOT NULL AUTO_INCREMENT,
//	`nomeLeitor` VARCHAR(100) NULL DEFAULT NULL COLLATE 'utf8mb4_general_ci',
//	`livro` VARCHAR(100) NULL DEFAULT NULL COLLATE 'utf8mb4_general_ci',
//	`data` VARCHAR(10) NULL DEFAULT NULL COLLATE 'utf8mb4_general_ci',
//	`dataDevolucao` VARCHAR(10) NULL DEFAULT NULL COLLATE 'utf8mb4_general_ci',
//	PRIMARY KEY (`idemprestimo`) USING BTREE
//)
//COLLATE='utf8mb4_general_ci'
//ENGINE=InnoDB
//AUTO_INCREMENT=3
//;
//
//CREATE TABLE `log` (
//	`id` INT(11) NOT NULL AUTO_INCREMENT,
//	`usuario` VARCHAR(50) NOT NULL DEFAULT '' COLLATE 'utf8mb4_general_ci',
//	PRIMARY KEY (`id`) USING BTREE
//)
//COLLATE='utf8mb4_general_ci'
//ENGINE=InnoDB
//AUTO_INCREMENT=2
//;
//
//insert into autor values (1,'Susan Cain'); 
//insert into autor values (2,'Roger S. Pressman'); 
//insert into autor values (3,'Viktor Mayer-Schonberger'); 
//insert into autor values (4,'Paul Barry'); 
//insert into autor values (5,'Richard Hunter');
//
//insert into editora values (1,'Sextante'); 
//insert into editora values (2,'AMGH'); 
//insert into editora values (3,'Elsevier'); 
//insert into editora values (4,'Alta Books');
//insert into editora values (5,'MBOOKS');
//
//
//INSERT INTO leitor VALUES(1,"Jefferson Queiroz","28/09/1987","07778578425","8197548754","jefferson@gmail.com","Rua José Vieira","200","Boa Vista","Recife","PE","54258751","APTO:221");
//INSERT INTO leitor VALUES(2,"Ana Karine","14/05/1997","54875421458","81997845154","ana.karine@gmail.com","Rua Napoleão","1358","Torre","Recife","PE","54875484","Ao lado da Igreja da Torre");
//INSERT INTO leitor VALUES(3,"Gabriella Nunes","28/09/1990","548754457123","81978436478","gabriellanunes@gmail.com","Rua Joaquim","258","Boa Viagem","Recife","PE","54458754","");
//
//
//insert into livro values(1,"Redes de Computadores","Susan Cain","Sextante","2001",10);
//
//insert into usuario values(1,"jefferson","qwe1324","Administrador");
//insert into usuario VALUES(2,"ana","123ana","Gerente");
//insert into usuario VALUES(3,"Karine","1234","Atendente");
//insert into usuario VALUES(4,"rosi","1234","Atendente");
//insert into usuario VALUES(5,"dory","dory1234","Administrador");
//
//INSERT INTO emprestimo  VALUES (1, 'Jefferson', 'Rede de computdores', 'data', '29/11/2023');
//INSERT INTO emprestimo VALUES (2, 'Ana Luiza', 'Dominando JavaScript', '28/08/2023', '04/09/2023');


///=======================================

//INSERT INTO `leitor` (`idleitor`, `nome`, `dataNascimento`, `cpf`, `telefone`, `email`, `endereco`, `numero`, `bairro`, `cidade`, `uf`, `cep`, `complemento`, `usuario`, `senha`) VALUES (1, 'Ana Luiza', '13/05/1997', '7845124578', '87998745632', 'ana@gmail.com', 'Rua José da Silva', '600', 'Boa Vista', 'Recife', 'PE', '54230875','-', 'ana.luiza', 'ana123');
//INSERT INTO `leitor` (`idleitor`, `nome`, `dataNascimento`, `cpf`, `telefone`, `email`, `endereco`, `numero`, `bairro`, `cidade`, `uf`, `cep`, `complemento`, `usuario`, `senha`) VALUES (2, 'John Frusciante', '05/03/1970', '0778451298', '87997842101', 'john@rhcp.com', 'Rua João Fernandes', '2009', 'Casa Amarela', 'Recife', 'PE', '54875875', '--', 'jonh.frusciante', 'rhcp');
//INSERT INTO `leitor` (`idleitor`, `nome`, `dataNascimento`, `cpf`, `telefone`, `email`, `endereco`, `numero`, `bairro`, `cidade`, `uf`, `cep`, `complemento`, `usuario`, `senha`) VALUES (3, 'Maria Rosiane', '13/05/1966', '4657984512', '81979874587', 'rosi@gmail.com', 'Av. Domingos Ferreira', '2987', 'Boa Viagem', 'Recife', 'PE', '54782458', 'Apto-1205', 'rosi', '1234');
//INSERT INTO `leitor` (`idleitor`, `nome`, `dataNascimento`, `cpf`, `telefone`, `email`, `endereco`, `numero`, `bairro`, `cidade`, `uf`, `cep`, `complemento`, `usuario`, `senha`) VALUES (4, 'Aloizio Antônio', '16/05/1933', '79845612354', '81998754137', 'aloizio.antonio@gmail.com', 'Av. Conde da Boa Vista', '4587', 'Boa Vista', 'Recife', 'PE', '54789654', 'Apto-203', 'aloizio.antonio', '1324');

