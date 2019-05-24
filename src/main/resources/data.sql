
CREATE TABLE `person`
(
    `id`                  bigint(20) NOT NULL AUTO_INCREMENT,
    `added`               varchar(255) DEFAULT NULL,
    `address`             varchar(255) DEFAULT NULL,
    `age`                 int(11)      DEFAULT NULL,
    `apartament`          varchar(255) DEFAULT NULL,
    `avenue`              varchar(255) DEFAULT NULL,
    `birthday`            varchar(255) DEFAULT NULL,
    `blood_type`          varchar(255) DEFAULT NULL,
    `building`            varchar(255) DEFAULT NULL,
    `cell_phone`          varchar(255) DEFAULT NULL,
    `child_numberl`       varchar(255) DEFAULT NULL,
    `civil_status`        varchar(255) DEFAULT NULL,
    `first_name`          varchar(255) DEFAULT NULL,
    `floor`               varchar(255) DEFAULT NULL,
    `gender`              varchar(255) DEFAULT NULL,
    `grade_academy`       varchar(255) DEFAULT NULL,
    `height`              double       DEFAULT NULL,
    `identification`      varchar(255) DEFAULT NULL,
    `identification_type` varchar(255) DEFAULT NULL,
    `last_name`           varchar(255) DEFAULT NULL,
    `left_hand`           int(11)      DEFAULT NULL,
    `middle_name`         varchar(255) DEFAULT NULL,
    `neighborhood`        varchar(255) DEFAULT NULL,
    `postal_code`         varchar(255) DEFAULT NULL,
    `primary_email`       varchar(255) DEFAULT NULL,
    `profession`          varchar(255) DEFAULT NULL,
    `room_phone`          varchar(255) DEFAULT NULL,
    `secondary_emai`      varchar(255) DEFAULT NULL,
    `sur_name`            varchar(255) DEFAULT NULL,
    `weight`              double       DEFAULT NULL,
    PRIMARY KEY (`id`)
);

CREATE TABLE `files_to_process`
(
    `id`           int(11) NOT NULL,
    `file_name`    varchar(255) DEFAULT NULL,
    `extension`    varchar(255) DEFAULT NULL,
    `path`         varchar(255) DEFAULT NULL,
    `process`      tinyint(1)   DEFAULT NULL,
    `add`          datetime     DEFAULT NULL,
    `date_process` datetime     DEFAULT NULL,
    `size`         bigint(20)   DEFAULT NULL,
    `total_lines`  int(11)      DEFAULT NULL,
    PRIMARY KEY (`id`)
);