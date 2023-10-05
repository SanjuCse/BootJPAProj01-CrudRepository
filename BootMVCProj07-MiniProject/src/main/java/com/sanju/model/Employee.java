package com.sanju.model;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

@Entity
@Data
@Table(name = "Employee")
@SQLDelete(sql = "update Employee set status='deleted' where ID=?")
@Where(clause = "status <> 'deleted'")
public class Employee {
    @Id
    @SequenceGenerator(name = "empSeqNo", sequenceName = "empSeqNo", initialValue = 100, allocationSize = 1)
    @GeneratedValue(generator = "empSeqNo", strategy = GenerationType.SEQUENCE)
    @Column(name = "ID")
    private Integer empno;

    @Column(name = "Name")
    private String ename;

    @Column(name = "Job")
    private String job;

    @Column(name = "Salary")
    private Float sal;

    @Column(name = "Dept_No")
    private Integer deptNo;

    @Column(name = "Status")
    private String status = "active";
}
