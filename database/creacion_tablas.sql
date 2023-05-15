-- gestion_flota.login definition
-- gestion_flota.perfil definition
drop TABLE if exists `conductor`;
drop TABLE if exists `empleado`;
drop TABLE if exists `login`;
drop TABLE if exists `perfil`;
drop TABLE if exists `persona`;


CREATE TABLE if not exists `perfil` (
  `id_perfil` int(11) NOT NULL AUTO_INCREMENT,
  `nombre_perfil` varchar(100) DEFAULT NULL,
  `descripcion_perfil` varchar(100) DEFAULT NULL,
  `codigo_perfil` varchar(100) DEFAULT NULL,
  `estado` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id_perfil`)
);


CREATE TABLE if not exists `persona` (
  `id_persona` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `run` int(10) DEFAULT NULL,
  `dv` varchar(1) DEFAULT NULL,
  `nombre` varchar(100) DEFAULT NULL,
  `primer_pellido` varchar(100) DEFAULT NULL,
  `segundo_apellido` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id_persona`)
);

CREATE TABLE if not exists `login` (
  `id_login` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `usuario` varchar(100) DEFAULT NULL,
  `password` varchar(100) DEFAULT NULL,
  `perfil_id` int(11) REFERENCES perfil(id_perfil),
  `persona_id` int(11) REFERENCES person(id_person),
  PRIMARY KEY (`id_login`)  
);

CREATE TABLE if not exists `empleado` (
  `id_empleado` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `persona_id` int(11) REFERENCES person(id_person),
  `tipo_empleado` varchar(50) ,
  `tipo_contrato` varchar(100) , 
  PRIMARY KEY (`id_empleado`)  
);

CREATE TABLE if not exists `conductor` (
  `id_conductor` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `empleado_id` int(11) REFERENCES empleado(id_empleado),
  `tipo_licencia` varchar(500) not null,
  `numero_licencia` varchar(500) not null,
  `fecha_vencimiento` date not null,
  PRIMARY KEY (`id_conductor`)  
);
