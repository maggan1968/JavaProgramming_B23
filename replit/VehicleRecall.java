public class VehicleRecall {

        public static void main(String[] args) {

            int yearOfVehicle = 2005;
            String result = "";

            if (yearOfVehicle >= 1995 && yearOfVehicle <= 1998 ||
                    yearOfVehicle >= 2001 && yearOfVehicle <= 2002 ||
                    yearOfVehicle >= 2004 && yearOfVehicle <= 2006 ||
                    yearOfVehicle >= 2015 && yearOfVehicle <= 2017) {
                result = "Your vehicle needs to be recalled!";
            } else {
                result = "Your vehicle is fine, enjoy!";
            }
            System.out.println(result);
        }
    }

