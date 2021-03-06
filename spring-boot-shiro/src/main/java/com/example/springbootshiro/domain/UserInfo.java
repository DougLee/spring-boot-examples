package com.example.springbootshiro.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by Douglee on 2018/3/28.
 */
@Table(name = "T_USER")
public class UserInfo implements Serializable {

    private static final long serialVersionUID = -5157941902574936160L;

    /**
     * 账户有效
     */
    public static final String STATUS_VALID = "1";

    @Id
    @GeneratedValue(generator = "JDBC")
    @Column(name = "USER_ID")
    private Long userId;

    @Column(name = "USERNAME")
    private String username;

    @Column(name = "PASSWORD")
    private String password;

    @Column(name = "STATUS")
    private String status = STATUS_VALID;

    @Column(name = "CRATE_TIME")
    private Date createTime;

    @Column(name = "MODIFY_TIME")
    private Date modifyTime;

    @Column(name = "LAST_LOGIN_TIME")
    private Date lastLoginTime;

    @Transient
    private String roleName;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}
