package com.rajan.idmanager.rangemanager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RangeController {

    @Autowired
    private RangeRepository repository;

    @RequestMapping("/ranges")
    public EntityModel<Range> getRange() {
        Range range=repository.getNextRange();
        return EntityModel.of(range);
    }

}
