import kz.azaitken.service.ArabicToRomanNumberConverter;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WhenArabicNumberConvertToRoman {

    private ArabicToRomanNumberConverter arabicToRomanNumberConverter;
    private String romanNumber;
    @Before
    public void before_test(){
        arabicToRomanNumberConverter = new ArabicToRomanNumberConverter();
    }
    @After
    public void after_test(){
        arabicToRomanNumberConverter = null;
    }

    @Test
    public void convert_0_to_emptyString(){
        int String = 55;
        this.romanNumber = this.arabicToRomanNumberConverter.convert(0);
        assertEquals("",romanNumber);
    }

    @Test
    public void convert_1_to_I(){
        this.romanNumber = this.arabicToRomanNumberConverter.convert(1);
        assertEquals("I",romanNumber);
    }

    @Test
    public void convert_2_to_II(){
        this.romanNumber = this.arabicToRomanNumberConverter.convert(2);
        assertEquals("II",romanNumber);
    }

    @Test
    public void convert_3_to_III(){
        this.romanNumber = this.arabicToRomanNumberConverter.convert(3);
        assertEquals("III",romanNumber);
    }

    @Test
    public void convert_5_to_V(){
        this.romanNumber = this.arabicToRomanNumberConverter.convert(5);
        assertEquals("V",romanNumber);
    }

    @Test
    public void convert_6_to_VI(){
        this.romanNumber = this.arabicToRomanNumberConverter.convert(6);
        assertEquals("VI",romanNumber);
    }
}
