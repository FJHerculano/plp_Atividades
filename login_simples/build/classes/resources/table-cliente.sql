

CREATE TABLE `cliente` (
  `idcliente` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(90) DEFAULT NULL,
  `cnpj` varchar(20) DEFAULT NULL,
  `situacao` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`idcliente`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

insert into `cliente` (`nome`, `cnpj`, `situacao`) 
 values 
('fulano de tal',  '111.111.111-11','Ativo'),
('ciclano','222.222.222-22','Inativo');