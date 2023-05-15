-- gestion_flota.login definition
-- gestion_flota.perfil definition

drop TABLE if exists `vehiculo`;
drop TABLE if exists `planificacion`;
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
  `fecha_vencimiento` datetime not null,
  PRIMARY KEY (`id_conductor`)  
);

CREATE TABLE if not exists `planificacion` (
  `id_planificacion` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `conductor_id` int(11) REFERENCES empleado(id_empleado),
  `fecha_creacion` datetime,
  `fecha_planificacion` datetime,
  `hora_salida` time,
  `hora_retorno` time,
  `estado` varchar(50),
  `origen` varchar(100),
  `destino` varchar(100),
  PRIMARY KEY (`id_planificacion`)  
);

CREATE TABLE if not exists `vehiculo` (
  `id_vehiculo` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `patente` varchar(10),
  `numero_motor` varchar(30),
  `fecha_revision_tecnica` datetime,
  `marca` varchar(30),
  `anio` int(4),
  `modelo` varchar(50),
  `consecionario` varchar(100),
  `aseguradora` varchar(100),
  `poliza` varchar(30),
  `fecha_poliza` datetime,
  `fecha_ingreso` datetime,
  `fecha_baja` datetime,
  `tipo` varchar(10),
  `estado` varchar(10),
  PRIMARY KEY (`id_vehiculo`)  
);
