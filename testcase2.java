import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class testcase2 {

    public static int WaterM, ElectM;
    public static int resultBill;

    public static int currentWaterMeter, lastWaterMeterM;
    public static int currentElectMeter, lastElectMeterM;

    public static int calculateWaterBill() {
        if (currentWaterMeter >= lastWaterMeterM) {
            WaterM = (currentWaterMeter - lastWaterMeterM) * 5;
        }
        return WaterM;
    }

    public static int calculateElectBill() {
        if (currentElectMeter >= lastElectMeterM) {
            ElectM = (currentElectMeter - lastElectMeterM) * 6;
        }
        return ElectM;
    }

    public static int calculateResultBill(String roomType) {
        if (roomType.equals("5")) {
            resultBill = 1500 + calculateElectBill() + calculateWaterBill();
        } else if (roomType.equals("0")) {
            resultBill = 2000 + calculateElectBill() + calculateWaterBill();
        }
        return resultBill;
    }

    @Test
    public void testCalculateResultBill() {
        currentElectMeter = 50;
        lastElectMeterM = 20;
        currentWaterMeter = 100;
        lastWaterMeterM = 50;

        int result = calculateResultBill("0");
        assertEquals(2430, result); 
    }

    @Test
    public void testCalculateResultBill2() {
        currentElectMeter = 60;
        lastElectMeterM = 40;
        currentWaterMeter = 150;
        lastWaterMeterM = 100;

        int result = calculateResultBill("5");
        assertEquals(1870, result); 
    }

    @Test
    public void testCalculateResultBill3() {
        currentElectMeter = 20;
        lastElectMeterM = 10;
        currentWaterMeter = 50;
        lastWaterMeterM = 30;

        int result = calculateResultBill("0");
        assertEquals(2160, result); 
    }

    @Test
    public void testCalculateResultBill4() {
        currentElectMeter = 80;
        lastElectMeterM = 20;
        currentWaterMeter = 200;
        lastWaterMeterM = 150;

        int result = calculateResultBill("0");
        assertEquals(2610, result); 
    }

    @Test
    public void testCalculateResultBill5() {
        currentElectMeter = 100;
        lastElectMeterM = 100;
        currentWaterMeter = 200;
        lastWaterMeterM = 150;

        int result = calculateResultBill("0");
        assertEquals(2250, result); 
    }

    @Test
    public void testCalculateResultBill6() {
        currentElectMeter = 10;
        lastElectMeterM = 5;
        currentWaterMeter = 20;
        lastWaterMeterM = 10;

        int result = calculateResultBill("0");
        assertEquals(2080, result); 
    }

    

    public static void main(String[] args) {
        currentElectMeter = 50;
        lastElectMeterM = 20;

        currentWaterMeter = 100;
        lastWaterMeterM = 50;

        System.out.println("Your bill is: " + calculateResultBill("0"));
    }
}
