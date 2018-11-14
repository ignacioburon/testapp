package io.openshift.booster.service;

import io.openshift.booster.domain.Greeting;

public interface TestService {

    boolean testMethod();
    
    Greeting obtainGretting(String message);
    
}
