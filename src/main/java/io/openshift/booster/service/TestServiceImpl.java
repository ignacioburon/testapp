package io.openshift.booster.service;

import org.springframework.stereotype.Service;

import io.openshift.booster.domain.Greeting;

@Service
public class TestServiceImpl implements TestService {
    
    public boolean testMethod() {
        return true;
    }
    
    public Greeting obtainGretting(String message) {
        return new Greeting(message);
    }
    
}
