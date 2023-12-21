package com.poja.prime.endpoint.rest.controller.health;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;

@RestController
public class BigSum {
    @GetMapping("/big-sum")
    public BigInteger sumOfVariable(@RequestParam("a") String a, @RequestParam("b") String b){
        BigInteger bigIntegerA = new BigInteger(a);
        BigInteger bigIntegerB = new BigInteger(b);
        return bigIntegerA.add(bigIntegerB);
    }
}
