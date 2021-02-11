package com.FormTemplates.Registration.stepFunctions;

import com.FormTemplates.Registration.utils.DriverFactory;
import java.io.IOException;

public class StudentRegistrationStepDef extends DriverFactory {
        pageInits.studentRegForm.loadStudentRegistrationPage();

        pageInits.studentRegForm.enterStudentData();

        pageInits.studentRegForm.submitForm();


}
