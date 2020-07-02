-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 02, 2020 at 06:22 PM
-- Server version: 10.4.13-MariaDB
-- PHP Version: 7.4.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_project_akhir`
--

-- --------------------------------------------------------

--
-- Table structure for table `account`
--

CREATE TABLE `account` (
  `id` varchar(4) NOT NULL,
  `username` varchar(10) NOT NULL,
  `password` varchar(8) NOT NULL,
  `verify_code` varchar(50) NOT NULL,
  `is_active` tinyint(1) NOT NULL,
  `is_deleted` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `account_role`
--

CREATE TABLE `account_role` (
  `id` varchar(5) NOT NULL,
  `account` varchar(5) NOT NULL,
  `role` varchar(5) NOT NULL,
  `is_deleted` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `employees`
--

CREATE TABLE `employees` (
  `id` varchar(4) NOT NULL,
  `name` char(30) NOT NULL,
  `email` varchar(20) NOT NULL,
  `phone_number` varchar(12) NOT NULL,
  `leave_quota` int(2) NOT NULL,
  `manager_id` varchar(4) NOT NULL,
  `is_deleted` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `parameter`
--

CREATE TABLE `parameter` (
  `id` varchar(4) NOT NULL,
  `name` varchar(30) NOT NULL,
  `note` longtext NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `public_holiday`
--

CREATE TABLE `public_holiday` (
  `id` varchar(4) NOT NULL,
  `name` varchar(30) NOT NULL,
  `holiday_date` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `report`
--

CREATE TABLE `report` (
  `id` varchar(5) NOT NULL,
  `pic` varchar(4) NOT NULL,
  `request` varchar(4) NOT NULL,
  `notes` int(11) NOT NULL,
  `date_time` datetime NOT NULL,
  `status` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `request`
--

CREATE TABLE `request` (
  `id` varchar(4) NOT NULL,
  `requester` varchar(4) NOT NULL,
  `type` varchar(4) NOT NULL,
  `current_status` varchar(4) NOT NULL,
  `total` int(2) NOT NULL,
  `start` datetime NOT NULL,
  `end` datetime NOT NULL,
  `reason` longtext NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `role`
--

CREATE TABLE `role` (
  `id` varchar(5) NOT NULL,
  `name` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `status`
--

CREATE TABLE `status` (
  `id` varchar(4) NOT NULL,
  `name` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `type`
--

CREATE TABLE `type` (
  `id` varchar(4) NOT NULL,
  `name` varchar(30) NOT NULL,
  `number_of_days` int(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `account`
--
ALTER TABLE `account`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `account_role`
--
ALTER TABLE `account_role`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK_account` (`account`),
  ADD KEY `FK_role` (`role`);

--
-- Indexes for table `employees`
--
ALTER TABLE `employees`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `email` (`email`),
  ADD UNIQUE KEY `phone_number` (`phone_number`),
  ADD KEY `manager_id` (`manager_id`);

--
-- Indexes for table `parameter`
--
ALTER TABLE `parameter`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `public_holiday`
--
ALTER TABLE `public_holiday`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `report`
--
ALTER TABLE `report`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK_employee_manager` (`pic`),
  ADD KEY `FK_employee` (`request`),
  ADD KEY `FK_status` (`status`);

--
-- Indexes for table `request`
--
ALTER TABLE `request`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK_employee` (`requester`),
  ADD KEY `FK_type` (`type`),
  ADD KEY `FK_status` (`current_status`);

--
-- Indexes for table `role`
--
ALTER TABLE `role`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `status`
--
ALTER TABLE `status`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `type`
--
ALTER TABLE `type`
  ADD PRIMARY KEY (`id`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `account`
--
ALTER TABLE `account`
  ADD CONSTRAINT `account_ibfk_1` FOREIGN KEY (`id`) REFERENCES `employees` (`id`);

--
-- Constraints for table `account_role`
--
ALTER TABLE `account_role`
  ADD CONSTRAINT `account_role_ibfk_1` FOREIGN KEY (`account`) REFERENCES `account` (`id`),
  ADD CONSTRAINT `account_role_ibfk_2` FOREIGN KEY (`role`) REFERENCES `role` (`id`);

--
-- Constraints for table `employees`
--
ALTER TABLE `employees`
  ADD CONSTRAINT `employees_ibfk_1` FOREIGN KEY (`manager_id`) REFERENCES `employees` (`id`);

--
-- Constraints for table `report`
--
ALTER TABLE `report`
  ADD CONSTRAINT `report_ibfk_1` FOREIGN KEY (`pic`) REFERENCES `employees` (`id`),
  ADD CONSTRAINT `report_ibfk_2` FOREIGN KEY (`request`) REFERENCES `request` (`id`);

--
-- Constraints for table `request`
--
ALTER TABLE `request`
  ADD CONSTRAINT `request_ibfk_1` FOREIGN KEY (`requester`) REFERENCES `employees` (`id`),
  ADD CONSTRAINT `request_ibfk_2` FOREIGN KEY (`type`) REFERENCES `type` (`id`),
  ADD CONSTRAINT `request_ibfk_3` FOREIGN KEY (`current_status`) REFERENCES `status` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
