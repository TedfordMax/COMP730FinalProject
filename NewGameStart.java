public class NewGameStart {

    public static void IntroText() {
        System.out.print("Welcome to the Pacific Ocean! The once vast seas are becoming ");
        System.out.print("crowded with pollution and plastic, forcing sea life down into the "); 
        System.out.print("cracks of the sea-floor to survive, what was once a barren and "); 
        System.out.print("nearly lifeless part of the ocean is now a buffet for predators. ");
        System.out.print("You must make it past those creatures that wish to prey on you and ");
        System.out.print("into the deepest trenches to stay alive. Will you escape as a ");
        System.out.print("powerful squid who can finish off foes with few hits, a starfish ");
        System.out.print("who can survive the strongest of blows, or a crab who has strong ");
        System.out.println("claws and a tough shell?");
        NewGame();
    }

    public static void NewGame() {
        CharacterCreator.CharacterSelection();
    }
}