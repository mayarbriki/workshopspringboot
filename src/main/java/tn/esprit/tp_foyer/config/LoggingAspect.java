package tn.esprit.tp_foyer.config;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Slf4j

public class LoggingAspect {
    @Before("execution(* tn.esprit.tp_foyer.services.FoyerService.*(..))")
    public void logMethodEntry(JoinPoint joinPoint){
        String name = joinPoint.getSignature().getName();
        log.info("In method "+ name +" :");
    }
    @After("execution(* tn.esprit.tp_foyer.services.FoyerService.*(..))")
    public void logMethodEntry1(JoinPoint joinPoint){
        String name = joinPoint.getSignature().getName();
        log.info("out method "+ name +" :");
    }
}
