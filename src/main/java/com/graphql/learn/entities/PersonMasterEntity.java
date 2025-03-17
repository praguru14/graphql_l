package com.graphql.learn.entities;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name = "per_mst_we", schema = "inmdb", uniqueConstraints = @UniqueConstraint(columnNames = "pno"))
@Data
public class PersonMasterEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sr_no")
    private Long srNo;

    @Column(name = "pno", nullable = false, unique = true)
    private String pno;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "middle_name")
    private String middleName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "test")
    private String test;

    @Column(name = "gender")
    private String gender;

    @Column(name = "date_of_birth")
    private Date dateOfBirth;

    @Column(name = "place_of_birth")
    private String placeOfBirth;

    @Column(name = "user_type_code")
    private String userTypeCode;

    @Column(name = "is_active")
    private Integer isActive;

    @Column(name = "full_name")
    private String fullName;

    @Column(name = "dashboard_allow_yn")
    private Integer dashboardAllowYn;

    @Column(name = "admin_control_yn")
    private Integer adminControlYn;

    @Column(name = "admin_cr_report_allow_yn")
    private Integer adminCrReportAllowYn;

    @Column(name = "super_admin_control_yn")
    private Integer superAdminControlYn;

        @OneToOne(mappedBy = "perMstWe", fetch = FetchType.EAGER)
        private PersonDetailsEntity perDtlsWe;
}
