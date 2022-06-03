-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 03, 2022 at 04:13 PM
-- Server version: 10.4.20-MariaDB
-- PHP Version: 8.0.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `berkah_motor`
--

-- --------------------------------------------------------

--
-- Table structure for table `tbl_karyawan`
--

CREATE TABLE `tbl_karyawan` (
  `id_karyawan` varchar(5) NOT NULL,
  `pass_karyawan` varchar(20) NOT NULL,
  `nama` varchar(30) NOT NULL,
  `no_telpon` varchar(15) NOT NULL,
  `alamat` varchar(50) DEFAULT NULL,
  `akses` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbl_karyawan`
--

INSERT INTO `tbl_karyawan` (`id_karyawan`, `pass_karyawan`, `nama`, `no_telpon`, `alamat`, `akses`) VALUES
('K0001', '1234', 'Bintang', '082243234304', 'Jogja', 'Manajer'),
('K0002', '1234', 'Alfian', '082292204337', 'Jogja', 'Manager');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_kendaraan`
--

CREATE TABLE `tbl_kendaraan` (
  `nopol` varchar(10) NOT NULL,
  `jenis` varchar(10) NOT NULL,
  `merk` varchar(10) NOT NULL,
  `harga` int(11) NOT NULL,
  `tersedia` char(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbl_kendaraan`
--

INSERT INTO `tbl_kendaraan` (`nopol`, `jenis`, `merk`, `harga`, `tersedia`) VALUES
('AA2234GH', 'Mio', 'Yamaha', 25000, 'N'),
('AB1234BH', 'Suzuki', 'Smash', 15000, 'N'),
('AB3234HP', 'Ninja', 'Kawasaki', 50000, 'Y'),
('AB4H', 'Vario', 'Honda', 30000, 'Y'),
('B4YU', 'Vario', 'Honda', 30000, 'Y'),
('B7765G', 'Ninja', 'Kawasaki', 50000, 'Y'),
('G2221CF', 'Vario', 'Honda', 30000, 'N'),
('G4756CZ', 'Vario', 'Honda', 50000, 'Y');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_pelanggan`
--

CREATE TABLE `tbl_pelanggan` (
  `id_pelanggan` varchar(5) NOT NULL,
  `nama` varchar(30) NOT NULL,
  `no_identitas` varchar(16) NOT NULL,
  `jenis_kelamin` varchar(1) NOT NULL,
  `no_telpon` varchar(15) NOT NULL,
  `alamat` varchar(50) DEFAULT NULL,
  `pinjam` char(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbl_pelanggan`
--

INSERT INTO `tbl_pelanggan` (`id_pelanggan`, `nama`, `no_identitas`, `jenis_kelamin`, `no_telpon`, `alamat`, `pinjam`) VALUES
('P0001', 'Dede Agus', '095318123', 'L', '082134412', 'Tegal', 'N'),
('P0002', 'Reza Agung', '0859302', 'L', '09421321', 'Semarang', 'N'),
('P0005', 'Budi', '123200011', 'L', '085341676565', 'Seturan', 'N'),
('P0007', 'Wika', '0974670', 'L', '466739', 'jogja', 'N'),
('P0008', 'Soffa', '1234', 'P', '212', '31', 'N'),
('P0009', 'Nanda', '123', 'P', '123', '123', 'Y'),
('P0010', 'Zen', '2132123', 'L', '08541', 'Sleman', 'N'),
('P0011', 'Henricus', '123200101', 'L', '082253646', 'Bantul', 'Y'),
('P0012', 'Alfian', '123200007', 'L', '082292204337', 'Jogja', 'N');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_transaksi_sewa`
--

CREATE TABLE `tbl_transaksi_sewa` (
  `no_transaksi` varchar(10) NOT NULL,
  `id_pelanggan` varchar(5) NOT NULL,
  `nopol` varchar(10) NOT NULL,
  `harga` int(11) NOT NULL,
  `id_karyawan` varchar(5) NOT NULL,
  `tgl_sewa` date NOT NULL,
  `tgl_kembali` date DEFAULT NULL,
  `lama` int(11) NOT NULL,
  `total` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbl_transaksi_sewa`
--

INSERT INTO `tbl_transaksi_sewa` (`no_transaksi`, `id_pelanggan`, `nopol`, `harga`, `id_karyawan`, `tgl_sewa`, `tgl_kembali`, `lama`, `total`) VALUES
('020622-001', 'P0009', 'AA2234GH', 25000, 'K0002', '2022-06-02', NULL, 3, 75000),
('030622-001', 'P0011', 'AB1234BH', 15000, 'K0002', '2022-06-03', NULL, 2, 30000);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbl_karyawan`
--
ALTER TABLE `tbl_karyawan`
  ADD PRIMARY KEY (`id_karyawan`);

--
-- Indexes for table `tbl_kendaraan`
--
ALTER TABLE `tbl_kendaraan`
  ADD PRIMARY KEY (`nopol`);

--
-- Indexes for table `tbl_pelanggan`
--
ALTER TABLE `tbl_pelanggan`
  ADD PRIMARY KEY (`id_pelanggan`);

--
-- Indexes for table `tbl_transaksi_sewa`
--
ALTER TABLE `tbl_transaksi_sewa`
  ADD PRIMARY KEY (`no_transaksi`),
  ADD KEY `id_karyawan` (`id_karyawan`),
  ADD KEY `nopol` (`nopol`),
  ADD KEY `id_pelanggan` (`id_pelanggan`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `tbl_transaksi_sewa`
--
ALTER TABLE `tbl_transaksi_sewa`
  ADD CONSTRAINT `tbl_transaksi_sewa_ibfk_1` FOREIGN KEY (`id_karyawan`) REFERENCES `tbl_karyawan` (`id_karyawan`),
  ADD CONSTRAINT `tbl_transaksi_sewa_ibfk_2` FOREIGN KEY (`nopol`) REFERENCES `tbl_kendaraan` (`nopol`),
  ADD CONSTRAINT `tbl_transaksi_sewa_ibfk_3` FOREIGN KEY (`id_pelanggan`) REFERENCES `tbl_pelanggan` (`id_pelanggan`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
