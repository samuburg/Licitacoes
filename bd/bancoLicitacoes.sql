-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema licitacoes
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema licitacoes
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `licitacoes` DEFAULT CHARACTER SET utf8 ;
USE `licitacoes` ;

-- -----------------------------------------------------
-- Table `licitacoes`.`instituicao`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `licitacoes`.`instituicao` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;
