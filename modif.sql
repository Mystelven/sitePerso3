-- phpMyAdmin SQL Dump
-- version 4.2.10
-- http://www.phpmyadmin.net
--
-- Host: localhost:3306
-- Generation Time: Jun 10, 2017 at 06:41 PM
-- Server version: 5.5.38
-- PHP Version: 5.5.17

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";

--
-- Database: `sitepersojava`
--

-- --------------------------------------------------------

--
-- Table structure for table `CategoryProject`
--

CREATE TABLE `CategoryProject` (
`id` int(5) NOT NULL,
  `titre` text NOT NULL
) ENGINE=MyISAM AUTO_INCREMENT=1000 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `CategoryProject`
--

INSERT INTO `CategoryProject` (`id`, `titre`) VALUES
(1, 'PhP & Mysql'),
(2, 'Java'),
(3, 'C++'),
(4, 'Asm 80x86'),
(5, 'Zend Framework'),
(6, 'Qt 4.7'),
(8, 'C'),
(7, 'GTK+'),
(9, 'Android'),
(10, 'Arduino'),
(11, 'OpenGL'),
(12, 'JavaEE'),
(13, 'JavaScript / AngularJS'),
(14, 'Jekyll');

-- --------------------------------------------------------

--
-- Table structure for table `CategorySkill`
--

CREATE TABLE `CategorySkill` (
`id_category` int(10) unsigned NOT NULL,
  `name_category` varchar(255) NOT NULL,
  `order_category` int(255) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `CategorySkill`
--

INSERT INTO `CategorySkill` (`id_category`, `name_category`, `order_category`) VALUES
(1, 'Software', 1),
(2, 'Web Technologies', 2),
(3, 'Languages', 3),
(4, 'Databases', 4),
(5, 'Project management', 5);

-- --------------------------------------------------------

--
-- Table structure for table `Color`
--

CREATE TABLE `Color` (
`id_color` int(10) unsigned NOT NULL,
  `name_color` varchar(255) NOT NULL,
  `description_color` varchar(255) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `Color`
--

INSERT INTO `Color` (`id_color`, `name_color`, `description_color`) VALUES
(1, 'pomengrate', 'Red'),
(2, 'asbestos', 'Grey'),
(3, 'sunflower', 'Yellow'),
(4, 'wisteria', 'Purple'),
(5, 'emerald', 'Green'),
(6, 'carrot', 'Orange');

-- --------------------------------------------------------

--
-- Table structure for table `Education`
--

CREATE TABLE `Education` (
`id_education` int(10) unsigned NOT NULL,
  `name_education` varchar(255) NOT NULL,
  `description_education` varchar(255) NOT NULL,
  `debut` varchar(255) NOT NULL,
  `fin` varchar(255) NOT NULL,
  `id_logo` int(11) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `Education`
--

INSERT INTO `Education` (`id_education`, `name_education`, `description_education`, `debut`, `fin`, `id_logo`) VALUES
(1, 'Politechnika Lódzka (Lódz - Poland)', 'Winter semester in the International Faculty of Engineering inside the Erasmus program.', '2014', '2014', 1),
(2, 'École Polytechnique de l’Université de Tours (Tours - France) ', 'Obtention of an engineering degree in Computer Science.', '2012', '2015', 4),
(3, 'UQAM (Montreal - Canada)', 'Winter semester in Bachelor of Software Engineering.', '2012', '2012', 3),
(4, 'IUT de Lens (Lens - France)', 'Obtention an University Diploma of Technology in Computer Science.', '2010 ', '2012', 2),
(5, 'Centre de Recherche en Informatique de Lens (Lens - France)', 'I''m doing my Ph.D in Artificial Intelligence.<br />\r\nThe thesis subject : Practical resolution of the coherence of formulas in modal logic. ', '2015', '2018', 5);

-- --------------------------------------------------------

--
-- Table structure for table `Experience`
--

CREATE TABLE `Experience` (
  `id_experience` int(10) unsigned NOT NULL,
  `city_experience` varchar(255) NOT NULL,
  `description_experience` varchar(255) NOT NULL,
  `debut_experience` varchar(255) NOT NULL,
  `fin_experience` varchar(255) NOT NULL,
  `order_experience` int(11) NOT NULL,
  `personal` tinyint(2) NOT NULL COMMENT 'This boolean is to know if the experience is a personal one or not',
  `current` int(1) NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `Experience`
--

INSERT INTO `Experience` (`id_experience`, `city_experience`, `description_experience`, `debut_experience`, `fin_experience`, `order_experience`, `personal`, `current`) VALUES
(1, 'Immojeune (Paris - France)', 'Performing an integratable Iframe on all its partners for Immojeune. I co-managed the development in Symfony 2 and the versioning (git).', 'August 2014', 'Sept. 2014', 4, 0, 0),
(2, 'Worldline (Tours - France)', 'Perform the comparison and merging management projects prepaid accounts and receipts of items to achieve a complete software, generic and reusable.', 'July 2014', 'August 2014', 3, 0, 0),
(3, 'Axa-Assistance Canada (Montreal - Canada)', 'Continuing the Intern website with Zend Framework started 1 year earlier.', 'June 2013', 'August 2013', 2, 0, 0),
(4, 'Axa-Assistance Canada (Montreal - Canada)', 'Internship at AXA Assistance Canada, to create an internal website in PHP 5.3 and Zend Framework, the goal was the merger of several existing sites so that field agents no longer uses a single intranet to access everything they need.', 'May 2012', 'August 2012', 1, 0, 0),
(5, 'Simply Créat'' (Tours - France)', 'Co-director of the company Simply Créat’, I was often asked to quantify and control the\r\nrealized projects and to take care of customer relationships', 'January 2014', 'August 2015', 1, 1, 0),
(6, 'Event''s organisation (Douai - France)', 'Organizing concerts (human and technical constraints) and writing business plans as treasurer\r\nwhether within les Binoclards or the Club Music of Polytech Tours.', 'January 2011', 'April 2015', 2, 1, 0),
(7, 'CHRU (Tours - France)', 'The goal of this project was to realize a web platform who allow different hospitals to upload their DICOM files.\r\n\r\nTheses DICOM files contains the patient''s name and to fix this problem, we integrate a JavaFX application to anonymize theses files.', 'December 2014', 'March 2015', 5, 0, 0),
(8, 'Atos (Wroclaw - Poland)', 'My role as a Java EE Developer (with French knowledge) was to design and\r\nimplement a software in Java technologies and work on projects with French-speaking clients.', 'May 2015', 'September 2015', 6, 0, 0),
(9, 'gPartner (Paris - France)', 'I was working with 2 others differents companies on the website of a very famous company in the luxe industry to integrate desktop and mobile versions.', 'July 2015', 'August 2015', 7, 0, 0);

-- --------------------------------------------------------

--
-- Table structure for table `Logo`
--

CREATE TABLE `Logo` (
`id_logo` int(10) unsigned NOT NULL,
  `logo_name` varchar(255) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `Logo`
--

INSERT INTO `Logo` (`id_logo`, `logo_name`) VALUES
(1, 'resources/images/polLodzka.png'),
(2, 'resources/images/iutLens.png\r\n'),
(3, 'resources/images/uqam.png'),
(4, 'resources/images/polytech.png'),
(5, 'resources/images/cril.png');

-- --------------------------------------------------------

--
-- Table structure for table `ResearchSoftware`
--

CREATE TABLE `ResearchSoftware` (
  `id_project` int(10) NOT NULL,
  `name_project` varchar(255) NOT NULL,
  `image_project` varchar(255) NOT NULL,
  `id_category` int(10) NOT NULL,
  `description_project` text NOT NULL,
  `date_project` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `ResearchSoftware`
--

INSERT INTO `ResearchSoftware` (`id_project`, `name_project`, `image_project`, `id_category`, `description_project`, `date_project`) VALUES
(39, 'Generalized Lights Out', 'resources/projet/Interrupteur.png', 2, 'Project created in tandem with Florent Dewez and Thibault Defourneau.\r\n<br /><br />\r\nLights Out is an electronic game, released by Tiger Electronics in 1995.\r\n<br />\r\nThe game consists of a 5 by 5 grid of lights. When the game starts, a random number or a stored pattern of these lights is switched on.|End|\r\n\r\n<br /><br />\r\n\r\nPressing any of the lights will toggle it and the adjacent lights. \r\n<br />\r\nThe goal of the puzzle is to switch all the lights off, preferably in as few button presses as possible.\r\n<br />\r\n<br />\r\nWe generalized this game by a N*M board, and not only : <img src="resources/lights/smallRules.png" />\r\n<br />\r\nbut also with P colors : <img src="resources/lights/fullRules.png" />\r\n<br />\r\n<br />\r\nWe created 2 Artificial Intelligences : one based on the method of Branch and Bound and the other based on the resolution of a system : AX + B = 0<br/>\r\n<br />\r\nThe solution ends up just being a matrix inversion problem Ax=B. \r\n<br />\r\nA would be your kernel matrix (it would be square if you use all the lights), B would be the "on" lights, and x would be the switches you need to hit in order to turn them off.\r\n<br /><br />\r\nThe source code is accessible on <a target="_blank" href="https://github.com/Mystelven/LightsOuts-Math">GitHub</a>.\r\n<br /><br />\r\nWebsite who support this project : <a target="_blank" href="http://mystelven.github.io/LightsOuts-Math/">here</a>.', '2015-03-09'),
(40, 'Contributions to SATLive!', 'resources/projet/satLive.png', 14, 'SAT Live! is a community web site to share news about SAT: conferences, workshops, software, benchmarks, positions, etc.|End|\r\n\r\n<br /><br />\r\nThis project was initialized by Daniel Le Berre.<br /><br />\r\n<a target="_blank" href="http://www.satlive.org/">SAT Live!</a> is powered by Jekyll and it''s content can be found on GitHub since December 2014.\r\n<br />\r\n<br />\r\n\r\nGitHub : <a target="_blank" href="https://github.com/satlive/website/">https://github.com/satlive/website/</a>.\r\n<br />\r\n<br />\r\nI''m participating in this project by adding news about Modal-SAT in particular and by being one of developers who add new visual features.', '2015-07-01'),
(41, 'MDK-Verifier', 'resources/projet/mdk-verifier.png', 3, 'MDK-verfier is, with some specifications in the I/O, able to tell if a Kripke model satisfies a formula for the modal logic K.\r\n\r\nThe source code, written in C++ is accessible here: <a href="http://www.cril.univ-artois.fr/~montmirail/mdk-verifier/">http://www.cril.univ-artois.fr/~montmirail/mdk-verifier/</a>\r\n', '2016-06-30'),
(42, 'Stabilisation of a nacelle', 'resources/projet/nacelle.png', 10, '\r\nProject performed in partnership with <a href="mailto:alain.krok@etu.univ-tours.fr">Alain Krok</a>. The goal of this project was to copy what Nature is able to do since thousands of years: <b>Stabilized the view</b>.<br /> |End|\r\n\r\n<br/>\r\n<h2>Small historic of the state-of-the-art</h2>\r\n<br/>\r\n\r\n<u><span>Nacelle with servomotors</span></u>\r\n\r\n<br/><br/>\r\n\r\nThe first model available to the public at a reasonable cost is the nacelle with servomotors.<br/>\r\nThis system is composed with a nacelle actioned by two servomotors allowing a stabilization on the axis forward-backward and left-right.\r\n<br/><br/>\r\n\r\nThese two servomotors are connected and powered directly by the main card of the drone.\r\n<br/>\r\nThus, the nacelle uses the couple gyro-accelerometer of the main card to perform the necessary calculation for the positioning of the nacelle perfectly straight. \r\n\r\n<br/><br/>\r\n\r\nThe orders are then transmitted to the servomotors which move the platform of the nacelle. The following Figure shows an example of nacelle with servomotors:\r\n\r\n<br/><br/>\r\n\r\n<div>\r\n	<img title="Nacelle with servomotors" alt="Nacelle with servomotors" src="resources/projet/nacelle_servo.jpg" width="500" height="300"/>\r\n</div>\r\n\r\n<br/>\r\n\r\nDespite its cost relatively low, <b>this system suffers from two majors default</b>:\r\n<ul>\r\n	<li>\r\n		The reaction time and the precision of the servomotors: when there is violent movements, the nacelle is very slow to come back to its initial position.\r\n	</li>\r\n\r\n	<li>\r\n		Dependency to the main card: the calculations are distributed and the main battery is requested. 	\r\n	</li>\r\n</ul>\r\n<br/>\r\n\r\n<u><span>Nacelle with brushless motors</span></u>\r\n<br/><br/>\r\n\r\nNacelles with brushless motors are composed with two majors elements:\r\n\r\n<ul>\r\n	<li>\r\n		A support on which the two brushless motors are fixed.\r\n	</li>\r\n\r\n	<li>\r\n		A dedicated card to perform the calculation and also a captor giving the informations of the position-orientation of the card.\r\n	</li>\r\n\r\n</ul>\r\n\r\n<div>\r\n	<img title="Nacelle with brushless motors" alt="Nacelle with brushless motors" src="resources/projet/nacelle_moteurs.jpg" width="500" height="300" />\r\n</div>\r\n\r\n<br/>\r\n\r\nThis new version corrects the problems that suffer the nacelle with servomotors. \r\n<br/>\r\nThe cost is relatively higher (approx. 200 euros for the metallic support plus the motors and between 40 and 100 euros for the main card and the captors).\r\n<br/>\r\nThis system is thus entirely independent and compatible with every types of drones.\r\n\r\n<br/><br/>\r\n\r\nTo stabilize a nacelle, we need to enslave it. For this purpose, we used the famous regulation method: <b>the PID method</b>\r\n<br/><br/>\r\n\r\n<h2>Slaving by the PID method</h2>\r\n<br/>\r\n\r\nAs stated before, to solve this slaving problem, we used a regulation method. The most used one is the PID method.\r\n\r\n<br/>\r\n\r\n<div>\r\n	<img title="PID method" alt="PID method" src="resources/projet/pid.png" width="500" height="300" /></a>\r\n</div>\r\n\r\nThe principle of the PID regulation is to modify intentionally the value of the deviation measured between the setpoint and the current position.\r\n\r\n<br/><br/>\r\n\r\n<h3>P - Proportional </h3>\r\n\r\nThe principle of a proportional regulation is to increase virtually the value of the error. \r\n<br/>\r\nThus the system will react quickly to the changes of positions. \r\n<br/>\r\nOn the other hand, if this value is too amplified, the system will become unstable.\r\n\r\n<div>\r\n	<img title="P regulation" alt="Curves of the P regulation" src="resources/projet/P.png" width="500" height="300" />\r\n</div>\r\n\r\n\r\n<br /><br />\r\n<h3>I - Integral </h3>\r\n\r\nIt is possible to add to the proportional regulation, the integral of the error. We obtain a PI regulation.\r\n<br/>\r\nThe error between the setpoint and the current position is integrated with respect to the time, and multiplied by a constant which must be determined according to the system.\r\n<br /><br />\r\n\r\nThis functionality is added because when the system gets closer to the setpoint, the error is not big enough to be corrected. \r\n<br/>\r\nThe static error is thus compensated, and a more stable system is obtained in steady state.\r\n\r\n<div>\r\n<img title="PI regulation" alt="Curves of the PI regulation" src="resources/projet/I.png" width="500" height="300" />\r\n</div>\r\n\r\n<br /><br />\r\n<h3>D - Derivation </h3>\r\n\r\nFinally, we can add a last term. It is the derivative of the error between the setpoint and the current position with respect to the time, and to multiply it by a constant.\r\n<br /><br />\r\n\r\nWe add this last functionality because the PI regulation can lead to an overrun of the setpoint. \r\n<br/>\r\nThis is limited by the derivative. When the system approaches the setpoint, the setpoint is braked by adding a force in the opposite direction. \r\n<br/>\r\nThe stabilization is thus faster.\r\n\r\n<div>\r\n<img title="PID regulation" alt="Curves of the PID regulation" src="resources/projet/D.png" width="500" height="300" />\r\n</div>\r\n\r\n<br /><br />\r\n<h3>Animation of PID</h3>\r\n\r\nHere is now a small animation on how these three parameters affects the position of the drone\r\n\r\n<div>\r\n<img title="PID animation" alt="" src="resources/projet/PID_Animated.gif" width="500" height="300" />\r\n</div\r\n\r\n<br /><br />\r\n<h2>Conclusion</h2>\r\n\r\n<div style="text-align:center;">\r\n<iframe width="560" height="315" src="//www.youtube.com/embed/OzAlos7IiE8" frameborder="0" allowfullscreen></iframe>\r\n</div>\r\n<br/>\r\n\r\nAs you can see on this video, the camera is perfectly stable, no matter the movements made by the drone.\r\n<br/>\r\nThis came from the fact that at each force applied on the camera, an opposite force is send in the motors by the Arduino card to cancel it.\r\n<br/>\r\nThus, for every movement, an opposite force is applied and thus, the camera stays at the setpoint.', '2014-01-30'),
(43, 'S52SAT', 'resources/projet/S52SAT.png', 3, '\r\nS52SAT is a SAT-based approach for solving the modal logic S5 satisfiability problem.\r\n\r\nIt is able to give in output the S5-model, when the formula is satisfiable.\r\n<br/>\r\nThe source code, written in C++ is accessible here: <a href="http://www.cril.univ-artois.fr/~montmirail/s52SAT/">http://www.cril.univ-artois.fr/~montmirail/s52SAT/</a>', '2017-02-04'),
(44, 'Tweet Classifier', 'resources/projet/tweetAnalyser.png', 2, 'Learning-ception: I wanted to learn how to use Machine Learning and Natural Language Processing in practice.\r\nThis program can classify tweets on a topic (passed in argument) on 3 levels ''positive'', ''negative'' and ''neutral''.|End|\r\n<br />\r\n\r\nThe illustration represents what Twitter was thinking about Trump at the date of 05/06/2017 at 14:12, with the following classification:\r\n<br/>\r\n<pre>\r\n\r\n[0.956, 0.836, 0.836, 0.825, 0.781, 0.78, 0.758, 0.754, 0.728, 0.697, 0.684, 0.683, 0.683, 0.675, 0.649, 0.645, 0.644, 0.642, 0.617, 0.603, 0.603, 0.599, 0.59, 0.576, 0.548, 0.548, 0.533, 0.523, 0.518, 0.517, 0.516, 0.512, 0.507, 0.506, 0.504, 0.504, 0.501, 0.5, 0.5, 0.486, 0.483, 0.48, 0.461, 0.455, 0.455, 0.447, 0.447, 0.447, 0.447, 0.445, 0.444, 0.444, 0.442, 0.442, 0.433, 0.421, 0.421, 0.421, 0.421, 0.407, 0.407, 0.402, 0.4, 0.399, 0.396, 0.372, 0.366, -0.348, -0.356, -0.371, -0.376, -0.376, -0.376, -0.379, -0.383, -0.391, -0.393, -0.396, -0.399, -0.399, -0.399, -0.401, -0.401, -0.401, -0.401, -0.401, -0.401, -0.401, -0.401, -0.401, -0.401, -0.401, -0.401, -0.401, -0.401, -0.401, -0.401, -0.401, -0.401, -0.402, -0.404, -0.406, -0.406, -0.408, -0.41, -0.413, -0.415, -0.419, -0.419, -0.419, -0.419, -0.419, -0.421, -0.424, -0.426, -0.426, -0.426, -0.426, -0.426, -0.427, -0.431, -0.434, -0.435, -0.436, -0.436, -0.437, -0.439, -0.442, -0.443, -0.444, -0.444, -0.444, -0.446, -0.447, -0.45, -0.455, -0.456, -0.456, -0.459, -0.459, -0.46, -0.461, -0.462, -0.465, -0.465, -0.465, -0.465, -0.465, -0.466, -0.467, -0.469, -0.47, -0.471, -0.473, -0.475, -0.475, -0.477, -0.479, -0.481, -0.481, -0.482, -0.487, -0.487, -0.487, -0.489, -0.49, -0.505, -0.505, -0.505, -0.505, -0.505, -0.506, -0.508, -0.51, -0.516, -0.518, -0.518, -0.524, -0.524, -0.528, -0.53, -0.538, -0.538, -0.538, -0.538, -0.544, -0.544, -0.544, -0.544, -0.545, -0.548, -0.549, -0.549, -0.558, -0.559, -0.565, -0.572, -0.572, -0.572, -0.572, -0.575, -0.575, -0.576, -0.576, -0.576, -0.576, -0.58, -0.586, -0.592, -0.599, -0.608, -0.608, -0.608, -0.608, -0.608, -0.611, -0.613, -0.615, -0.615, -0.634, -0.635, -0.635, -0.635, -0.643, -0.657, -0.662, -0.67, -0.67, -0.685, -0.685, -0.686, -0.718, -0.729, -0.729, -0.734, -0.738, -0.738, -0.758, -0.76, -0.77, -0.789, -0.809, -0.815, -0.815, -0.815, -0.815, -0.823, -0.869, -0.882, -0.929, -0.964, -0.978]\r\n\r\nThe strongest negative  :  -0.978\r\nThe strongest positive  :   0.956\r\nThe median value        :  -0.439\r\nThe average value       :  -0.239\r\n\r\nWhich can somehow be interpreted as ''globally, Twitter is against, but when people are for him, they are strongly for him''\r\n</pre>\r\n\r\n<br />\r\nFeel free to contribute to this project on GitHub: <a href="https://github.com/Mystelven/tweet-classifier">https://github.com/Mystelven/tweet-classifier</a>', '2017-06-05'),
(45, 'MoSaiC', 'resources/projet/mosaic.png', 3, 'MoSaiC is a <a href="recar">RECAR</a> approach for solving the Modal Logic K Satisfiability Problem.<br/>\r\nThe solver, written in C++, is accessible here: <a href="http://www.cril.univ-artois.fr/~montmirail/mosaic/">http://www.cril.univ-artois.fr/~montmirail/mosaic/</a>|End|\r\n<br/>\r\n<br/>\r\n\r\nThe RECAR approach definitely increase the performance compared to a simple <a href="https://link.springer.com/chapter/10.1007/10722167_15">CEGAR</a> approach\r\n<br/>\r\n<div>\r\n	<img title="Scatter-plot CEGAR vs RECAR" alt="Scatter-plot CEGAR vs RECAR" src="resources/projet/Cegar-vs-Mosaic.png" width="500" height="300"/>\r\n</div><br/>\r\n\r\nMoSaiC is also very competitive against the state-of-the-art solver for Moda Logic K Satisfiability Problem\r\n\r\n<br/>\r\n<div>\r\n	<img title="Cactus-Plot MoSaiC againt others" alt="Cactus-Plot MoSaiC againt others" src="resources/projet/Cactus-ALL.png" width="500" height="300"/>\r\n</div>', '2017-08-19');

-- --------------------------------------------------------

--
-- Table structure for table `Skill`
--

CREATE TABLE `Skill` (
`id_skill` int(10) unsigned NOT NULL,
  `name_skill` varchar(255) NOT NULL,
  `value_skill` varchar(255) NOT NULL,
  `id_color` int(11) NOT NULL,
  `id_category` int(11) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `Skill`
--

INSERT INTO `Skill` (`id_skill`, `name_skill`, `value_skill`, `id_color`, `id_category`) VALUES
(1, 'Java (Swing, AWT)', '100', 1, 1),
(2, 'JavaEE (Spring, Tapestry, CDI)', '85', 2, 1),
(3, 'C (GTK+, OpenGL, Glut)', '70\r\n', 3, 1),
(4, 'C++ (Qt,SFML)', '90', 4, 1),
(5, 'C# (.NET)', '20', 5, 1),
(6, 'Android', '60', 6, 1),
(7, 'PHP (Zend Framework, Symfony)', '90', 1, 2),
(8, 'JavaScript (JQuery, Mootools)', '80', 2, 2),
(9, 'HTML5 / CSS3', '100', 3, 2),
(10, 'English', '100', 1, 3),
(11, 'French', '100', 2, 3),
(12, 'Italian', '20', 3, 3),
(13, 'Microsoft Access', '80', 1, 4),
(14, 'MySQL', '80', 2, 4),
(15, 'PostGreSQL', '90', 3, 4),
(16, 'Oracle', '90', 4, 4),
(17, 'Versioning (Git, SVN, Mercurial)', '100', 1, 5),
(18, 'Jenkins/Bamboo/GitLab | Sonar', '90', 2, 5),
(19, 'Agile Methodology', '90', 3, 5),
(20, 'TDD (JUnit, Cppcheck)', '90', 4, 5),
(21, 'UML/Merise', '80', 5, 5),
(22, 'Polish', '30', 4, 3);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `CategoryProject`
--
ALTER TABLE `CategoryProject`
 ADD PRIMARY KEY (`id`);

--
-- Indexes for table `CategorySkill`
--
ALTER TABLE `CategorySkill`
 ADD PRIMARY KEY (`id_category`);

--
-- Indexes for table `Color`
--
ALTER TABLE `Color`
 ADD PRIMARY KEY (`id_color`);

--
-- Indexes for table `Education`
--
ALTER TABLE `Education`
 ADD PRIMARY KEY (`id_education`);

--
-- Indexes for table `Experience`
--
ALTER TABLE `Experience`
 ADD PRIMARY KEY (`id_experience`);

--
-- Indexes for table `Logo`
--
ALTER TABLE `Logo`
 ADD PRIMARY KEY (`id_logo`);

--
-- Indexes for table `ResearchSoftware`
--
ALTER TABLE `ResearchSoftware`
 ADD PRIMARY KEY (`id_project`);

--
-- Indexes for table `Skill`
--
ALTER TABLE `Skill`
 ADD PRIMARY KEY (`id_skill`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `CategoryProject`
--
ALTER TABLE `CategoryProject`
MODIFY `id` int(5) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=1000;
--
-- AUTO_INCREMENT for table `CategorySkill`
--
ALTER TABLE `CategorySkill`
MODIFY `id_category` int(10) unsigned NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT for table `Color`
--
ALTER TABLE `Color`
MODIFY `id_color` int(10) unsigned NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=7;
--
-- AUTO_INCREMENT for table `Education`
--
ALTER TABLE `Education`
MODIFY `id_education` int(10) unsigned NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT for table `Logo`
--
ALTER TABLE `Logo`
MODIFY `id_logo` int(10) unsigned NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT for table `Skill`
--
ALTER TABLE `Skill`
MODIFY `id_skill` int(10) unsigned NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=23;