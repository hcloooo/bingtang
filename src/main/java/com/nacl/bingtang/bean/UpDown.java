package com.nacl.bingtang.bean;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.sql.Date;

/**
 * @author 赵益江
 * @version 1.0
 * @date 2020/4/1 0001 19:40
 */
public class UpDown {
    private Long id;
    private Long uid;
    private String up;
    private String down;
    private String date;
    private String note;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public String getUp() {
        return up;
    }

    public void setUp(String up) {
        this.up = up;
    }

    public String getDown() {
        return down;
    }

    public void setDown(String down) {
        this.down = down;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
