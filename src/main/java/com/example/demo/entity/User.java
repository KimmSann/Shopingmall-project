package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Entity
@Table(name = "tbl_user")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
    
	@Id
	@Column(length = 255)
    private String id; 

    @Column(length = 255, nullable = false)
    private String passward;

    @Column(length = 20, nullable = false)
    private String name;

    @Column(length = 255)
    private String address;

    @Column(length = 20)
    private String tel;
	

}
