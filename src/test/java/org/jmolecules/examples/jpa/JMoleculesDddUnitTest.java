package org.jmolecules.examples.jpa;

import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import org.jmolecules.archunit.JMoleculesDddRules;

@AnalyzeClasses(packages = "org.jmolecules.examples.jpa")
public class JMoleculesDddUnitTest {

    @ArchTest
    void whenCheckingAllClasses_thenCodeFollowsAllDddPrinciples( JavaClasses classes) {
        JMoleculesDddRules.all()
                .check(classes);
    }
}
