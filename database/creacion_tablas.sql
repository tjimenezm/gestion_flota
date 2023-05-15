-- gestion_flota.login definition
-- gestion_flota.perfil definition

drop TABLE if exists `solicitud`;
drop TABLE if exists `carga`;
drop TABLE if exists `comuna`;
drop TABLE if exists `provincia`;
drop TABLE if exists `region`;
drop TABLE if exists `direccion`;
drop TABLE if exists `cliente`;
drop TABLE if exists `camion`;
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

CREATE TABLE if not exists `camion` (
  `id_camion` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `vehiculo_id` int(11) REFERENCES vehiculo(id_vehiculo),
  `capacidad` float(9,2),
  `tipo` varchar(30),
  PRIMARY KEY (`id_camion`)  
);


CREATE TABLE if not exists `planificacion` (
  `id_planificacion` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `conductor_id` int(11) REFERENCES empleado(id_empleado),
  `camion_id` int(11) REFERENCES camion(id_camion),
  `fecha_creacion` datetime,
  `fecha_planificacion` datetime,
  `hora_salida` time,
  `hora_retorno` time,
  `estado` varchar(50),
  `origen` varchar(100),
  `destino` varchar(100),
  PRIMARY KEY (`id_planificacion`)  
);


CREATE TABLE if not exists `region` (
  `id_region` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `nombre_region` varchar(100),
  PRIMARY KEY (`id_region`)  
);
CREATE TABLE if not exists `provincia` (
  `id_provincia` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `nombre_provincia` varchar(100),
  PRIMARY KEY (`id_provincia`)  
);
CREATE TABLE if not exists `comuna` (
  `id_comuna` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `nombre_comuna` varchar(100),
  PRIMARY KEY (`id_comuna`)  
);
CREATE TABLE if not exists `direccion` (
  `id_direccion` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `calle_numero` varchar(100),
  `adicional` varchar(100),
  `region_id` int(10),
  `provincia_id` int(10),
  `comuna_id` int(10),
  PRIMARY KEY (`id_direccion`)  
);
CREATE TABLE if not exists `cliente` (
  `id_cliente` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `persona_id` int(11) REFERENCES persona(id_persona),
  `razon_social` varchar(100),
  `direccion_id` int(10) REFERENCES direccion(id_direccion),
  PRIMARY KEY (`id_cliente`)  
);

CREATE TABLE if not exists `solicitud` (
  `id_solicitud` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `cliente_id` int(11) REFERENCES cliente(id_cliente),
  `planificacion_id` int(11) null REFERENCES planificacion(planificacion_id),
  `estado` varchar(50),
  `origen` varchar(100),
  `destino` varchar(100),
  `fecha_solicitud` datetime,
  `fecha_entrega` datetime,
  PRIMARY KEY (`id_solicitud`)  
);

CREATE TABLE if not exists `carga` (
  `id_carga` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `solicitud_id` int(11) REFERENCES cliente(id_solicitud),
  `tipo` varchar(50),
  `peso` float(11,2),
  `dimension` varchar(100),
  `detalle` varchar(200),
  PRIMARY KEY (`id_carga`)  
);
