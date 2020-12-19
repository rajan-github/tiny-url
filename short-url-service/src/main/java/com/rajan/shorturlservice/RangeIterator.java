package com.rajan.shorturlservice;

public class RangeIterator {
    private final IDRange range;

    private long iterator;

    public RangeIterator(IDRange range) {
        this.range = range;
        iterator = range.getLowerLimit();
    }

    public long getNext() {
        if (iterator < range.getUpperLimit())
            return iterator++;
        else {
            //TODO: fetch new range from id range service.
            return -1;
        }
    }
}
