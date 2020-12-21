package com.rajan.idmanager.rangemanager;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="region", indexes = {@Index(name="id_index", columnList = "id")})
public class Range {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private long id;

    private long range;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getRange() {
        return range;
    }

    public void setRange(long range) {
        this.range = range;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Range range1 = (Range) o;
        return id == range1.id && range == range1.range;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, range);
    }
}
