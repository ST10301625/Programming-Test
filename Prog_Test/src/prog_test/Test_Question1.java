
package prog_test;


public class Test_Question_1 {

    
    public static void main(String[] args) {
        
        int[][] arrPrices = {{10500, 8500},{9500, 7200},{12000, 8000} }; //Declaration of 2D array
        String[] arrCamManufactures = {"CANON", "SONY", "NIKON"}; //Declaration of 1D array
        int iMax = 0; //Declaration to find the camera with the greatest difference
        String iMaxManufacturer = "";
       
        System.out.println("==============================================================================");
        System.out.println("The Camera Technology Report:");  //Format for the technology Report
        System.out.println("==============================================================================");
        System.out.println("\tMIRRORLESS \tDSLR");
        
        for (int i = 0; i < arrCamManufactures.length; i++) {
            String manufacturer = arrCamManufactures[i];
            int mirrorlessPrice = arrPrices[i][0];
            int dslrPrice = arrPrices[i][1];
            System.out.println(manufacturer + "\tR " + mirrorlessPrice + "\t\tR " + dslrPrice);
        }

        System.out.println("==============================================================================");
        System.out.println("The Camera Technology Results:"); //Format for the technology Results
        System.out.println("==============================================================================");
        
        for (int i = 0; i < arrCamManufactures.length; i++) { //Loop to initialize array
            String manufacturer = arrCamManufactures[i];  //Obtaining the Manufacturers/Brands
            int mirrorlessPrice = arrPrices[i][0]; 
            int dslrPrice = arrPrices[i][1];
            int difference = mirrorlessPrice - dslrPrice; //Calculating the difference of the prices

            System.out.println(manufacturer + "\tR" + difference + ".00" + (difference >= 2500 ? " ***" : ""));

            if (Math.abs(difference) > iMax) {  //Returns the absolute value of the price
                iMax = Math.abs(difference);
                iMaxManufacturer = manufacturer;
            }
        }
        // Format to output the Max cost difference
        System.out.println("==============================================================================");
        System.out.println("Camera with the greatest cost difference: " + iMaxManufacturer);
        System.out.println("==============================================================================");
    }
}

