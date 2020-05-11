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
                        Character.ArmorItem("Scaley Armor", 2, -1);
                        Character.Gold = Character.Gold - 100;
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
                        Character.Gold = Character.Gold - 200;
                        Character.SecondaryWeaponItem("Sword of Barnacles", "Single", 1, 1, 1);
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
                System.out.println("Gringo the Armsdealer: Ya want the Water Pistol? It's a one-handed weapon that packs a punch and proves your smart enough to use a gun underwater!");
                try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
                System.out.println("Gringo the Armsdealer: I'll give it to ya for 300 coins.\n1) Buy for 300 coins\n2) Cancel purchase");
                int purchase3 = sc.nextInt();
                switch (purchase3) {
                    case 1:
                        System.out.println("Gringo the Armsdealer: Thank you for purchasing from me!");
                        try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
                        System.out.println("Gringo the Armsdealer: Good luck out there in the open waters, kid.");
                        try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
                        Character.SecondaryWeaponItem("Water Gun", "Single", 4, 3, 0);
                        Character.Gold = Character.Gold - 300;
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
                System.out.println("Gringo the Armsdealer: Ya want the Water Rifle? It's a two-handed weapon, you can't use an off-hand weapon with it but it's strong!");
                try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
                System.out.println("Gringo the Armsdealer: I'll give it to ya for 400 coins.\n1) Buy for 400 coins\n2) Cancel purchase");
                int purchase4 = sc.nextInt();
                switch (purchase4) {
                    case 1:
                        System.out.println("Gringo the Armsdealer: Thank you for purchasing from me!");
                        try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
                        System.out.println("Gringo the Armsdealer: Good luck out there in the open waters, kid.");
                        try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
                        Character.WeaponItem("Water Gun", "Two Handed", 5, 4);
                        Character.Gold = Character.Gold - 400;
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
                System.out.println("Gringo the Armsdealer: Ya want the Water Sword? This is a dangerous weapon that only takes one hand to swing.");
                try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
                System.out.println("Gringo the Armsdealer: I'll give it to ya for 500 coins.\n1) Buy for 500 coins\n2) Cancel purchase");
                int purchase5 = sc.nextInt();
                switch (purchase5) {
                    case 1:
                        System.out.println("Gringo the Armsdealer: Thank you for purchasing from me!");
                        try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
                        System.out.println("Gringo the Armsdealer: Good luck out there in the open waters, kid.");
                        try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
                        Character.Gold = Character.Gold - 500;
                        Character.WeaponItem("Water Sword", "Single", 8, 2);
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
                System.out.println("Gringo the Armsdealer: Ya want the Whirlpool Activator? It's an ancient weapon you can use in your off-hand!");
                try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
                System.out.println("Gringo the Armsdealer: I'll give it to ya for 600 coins.\n1) Buy for 600 coins\n2) Cancel purchase");
                int purchase6 = sc.nextInt();
                switch (purchase6) {
                    case 1:
                        System.out.println("Gringo the Armsdealer: Thank you for purchasing from me!");
                        try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
                        System.out.println("Gringo the Armsdealer: Good luck out there in the open waters, kid.");
                        try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
                        Character.Gold = Character.Gold - 600;
                        Character.SecondaryWeaponItem("Whirlpool Activator", "Single", 1, 8, 3);
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
                System.out.println("Gringo the Armsdealer: Ya want the Flame Thrower? It's a two handed powerhouse, the most feared weapon I've got.");
                try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
                System.out.println("Gringo the Armsdealer: I'll give it to ya for 700 coins.\n1) Buy for 700 coins\n2) Cancel purchase");
                int purchase7 = sc.nextInt();
                switch (purchase7) {
                    case 1:
                        System.out.println("Gringo the Armsdealer: Thank you for purchasing from me!");
                        try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
                        System.out.println("Gringo the Armsdealer: Good luck out there in the open waters, kid.");
                        try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
                        Character.Gold = Character.Gold - 700;
                        Character.WeaponItem("Flame Thrower", "Two Handed", 12, 0);
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
                System.out.println("Gringo the Armsdealer: Ya want the Armor Piercing Blowfish? It's like a pistol, if you're smart you can really use this effectivley.");
                try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
                System.out.println("Gringo the Armsdealer: I'll give it to ya for 800 coins.\n1) Buy for 800 coins\n2) Cancel purchase");
                int purchase8 = sc.nextInt();
                switch (purchase8) {
                    case 1:
                        System.out.println("Gringo the Armsdealer: Thank you for purchasing from me!");
                        try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
                        System.out.println("Gringo the Armsdealer: Good luck out there in the open waters, kid.");
                        try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
                        Character.Gold = Character.Gold - 800;
                        Character.WeaponItem("Armor Piercing Blowfish", "Single", 5, 5);
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
