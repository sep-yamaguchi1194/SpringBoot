package com.example.demo.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "user")
public class User implements Serializable {

    /**
     * user id
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
        private Long id;
        /**
         * user name
         */
        @Column(name = "name")
        private String name;

        /**
         * user address
         */
        @Column(name = "address")
        private String address;

        /**
         * user phone
         */
        @Column(name = "phone")
        private String phone;

        /**
         * user update_date
         */
        @Column(name = "update_date")
        private Date updateDate;

        /**
         * user create_date
         */
        @Column(name = "create_date")
        private Date createDate;

        /**
         * user delete_date
         */
        @Column(name = "delete_date")
        private Date deleteDate;
}
