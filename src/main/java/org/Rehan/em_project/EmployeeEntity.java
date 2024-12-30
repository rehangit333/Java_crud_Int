package org.Rehan.em_project;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
//import lombok.NoArgsConstructor;

@Data
//@NoArgsConstructor
//@AllArgsConstructor
@Entity
@Table(name="emp_db")
public class EmployeeEntity{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; //ONLY THIS WILL BE TREATED AS THE PRIMARY KEY
    private String name;
    private String phone;
    private String email;

}
