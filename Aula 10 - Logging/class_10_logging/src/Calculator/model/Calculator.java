package Calculator.model;


import org.apache.log4j.Logger;

public class Calculator {
    /** Attributes **/
    private static final Logger logger = Logger.getLogger(Calculator.class);

    private int value1, value2;

    /** Constructor **/
    public Calculator(int value1, int value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    /** Methods **/
    public int sum() {
        return value1 + value2;
    }

    public int subtract() {
        return value1 - value2;
    }

    public int multiply() {
        return value1 * value2;
    }

    public double divide() {
        logger.info("Division attempt: " + value1 + "/" + value2);
        try {
            logger.debug("Try from division");
            return value1 / value2;
        } catch (Exception e) {
            logger.error("Division went wrong: ", e);
            return 0;
        }
    }
}
