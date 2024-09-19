import java.util.*;
import java.lang.Math;

class Army {
    public int price;
    public float attack, defence, health, speed;
    public float battle_attack, battle_defence, battle_health, battle_speed;
    public String name;
    public String fam;
    public Armour armour;
    public Artefacts artefacts;
    public String category;

    public Army(String name, int price, float attack, float defence, float health, float speed,String category) {
        this.name = name;
        this.price = price;
        this.attack = attack;
        this.battle_attack=attack;
        this.defence = defence;
        this.battle_defence = defence;
        this.health = health;
        this.battle_health = health;
        this.speed = speed;
        this.battle_speed = speed;
        this.category=category;
    }

    public String getFam() {
        return this.fam;
    }

    public float getBattleSpeed() {
        return this.battle_speed;
    }

    public String getName() {
        return this.name;
    }

    public void resetArmy(){
        this.battle_attack=this.attack;
        this.battle_defence=this.defence;
        this.battle_health=this.health;
        this.battle_speed=this.speed;
    }
}

class Archers extends Army {
    public Archers(String name, int price, float attack, float defence, float health, float speed,String category) {
        super(name, price, attack, defence, health, speed,category);
        this.fam = "Archers";
    }
}

class Shooter extends Archers {
    public Shooter() {
        super("shooter", 80, 11.0f, 4.0f, 6.0f, 9.0f,"Highlanders");
    }
}

class Ranger extends Archers {
    public Ranger() {
        super("ranger", 115, 14.0f, 5.0f, 8.0f, 10.0f,"Highlanders");
    }
}

class Sunfire extends Archers {
    public Sunfire() {
        super("sunfire", 160, 15.0f, 5.0f, 7.0f, 14.0f,"Sunchildren");
    }
}

class Zing extends Archers {
    public Zing() {
        super("zing", 200, 16.0f, 9.0f, 11.0f, 14.0f,"Sunchildren");
    }
}

class Saggitarius extends Archers {
    public Saggitarius() {
        super("saggitarius", 230, 18.0f, 7.0f, 12.0f, 17.0f,"Mystics");
    }
}

class Knights extends Army {
    public Knights(String name, int price, float attack, float defence, float health, float speed,String category) {
        super(name, price, attack, defence, health, speed,category);
        this.fam = "Knights";
    }
}

class Squire extends Knights {
    public Squire() {
        super("squire", 85, 8.0f, 9.0f, 7.0f, 8.0f,"Marshlanders");
    }
}

class Cavalier extends Knights {
    public Cavalier() {
        super("cavalier", 110, 10.0f, 12.0f, 7.0f, 10.0f,"Mystics");
    }
}

class Templar extends Knights {
    public Templar() {
        super("templar", 155, 14.0f, 16.0f, 12.0f, 12.0f,"Sunchildren");
    }
}

class Zoro extends Knights {
    public Zoro() {
        super("zoro", 180, 17.0f, 16.0f, 13.0f, 14.0f,"Highlanders");
    }
}

class Swiftblade extends Knights {
    public Swiftblade() {
        super("swiftblade", 250, 18.0f, 20.0f, 17.0f, 13.0f,"Marshlanders");
    }
}

class Mages extends Army {
    public Mages(String name, int price, float attack, float defence, float health, float speed,String category) {
        super(name, price, attack, defence, health, speed,category);
        this.fam = "Mages";
    }
}

class Warlock extends Mages {
    public Warlock() {
        super("warlock", 100, 12.0f, 7.0f, 10.0f, 12.0f,"Marshlanders");
    }
}

class Illusionist extends Mages {
    public Illusionist() {
        super("illusionist", 120, 13.0f, 8.0f, 12.0f, 14.0f,"Mystics");
    }
}

class Enchanter extends Mages {
    public Enchanter() {
        super("enchanter", 160, 16.0f, 10.0f, 13.0f, 16.0f,"Highlanders");
    }
}

class Conjurer extends Mages {
    public Conjurer() {
        super("conjurer", 195, 18.0f, 15.0f, 14.0f, 12.0f,"Highlanders");
    }
}

class Eldritch extends Mages {
    public Eldritch() {
        super("eldritch", 270, 19.0f, 17.0f, 18.0f, 14.0f,"Mystics");
    }
}

class Healers extends Army {
    public Healers(String name, int price, float attack, float defence, float health, float speed,String category) {
        super(name, price, attack, defence, health, speed,category);
        this.fam = "Healers";
    }
}

class Soother extends Healers {
    public Soother() {
        super("soother", 95, 10.0f, 8.0f, 9.0f, 6.0f,"Sunchildren");
    }
}

class Medic extends Healers {
    public Medic() {
        super("medic", 125, 12.0f, 9.0f, 10.0f, 7.0f,"Highlanders");
    }
}

class Alchemist extends Healers {
    public Alchemist() {
        super("alchemist", 150, 13.0f, 13.0f, 13.0f, 13.0f,"Marshlanders");
    }
}

class Saint extends Healers {
    public Saint() {
        super("saint", 200, 16.0f, 14.0f, 17.0f, 9.0f,"Mystics");
    }
}

class Lightbringer extends Healers {
    public Lightbringer() {
        super("lightbringer", 260, 17.0f, 15.0f, 19.0f, 12.0f,"Sunchildren");
    }
}

class MythicalCreatures extends Army {
    public MythicalCreatures(String name, int price, float attack, float defence, float health, float speed,String category) {
        super(name, price, attack, defence, health, speed,category);
        this.fam = "MythicalCreatures";
    }
}

class Dragon extends MythicalCreatures {
    public Dragon() {
        super("dragon", 120, 12.0f, 14.0f, 15.0f, 8.0f,"Sunchildren");
    }
}

class Basilisk extends MythicalCreatures {
    public Basilisk() {
        super("basilisk", 165, 15.0f, 11.0f, 10.0f, 12.0f,"Marshlanders");
    }
}

class Hydra extends MythicalCreatures {
    public Hydra() {
        super("hydra", 205, 12.0f, 16.0f, 15.0f, 11.0f,"Marshlanders");
    }
}

class Phoenix extends MythicalCreatures {
    public Phoenix() {
        super("phoenix", 275, 17.0f, 13.0f, 17.0f, 19.0f,"Sunchildren");
    }
}

class Pegasus extends MythicalCreatures {
    public Pegasus() {
        super("pegasus", 340, 14.0f, 18.0f, 20.0f, 20.0f,"Mystics");
    }
}

class Equipment {
    public int price;
    public float attack, defence, health, speed;
    public String name;
    public String cast;

    public Equipment(String name, int price, float attack, float defence, float health, float speed) {
        this.name = name;
        this.price = price;
        this.attack = attack;
        this.defence = defence;
        this.health = health;
        this.speed = speed;
    }
}

class Armour extends Equipment {
    public Armour(String name, int price, float attack, float defence, float health, float speed) {
        super(name, price, attack, defence, health, speed);
        this.cast = "Armour";
    }
}

class Artefacts extends Equipment {
    public Artefacts(String name, int price, float attack, float defence, float health, float speed) {
        super(name, price, attack, defence, health, speed);
        this.cast = "Artefacts";
    }
}

class Battle extends GameName {
    public PlayerProfile p1;
    public PlayerProfile p2;

    public Battle(PlayerProfile p1, PlayerProfile p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public ArrayList<Army> sortAttacker(ArrayList<Army> army) {
        List<String> priorityOrder = List.of("Healers", "Mages", "MythicalCreatures", "Knights","Archers");
        army.sort(Comparator.comparingDouble((Army::getBattleSpeed))
                .thenComparing((o1, o2) -> {
                    int index1 = priorityOrder.indexOf(o1.getFam());
                    int index2 = priorityOrder.indexOf(o2.getFam());
                    return Integer.compare(index1, index2);
                }));
        Collections.reverse(army);
        return army;
    }
    public Army getAttacker(ArrayList<Army> army){
        Army attacker = army.remove(0);
        army.add(attacker);
        return attacker;
    }

    public Army getDefender(ArrayList<Army> army) {
        Army lowestDefence = army.get(0);
        for (Army x: army) {
            if (x.battle_defence < lowestDefence.battle_defence) {
                lowestDefence = x;
            } else if (x.battle_defence == lowestDefence.battle_defence) {
                List<String> priorityOrder = List.of("Healer", "MythicalCreature", "Archer", "Knight", "Mage");
                int index1 = priorityOrder.indexOf(x.getFam());
                int index2 = priorityOrder.indexOf(lowestDefence.getFam());
                if (index1 < index2) {
                    lowestDefence = x;
                }
            }
        }
        return lowestDefence;
    }

    public Army getLowestHealth(ArrayList<Army> army) {
        Army lowestHealth = army.get(0);
        for (Army x : army) {
            if (x.battle_health < lowestHealth.battle_health) {
                lowestHealth = x;
            }
        }
        return lowestHealth;
    }

    public void battlechanges(Army attacker, Army defender) {
        animatePrint(attacker.name + " attacks " + defender.name,ANSI_BOLD);
        if (!(attacker instanceof Healers)) {
            float temp=0.5f * (attacker.battle_attack) - 0.1f * (defender.battle_defence);
            defender.battle_health = (float)(Math.round((defender.battle_health - temp)*10.0)/10.0);
        }

        if (defender.battle_health <= 0.0f) {
            blinkText(defender.name + " died",2,500,ANSI_RED);
        } else {
            System.out.print(defender.name + "'s health   :   ");
            System.out.format("%.1f", defender.battle_health);
            System.out.println();

        }
        System.out.print(attacker.name + "'s health  :   ");
        System.out.format("%.1f", attacker.battle_health);
        System.out.println();

        try {
            Thread.sleep(300);
        }
        catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void battlegroundPowers(String homeground,ArrayList<Army> soldiers){
        if (homeground.equals("Hillcrest")){
            for(Army army : soldiers){
                if(army.category.equals("Highlanders")){
                    army.battle_attack+=1;
                    army.battle_defence+=1;
                }

                if(army.category.equals("Marshlanders") ||army.category.equals("Sunchildren")){
                    army.battle_speed=army.battle_speed-1;
                }
            }
        }

        else if(homeground.equals("Marshland")){
            for(Army army : soldiers){
                if(army.category.equals("Marshlanders")){
                    army.battle_defence+=2;
                }
                if(army.category.equals("Sunchildren")){
                    army.battle_attack=army.battle_attack-1;
                }
                if(army.category.equals("Mystics")){
                    army.battle_speed=army.battle_speed-1;
                }
            }
        }

        else if(homeground.equals("Desert")){
            for(Army army : soldiers){
                if(army.category.equals("Marshlanders")){
                    army.battle_health=army.battle_health-1;
                }
                if(army.category.equals("Sunchildren")){
                    army.battle_attack+=1;
                }
            }
        }

        else{
            for(Army army : soldiers){
                if(army.category.equals("Mystics")){
                    army.battle_attack+=2;
                }
                if(army.category.equals("Highlanders")||army.category.equals("Marshlanders")){
                    army.battle_speed=army.battle_speed-1;
                    army.battle_defence=army.battle_defence-1;
                }
            }
        }
    }

    public void startBattle() {
        PlayerProfile attacker = p1;
        PlayerProfile defender = p2;
        ArrayList<Army> p1soldiers = new ArrayList<>();
        ArrayList<Army> p2soldiers = new ArrayList<>();
        int gameover = 0;
        int turnCount = 0;
        System.out.println();
        animatePrint("         Challenging " + p2.name + " to battle ",ANSI_YELLOW);

        p1soldiers.addAll(Arrays.asList(attacker.A, attacker.K, attacker.M, attacker.H, attacker.MC));
        p2soldiers.addAll(Arrays.asList(defender.A, defender.K, defender.M, defender.H, defender.MC));
        String battleground=p2.homeground;
        battlegroundPowers(battleground,p1soldiers);
        battlegroundPowers(battleground, p2soldiers);
        p1soldiers = sortAttacker(p1soldiers);
        p2soldiers = sortAttacker(p2soldiers);
        Army attack_char;
        Army defend_char;
        Army lowest_health_char;

        while (turnCount < 20) {
            if (gameover != 1) {
                turnCount += 1;

                attack_char=getAttacker(p1soldiers);
                defend_char=getDefender(p2soldiers);
                animatePrintSlow((attack_char.name + " vs " + defend_char.name),ANSI_BLUE);
                animatePrint("TURN " + (turnCount) + " : " + attack_char.name,ANSI_BOLD);
                battlechanges(attack_char, defend_char);
                if (attack_char instanceof Healers) {
                    float temp = attack_char.battle_attack;
                    lowest_health_char=getLowestHealth(p1soldiers);
                    lowest_health_char.battle_health += 0.1 * temp;
                }
                if (defend_char.battle_health <= 0) {
                    p2soldiers.remove(defend_char);
                    if (p2soldiers.isEmpty()) {
                        animatePrint("               ┌──────────────────────────────────────────┐", ANSI_GREEN);
                        animatePrint("               │     " + p1.name + " WON "+"              │", ANSI_GREEN);
                        animatePrint("               └──────────────────────────────────────────┘", ANSI_GREEN);

                        System.out.println();
                        p1.XP=p1.XP+1;
                        gameover = 1;
                        int exchangeCoins=(int)Math.round((p2.goldCoins)*0.1);
                        p1.goldCoins=p1.goldCoins+exchangeCoins;
                        p2.goldCoins=p2.goldCoins-exchangeCoins;
                        break;
                    }
                    else{
                        defend_char=getDefender(p2soldiers);
                    }
                }

                if (battleground.equals("Hillcrest")){
                    if(attack_char.category.equals("Highlanders")){
                        blinkText("Bonus Attack",3,500,ANSI_LIGHT_CYAN);
                        float temp_attack=attack_char.battle_attack;
                        attack_char.battle_attack=(float)0.2f*(attack_char.battle_attack);
                        battlechanges(attack_char, defend_char);
                        attack_char.battle_attack=temp_attack;
                        if (attack_char instanceof Healers) {
                            float temp = attack_char.battle_attack;
                            lowest_health_char=getLowestHealth(p1soldiers);
                            lowest_health_char.battle_health += 0.1f * temp;
                        }
                        if (defend_char.battle_health <= 0.0f) {
                            p2soldiers.remove(defend_char);
                        }
                    }
                }

                if (battleground.equals("Arcane")){
                    if(attack_char.category.equals("Mystics")){
                        attack_char.battle_health=attack_char.battle_health+(float)attack_char.battle_health*0.1f;
                    }
                }

                if (p2soldiers.isEmpty()) {
                    animatePrint("               ┌──────────────────────────────────────────┐", ANSI_GREEN);
                    animatePrint("               │     " + p1.name + " WON "+"              │", ANSI_GREEN);
                    animatePrint("               └──────────────────────────────────────────┘", ANSI_GREEN);

                    System.out.println();
                    p1.XP=p1.XP+1;
                    gameover = 1;
                    int exchangeCoins=(int)Math.round((p2.goldCoins)*0.1);
                    p1.goldCoins=p1.goldCoins+exchangeCoins;
                    p2.goldCoins=p2.goldCoins-exchangeCoins;
                    break;
                }
                System.out.println();

                turnCount += 1;

                attack_char=getAttacker(p2soldiers);
                defend_char=getDefender(p1soldiers);
                animatePrintSlow(attack_char.name + " vs " + defend_char.name,ANSI_BLUE);
                animatePrint("TURN " + (turnCount) + " : " + attack_char.name,ANSI_BOLD);
                battlechanges(attack_char, defend_char);
                if (attack_char instanceof Healers) {
                    float temp = attack_char.battle_attack;
                    lowest_health_char=getLowestHealth(p2soldiers);
                    lowest_health_char.battle_health += 0.1f * temp;
                }
                if (defend_char.battle_health <= 0.0f) {
                    p1soldiers.remove(defend_char);
                    if (p1soldiers.isEmpty()) {
                        animatePrint("               ┌──────────────────────────────────────────┐", ANSI_GREEN);
                        animatePrint("               │     " + p2.name + " WON "+"              │", ANSI_GREEN);
                        animatePrint("               └──────────────────────────────────────────┘", ANSI_GREEN);

                        System.out.println();
                        p2.XP=p2.XP+1;
                        gameover = 1;
                        int exchangeCoins=(int)Math.round((p1.goldCoins)*0.1);
                        p2.goldCoins=p2.goldCoins+exchangeCoins;
                        p1.goldCoins=p1.goldCoins-exchangeCoins;
                        break;
                    }
                    else{
                        defend_char=getDefender(p1soldiers);
                    }
                }

                if (battleground.equals("Hillcrest")){
                    if(attack_char.category.equals("Highlanders")){
                        blinkText("_Bonus Attack",3,500,ANSI_LIGHT_CYAN);
                        float temp_attack=attack_char.battle_attack;
                        attack_char.battle_attack=(float)0.2f*(attack_char.battle_attack);
                        battlechanges(attack_char, defend_char);
                        attack_char.battle_attack=temp_attack;
                        if (attack_char instanceof Healers) {
                            float temp = attack_char.battle_attack;
                            lowest_health_char=getLowestHealth(p2soldiers);
                            lowest_health_char.battle_health += 0.1f * temp;
                        }
                        if (defend_char.battle_health <= 0.0f) {
                            p1soldiers.remove(defend_char);
                        }
                    }
                }

                if (battleground.equals("Arcane")){
                    if(attack_char.category.equals("Mystics")){
                        attack_char.battle_health=attack_char.battle_health+(float)attack_char.battle_health*0.1f;
                    }
                }

                if (p1soldiers.isEmpty()) {
                    animatePrint("               ┌──────────────────────────────────────────┐", ANSI_GREEN);
                    animatePrint("               │     " + p2.name + " WON "+"              │", ANSI_GREEN);
                    animatePrint("               └──────────────────────────────────────────┘", ANSI_GREEN);
                    System.out.println();
                    p2.XP=p2.XP+1;
                    gameover = 1;
                    int exchangeCoins=(int)Math.round((p1.goldCoins)*0.1);
                    p2.goldCoins=p2.goldCoins+exchangeCoins;
                    p1.goldCoins=p1.goldCoins-exchangeCoins;
                    break;
                }
                System.out.println();

            }
            else {
                break;
            }
        }
        p1.A.resetArmy();
        p1.H.resetArmy();
        p1.K.resetArmy();
        p1.M.resetArmy();
        p1.MC.resetArmy();

        p2.A.resetArmy();
        p2.H.resetArmy();
        p2.K.resetArmy();
        p2.M.resetArmy();
        p2.MC.resetArmy();

        if (gameover!=1){
            animatePrint("                       ┌──────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────┐", ANSI_GREEN);
            animatePrint("                       │    _________________________________________________________DRAW_______________________________________________________    │", ANSI_GREEN);
            animatePrint("                       └──────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────┘", ANSI_GREEN);
            System.out.println();
        }

        animatePrint("",ANSI_PURPLE);
        System.out.println();
        animatePrint("                                     " + p1.name+ "       XP : " + p1.XP + "          Gold Coins: "  + p1.goldCoins ,ANSI_PURPLE);
        System.out.println();
        animatePrint("",ANSI_PURPLE);
        System.out.println();
        animatePrint("                                   " + p2.name+ "   XP : " + p2.XP + "          Gold Coins: "  + p2.goldCoins,ANSI_PURPLE);
        System.out.println();
        animatePrint("",ANSI_PURPLE);
        System.out.println();
    }
}

class PlayerProfile extends GameName {
    public String name;
    private String username;
    public int userID;
    public int goldCoins = 500;
    public int XP = 0;
    public Archers A;
    public Knights K;
    public Mages M;
    public Healers H;
    public MythicalCreatures MC;
    public String homeground;

    PlayerProfile(String name) {
        this.name = name;
    }

    PlayerProfile(String name,String username, int goldCoins, int XP, Archers A, Knights K, Mages M, Healers H, MythicalCreatures MC,String homeground,ArrayList<String> usernameList) {
        this.name = name;
        this.username=username;
        usernameList.add(name);
        this.userID=usernameList.size();
        this.goldCoins = goldCoins;
        this.XP = XP;
        this.A = A;
        this.K = K;
        this.M = M;
        this.H = H;
        this.MC = MC;
        this.homeground=homeground;
    }

    public void inputUsername(ArrayList<String> usernameList) {
        animatePrintSlow("Enter Username  :  ",ANSI_YELLOW);
        Scanner sc = new Scanner(System.in);
        username = sc.nextLine();

        if (usernameList.isEmpty()) {
            usernameList.add(username);
            userID = usernameList.size();
        }
        else {
            while (usernameList.contains(username)) {
                blinkText("Username already exists. Enter another username : ",3,500,ANSI_RED);
                username = sc.nextLine();
            }

            usernameList.add(username);
            userID = usernameList.size();
        }
        // sc.close();
        animatePrint("Hello "+username+ "!",ANSI_YELLOW);
        animatePrint("Your userID is  :  "+userID,ANSI_YELLOW);
        System.out.println();
    }

    public void selectArmy(ArrayList<Army> characters) {
        blinkText("                                         Choose your army selecting one from each category",2,500,ANSI_PURPLE);
        animatePrint("Archers            :   shooter  80gc     ranger       115gc      sunfire     160gc     zing      200gc     saggitarius    230gc",ANSI_BOLD);
        animatePrint("Knights            :   squire   85gc     cavalier     110gc      templar     155gc     zoro      180gc     swiftblade     250gc",ANSI_BOLD);
        animatePrint("Mages              :   warlock  100gc    illusionist  120gc      enchanter   160gc     conjurer  195gc     eldritch       270gc",ANSI_BOLD);
        animatePrint("Healers            :   soother  95gc     medic        125gc      alechemist  150gc     saint     200gc     lightbringer   260gc",ANSI_BOLD);
        animatePrint("MythicalCreatures  :   dragon   120gc    basilisk     165gc      hydra       205gc     phoenix   275gc     pegasus        340gc",ANSI_BOLD);
        System.out.println();

        Scanner sc = new Scanner(System.in);
        ArrayList<Army> PlayerCharacterList = new ArrayList<>();
        ArrayList<String> CharacterFam = new ArrayList<>();
        int temp_goldCoins=goldCoins;

        while (PlayerCharacterList.size() < 5) {
            animatePrintSlow("Enter Character : ",ANSI_GREEN);
            String character = sc.nextLine();
            for (Army army : characters) {
                if (character.equals(army.name)) {
                    if (CharacterFam.contains(army.fam)) {
                        blinkText("Already purchased this type of character!",3,500,ANSI_RED);
                        break;
                    }
                    temp_goldCoins = temp_goldCoins - army.price;
                    if (temp_goldCoins > 0) {
                        PlayerCharacterList.add(army);
                        CharacterFam.add(army.fam);
                        break;
                    } else {
                        blinkText("Gold coins not enough. Choose a different combination of characters",3,500,ANSI_RED);
                        System.out.println();
                        temp_goldCoins=goldCoins;
                        PlayerCharacterList.clear();
                        CharacterFam.clear();
                        break;
                    }
                }
            }
        }

        goldCoins=temp_goldCoins;
        for (Army army : PlayerCharacterList) {
            if (army instanceof Archers) {
                A = (Archers) army;
            } else if (army instanceof Knights) {
                K = (Knights) army;
            } else if (army instanceof Mages) {
                M = (Mages) army;
            } else if (army instanceof Healers) {
                H = (Healers) army;
            } else {
                MC = (MythicalCreatures) army;
            }
        }
        System.out.println();
        blinkText("Your army is :",2,300,ANSI_BOLD);
        animatePrint( "         Archers : "+A.name+"     Knights : "+K.name+"     Mages : "+M.name+"     Healers : "+H.name+"     MythicalCreatures : "+MC.name,ANSI_BOLD);
        animatePrint("Remaining Goldcoins : "+goldCoins,ANSI_BOLD);
        System.out.println();
    }

    public void purchaseEquipment(Army army, ArrayList<Equipment> weapons) {
        int done = 0;
        Scanner sc = new Scanner(System.in);
        while (done == 0) {
            animatePrintSlow("Enter weapon : ",ANSI_GREEN);
            String weapon = sc.nextLine();
            for (Equipment equipment : weapons) {
                if (weapon.equals(equipment.name)) {
                    if (goldCoins >= equipment.price) {
                        if (equipment instanceof Armour) {
                            army.armour = (Armour) equipment;
                        } else {
                            army.artefacts = (Artefacts) equipment;
                        }
                        army.price += (int)Math.round(equipment.price*0.2);
                        army.attack += equipment.attack;
                        army.defence += equipment.defence;
                        army.health += equipment.health;
                        army.speed += equipment.speed;
                        army.battle_attack=army.attack;
                        army.battle_defence=army.defence;
                        army.battle_health=army.health;
                        army.battle_speed=army.speed;
                        goldCoins = goldCoins - equipment.price;
                        done = 1;
                        break;

                    } else {
                        if (goldCoins > 70) {
                            blinkText("Not enough gold coins! Choose another weapon to purchase.",3,500,ANSI_RED);
                        } else {
                            blinkText("Not enough gold coins to purchase any equipment!",3,500,ANSI_RED);
                            done = 1;
                        }
                        break;
                    }
                }
            }
        }
    }

    public void purchaseArmy(Army current_char,ArrayList<Army> characters) {
        int soldPrice=(int)Math.round((current_char.price)*0.9);
        goldCoins=goldCoins+soldPrice;
        int done = 0;
        Scanner sc = new Scanner(System.in);
        while (done == 0) {
            animatePrintSlow("Enter the character you want to purchase : ",ANSI_GREEN);
            String new_char = sc.nextLine();
            for (Army army : characters) {
                if(new_char.equals(army.name)){
                    if(goldCoins>=army.price){
                        goldCoins=goldCoins-army.price;
                        current_char.name=army.name;
                        current_char.price=army.price;
                        current_char.attack=army.attack;
                        current_char.defence=army.defence;
                        current_char.health=army.health;
                        current_char.speed=army.speed;
                        done=1;
                    }
                    else{
                        blinkText("Not enough gold coins! Choose another character to purchase from the current category.",3,500,ANSI_RED);
                        System.out.println();
                    }
                    break;
                }
            }
        }
    }

    public void setEquipment(Army army,Equipment equipment){
        if(equipment instanceof Armour){
            army.armour=(Armour)equipment;
            army.price += (int)Math.round(equipment.price*0.2);
            army.attack += equipment.attack;
            army.defence += equipment.defence;
            army.health += equipment.health;
            army.speed += equipment.speed;
            army.battle_attack=army.attack;
            army.battle_defence=army.defence;
            army.battle_health=army.health;
            army.battle_speed=army.speed;

        }
        if(equipment instanceof Artefacts){
            army.artefacts=(Artefacts)equipment;
            army.price += (int)(equipment.price) * 0.2;
            army.attack += equipment.attack;
            army.defence += equipment.defence;
            army.health += equipment.health;
            army.speed += equipment.speed;
            army.battle_attack=army.attack;
            army.battle_defence=army.defence;
            army.battle_health=army.health;
            army.battle_speed=army.speed;
        }
    }

    public PlayerProfile chooseOpponent(ArrayList <PlayerProfile> playersList){
        PlayerProfile opponent=null;
        Scanner sc = new Scanner(System.in);
        int count=1;
        int num=playersList.size();

        System.out.println();
        animatePrintFast("                                                              "+num+" players are ready for the battle.",ANSI_BLUE);
        animatePrint("                                                       If you want to battle the opponent shown, enter YES else enter NO.",ANSI_BLUE);
        animatePrint("",ANSI_BLUE);
        try{
            Thread.sleep(500);
        }
        catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println();

        for (PlayerProfile player : playersList) {
            animatePrint("Player                  :   "+count,ANSI_BOLD);
            animatePrint("Player Name             :   "+player.username,ANSI_BOLD);
            animatePrint(("Army                    :   "+player.A.name + "     " + player.K.name + "     " + player.M.name + "     " + player.H.name + "     " + player.MC.name),ANSI_BOLD);
            animatePrint(("XP value of the player  :   "+player.XP),ANSI_BOLD);
            String answer = sc.nextLine();
            if (answer.equals("YES")) {
                opponent=player;
                break;
            }
            else if(answer.equals("NO")){
                System.out.println();
                animatePrint("Choose Again",ANSI_BLUE);
                System.out.println();
            }
            else{
                blinkText("Invalid Command!",3,500,ANSI_RED);
                System.out.println();
            }
            count++;
        }

        if(opponent==null){
            blinkText("Haven't chosen any opponent!",3,500,ANSI_RED);
            System.out.println();
        }
        return (opponent);
    }
}

class GameName {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[91m";
    public static final String ANSI_GREEN = "\u001B[92m";
    public static final String ANSI_YELLOW = "\u001B[93m";
    public static final String ANSI_BLUE = "\u001B[94m";
    public static final String ANSI_PURPLE = "\u001B[95m";
    public static final String ANSI_BLINK = "\u001B[5m";
    public static final String ANSI_BOLD = "\u001B[1m";
    public static final String ANSI_LIGHT_CYAN = "\u001B[96m";

    public void animatePrint(String text, String color) {
        System.out.print(color);
        for (char c : text.toCharArray()) {
            System.out.print(c);
            try {
                Thread.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.print(ANSI_RESET);
        System.out.println();
    }

    public void animatePrintFast(String text, String color) {
        System.out.print(color);
        for (char c : text.toCharArray()) {
            System.out.print(c);
            try {
                Thread.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.print(ANSI_RESET);
        System.out.println();
    }

    public void animatePrintSlow(String text, String color) {
        System.out.print(color);
        for (char c : text.toCharArray()) {
            System.out.print(c);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.print(ANSI_RESET);
        System.out.println();
    }

    public  void blinkText(String text, int repeat, int durationMillis, String color) {
        try {
            for (int i = 0; i < repeat; i++) {
                System.out.print(ANSI_BLINK + color + text + ANSI_RESET + "\r");
                Thread.sleep(durationMillis);
                System.out.print(" ".repeat(text.length()) + "\r");
                Thread.sleep(durationMillis);
            }

            System.out.println(color + text + ANSI_RESET);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void gameStart() {
        String k = ">>============================================================================================================================================================<< \n" +
                "                                                                                                                                                             \n" +
                "   ▄▄▄▄███▄▄▄▄   ▄██   ▄      ▄████████     ███      ▄█   ▄████████        ▄▄▄▄███▄▄▄▄      ▄████████ ▄██   ▄      ▄█    █▄       ▄████████   ▄▄▄▄███▄▄▄▄    \n" +
                " ▄██▀▀▀███▀▀▀██▄ ███   ██▄   ███    ███ ▀█████████▄ ███  ███    ███      ▄██▀▀▀███▀▀▀██▄   ███    ███ ███   ██▄   ███    ███     ███    ███ ▄██▀▀▀███▀▀▀██▄  \n" +
                " ███   ███   ███ ███▄▄▄███   ███    █▀     ▀███▀▀██ ███▌ ███    █▀       ███   ███   ███   ███    ███ ███▄▄▄███   ███    ███     ███    █▀  ███   ███   ███  \n" +
                " ███   ███   ███ ▀▀▀▀▀▀███   ███            ███   ▀ ███▌ ███             ███   ███   ███   ███    ███ ▀▀▀▀▀▀███  ▄███▄▄▄▄███▄▄  ▄███▄▄▄     ███   ███   ███  \n" +
                " ███   ███   ███ ▄██   ███ ▀███████████     ███     ███▌ ███             ███   ███   ███ ▀███████████ ▄██   ███ ▀▀███▀▀▀▀███▀  ▀▀███▀▀▀     ███   ███   ███  \n" +
                " ███   ███   ███ ███   ███          ███     ███     ███  ███    █▄       ███   ███   ███   ███    ███ ███   ███   ███    ███     ███    █▄  ███   ███   ███  \n" +
                " ███   ███   ███ ███   ███    ▄█    ███     ███     ███  ███    ███      ███   ███   ███   ███    ███ ███   ███   ███    ███     ███    ███ ███   ███   ███  \n" +
                "  ▀█   ███   █▀   ▀█████▀   ▄████████▀     ▄████▀   █▀   ████████▀        ▀█   ███   █▀    ███    █▀   ▀█████▀    ███    █▀      ██████████  ▀█   ███   █▀   \n" +
                "                                                                                                                                                             \n" +
                ">>============================================================================================================================================================<< \n" ;

        // System.out.println( ANSI_LIGHT_BLUE+k);
        animatePrint(k,ANSI_LIGHT_CYAN);

        System.out.println();
        animatePrint("Welcome to the Mystic Mayhem",ANSI_RED);
        System.out.println();
    }
}

class MysticMayhemGame{
    public static void main(String[] args) {

        ArrayList<Army> characters = new ArrayList<>();
        characters.addAll(Arrays.asList(new Shooter(),new Ranger(),new Sunfire(),new Zing(), new Saggitarius(),new Squire(), new Cavalier(), new Templar(), new Zoro(),
                new Swiftblade(),new Warlock(),new Illusionist(), new Enchanter(), new Conjurer(), new Eldritch(),new Soother(),new Medic(),new Alchemist(),new Saint(),
                new Lightbringer(),new Dragon(), new Basilisk(),new Hydra(),new Phoenix(),new Pegasus()));

        Armour chainmail = new Armour("chainmail", 70, 0.0f, 1.0f, 0.0f,-1.0f);
        Armour regalia = new Armour("regalia", 105, 0.0f, 1.0f, 0.0f, 0.0f);
        Armour fleece = new Armour("fleece", 150, 0.0f, 2.0f, 1.0f, -1.0f);

        Artefacts excalibur = new Artefacts("excalibur", 150, 2.0f, 0.0f, 0.0f, 0.0f);
        Artefacts amulet = new Artefacts("amulet", 200, 1.0f, -1.0f, 1.0f, 1.0f);
        Artefacts crystal = new Artefacts("crystal", 210, 2.0f, 1.0f,-1.0f,-1.0f);

        ArrayList<Equipment> weapons = new ArrayList<>();
        weapons.addAll(Arrays.asList(chainmail, regalia, fleece, excalibur, amulet, crystal));

        ArrayList <String> usernameList = new ArrayList<>();

        PlayerProfile p1 = new PlayerProfile("GeraltoRivia","Whitewolf", 215, 32,new Ranger(), new Squire(), new Warlock(), new Medic(), new Dragon(),"Marshland",usernameList);
        p1.setEquipment(p1.A,chainmail);
        p1.setEquipment(p1.H,amulet);

        PlayerProfile p2 = new PlayerProfile("Kasunya","Kas",120,10, new Ranger(),new Swiftblade(),new Enchanter(),new Medic(),new Dragon(),"Hillcrest",usernameList);
        p2.setEquipment(p2.MC, crystal);

        PlayerProfile p3 = new PlayerProfile("Dulmini","Dulz",220,15, new Sunfire(),new Templar(),new Eldritch(),new Alchemist(),new Basilisk(),"Desert",usernameList);
        p3.setEquipment(p3.A, excalibur);
        p3.setEquipment(p3.K,fleece);

        PlayerProfile p4 = new PlayerProfile("Mindi","Mindi",15,30, new Saggitarius(),new Zoro(),new Conjurer(),new Saint(),new Pegasus(),"Marshland",usernameList);
        p4.setEquipment(p4.K, regalia);
        p4.setEquipment(p4.K, crystal);
        p4.setEquipment(p4.A, crystal);

        PlayerProfile p5 = new PlayerProfile("Rasindu","Rasindu",520,21, new Zing(),new Cavalier(),new Illusionist(),new Lightbringer(),new Hydra(),"Arcane",usernameList);
        p5.setEquipment(p5.M,amulet);
        p5.setEquipment(p5.H,fleece);

        ArrayList <PlayerProfile> playersList = new ArrayList<>();
        playersList.addAll(Arrays.asList(p1,p2,p3,p4,p5));

        GameName game = new GameName();
        game.gameStart();

        PlayerProfile currentPlayer = new PlayerProfile("current");
        currentPlayer.inputUsername(usernameList);
        currentPlayer.selectArmy(characters);
        currentPlayer.purchaseEquipment(currentPlayer.K, weapons);
        PlayerProfile opponent =currentPlayer.chooseOpponent(playersList);

        if (opponent!=null){
            System.out.println();
            game.animatePrintFast("                           ╔═════════════════════════════════════════════════════════════════════════════════════════════════════════════════╗", GameName.ANSI_PURPLE);
            game.blinkText("                                     " +       "....................................LET'S START THE BATTLE...................................."              , 3,500,GameName.ANSI_PURPLE);
            game.animatePrintFast("                           ╚═════════════════════════════════════════════════════════════════════════════════════════════════════════════════╝", GameName.ANSI_PURPLE);

            try{
                Thread.sleep(1000);
            }
            catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println();
            Battle battle1=new Battle(currentPlayer,opponent);
            battle1.startBattle();
        }
        Battle battle2=new Battle(currentPlayer,p1);
        battle2.startBattle();
    }
}
