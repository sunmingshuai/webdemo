
create DATABASE mobile;

CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(256) DEFAULT NULL,
  `balance` float default 0,
  `mobile` varchar(64)  DEFAULT NULL,
  `email` varchar(256) DEFAULT NULL,
  `first_visit_time` datetime DEFAULT NULL,
  `last_visit_time` datetime DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `user_name_idx`(`user_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO `user` (`id`, `user_name`, `balance`, `mobile`, `email`, `first_visit_time`, `last_visit_time`, `create_time`, `update_time`)
VALUES
  (1, 'sunms', 1000, '15067157866', 'sunmingshuai1024@gmail.com', '2017-12-31 15:11:07', '2017-12-31 15:11:07', '2017-12-31 15:11:07', '2017-12-31 15:11:07'),
  (2, 'sunmingshuai', 1000, '15067157888', 'sunms@gmail.com', '2017-12-31 15:11:07', '2017-12-31 15:11:07', '2017-12-31 15:11:07', '2017-12-31 15:11:07');