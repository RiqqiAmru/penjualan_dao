-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 14, 2023 at 06:14 PM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `penjualan_db`
--

-- --------------------------------------------------------

--
-- Table structure for table `barang_dao`
--

CREATE TABLE `barang_dao` (
  `kode` varchar(12) NOT NULL,
  `nama` varchar(40) NOT NULL,
  `satuan` enum('kilo','liter','box') NOT NULL,
  `jumlah` int(11) NOT NULL,
  `harga` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='barang_dao';

--
-- Dumping data for table `barang_dao`
--

INSERT INTO `barang_dao` (`kode`, `nama`, `satuan`, `jumlah`, `harga`) VALUES
('1', 'test', 'box', 53, 20000),
('101', 'test', 'box', 53, 20000),
('102', 'test', 'box', 53, 20000),
('A001', 'beras', 'kilo', 30, 5500),
('telo', 'telo', 'liter', 89, 9000);

-- --------------------------------------------------------

--
-- Table structure for table `pelanggan_dao`
--

CREATE TABLE `pelanggan_dao` (
  `kode` varchar(20) NOT NULL,
  `nama` varchar(30) NOT NULL,
  `email` varchar(30) NOT NULL,
  `alamat` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `pelanggan_dao`
--

INSERT INTO `pelanggan_dao` (`kode`, `nama`, `email`, `alamat`) VALUES
('8u', 'riqqi amru', 'riqqia00@gmail.com', 'simbang kulon'),
('amru', 'amru', 'amru@gmail.com', 'ngipik');

-- --------------------------------------------------------

--
-- Table structure for table `penjualan`
--

CREATE TABLE `penjualan` (
  `kode_penjualan` varchar(20) NOT NULL,
  `tanggal_penjualan` datetime NOT NULL,
  `total_penjualan` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `penjualan`
--

INSERT INTO `penjualan` (`kode_penjualan`, `tanggal_penjualan`, `total_penjualan`) VALUES
('T001', '2023-01-13 23:57:42', 150000);

-- --------------------------------------------------------

--
-- Table structure for table `penjualan_detail`
--

CREATE TABLE `penjualan_detail` (
  `kode_detail` int(11) NOT NULL,
  `kode_barang` varchar(12) NOT NULL,
  `jumlah` int(11) NOT NULL,
  `harga` double NOT NULL,
  `subtotal` double NOT NULL,
  `kode_penjualan` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `penjualan_detail`
--

INSERT INTO `penjualan_detail` (`kode_detail`, `kode_barang`, `jumlah`, `harga`, `subtotal`, `kode_penjualan`) VALUES
(1, 'A001', 5, 5500, 27500, 'T001');

-- --------------------------------------------------------

--
-- Table structure for table `t_person`
--

CREATE TABLE `t_person` (
  `id` int(11) NOT NULL,
  `name` varchar(30) NOT NULL,
  `password` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `t_person`
--

INSERT INTO `t_person` (`id`, `name`, `password`) VALUES
(1, 'administrator', 'pwd');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `barang_dao`
--
ALTER TABLE `barang_dao`
  ADD PRIMARY KEY (`kode`);

--
-- Indexes for table `pelanggan_dao`
--
ALTER TABLE `pelanggan_dao`
  ADD PRIMARY KEY (`kode`);

--
-- Indexes for table `penjualan`
--
ALTER TABLE `penjualan`
  ADD PRIMARY KEY (`kode_penjualan`);

--
-- Indexes for table `penjualan_detail`
--
ALTER TABLE `penjualan_detail`
  ADD PRIMARY KEY (`kode_detail`);

--
-- Indexes for table `t_person`
--
ALTER TABLE `t_person`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `penjualan_detail`
--
ALTER TABLE `penjualan_detail`
  MODIFY `kode_detail` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `t_person`
--
ALTER TABLE `t_person`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
