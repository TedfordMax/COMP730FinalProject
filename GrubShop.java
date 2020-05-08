import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class GrubShop {
    public static void Menu(String character) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Gringo the Armsdealer: Welcome to the GrubShop!\nWe have plenty of things for you to choose from.");
        System.out.println("\n1) Scaley Armor (1xp)\n2) Prickly Shield (3xp)\n3) Water Gun (5xp)\n4) Water Rifle (7xp)\n5) Water Sword (9xp)\n6) Whirlpool Activator (11xp)\n7) Flame Thrower (13xp)\n8) Armor Piercing Blowfish (15xp)\n9) Exit\nWhat would ya like, kid?");
        int grub = sc.nextInt();
        switch (grub) {
            case 1:
                System.out.println("Gringo the Armsdealer: Ya want the Scaley Armor?");
                try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
                System.out.println("Gringo the Armsdealer: I'll give it to ya for 100 coins.\n1) Buy for 100 coins\n2) Cancel purchase");
                int purchase = sc.nextInt();
                switch (purchase) {
                    case 1:
                        System.out.println("Gringo the Armsdealer: Thank you for purchasing from me!");
                        try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
                        System.out.println("Gringo the Armsdealer: Good luck out there in the open waters, kid.");
                        try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
                        Storyboard.Crossroads(character, 1);
                        break;
                    case 2:
                        System.out.println("Gringo the Armsdealer: Not for you? No worries at all.");
                        try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
                        System.out.println("Gringo the Armsdealer: Good luck out there in the open waters, kid.");
                        try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
                        Storyboard.Crossroads(character, 1);
                        break;
                }
                break;
            case 2:
                System.out.println("Gringo the Armsdealer: Ya want the Prickly Shield?");
                try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
                System.out.println("Gringo the Armsdealer: I'll give it to ya for 200 coins.\n1) Buy for 200 coins\n2) Cancel purchase");
                int purchase2 = sc.nextInt();
                switch (purchase2) {
                    case 1:
                        System.out.println("Gringo the Armsdealer: Thank you for purchasing from me!");
                        try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
                        System.out.println("Gringo the Armsdealer: Good luck out there in the open waters, kid.");
                        try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
                        Storyboard.Crossroads(character, 1);
                        break;
                    case 2:
                        System.out.println("Gringo the Armsdealer: Not for you? No worries at all.");
                        try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
                        System.out.println("Gringo the Armsdealer: Good luck out there in the open waters, kid.");
                        try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
                        Storyboard.Crossroads(character, 1);
                        break;
                }
                break;
            case 3:
                System.out.println("Gringo the Armsdealer: Ya want the Water Gun?");
                try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
                System.out.println("Gringo the Armsdealer: I'll give it to ya for 300 coins.\n1) Buy for 300 coins\n2) Cancel purchase");
                int purchase3 = sc.nextInt();
                switch (purchase3) {
                    case 1:
                        System.out.println("Gringo the Armsdealer: Thank you for purchasing from me!");
                        try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
                        System.out.println("Gringo the Armsdealer: Good luck out there in the open waters, kid.");
                        try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
                        Storyboard.Crossroads(character, 1);
                        break;
                    case 2:
                        System.out.println("Gringo the Armsdealer: Not for you? No worries at all.");
                        try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
                        System.out.println("Gringo the Armsdealer: Good luck out there in the open waters, kid.");
                        try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
                        Storyboard.Crossroads(character, 1);
                        break;
                }
                break;
            case 4:
                System.out.println("Gringo the Armsdealer: Ya want the Water Rifle?");
                try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
                System.out.println("Gringo the Armsdealer: I'll give it to ya for 400 coins.\n1) Buy for 400 coins\n2) Cancel purchase");
                int purchase4 = sc.nextInt();
                switch (purchase4) {
                    case 1:
                        System.out.println("Gringo the Armsdealer: Thank you for purchasing from me!");
                        try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
                        System.out.println("Gringo the Armsdealer: Good luck out there in the open waters, kid.");
                        try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
                        Storyboard.Crossroads(character, 1);
                        break;
                    case 2:
                        System.out.println("Gringo the Armsdealer: Not for you? No worries at all.");
                        try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
                        System.out.println("Gringo the Armsdealer: Good luck out there in the open waters, kid.");
                        try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
                        Storyboard.Crossroads(character, 1);
                        break;
                }
                break;
            case 5:
                System.out.println("Gringo the Armsdealer: Ya want the Water Sword?");
                try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
                System.out.println("Gringo the Armsdealer: I'll give it to ya for 500 coins.\n1) Buy for 500 coins\n2) Cancel purchase");
                int purchase5 = sc.nextInt();
                switch (purchase5) {
                    case 1:
                        System.out.println("Gringo the Armsdealer: Thank you for purchasing from me!");
                        try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
                        System.out.println("Gringo the Armsdealer: Good luck out there in the open waters, kid.");
                        try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
                        Storyboard.Crossroads(character, 1);
                        break;
                    case 2:
                        System.out.println("Gringo the Armsdealer: Not for you? No worries at all.");
                        try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
                        System.out.println("Gringo the Armsdealer: Good luck out there in the open waters, kid.");
                        try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
                        Storyboard.Crossroads(character, 1);
                        break;
                }
                break;
            case 6:
                System.out.println("Gringo the Armsdealer: Ya want the Whirlpool Activator?");
                try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
                System.out.println("Gringo the Armsdealer: I'll give it to ya for 600 coins.\n1) Buy for 600 coins\n2) Cancel purchase");
                int purchase6 = sc.nextInt();
                switch (purchase6) {
                    case 1:
                        System.out.println("Gringo the Armsdealer: Thank you for purchasing from me!");
                        try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
                        System.out.println("Gringo the Armsdealer: Good luck out there in the open waters, kid.");
                        try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
                        Storyboard.Crossroads(character, 1);
                        break;
                    case 2:
                        System.out.println("Gringo the Armsdealer: Not for you? No worries at all.");
                        try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
                        System.out.println("Gringo the Armsdealer: Good luck out there in the open waters, kid.");
                        try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
                        Storyboard.Crossroads(character, 1);
                        break;
                }
                break;
            case 7:
                System.out.println("Gringo the Armsdealer: Ya want the Flame Thrower?");
                try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
                System.out.println("Gringo the Armsdealer: I'll give it to ya for 700 coins.\n1) Buy for 700 coins\n2) Cancel purchase");
                int purchase7 = sc.nextInt();
                switch (purchase7) {
                    case 1:
                        System.out.println("Gringo the Armsdealer: Thank you for purchasing from me!");
                        try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
                        System.out.println("Gringo the Armsdealer: Good luck out there in the open waters, kid.");
                        try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
                        Storyboard.Crossroads(character, 1);
                        break;
                    case 2:
                        System.out.println("Gringo the Armsdealer: Not for you? No worries at all.");
                        try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
                        System.out.println("Gringo the Armsdealer: Good luck out there in the open waters, kid.");
                        try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
                        Storyboard.Crossroads(character, 1);
                        break;
                }
                break;
            case 8:
                System.out.println("Gringo the Armsdealer: Ya want the Armor Piercing Blowfish?");
                try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
                System.out.println("Gringo the Armsdealer: I'll give it to ya for 800 coins.\n1) Buy for 800 coins\n2) Cancel purchase");
                int purchase8 = sc.nextInt();
                switch (purchase8) {
                    case 1:
                        System.out.println("Gringo the Armsdealer: Thank you for purchasing from me!");
                        try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
                        System.out.println("Gringo the Armsdealer: Good luck out there in the open waters, kid.");
                        try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
                        Storyboard.Crossroads(character, 1);
                        break;
                    case 2:
                        System.out.println("Gringo the Armsdealer: Not for you? No worries at all.");
                        try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
                        System.out.println("Gringo the Armsdealer: Good luck out there in the open waters, kid.");
                        try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
                        Storyboard.Crossroads(character, 1);
                        break;
                }
                break;
            case 9:
                System.out.println("Gringo the Armsdealer: Good luck out there in the open waters, kid.");
                try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
                Storyboard.Crossroads(character, 1);
                break;
        }
        System.out.println("Gringo the Armsdealer: Good luck out there in the open waters, kid.");
        Storyboard.Crossroads(character, 1);
    }
}