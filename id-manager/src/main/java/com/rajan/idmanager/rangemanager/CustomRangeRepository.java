package com.rajan.idmanager.rangemanager;

public interface CustomRangeRepository<Range, Long> {
    public Range getNextRange();
}
