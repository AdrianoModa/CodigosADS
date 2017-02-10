-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema projetojava_v01
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema projetojava_v01
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `projetojava_v01` DEFAULT CHARACTER SET utf8 ;
USE `projetojava_v01` ;

-- -----------------------------------------------------
-- Table `projetojava_v01`.`tb_login`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `projetojava_v01`.`tb_login` (
  `id` BIGINT(10) NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(255) NULL DEFAULT NULL,
  `login` VARCHAR(255) NULL DEFAULT NULL,
  `senha` VARCHAR(255) NULL DEFAULT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
AUTO_INCREMENT = 33
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `projetojava_v01`.`usuario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `projetojava_v01`.`usuario` (
  `id` BIGINT(10) NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(255) NULL DEFAULT NULL,
  `cpf` VARCHAR(255) NULL DEFAULT NULL,
  `email` VARCHAR(255) NULL DEFAULT NULL,
  `telefone` VARCHAR(255) NULL DEFAULT NULL,
  `nome_veiculo` VARCHAR(50) NOT NULL,
  `placa` VARCHAR(10) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
AUTO_INCREMENT = 4
DEFAULT CHARACTER SET = utf8;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
