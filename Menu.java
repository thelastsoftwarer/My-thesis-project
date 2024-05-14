import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Air_conditioning airConditioning = new Air_conditioning();
        oven ov = new oven();
        Refrigerator cupboard = new Refrigerator();
        Fluorescent_Lamp fluorescentLamp = new Fluorescent_Lamp();
        lightbulb lightbul = new lightbulb();
        cyclic abc=new dishwasher();
        cyclic abcd=new washing_machine();
        washing_machine washing=new washing_machine();
        dishwasher dishwasherr=new dishwasher();
        System.out.println(abc.name());
        int choice;
        do {
            System.out.println("*********** MENU ***********");
            System.out.println("1. Air Conditioning");
            System.out.println("2. Oven");
            System.out.println("3. Refrigerator");
            System.out.println("4. Fluorescent Lamp");
            System.out.println("5. Lightbulb");
            System.out.println("6. Washing Machine");
            System.out.println("7. Dishwasher");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("*********** AIR CONDITIONING MENU ***********");
                    System.out.println("1. Open");
                    System.out.println("2. Close");
                    System.out.println("3. Set Temperature");
                    System.out.println("4. Set Fan Speed");
                    System.out.println("5. Increase one degree temperature");
                    System.out.println("6. Decrease one degree temperature");
                    System.out.println("7. Increase one unit fan speed ");
                    System.out.println("8. Decrease one unit fan speed ");
                    System.out.println("9. Do minimum temperature ");
                    System.out.println("10.Do maximum temperature ");
                    System.out.println("11.Learn temperature ");
                    System.out.println("12.Learn fan speed ");
                    System.out.println("13.Active energy mode ");
                    System.out.println("14.Deactive energy mode ");
                    System.out.println("15.Now automatic mode? ");
                    System.out.println("16.Clean air ");
                    System.out.println("17.Turn on sleep mode ");
                    System.out.println("18.Turn of sleep mode ");
                    System.out.println("19.Set timer ");

                    System.out.println("0. Back to main menu");
                    System.out.print("Enter your choice: ");
                    int acChoice = scanner.nextInt();
                    switch (acChoice) {
                        case 1:
                            airConditioning.open();
                           System.out.println(airConditioning.type()); 
                            break;
                        case 2:
                            airConditioning.close();
                            break;
                        case 3:
                            System.out.println("Enter temperature: ");
                            int temperature = scanner.nextInt();
                            airConditioning.setTemperature(temperature);
                            break;
                        case 4:
                            System.out.println("Enter fan speed: ");
                            int fanSpeed = scanner.nextInt();
                            scanner.nextLine(); 
                            System.out.println("Do you want turbo mode? If you want say yes enter y if not enter n");
                            String Turbo = scanner.nextLine();
                            
                            if (fanSpeed > 10) {
                                airConditioning.setFanSpeed();
                                break;
                            } else if (Turbo.equals("y")) { 
                                airConditioning.setFanSpeed(fanSpeed, true);
                                break;
                            } else {
                                airConditioning.setFanSpeed(fanSpeed);
                                break;
                            }

                           
                        case 5:
                            System.out.println(":Increased one degree ");
                            airConditioning.increaseTemperature();
                            break;
                        case 6:
                            System.out.println(":Increased one degree ");
                            airConditioning.decreaseTemperature();
                            break;
                        case 7:
                            System.out.println(":Increased one unit fan speed ");
                            airConditioning.increaseFanSpeed();
                            break;
                        case 8:
                            System.out.println(":Decreased one unit fan fan speed ");
                            airConditioning.decreaseFanSpeed();
                            break;
                        case 9:
                            System.out.println(":Set to lowest temperature ");
                            airConditioning.setTemperaturemin();
                            System.out.println("Your Air Conditioning temperature is "+airConditioning.getMinTemperature());
                            break;
                        case 10:
                            System.out.println(":Set to highest temperature ");
                            airConditioning.setTemperaturemax();
                            System.out.println("Your Air Conditioning temperature is "+airConditioning.getMaxTemperature());
                            break;
                        case 11:
                            System.out.println("Temperature now : "+airConditioning.getTemperature());
                            break;
                        case 12:
                            System.out.println("Fan speed now : "+airConditioning.getFanSpeed());
                            break;
                        case 13:
                        	airConditioning.activateEnergySavingMode();
                        	break;
                        case 14:
                        	airConditioning.deactivateEnergySavingMode();
                        	break;
                        case 15:
                        	airConditioning.isAutomaticMode();
                        	break;
                        case 16:
                        	airConditioning.cleanAir();     
                        	break;
                        case 17:
                        	airConditioning.turnOnSleepMode();
                        	airConditioning.setFanSpeed(1);
                        	break;
                        case 18:
                        	airConditioning.turnOffSleepMode();
                        	airConditioning.setFanSpeed(2);
                        	break;
                        case 19:
                        	 System.out.println("Enter time: ");
                             int timer = scanner.nextInt();
                             airConditioning.setTimer(timer);  
                        	break;
                                                    
                        case 0:
                            break;
                        default:
                            System.out.println("Invalid choice!");
                    }
                    break;
                case 2:
                	System.out.println("*********** OVEN MENU ***********");
                    System.out.println("1. Open");
                    System.out.println("2. Close");
                    System.out.println("3. Set Temperature");
                    System.out.println("4. Set Fan Speed");
                    System.out.println("5. Increase one degree temperature");
                    System.out.println("6. Decrease one degree temperature");
                    System.out.println("7. Increase one unit fan speed ");
                    System.out.println("8. Decrease one unit fan speed ");
                    System.out.println("9. Do minimum temperature ");
                    System.out.println("10.Do maximum temperature ");
                    System.out.println("11.Learn temperature ");
                    System.out.println("12.Learn fan speed ");
                    System.out.println("13.Set timer ");
                    System.out.println("0. Back to main menu");
                    System.out.print("Enter your choice: ");
                    int achoice = scanner.nextInt();
                    switch (achoice) {
                    case 1:
                        ov.open();
                       System.out.println(ov.type()); 
                        break;
                    case 2:
                        ov.close();
                        break;
                    case 3:
                        System.out.println("Enter temperature: ");
                        int temperature = scanner.nextInt();
                        ov.setTemperature(temperature);
                        break;
                    case 4:
                        System.out.println("Enter fan speed: ");
                        int fanSpeed = scanner.nextInt();
                        scanner.nextLine(); 
                        System.out.println("Do you want turbo mode? If you want say yes enter y if not enter n");
                        String Turbo = scanner.nextLine();
                        
                        if (fanSpeed > 10) {
                            ov.setFanSpeed(fanSpeed);
                            break;
                        } else if (Turbo.equals("y")) { 
                            ov.setFanSpeed(fanSpeed, true);
                            break;
                        } else {
                            ov.setFanSpeed(fanSpeed);
                            break;
                        }

                       
                    case 5:
                        System.out.println(":Increased one degree ");
                        ov.increaseTemperature();
                        break;
                    case 6:
                        System.out.println(":Increased one degree ");
                        ov.decreaseTemperature();
                        break;
                    case 7:
                        System.out.println(":Increased one unit fan speed ");
                        ov.increaseFanSpeed();
                        break;
                    case 8:
                        System.out.println(":Decreased one unit fan fan speed ");
                        ov.decreaseFanSpeed();
                        break;
                    case 9:
                        System.out.println(":Set to lowest temperature ");
                        ov.setTemperaturemin();
                        System.out.println("Your oven temperature is "+ov.getMinTemperature());
                        break;
                    case 10:
                        System.out.println(":Set to highest temperature ");
                        ov.setTemperaturemax();
                        System.out.println("Your oven temperature is "+ov.getMaxTemperature());
                        break;
                    case 11:
                        System.out.println("Temperature now : "+ov.getTemperature());
                        break;
                    case 12:
                        System.out.println("Fan speed now : "+ov.getFanSpeed());
                        break;
                    case 13:
                   	 System.out.println("Enter time: ");
                        int timer = scanner.nextInt();
                        ov.setTimer(timer);  
                   	break;
                                                
                    case 0:
                        break;
                    default:
                        System.out.println("Invalid choice!");
                }
                break;
                   
                case 3:
                	System.out.println("*********** REFRIGERATOR MENU ***********");
                    System.out.println("1. Open");
                    System.out.println("2. Close");
                    System.out.println("3. Set Temperature");
                    System.out.println("4. Set Fan Speed");
                    System.out.println("5. Increase one degree temperature");
                    System.out.println("6. Decrease one degree temperature");
                    System.out.println("7. Increase one unit fan speed ");
                    System.out.println("8. Decrease one unit fan speed ");
                    System.out.println("9. Do minimum temperature ");
                    System.out.println("10.Do maximum temperature ");
                    System.out.println("11.Learn temperature ");
                    System.out.println("12.Learn Fan speed ");
                    System.out.println("13.Set Mode ");


                    System.out.println("0. Back to main menu");
                    System.out.print("Enter your choice: ");
                    int refchoice = scanner.nextInt();
                    switch (refchoice) {
                    case 1:
                        cupboard.open();
                       System.out.println(cupboard.type()); 
                        break;
                    case 2:
                    	cupboard.close();
                        break;
                    case 3:
                        System.out.println("Enter temperature: ");
                        int temperature = scanner.nextInt();
                        cupboard.setTemperature(temperature);;
                        break;
                    case 4:
                        System.out.println("Enter fan speed: ");
                        int fanSpeed = scanner.nextInt();
                        scanner.nextLine();
                        	cupboard.setFanSpeed(fanSpeed);
                            break;
                       
                    case 5:
                        System.out.println(":Increased one degree ");
                        cupboard.increaseTemperature();
                        break;
                    case 6:
                        System.out.println(":Increased one degree ");
                        cupboard.decreaseTemperature();
                        break;
                    case 7:
                        System.out.println(":Increased one unit fan speed ");
                        cupboard.increaseFanSpeed();
                        break;
                    case 8:
                        System.out.println(":Decreased one unit fan fan speed ");
                        cupboard.decreaseFanSpeed();
                        break;
                    case 9:
                        System.out.println(":Set to lowest temperature ");
                        cupboard.setTemperaturemin();
                        System.out.println("Your oven temperature is "+cupboard.getMinTemperature());
                        break;
                    case 10:
                        System.out.println(":Set to highest temperature ");
                        cupboard.setTemperaturemax();
                        System.out.println("Your oven temperature is "+cupboard.getMaxTemperature());
                        break;
                    case 11:
                        System.out.println("Temperature now : "+cupboard.getTemperature());
                        break;
                    case 12:
                        System.out.println("Fan speed now : "+cupboard.getFanSpeed());
                        break;
                    case 13:
                    	 System.out.println("Which mode do you want now? Enter please");
                         System.out.println("If you want Vegatables mode enter v ");
                         System.out.println("If you want Meat mode enter m ");
                         System.out.println("If you want Drinks mode enter d ");
                         System.out.println("If you dont choose above modes refrigator will be normal mode ");
                         System.out.println("If you choose Vegatables mode temperature will be 10C");
                         System.out.println("If you choose Meat mode temperature will be 4C");
                         System.out.println("If you choose Drinks mode temperature will be 6C");
                         System.out.println("If you dont choose above modes temperature will be 12C");
                         scanner.nextLine();
                        String a=scanner.nextLine();
                        cupboard.setMode(a);
                        
                        break;
                       
                                                
                    case 0:
                        break;
                    default:
                        System.out.println("Invalid choice!");
                }
                break;

                    
                case 4:
                    System.out.println("*********** FLUORESCENT LAMP MENU ***********");
                    System.out.println("1. Open");
                    System.out.println("2. Close");
                    System.out.println("3. Cost Calculation");
                    System.out.println("4. Set Brightness Level");
                    System.out.println("5. Set Minimum Brightness Level");
                    System.out.println("6. Set Maximum Brightness Level");
                    System.out.println("0. Back to main menu");
                    System.out.print("Enter your choice: ");
                    int fluorescentChoice = scanner.nextInt();
                    switch (fluorescentChoice) {
                        case 1:
                            fluorescentLamp.open();
                            fluorescentLamp.setBrightness();

                            break;
                        case 2:
                            fluorescentLamp.close();
                            break;
                        case 3:
                            System.out.print("Enter hours of use: ");
                            int hours=scanner.nextInt();
                            fluorescentLamp.hours=hours;
                            System.out.println("Cost: $" + fluorescentLamp.cost());
                            break;
                        case 4:
                        	 System.out.println("Enter brightness level: ");
                             int brightness = scanner.nextInt();
                           fluorescentLamp.setBrightness(brightness);
                            break;
                        case 5:
                          fluorescentLamp.setBrightnessmin();
                           break;
                        case 6:
                            fluorescentLamp.setBrightnessmax();
                             break;
                        case 0:
                            break;
                        default:
                            System.out.println("Invalid choice!");
                    }
                    break;
                case 5:
                
                    System.out.println("***********  LIGHTBULB  MENU ***********");
                    System.out.println("1. Open");
                    System.out.println("2. Close");
                    System.out.println("3. Cost Calculation");
                    System.out.println("4. Set Brightness Level");
                    System.out.println("5. Set Minimum Brightness Level");
                    System.out.println("6. Set Maximum Brightness Level");


                    System.out.println("0. Back to main menu");
                    System.out.print("Enter your choice: ");
                    int lightbulbchoice = scanner.nextInt();
                    switch (lightbulbchoice) {
                        case 1:
                        	lightbul.open();
                        	lightbul.setBrightness();

                            break;
                        case 2:
                        	lightbul.close();
                            break;
                        case 3:
                            System.out.print("Enter hours of use: ");
                            int hours = scanner.nextInt();
                            System.out.println("Cost: $" + lightbul.cost(hours));
                            break;
                        case 4:
                        	 System.out.println("Enter brightness level: ");
                             int brightness = scanner.nextInt();
                             lightbul.setBrightness(brightness);
                            break;
                        case 5:
                        	lightbul.setBrightnessmin();
                           break;
                        case 6:
                        	lightbul.setBrightnessmax();
                             break;
                        case 0:
                            break;
                        default:
                            System.out.println("Invalid choice!");
                    }
                    
                    break;
                case 6:
                	System.out.println("*********** WASHING MACHINE MENU ***********");
                    System.out.println("1. Open");
                    System.out.println("2. Close");
                    System.out.println("3. Set automatic mode");
                    System.out.println("4. Set mode");
                    System.out.println("5. Set cyclic number maximum for per minute");
                    System.out.println("6. Set cyclic number normal for per minute");
                    System.out.println("7. Set cyclic number minimum for per minute");
                    System.out.println("8. Set timer ");
                    System.out.println("9. Calculate cost  ");
                    System.out.println("10. Get timer ");
                    System.out.println("0. Back to main menu");
                    System.out.print("Enter your choice: ");
                    int acchoice = scanner.nextInt();
                    switch (acchoice) {
                    case 1:
                    	abcd.open();
                       System.out.println(abcd.type()); 
                        break;
                    case 2:
                    	abcd.close();
                        break;
                    case 3:
                        washing.setAutomaticMode(true);
                        System.out.println("Washing machine now on automatic mode");
                       break;
                    case 4:
                      	System.out.println("Which mode do you want now? Enter please");
                        System.out.println("If you want Cotton mode enter c ");
                        System.out.println("If you want Woody mode enter w ");
                        System.out.println("If you want Simple mode enter s ");
                        System.out.println("If you dont choose above modes washing machine will be normal mode ");
                       
                       scanner.nextLine();
                       String a=scanner.nextLine();
                       washing.setMode(a);                 
                   	break;
                    case 5:
                    	washing.setcyclicperminutemax();
                        System.out.println("Washing machine cyclic on max");
                       break;
                    case 6:
                    	abcd.setcyclicperminute();
                        System.out.println("Washing machine cyclic on normal");
                       break;
                    case 7:
                    	washing.setcyclicperminute();
                        System.out.println("Washing machine cyclic on min");
                       break;
                    case 8:
                   	 System.out.println("Enter time: ");
                        int timer = scanner.nextInt();
                        washing.setTimer(timer);  
                   	break;
                   	
                    case 9:
                        System.out.println("Cost is : "+washing.cost());
                        break;
                                
                    case 10:
                    	washing.getTimer();
                        break;                  
                    case 0:
                        break;
                    default:
                        System.out.println("Invalid choice!");
                }
                break;
                case 7:
                	System.out.println("*********** DISHWASHER MENU ***********");
                    System.out.println("1. Open");
                    System.out.println("2. Close");
                    System.out.println("3. Set automatic mode");
                    System.out.println("4. Set mode");
                    System.out.println("5. Set cyclic number maximum for per minute");
                    System.out.println("6. Set cyclic number normal for per minute");
                    System.out.println("7. Set cyclic number minimum for per minute");
                    System.out.println("8. Set timer ");
                    System.out.println("9. Calculate cost  ");
                    System.out.println("10. Get timer ");
                    System.out.println("0. Back to main menu");
                    System.out.print("Enter your choice: ");
                    int cchoice = scanner.nextInt();
                    switch (cchoice) {
                    case 1:
                        abc.open();
                       System.out.println(abc.type()); 
                        break;
                    case 2:
                        abc.close();
                        break;
                    case 3:
                         dishwasherr.setAutomaticMode(true);
                         System.out.println("Dishwasher now on automatic mode");
                        break;
                    case 4:
                      	System.out.println("Which mode do you want now? Enter please");
                        System.out.println("If you want Long mode enter l ");
                        System.out.println("If you want Short mode enter s ");
                        System.out.println("If you want Normal mode enter n ");
                        System.out.println("If you dont choose above modes dishwasher will be normal mode ");
                       
                       scanner.nextLine();
                       String a=scanner.nextLine();
                       dishwasherr.setMode(a);                 
                       break;
                    case 5:
                        dishwasherr.setcyclicperminutemax();
                        System.out.println("Dishwasher cyclic on max");
                       break;
                    case 6:
                        abc.setcyclicperminute();
                        System.out.println("Dishwasher cyclic on normal");
                       break;
                    case 7:
                        dishwasherr.setcyclicperminute();
                        System.out.println("Dishwasher cyclic on min");
                       break;
                    case 8:
                   	 System.out.println("Enter time: ");
                        int timer = scanner.nextInt();
                        dishwasherr.setTimer(timer);  
                   	break;
                   	
                    case 9:
                        System.out.println("Cost is : "+dishwasherr.cost());
                        break;
                                
                    case 10:
                    	dishwasherr.getTimer();
                        break;
                    case 0:
                        break;
                    default:
                        System.out.println("Invalid choice!");
                }
                break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 0);

        scanner.close();
    }
}
