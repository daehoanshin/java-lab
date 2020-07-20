package jpa.model;

import javax.annotation.Generated;

/**
 * Dept is a Querydsl bean type
 */
@Generated("com.querydsl.codegen.BeanSerializer")
public class Dept {

    private Long deptno;

    private String dname;

    public Long getDeptno() {
        return deptno;
    }

    public void setDeptno(Long deptno) {
        this.deptno = deptno;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

}

