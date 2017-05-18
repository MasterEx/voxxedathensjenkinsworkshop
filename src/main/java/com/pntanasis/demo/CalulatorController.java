/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pntanasis.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author master
 */
@RestController
public class CalulatorController {

    /**
     *
     * @param a an int
     * @param b an int
     * @return sum of numbers
     */
    @RequestMapping(value = "/sum", method = RequestMethod.GET)
    public final Integer sum(
            @RequestParam(value = "a", required = true) final Integer a,
            @RequestParam(value = "b", required = true) final Integer b) {
        return a + b;
    }

}
