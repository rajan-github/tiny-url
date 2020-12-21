package com.rajan.idmanager.rangemanager;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RangeRepository extends JpaRepository<Range, Long>, CustomRangeRepository<Range, Long>{
}
