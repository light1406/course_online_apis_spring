create database course_online

CREATE TABLE `account`  (
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NULL,
  `role` int NULL,
  `user_id` varchar(20) NULL,
  PRIMARY KEY (`username`)
);

CREATE TABLE `answer`  (
  `id` varchar(20) NOT NULL,
  `key` varchar(255) NULL,
  `value` varchar(255) NULL,
  `is_correct` bit NULL,
  `question_id` varchar(20) NULL,
  PRIMARY KEY (`id`)
);

CREATE TABLE `benefit`  (
  `id` varchar(20) NOT NULL,
  `description` varchar(255) NULL,
  `course_id` varchar(20) NULL,
  PRIMARY KEY (`id`)
);

CREATE TABLE `category`  (
  `id` varchar(20) NOT NULL,
  `category` varchar(255) NULL,
  PRIMARY KEY (`id`)
);

CREATE TABLE `chapter`  (
  `id` varchar(20) NOT NULL,
  `title` varchar(255) NULL,
  `serial` int NULL,
  `course_id` varchar(20) NULL,
	`manufacture` datetime NULL,
  PRIMARY KEY (`id`)
);

CREATE TABLE `course`  (
  `id` varchar(20) NOT NULL,
  `title` varchar(255) NULL,
  `category_id` varchar(20) NULL,
  `price` decimal(10, 2) NULL,
  `manufacture` datetime NULL,
  `corver_url` varchar(255) NULL,
  PRIMARY KEY (`id`)
);

CREATE TABLE `course_of_user`  (
  `user_id` varchar(20) NOT NULL,
  `course_id` varchar(20) NOT NULL,
  PRIMARY KEY (`user_id`, `course_id`)
);

CREATE TABLE `learned_lesson_question`  (
  `user_id` varchar(20) NOT NULL,
  `lesson_question_id` varchar(20) NOT NULL,
  PRIMARY KEY (`user_id`, `lesson_question_id`)
);

CREATE TABLE `learned_lesson_video`  (
  `user_id` varchar(20) NOT NULL,
  `lesson_video_id` varchar(20) NOT NULL,
  PRIMARY KEY (`user_id`, `lesson_video_id`)
);

CREATE TABLE `lesson_question`  (
  `id` varchar(20) NOT NULL,
  `title` varchar(255) NULL,
  `serial` int NULL,
  `description` varchar(255) NULL,
  `chapter_id` varchar(20) NULL,
  `manufacture` datetime NULL,
  PRIMARY KEY (`id`)
);

CREATE TABLE `lesson_video`  (
  `id` varchar(20) NOT NULL,
  `title` varchar(255) NULL,
  `serial` int NULL,
  `description` varchar(255) NULL,
  `link_video` varchar(255) NULL,
  `time` longtext NULL,
  `chapter_id` varchar(20) NULL,
  `manufacture` datetime NULL,
  PRIMARY KEY (`id`)
);

CREATE TABLE `order`  (
  `id` varchar(20) NOT NULL,
  `user_id` varchar(20) NULL,
  `status` varchar(255) NULL,
  `purchase_date` datetime NULL,
  PRIMARY KEY (`id`)
);

CREATE TABLE `order_detail`  (
  `order_id` varchar(20) NOT NULL,
  `course_id` varchar(20) NOT NULL,
  PRIMARY KEY (`order_id`, `course_id`)
);

CREATE TABLE `question`  (
  `id` varchar(20) NOT NULL,
  `question` varchar(255) NULL,
  `lesson_question_id` varchar(20) NULL,
  PRIMARY KEY (`id`)
);

CREATE TABLE `user`  (
  `id` varchar(20) NOT NULL,
  `fname` varchar(255) NULL,
  `avtURL` varchar(255) NULL,
  `age` int NULL,
  `email` varchar(255) NULL,
  `phone` varchar(20) NULL,
  PRIMARY KEY (`id`)
);

ALTER TABLE `account` ADD CONSTRAINT `fk_user_account` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`);
ALTER TABLE `answer` ADD CONSTRAINT `fk_question_answer` FOREIGN KEY (`question_id`) REFERENCES `question` (`id`);
ALTER TABLE `benefit` ADD CONSTRAINT `fk_course_benefit` FOREIGN KEY (`course_id`) REFERENCES `course` (`id`);
ALTER TABLE `chapter` ADD CONSTRAINT `fk_course_chapter` FOREIGN KEY (`course_id`) REFERENCES `course` (`id`);
ALTER TABLE `course` ADD CONSTRAINT `fk_category_course` FOREIGN KEY (`category_id`) REFERENCES `category` (`id`);
ALTER TABLE `course_of_user` ADD CONSTRAINT `fk_user_cou` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`);
ALTER TABLE `course_of_user` ADD CONSTRAINT `fk_course_cou` FOREIGN KEY (`course_id`) REFERENCES `course` (`id`);
ALTER TABLE `learned_lesson_question` ADD CONSTRAINT `fk_user_llq` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`);
ALTER TABLE `learned_lesson_question` ADD CONSTRAINT `fk_lesson_question_llq` FOREIGN KEY (`lesson_question_id`) REFERENCES `lesson_question` (`id`);
ALTER TABLE `learned_lesson_video` ADD CONSTRAINT `fk_user_llv` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`);
ALTER TABLE `learned_lesson_video` ADD CONSTRAINT `fk_lesson_video_llv` FOREIGN KEY (`lesson_video_id`) REFERENCES `lesson_video` (`id`);
ALTER TABLE `lesson_question` ADD CONSTRAINT `fk_chapter_lq` FOREIGN KEY (`chapter_id`) REFERENCES `chapter` (`id`);
ALTER TABLE `lesson_video` ADD CONSTRAINT `fk_chapter_lv` FOREIGN KEY (`chapter_id`) REFERENCES `chapter` (`id`);
ALTER TABLE `order` ADD CONSTRAINT `fk_user_order` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`);
ALTER TABLE `order_detail` ADD CONSTRAINT `fk_order_od` FOREIGN KEY (`order_id`) REFERENCES `order` (`id`);
ALTER TABLE `order_detail` ADD CONSTRAINT `fk_course_od` FOREIGN KEY (`course_id`) REFERENCES `course` (`id`);
ALTER TABLE `question` ADD CONSTRAINT `fk_lesson_question_q` FOREIGN KEY (`lesson_question_id`) REFERENCES `lesson_question` (`id`);

