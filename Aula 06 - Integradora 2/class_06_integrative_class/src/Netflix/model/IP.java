package Netflix.model;

public class IP {
//    Attributes
    private int[] number = new int[4];

//    Constructor
    public IP(int number1, int number2, int number3, int number4) {
        this.number[0] = number1;
        this.number[1] = number2;
        this.number[2] = number3;
        this.number[3] = number4;
    }

//    Getters/Setters
    public int[] getNumber() {
        return number;
    }

    public void setNumber(int[] number) {
        this.number = number;
    }

    //    Method
    public String getCountry() {
        String country = "";
        if (this.number[0] >= 0 && this.number[0] <= 49) {
            country = "Argentina";
        } else if (this.number[0] >= 50 && this.number[0] <= 99) {
            country = "Brazil";
        } else if (this.number[0] >= 100 && this.number[0] <= 149) {
            country = "Colombia";
        }
        return country;
    }

//    toString
    @Override
    public String toString() {
        return "IP = " + this.number[0] + "." + this.number[1] + "." + this.number[2] + "." + this.number[3];
    }
}
