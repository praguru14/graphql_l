package com.graphql.learn.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name = "per_dtls_we", schema = "inmdb")
@Data
public class PersonDetailsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sr_no")
    private Long srNo;

    @Column(name = "pno", nullable = false)
    private String pno;

    @Column(name = "test")
    private String test;

    @Column(name = "blood_group_code")
    private String bloodGroupCode;

    @Column(name = "aadhar_number")
    private String aadharNumber;

    @Column(name = "pan_number")
    private String panNumber;

    @Column(name = "voter_id")
    private String voterId;

    @Column(name = "religion_code")
    private String religionCode;

    @Column(name = "nationality_code")
    private String nationalityCode;

    @Column(name = "marital_status_code")
    private String maritalStatusCode;

    @Column(name = "date_of_marriage")
    private Date dateOfMarriage;

    @Column(name = "official_mobile_number")
    private String officialMobileNumber;

    @Column(name = "personal_mobile_number")
    private String personalMobileNumber;

    @Column(name = "unit_code")
    private String unitCode;

    @Column(name = "command_code")
    private String commandCode;

    @Column(name = "gov_email_id")
    private String govEmailId;

    @Column(name = "nud_email_id")
    private String nudEmailId;

    @Column(name = "personal_email_id")
    private String personalEmailId;

    @Column(name = "date_of_joining")
    private Date dateOfJoining;

    @Column(name = "rank_code")
    private String rankCode;

    @Column(name = "date_of_commission")
    private Date dateOfCommission;

    @Column(name = "date_of_seniority")
    private Date dateOfSeniority;

    @Column(name = "cadre_code")
    private String cadreCode;

    @Column(name = "branch_code")
    private String branchCode;

    @Column(name = "entry_type")
    private String entryType;

    @Column(name = "icard_number")
    private String icardNumber;

    @Column(name = "icard_type")
    private String icardType;

    @Column(name = "gx_unit")
    private String gxUnit;

    @Column(name = "medical_category")
    private String medicalCategory;

    @Column(name = "medical_category_date")
    private Date medicalCategoryDate;

    @Column(name = "date_of_retirement")
    private Date dateOfRetirement;

    @Column(name = "domicile_state")
    private String domicileState;

    @Column(name = "designation")
    private String designation;

    @Column(name = "designation_idm")
    private String designationIdm;

    @Column(name = "unit_idm")
    private String unitIdm;

    @Column(name = "unit_id")
    private Integer unitId;

    @Column(name = "command_id")
    private Integer commandId;

    @Column(name = "cadre_id")
    private Integer cadreId;

    @Column(name = "branch_id")
    private Integer branchId;

    @Column(name = "rank_id")
    private Integer rankId;



    @OneToOne(fetch = FetchType.EAGER)
    @JsonIgnoreProperties("perDtlsWe")
    @JoinColumn(name = "pno", referencedColumnName = "pno",insertable=false, updatable=false)
    private PersonMasterEntity perMstWe;
}
