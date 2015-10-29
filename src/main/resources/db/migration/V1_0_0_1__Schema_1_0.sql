
DROP TABLE IF EXISTS `buah`;
CREATE TABLE `buah`(
`id` varchar(255) NOT NULL,
`nama` varchar(255) NOT NULL,
`rasa` varchar(255) NOT NULL,
PRIMARY KEY (`id`)
)ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE `c_security_role`(
`id` varchar(255) NOT NULL
`nama` varchar(255) NOT NULL,
`keterangan` varchar(255) NOT NULL,
PRIMARY KEY (`id`),
UNIQUE KEY `sopiehalimahleeminhoyeojingo` (`nama`)
)ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE `c_security_user`(
`id` varchar(255) NOT NULL
`username` varchar(255) NOT NULL,
`password` varchar(255) NOT NULL,
`active` BOOLEAN NOT NULL,
`id_role` varchar(255) NOT NULL,
PRIMARY KEY (`id`),
UNIQUE KEY `sopiehalimahleeminhoyeojingo` (`username`),
KEY `sopiehalimahleeminhoyeojingo` (`id_role`),
CONSTRAINT `sopiehalimahleeminhoyeojingo` FOREIGN KEY (`id_role`)
REFERENCES `c_security_role` (`id`)
)ENGINE=InnoDB DEFAULT CHARSET=latin1;
