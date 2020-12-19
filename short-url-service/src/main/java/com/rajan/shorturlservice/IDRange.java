package com.rajan.shorturlservice;

import java.util.Objects;

public class IDRange {
private long lowerLimit;
private long upperLimit;

    public IDRange(long lowerLimit, long upperLimit) {
        this.lowerLimit = lowerLimit;
        this.upperLimit = upperLimit;
    }

    public long getLowerLimit() {
        return lowerLimit;
    }

    public void setLowerLimit(long lowerLimit) {
        this.lowerLimit = lowerLimit;
    }

    public long getUpperLimit() {
        return upperLimit;
    }

    public void setUpperLimit(long upperLimit) {
        this.upperLimit = upperLimit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IDRange idRange = (IDRange) o;
        return lowerLimit == idRange.lowerLimit && upperLimit == idRange.upperLimit;
    }

    @Override
    public int hashCode() {
        return Objects.hash(lowerLimit, upperLimit);
    }
}
