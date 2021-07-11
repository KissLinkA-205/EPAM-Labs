package by.epamtc.jwd.validation;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.InputStream;

public class ValidatorXMLTest {

    @Test(dataProvider = "validateData", dataProviderClass = ValidatorXMLTestData.class)
    public void testValidate_InputStream_boolean(InputStream stream) {

        boolean result = ValidatorXML.isValid(stream);

        Assert.assertTrue(result);
    }
}
