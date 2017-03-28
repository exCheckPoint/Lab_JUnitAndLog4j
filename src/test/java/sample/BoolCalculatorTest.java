package sample;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Admin on 22.03.2017.
 */
public class BoolCalculatorTest {
    //Create 144 loggers
    static Logger logger = Logger.getLogger(String.valueOf(BoolCalculatorTest.class));
    //BinaryConstantZero
    @Test
    public void BinaryConstantZeroNullNull() throws Exception {
        Boolean result = BoolCalculator.f0(null, null);
        Assert.assertEquals(false, result);
        logger.info("Function test was performed BinaryConstantZeroNullNull");
    }

    @Test
    public void BinaryConstantZeroNullFalse() throws Exception {
        Boolean result = BoolCalculator.f0(null, false);
        Assert.assertEquals(false, result);
        logger.info("Function test was performed BinaryConstantZeroNullFalse");
    }

    @Test
    public void BinaryConstantZeroNullTrue() throws Exception {
        Boolean result = BoolCalculator.f0(null, true);
        Assert.assertEquals(false, result);
        logger.info("Function test was performed BinaryConstantZeroNullTrue");
    }

    @Test
    public void BinaryConstantZeroFalseNull() throws Exception {
        Boolean result = BoolCalculator.f0(false, null);
        Assert.assertEquals(false, result);
        logger.info("Function test was performed BinaryConstantZeroFalseNull");
    }

    @Test
    public void BinaryConstantZeroFalseFalse() throws Exception {
        Boolean result = BoolCalculator.f0(false, false);
        Assert.assertEquals(false, result);
        logger.info("Function test was performed BinaryConstantZeroFalseFalse");
    }

    @Test
    public void BinaryConstantZeroFalseTrue() throws Exception {
        Boolean result = BoolCalculator.f0(false, true);
        Assert.assertEquals(false, result);
        logger.info("Function test was performed BinaryConstantZeroFalseTrue");
    }

    @Test
    public void BinaryConstantZeroTrueNull() throws Exception {
        Boolean result = BoolCalculator.f0(true, null);
        Assert.assertEquals(false, result);
        logger.info("Function test was performed BinaryConstantZeroTrueNull");
    }

    @Test
    public void BinaryConstantZeroTrueFalse() throws Exception {
        Boolean result = BoolCalculator.f0(true, false);
        Assert.assertEquals(false, result);
        logger.info("Function test was performed BinaryConstantZeroTrueFalse");
    }

    @Test
    public void BinaryConstantZeroTrueTrue() throws Exception {
        Boolean result = BoolCalculator.f0(true, true);
        Assert.assertEquals(false, result);
        logger.info("Function test was performed BinaryConstantZeroTrueTrue");
    }

    //AND
    @Test
    public void AndNulNull() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f1(null, null);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(null, result);
        logger.info("Function test was performed AndNulNull");
    }

    @Test
    public void AndNullFalse() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f1(null, false);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(null, result);
        logger.info("Function test was performed AndNullFalse");
    }

    @Test
    public void AndNullTrue() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f1(null, true);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(null, result);
        logger.info("Function test was performed AndNullTrue");
    }

    @Test
    public void AndFalseNull() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f1(false, null);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(null, result);
        logger.info("Function test was performed AndFalseNull");
    }

    @Test
    public void AndFalseFalse() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f1(false, false);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(false, result);
        logger.info("Function test was performed AndFalseFalse");
    }

    @Test
    public void AndFalseTrue() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f1(false, true);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(false, result);
        logger.info("Function test was performed AndFalseTrue");
    }

    @Test
    public void AndTrueNull() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f1(true, null);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(null, result);
        logger.info("Function test was performed AndTrueNull");
    }

    @Test
    public void AndTrueFalse() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f1(true, false);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(false, result);
        logger.info("Function test was performed AndTrueFalse");
    }

    @Test
    public void AndTrueTrue() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f1(true, true);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(true, result);
        logger.info("Function test was performed AndTrueTrue");
    }

    //Inhibition (X/Y)
    @Test
    public void InhibitionX_NullNull() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f2(null, null);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(null, result);
        logger.info("Function test was performed InhibitionX_NullNull");
    }

    @Test
    public void InhibitionX_NullFalse() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f2(null, false);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(null, result);
        logger.info("Function test was performed InhibitionX_NullFalse");
    }

    @Test
    public void InhibitionX_NullTrue() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f2(null, true);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(null, result);
        logger.info("Function test was performed InhibitionX_NullTrue");
    }

    @Test
    public void InhibitionX_FalseNull() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f2(false, null);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(null, result);
        logger.info("Function test was performed InhibitionX_FalseNull");
    }

    @Test
    public void InhibitionX_FalseFalse() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f2(false, false);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(false, result);
        logger.info("Function test was performed InhibitionX_FalseFalse");
    }

    @Test
    public void InhibitionX_FalseTrue() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f2(false, true);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(false, result);
        logger.info("Function test was performed InhibitionX_FalseTrue");
    }

    @Test
    public void InhibitionX_TrueNull() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f2(true, null);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(null, result);
        logger.info("Function test was performed InhibitionX_TrueNull");
    }

    @Test
    public void InhibitionX_TrueFalse() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f2(true, false);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(true, result);
        logger.info("Function test was performed InhibitionX_TrueFalse");
    }

    @Test
    public void InhibitionX_TrueTrue() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f2(true, true);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(false, result);
        logger.info("Function test was performed InhibitionX_TrueTrue");
    }

    //Transfer_X
    @Test
    public void TransferX_NullNull() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f3(null, null);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(null, result);
        logger.info("Function test was performed TransferX_NullNull");
    }

    @Test
    public void TransferX_NullFalse() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f3(null, false);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(null, result);
        logger.info("Function test was performed TransferX_NullFalse");
    }

    @Test
    public void TransferX_NullTrue() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f3(null, true);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(null, result);
        logger.info("Function test was performed TransferX_NullTrue");
    }

    @Test
    public void TransferX_FalseNull() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f3(false, null);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(false, result);
        logger.info("Function test was performed TransferX_FalseNull");
    }

    @Test
    public void TransferX_FalseFalse() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f3(false, false);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(false, result);
        logger.info("Function test was performed TransferX_FalseFalse");
    }

    @Test
    public void TransferX_FalseTrue() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f3(false, true);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(false, result);
        logger.info("Function test was performed TransferX_FalseTrue");
    }

    @Test
    public void TransferX_TrueNull() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f3(true, null);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(true, result);
        logger.info("Function test was performed TransferX_TrueNull");
    }

    @Test
    public void TransferX_TrueFalse() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f3(true, false);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(true, result);
        logger.info("Function test was performed TransferX_TrueFalse");
    }

    @Test
    public void TransferX_TrueTrue() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f3(true, true);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(true, result);
        logger.info("Function test was performed TransferX_TrueTrue");
    }

    // Inhibition (Y/X)*/
    @Test
    public void InhibitionY_NullNull() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f4(null, null);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(null, result);
        logger.info("Function test was performed InhibitionY_NullNull");
    }

    @Test
    public void InhibitionY_NullFalse() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f4(null, false);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(null, result);
        logger.info("Function test was performed BinaryConstantZeroNullNull");
    }

    @Test
    public void InhibitionY_NullTrue() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f4(null, true);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(null, result);
        logger.info("Function test was performed BinaryConstantZeroNullNull");
    }

    @Test
    public void InhibitionY_FalseNull() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f4(false, null);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(null, result);
        logger.info("Function test was performed InhibitionY_FalseNull");
    }

    @Test
    public void InhibitionY_FalseFalse() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f4(false, false);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(false, result);
        logger.info("Function test was performed BinaryConstantZeroNullNull");
    }

    @Test
    public void InhibitionY_FalseTrue() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f4(false, true);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(true, result);
        logger.info("Function test was performed InhibitionY_FalseTrue");
    }

    @Test
    public void InhibitionY_TrueNull() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f4(true, null);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(null, result);
        logger.info("Function test was performed InhibitionY_TrueNull");
    }

    @Test
    public void InhibitionY_TrueFalse() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f4(true, false);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(false, result);
        logger.info("Function test was performed InhibitionY_TrueFalse");
    }

    @Test
    public void InhibitionY_TrueTrue() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f4(true, true);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(false, result);
        logger.info("Function test was performed InhibitionY_TrueTrue");
    }

    //Transfer_Y
    @Test
    public void TransferY_NullNull() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f5(null, null);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(null, result);
        logger.info("Function test was performed TransferY_NullNull");
    }

    @Test
    public void TransferY_NullFalse() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f5(null, false);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(false, result);
        logger.info("Function test was performed TransferY_NullFalse");
    }

    @Test
    public void TransferY_NullTrue() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f5(null, true);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(true, result);
        logger.info("Function test was performed TransferY_NullTrue");
    }

    @Test
    public void TransferY_FalseNull() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f5(false, null);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(null, result);
        logger.info("Function test was performed TransferY_FalseNull");
    }

    @Test
    public void TransferY_FalseFalse() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f5(false, false);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(false, result);
        logger.info("Function test was performed TransferY_FalseFalse");
    }

    @Test
    public void TransferY_FalseTrue() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f5(false, true);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(true, result);
        logger.info("Function test was performed TransferY_FalseTrue");
    }

    @Test
    public void TransferY_TrueNull() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f5(true, null);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(null, result);
        logger.info("Function test was performed TransferY_TrueNull");
    }

    @Test
    public void TransferY_TrueFalse() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f5(true, false);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(false, result);
        logger.info("Function test was performed TransferY_TrueFalse");
    }

    @Test
    public void TransferY_TrueTrue() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f5(true, true);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(true, result);
        logger.info("Function test was performed TransferY_TrueTrue");
    }

    /// XOR
    @Test
    public void XorNullNull() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f6(null, null);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(null, result);
        logger.info("Function test was performed XorNullNull");
    }

    @Test
    public void XorNullFalse() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f6(null, false);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(null, result);
        logger.info("Function test was performed XorNullFalse");
    }

    @Test
    public void XorNullTrue() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f6(null, true);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(null, result);
        logger.info("Function test was performed XorNullTrue");
    }

    @Test
    public void XorFalseNull() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f6(false, null);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(null, result);
        logger.info("Function test was performed XorFalseNull");
    }

    @Test
    public void XorFalseFalse() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f6(false, false);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(false, result);
        logger.info("Function test was performed XorFalseFalse");
    }

    @Test
    public void XorFalseTrue() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f6(false, true);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(true, result);
        logger.info("Function test was performed XorFalseTrue");
    }

    @Test
    public void XorTrueNull() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f6(true, null);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(null, result);
        logger.info("Function test was performed XorTrueNull");
    }

    @Test
    public void XorTrueFalse() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f6(true, false);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(true, result);
        logger.info("Function test was performed XorTrueFalse");
    }

    @Test
    public void XorTrueTrue() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f6(true, true);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(false, result);
        logger.info("Function test was performed XorTrueTrue");
    }

    // OR
    @Test
    public void OrNullNull() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f7(null, null);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(null, result);
        logger.info("Function test was performed OrNullNull");
    }

    @Test
    public void OrNullFalse() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f7(null, false);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(null, result);
        logger.info("Function test was performed OrNullFalse");
    }

    @Test
    public void OrNullTrue() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f7(null, true);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(true, result);
        logger.info("Function test was performed OrNullTrue");
    }

    @Test
    public void OrFalseNull() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f7(false, null);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(null, result);
        logger.info("Function test was performed OrFalseNull");
    }

    @Test
    public void OrFalseFalse() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f7(false, false);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(false, result);
        logger.info("Function test was performed OrFalseFalse");
    }

    @Test
    public void OrFalseTrue() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f7(false, true);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(true, result);
        logger.info("Function test was performed OrFalseTrue");
    }

    @Test
    public void OrTrueNull() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f7(true, null);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(true, result);
        logger.info("Function test was performed OrTrueNull");
    }

    @Test
    public void OrTrueFalse() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f7(true, false);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(true, result);
        logger.info("Function test was performed OrTrueFalse");
    }

    @Test
    public void OrTrueTrue() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f7(true, true);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(true, result);
        logger.info("Function test was performed OrTrueTrue");
    }

    // NOR
    @Test
    public void NorNullNull() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f8(null, null);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(null, result);
        logger.info("Function test was performed NorNullNull");
    }

    @Test
    public void NorNullFalse() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f8(null, false);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(null, result);
        logger.info("Function test was performed BinaryConstantZeroNullNull");
    }

    @Test
    public void NorNullTrue() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f8(null, true);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(false, result);
        logger.info("Function test was performed BinaryConstantZeroNullNull");
    }

    @Test
    public void NorFalseNull() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f8(false, null);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(null, result);
        logger.info("Function test was performed BinaryConstantZeroNullNull");
    }

    @Test
    public void NorFalseFalse() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f8(false, false);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(true, result);
        logger.info("Function test was performed BinaryConstantZeroNullNull");
    }

    @Test
    public void NorFalseTrue() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f8(false, true);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(false, result);
        logger.info("Function test was performed BinaryConstantZeroNullNull");
    }

    @Test
    public void NorTrueNull() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f8(true, null);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(false, result);
        logger.info("Function test was performed BinaryConstantZeroNullNull");
    }

    @Test
    public void NorTrueFalse() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f8(true, false);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(false, result);
        logger.info("Function test was performed BinaryConstantZeroNullNull");
    }

    @Test
    public void NorTrueTrue() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f8(true, true);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(false, result);
        logger.info("Function test was performed BinaryConstantZeroNullNull");
    }

    //Equivalence
    @Test
    public void EquivalenceNullNull() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f9(null, null);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(null, result);
        logger.info("Function test was performed BinaryConstantZeroNullNull");
    }

    @Test
    public void EquivalenceNullFalse() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f9(null, false);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(null, result);
        logger.info("Function test was performed BinaryConstantZeroNullNull");
    }

    @Test
    public void EquivalenceNullTrue() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f9(null, true);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(null, result);
        logger.info("Function test was performed BinaryConstantZeroNullNull");
    }

    @Test
    public void EquivalenceFalseNull() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f9(false, null);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(null, result);
        logger.info("Function test was performed BinaryConstantZeroNullNull");
    }

    @Test
    public void EquivalenceFalseFalse() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f9(false, false);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(true, result);
        logger.info("Function test was performed BinaryConstantZeroNullNull");
    }

    @Test
    public void EquivalenceFalseTrue() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f9(false, true);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(false, result);
        logger.info("Function test was performed BinaryConstantZeroNullNull");
    }

    @Test
    public void EquivalenceTrueNull() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f9(true, null);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(null, result);
        logger.info("Function test was performed BinaryConstantZeroNullNull");
    }

    @Test
    public void EquivalenceTrueFalse() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f9(true, false);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(false, result);
        logger.info("Function test was performed BinaryConstantZeroNullNull");
    }

    @Test
    public void EquivalenceTrueTrue() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f9(true, true);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(true, result);
        logger.info("Function test was performed BinaryConstantZeroNullNull");
    }

    //NOT Y
    @Test
    public void NotY_NullNull() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f10(null, null);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(null, result);
        logger.info("Function test was performed BinaryConstantZeroNullNull");
    }

    @Test
    public void NotY_NullFalse() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f10(null, false);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(true, result);
        logger.info("Function test was performed BinaryConstantZeroNullNull");
    }

    @Test
    public void NotY_NullTrue() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f10(null, true);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(false, result);
        logger.info("Function test was performed BinaryConstantZeroNullNull");
    }

    @Test
    public void NotY_FalseNull() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f10(false, null);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(null, result);
        logger.info("Function test was performed BinaryConstantZeroNullNull");
    }

    @Test
    public void NotY_FalseFalse() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f10(false, false);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(true, result);
        logger.info("Function test was performed BinaryConstantZeroNullNull");
    }

    @Test
    public void NotY_FalseTrue() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f10(false, true);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(false, result);
        logger.info("Function test was performed BinaryConstantZeroNullNull");
    }

    @Test
    public void NotY_TrueNull() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f10(true, null);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(null, result);
        logger.info("Function test was performed BinaryConstantZeroNullNull");
    }

    @Test
    public void NotY_TrueFalse() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f10(true, false);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(true, result);
        logger.info("Function test was performed BinaryConstantZeroNullNull");
    }

    @Test
    public void NotY_TrueTrue() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f10(true, true);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(false, result);
        logger.info("Function test was performed BinaryConstantZeroNullNull");
    }

    // ANTI_IMPLICATION
    @Test
    public void AntiImplicationNullNull() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f11(null, null);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(null, result);
        logger.info("Function test was performed BinaryConstantZeroNullNull");
    }

    @Test
    public void AntiImplicationNullFalse() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f11(null, false);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(null, result);
        logger.info("Function test was performed BinaryConstantZeroNullNull");
    }

    @Test
    public void AntiImplicationNullTrue() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f11(null, true);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(null, result);
        logger.info("Function test was performed BinaryConstantZeroNullNull");
    }

    @Test
    public void AntiImplicationFalseNull() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f11(false, null);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(null, result);
        logger.info("Function test was performed BinaryConstantZeroNullNull");
    }

    @Test
    public void AntiImplicationFalseFalse() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f11(false, false);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(true, result);
        logger.info("Function test was performed BinaryConstantZeroNullNull");
    }

    @Test
    public void AntiImplicationFalseTrue() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f11(false, true);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(false, result);
        logger.info("Function test was performed BinaryConstantZeroNullNull");
    }

    @Test
    public void AntiImplicationTrueNull() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f11(true, null);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(null, result);
        logger.info("Function test was performed BinaryConstantZeroNullNull");
    }

    @Test
    public void AntiImplicationTrueFalse() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f11(true, false);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(true, result);
        logger.info("Function test was performed BinaryConstantZeroNullNull");
    }

    @Test
    public void AntiImplicationTrueTrue() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f11(true, true);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(true, result);
        logger.info("Function test was performed BinaryConstantZeroNullNull");
    }

    //Not_X
    @Test
    public void NotX_NullNull() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f12(null, null);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(null, result);
        logger.info("Function test was performed BinaryConstantZeroNullNull");
    }

    @Test
    public void NotX_NullFalse() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f12(null, false);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(null, result);
        logger.info("Function test was performed BinaryConstantZeroNullNull");
    }

    @Test
    public void NotX_NullTrue() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f12(null, true);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(null, result);
        logger.info("Function test was performed BinaryConstantZeroNullNull");
    }

    @Test
    public void NotX_FalseNull() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f12(false, null);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(true, result);
        logger.info("Function test was performed BinaryConstantZeroNullNull");
    }

    @Test
    public void NotX_FalseFalse() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f12(false, false);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(true, result);
        logger.info("Function test was performed BinaryConstantZeroNullNull");
    }

    @Test
    public void NotX_FalseTrue() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f12(false, true);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(true, result);
        logger.info("Function test was performed BinaryConstantZeroNullNull");
    }

    @Test
    public void NotX_TrueNull() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f12(true, null);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(false, result);
        logger.info("Function test was performed BinaryConstantZeroNullNull");
    }

    @Test
    public void NotX_TrueFalse() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f12(true, false);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(false, result);
        logger.info("Function test was performed BinaryConstantZeroNullNull");
    }

    @Test
    public void NotX_TrueTrue() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f12(true, true);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(false, result);
        logger.info("Function test was performed BinaryConstantZeroNullNull");
    }

    // Implication
    @Test
    public void ImplicationNullNull() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f13(null, null);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(null, result);
        logger.info("Function test was performed BinaryConstantZeroNullNull");
    }

    @Test
    public void ImplicationNullFalse() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f13(null, false);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(null, result);
        logger.info("Function test was performed BinaryConstantZeroNullNull");
    }

    @Test
    public void ImplicationNullTrue() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f13(null, true);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(null, result);
        logger.info("Function test was performed BinaryConstantZeroNullNull");
    }

    @Test
    public void ImplicationFalseNull() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f13(false, null);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(null, result);
        logger.info("Function test was performed BinaryConstantZeroNullNull");
    }

    @Test
    public void ImplicationFalseFalse() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f13(false, false);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(true, result);
        logger.info("Function test was performed BinaryConstantZeroNullNull");
    }

    @Test
    public void ImplicationFalseTrue() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f13(false, true);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(true, result);
        logger.info("Function test was performed BinaryConstantZeroNullNull");
    }

    @Test
    public void ImplicationTrueNull() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f13(true, null);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(null, result);
        logger.info("Function test was performed BinaryConstantZeroNullNull");
    }

    @Test
    public void ImplicationTrueFalse() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f13(true, false);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(false, result);
        logger.info("Function test was performed BinaryConstantZeroNullNull");
    }

    @Test
    public void ImplicationTrueTrue() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f13(true, true);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(true, result);
        logger.info("Function test was performed BinaryConstantZeroNullNull");
    }

    // NOT AND
    @Test
    public void NotAndNullNull() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f14(null, null);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(null, result);
        logger.info("Function test was performed BinaryConstantZeroNullNull");
    }

    @Test
    public void NotAndNullFalse() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f14(null, false);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(null, result);
        logger.info("Function test was performed BinaryConstantZeroNullNull");
    }

    @Test
    public void NotAndNullTrue() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f14(null, true);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(null, result);
        logger.info("Function test was performed BinaryConstantZeroNullNull");
    }

    @Test
    public void NotAndFalseNull() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f14(false, null);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(null, result);
        logger.info("Function test was performed BinaryConstantZeroNullNull");
    }

    @Test
    public void NotAndFalseFalse() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f14(false, false);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(true, result);
        logger.info("Function test was performed BinaryConstantZeroNullNull");
    }

    @Test
    public void NotAndFalseTrue() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f14(false, true);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(true, result);
        logger.info("Function test was performed BinaryConstantZeroNullNull");
    }

    @Test
    public void NotAndTrueNull() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f14(true, null);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(null, result);
        logger.info("Function test was performed BinaryConstantZeroNullNull");
    }

    @Test
    public void NotAndTrueFalse() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f14(true, false);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(true, result);
        logger.info("Function test was performed BinaryConstantZeroNullNull");
    }

    @Test
    public void NotAndTrueTrue() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f14(true, true);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(false, result);
        logger.info("Function test was performed BinaryConstantZeroNullNull");
    }

    // BinaryConstantOne
    @Test
    public void BinaryConstantOneNullNull() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f15(null, null);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(true, result);
        logger.info("Function test was performed BinaryConstantZeroNullNull");
    }

    @Test
    public void BinaryConstantOneNullFalse() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f15(null, false);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(true, result);
        logger.info("Function test was performed BinaryConstantZeroNullNull");
    }

    @Test
    public void BinaryConstantOneNullTrue() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f15(null, true);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(true, result);
        logger.info("Function test was performed BinaryConstantZeroNullNull");
    }

    @Test
    public void BinaryConstantOneFalseNull() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f15(false, null);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(true, result);
        logger.info("Function test was performed BinaryConstantZeroNullNull");
    }

    @Test
    public void BinaryConstantOneFalseFalse() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f15(false, false);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(true, result);
        logger.info("Function test was performed BinaryConstantZeroNullNull");
    }

    @Test
    public void BinaryConstantOneFalseTrue() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f15(false, true);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(true, result);
        logger.info("Function test was performed BinaryConstantZeroNullNull");
    }

    @Test
    public void BinaryConstantOneTrueNull() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f15(true, null);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(true, result);
        logger.info("Function test was performed BinaryConstantZeroNullNull");
    }

    @Test
    public void BinaryConstantOneTrueFalse() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f15(true, false);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(true, result);
        logger.info("Function test was performed BinaryConstantZeroNullNull");
    }

    @Test
    public void BinaryConstantOneTrueTrue() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f15(true, true);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(true, result);
        logger.info("Function test was performed BinaryConstantZeroNullNull");
    }
}