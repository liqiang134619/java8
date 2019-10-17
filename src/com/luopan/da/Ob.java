package com.luopan.da;

import java.util.Date;
import java.util.Objects;

/**
 * @author Liq
 * @date 2019/7/1
 */
public class Ob {

    private Date dateTime;

    public Ob(Date dateTime) {
        this.dateTime = dateTime;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    @Override
    public String toString() {
        return "Ob{" +
            "dateTime=" + dateTime +
            '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Ob ob = (Ob) o;
        return Objects.equals(dateTime, ob.dateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dateTime);
    }
}
