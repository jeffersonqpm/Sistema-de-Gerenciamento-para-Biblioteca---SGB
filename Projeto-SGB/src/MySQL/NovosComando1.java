package MySQL;


//CREATE DATABASE `biblioteca` /*!40100 COLLATE 'utf8mb4_general_ci' */

//CREATE TABLE `autor` (
//	`idautor` INT(11) NOT NULL AUTO_INCREMENT,
//	`nome` VARCHAR(100) NULL DEFAULT NULL COLLATE 'utf8mb4_general_ci',
//	PRIMARY KEY (`idautor`) USING BTREE
//)
//COLLATE='utf8mb4_general_ci'
//ENGINE=InnoDB
//AUTO_INCREMENT=8
//;
//
//CREATE TABLE `editora` (
//	`ideditora` INT(11) NOT NULL AUTO_INCREMENT,
//	`nome` VARCHAR(100) NULL DEFAULT NULL COLLATE 'utf8mb4_general_ci',
//	PRIMARY KEY (`ideditora`) USING BTREE
//)
//COLLATE='utf8mb4_general_ci'
//ENGINE=InnoDB
//AUTO_INCREMENT=5
//;
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
//AUTO_INCREMENT=6
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
//	`cep` VARCHAR(8) NULL DEFAULT NULL COLLATE 'utf8mb4_general_ci',
//	`complemento` VARCHAR(45) NULL DEFAULT NULL COLLATE 'utf8mb4_general_ci',
//	`usuario` VARCHAR(45) NULL DEFAULT NULL COLLATE 'utf8mb4_general_ci',
//	`senha` VARCHAR(45) NULL DEFAULT NULL COLLATE 'utf8mb4_general_ci',
//	PRIMARY KEY (`idleitor`) USING BTREE
//)
//COLLATE='utf8mb4_general_ci'
//ENGINE=InnoDB
//AUTO_INCREMENT=15
//;
//
//CREATE TABLE `livro` (
//	`idlivro` INT(11) NOT NULL AUTO_INCREMENT,
//	`titulo` VARCHAR(100) NULL DEFAULT NULL COLLATE 'utf8mb4_general_ci',
//	`autor` VARCHAR(100) NULL DEFAULT NULL COLLATE 'utf8mb4_general_ci',
//	`editora` VARCHAR(100) NULL DEFAULT NULL COLLATE 'utf8mb4_general_ci',
//	`anoEdicao` VARCHAR(4) NULL DEFAULT NULL COLLATE 'utf8mb4_general_ci',
//	`quantidade` INT(10) NULL DEFAULT NULL,
//	`local` VARCHAR(20) NULL DEFAULT NULL COLLATE 'utf8mb4_general_ci',
//	PRIMARY KEY (`idlivro`) USING BTREE
//)
//COLLATE='utf8mb4_general_ci'
//ENGINE=InnoDB
//AUTO_INCREMENT=9
//;
//
//CREATE TABLE `usuario` (
//	`idusuario` INT(11) NOT NULL AUTO_INCREMENT,
//	`Nome` VARCHAR(50) NULL DEFAULT NULL COLLATE 'utf8mb4_general_ci',
//	`usuario` VARCHAR(45) NULL DEFAULT NULL COLLATE 'utf8mb4_general_ci',
//	`senha` VARCHAR(100) NULL DEFAULT NULL COLLATE 'utf8mb4_general_ci',
//	`nivelHierarquico` VARCHAR(50) NULL DEFAULT NULL COLLATE 'utf8mb4_general_ci',
//	PRIMARY KEY (`idusuario`) USING BTREE
//)
//COLLATE='utf8mb4_general_ci'
//ENGINE=InnoDB
//AUTO_INCREMENT=12
//;
//
//CREATE TABLE `log` (
//	`id` INT(11) NOT NULL AUTO_INCREMENT,
//	`usuario` VARCHAR(50) NOT NULL DEFAULT '' COLLATE 'utf8mb4_general_ci',
//	PRIMARY KEY (`id`) USING BTREE
//)
//COLLATE='utf8mb4_general_ci'
//ENGINE=InnoDB
//AUTO_INCREMENT=1
//;
//INSERT INTO `autor` (`idautor`, `nome`) VALUES (1, 'Alckmar Luiz dos Santos');
//INSERT INTO `autor` (`idautor`, `nome`) VALUES (2, 'Alcides Villaça');
//INSERT INTO `autor` (`idautor`, `nome`) VALUES (3, 'Graciliano Ramos');
//INSERT INTO `autor` (`idautor`, `nome`) VALUES (4, 'Grégor Marcondes');
//INSERT INTO `editora` (`ideditora`, `nome`) VALUES (1, 'Companhia das Letras');
//INSERT INTO `editora` (`ideditora`, `nome`) VALUES (2, 'Editora Rocco');
//INSERT INTO `editora` (`ideditora`, `nome`) VALUES (3, 'Darkside');
//INSERT INTO `editora` (`ideditora`, `nome`) VALUES (4, 'Editora Wish');
//INSERT INTO `leitor`  VALUES (1, 'Ana Luiza', '13/05/1997', '7845124578', '87998745632', 'ana@gmail.com', 'Rua José da Silva', '600', 'Boa Vista', 'Recife', 'PE', '54230875','-', 'ana.luiza', 'ana123');
//INSERT INTO `leitor`  VALUES (2, 'John Frusciante', '05/03/1970', '0778451298', '87997842101', 'john@rhcp.com', 'Rua João Fernandes', '2009', 'Casa Amarela', 'Recife', 'PE', '54875875', '--', 'jonh.frusciante', 'rhcp');
//INSERT INTO `leitor`  VALUES (3, 'Maria Rosiane', '13/05/1966', '4657984512', '81979874587', 'rosi@gmail.com', 'Av. Domingos Ferreira', '2987', 'Boa Viagem', 'Recife', 'PE', '54782458', 'Apto-1205', 'rosi', '1234');
//INSERT INTO `leitor`  VALUES (4, 'Aloizio Antônio', '16/05/1933', '79845612354', '81998754137', 'aloizio.antonio@gmail.com', 'Av. Conde da Boa Vista', '4587', 'Boa Vista', 'Recife', 'PE', '54789654', 'Apto-203', 'aloizio.antonio', '1324');
//INSERT INTO `emprestimo` (`idemprestimo`, `nomeLeitor`, `livro`, `data`, `dataDevolucao`) VALUES (1, 'Ana', 'Rede de computdores', '10/11/2023', '20/11/2023');
//INSERT INTO `emprestimo` (`idemprestimo`, `nomeLeitor`, `livro`, `data`, `dataDevolucao`) VALUES (2, 'Jefferson', 'Dominando JavaScript', '10/11/2023', '20/11/2023');
//INSERT INTO `emprestimo` (`idemprestimo`, `nomeLeitor`, `livro`, `data`, `dataDevolucao`) VALUES (3, 'Michael', 'Rede de computdores', '13/11/2023', '23/11/2023');
//INSERT INTO `emprestimo` (`idemprestimo`, `nomeLeitor`, `livro`, `data`, `dataDevolucao`) VALUES (4, 'Ana', 'Rede de computdores', '10/11/2023', '20/11/2023');
//INSERT INTO `livro` (`idlivro`, `titulo`, `autor`, `editora`, `anoEdicao`, `quantidade`, `local`) VALUES (1, 'Scar Tissue', 'Alcides Villaça', 'Editora Rocco', '2004', 2, 'Rua A / B5');
//INSERT INTO `livro` (`idlivro`, `titulo`, `autor`, `editora`, `anoEdicao`, `quantidade`, `local`) VALUES (2, 'Windows Server 2022 Administration Fundamentals', 'Grégor Marcondes', 'Editora Wish', '2022', 1, 'Rua D / A2');
//INSERT INTO `livro` (`idlivro`, `titulo`, `autor`, `editora`, `anoEdicao`, `quantidade`, `local`) VALUES (3, 'Como Fazer Amigos e Influenciar Pessoas', 'Graciliano Ramos', 'Darkside', '1936', 4, 'Rua F / A8');
//INSERT INTO `livro` (`idlivro`, `titulo`, `autor`, `editora`, `anoEdicao`, `quantidade`, `local`) VALUES (4, 'Memórias póstumas de Brás Cubas', 'Alcides Villaça', 'Editora Rocco', '1881', 2, 'Rua E / B5');
//INSERT INTO `usuario` (`idusuario`, `Nome`, `usuario`, `senha`, `nivelHierarquico`) VALUES (1, 'Administrador', 'admin', '1324', 'Administrador');
//INSERT INTO `usuario` (`idusuario`, `Nome`, `usuario`, `senha`, `nivelHierarquico`) VALUES (2, 'Jefferson Queiroz', 'jefferson.queiroz', '4321', 'Gerente');

//INSERT INTO `log` (`id`, `usuario`) VALUES (1, 'admin');
