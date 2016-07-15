--
-- Structure de la table `CategoryProject`
--

CREATE TABLE `CategoryProject` (
`id` int(5) NOT NULL,
  `titre` text NOT NULL
) ENGINE=MyISAM AUTO_INCREMENT=1000 DEFAULT CHARSET=latin1;

--
-- Contenu de la table `CategoryProject`
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
(14, 'Jekyll/MarkDown');

-- --------------------------------------------------------

--
-- Structure de la table `CategorySkill`
--

CREATE TABLE `CategorySkill` (
`id_category` int(10) unsigned NOT NULL,
  `name_category` varchar(255) NOT NULL,
  `order_category` int(255) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

--
-- Contenu de la table `CategorySkill`
--

INSERT INTO `CategorySkill` (`id_category`, `name_category`, `order_category`) VALUES
(1, 'Software', 1),
(2, 'Web Technologies', 2),
(3, 'Languages', 3),
(4, 'Databases', 4),
(5, 'Project management', 5);

-- --------------------------------------------------------

--
-- Structure de la table `Color`
--

CREATE TABLE `Color` (
`id_color` int(10) unsigned NOT NULL,
  `name_color` varchar(255) NOT NULL,
  `description_color` varchar(255) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

--
-- Contenu de la table `Color`
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
-- Structure de la table `Education`
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
-- Contenu de la table `Education`
--

INSERT INTO `Education` (`id_education`, `name_education`, `description_education`, `debut`, `fin`, `id_logo`) VALUES
(1, 'Politechnika Lódzka (Lódz - Poland)', 'Winter semester in the International Faculty of Engineering inside the Erasmus program.', '2014', '2014', 1),
(2, 'École Polytechnique de l’Université de Tours (Tours - France) ', 'Obtention of an engineering degree in Computer Science.', '2012', '2015', 4),
(3, 'UQAM (Montreal - Canada)', 'Winter semester in Bachelor of Software Engineering.', '2012', '2012', 3),
(4, 'IUT de Lens (Lens - France)', 'Obtention an University Diploma of Technology in Computer Science.', '2010 ', '2012', 2),
(5, 'Centre de Recherche en Informatique de Lens (Lens - France)', 'I''m doing my Ph.D in Artificial Intelligence.<br />\r\nThe thesis subject : Practical resolution of the coherence of formulas in modal logic. ', '2015', '2018', 5);

-- --------------------------------------------------------

--
-- Structure de la table `Experience`
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
-- Contenu de la table `Experience`
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
(9, 'gPartner (Paris - France)', 'I was working with 2 companies on the website of a very famous company in the luxe industry to integrate desktop and mobile versions.', 'July 2015', 'August 2015', 7, 0, 0);

-- --------------------------------------------------------

--
-- Structure de la table `Logo`
--

CREATE TABLE `Logo` (
`id_logo` int(10) unsigned NOT NULL,
  `logo_name` varchar(255) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

--
-- Contenu de la table `Logo`
--

INSERT INTO `Logo` (`id_logo`, `logo_name`) VALUES
(1, 'resources/images/polLodzka.png'),
(2, 'resources/images/iutLens.png\r\n'),
(3, 'resources/images/uqam.png'),
(4, 'resources/images/polytech.png'),
(5, 'resources/images/cril.png');

-- --------------------------------------------------------

--
-- Structure de la table `ResearchSoftware`
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
-- Contenu de la table `ResearchSoftware`
--

INSERT INTO `ResearchSoftware` (`id_project`, `name_project`, `image_project`, `id_category`, `description_project`, `date_project`) VALUES
(1, 'Generalized Lights Out', 'resources/projet/Interrupteur.png', 2, 'Project created in tandem with Florent Dewez and Thibault Defourneau.\r\n<br /><br />\r\nLights Out is an electronic game, released by Tiger Electronics in 1995.\r\n<br />\r\nThe game consists of a 5 by 5 grid of lights. When the game starts, a random number or a stored pattern of these lights is switched on.|End|\r\n\r\n<br /><br />\r\n\r\nPressing any of the lights will toggle it and the adjacent lights. \r\n<br />\r\nThe goal of the puzzle is to switch all the lights off, preferably in as few button presses as possible.\r\n<br />\r\n<br />\r\nWe generalized this game by a N*M board, and not only : <img src="resources/lights/smallRules.png" />\r\n<br />\r\nbut also with P colors : <img src="resources/lights/fullRules.png" />\r\n<br />\r\n<br />\r\nWe created 2 Artificial Intelligences : one based on the method of Branch and Bound and the other based on the resolution of a system : AX + B = 0<br/>\r\n<br />\r\nThe solution ends up just being a matrix inversion problem Ax=B. \r\n<br />\r\nA would be your kernel matrix (it would be square if you use all the lights), B would be the "on" lights, and x would be the switches you need to hit in order to turn them off.\r\n<br /><br />\r\nThe source code is accessible on <a target="_blank" href="https://github.com/Mystelven/LightsOuts-Math">GitHub</a>.\r\n<br /><br />\r\nWebsite who support this project : <a target="_blank" href="http://mystelven.github.io/LightsOuts-Math/">here</a>.', '2015-03-09'),
(2, 'Contributions to SATLive!', 'resources/projet/satLive.png', 14, 'SAT Live! is a community web site to share news about SAT: conferences, workshops, software, benchmarks, positions, etc.|End|\r\n\r\n<br /><br />\r\nThis project was initialized by Daniel Le Berre.<br /><br />\r\n<a target="_blank" href="http://www.satlive.org/">SAT Live!</a> is powered by Jekyll and it''s content can be found on GitHub since December 2014.\r\n<br />\r\n<br />\r\n\r\nGitHub : <a target="_blank" href="https://github.com/satlive/website/">https://github.com/satlive/website/</a>.\r\n<br />\r\n<br />\r\nI''m participating in this project by adding news about Modal-SAT in particular and by being one of developers who add new visual features.', '2015-07-01'),
(3, 'MDK-Verifier', 'resources/projet/mdk-verifier.png', 3, 'MDK-verfier is, with some specifications in the I/O, able to tell if a Kripke model satisfies a formula for the modal logic K.\r\n\r\nThe source code, written in C++ is accessible here: <a href="http://www.cril.univ-artois.fr/~montmirail/mdk-verifier/">http://www.cril.univ-artois.fr/~montmirail/mdk-verifier/</a>', '2016-06-30');

-- --------------------------------------------------------

--
-- Structure de la table `Skill`
--

CREATE TABLE `Skill` (
`id_skill` int(10) unsigned NOT NULL,
  `name_skill` varchar(255) NOT NULL,
  `value_skill` varchar(255) NOT NULL,
  `id_color` int(11) NOT NULL,
  `id_category` int(11) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=latin1;

--
-- Contenu de la table `Skill`
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
-- Index pour les tables exportées
--

--
-- Index pour la table `CategoryProject`
--
ALTER TABLE `CategoryProject`
 ADD PRIMARY KEY (`id`);

--
-- Index pour la table `CategorySkill`
--
ALTER TABLE `CategorySkill`
 ADD PRIMARY KEY (`id_category`);

--
-- Index pour la table `Color`
--
ALTER TABLE `Color`
 ADD PRIMARY KEY (`id_color`);

--
-- Index pour la table `Education`
--
ALTER TABLE `Education`
 ADD PRIMARY KEY (`id_education`);

--
-- Index pour la table `Experience`
--
ALTER TABLE `Experience`
 ADD PRIMARY KEY (`id_experience`);

--
-- Index pour la table `Logo`
--
ALTER TABLE `Logo`
 ADD PRIMARY KEY (`id_logo`);

--
-- Index pour la table `ResearchSoftware`
--
ALTER TABLE `ResearchSoftware`
 ADD PRIMARY KEY (`id_project`);

--
-- Index pour la table `Skill`
--
ALTER TABLE `Skill`
 ADD PRIMARY KEY (`id_skill`);

--
-- AUTO_INCREMENT pour les tables exportées
--

--
-- AUTO_INCREMENT pour la table `CategoryProject`
--
ALTER TABLE `CategoryProject`
MODIFY `id` int(5) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=1000;
--
-- AUTO_INCREMENT pour la table `CategorySkill`
--
ALTER TABLE `CategorySkill`
MODIFY `id_category` int(10) unsigned NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT pour la table `Color`
--
ALTER TABLE `Color`
MODIFY `id_color` int(10) unsigned NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=7;
--
-- AUTO_INCREMENT pour la table `Education`
--
ALTER TABLE `Education`
MODIFY `id_education` int(10) unsigned NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT pour la table `Logo`
--
ALTER TABLE `Logo`
MODIFY `id_logo` int(10) unsigned NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT pour la table `Skill`
--
ALTER TABLE `Skill`
MODIFY `id_skill` int(10) unsigned NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=23;