package com.studenttheironyard;
import static com.studenttheironyard.Main.scanner;

/**
 * Created by hoseasandstrom on 5/25/16.
 */
public class Beer {
    String beer;
    String type;
    String brewer;
    String company;
    int drunk;



    public void chooseBeer() {
        System.out.println("What is the name of your favorite beer?");
        beer = scanner.nextLine();
        System.out.printf("So, you like, %s.", beer);
    }
    public void chooseType() {
        System.out.println("What type of beer is it? [IPA, Stout, Porter, etc]");
        type = scanner.nextLine();

        if (type.equalsIgnoreCase("IPA")) {
            System.out.println("IPAs are the best!");
        }
        else if (type.equalsIgnoreCase("Stout")) {
            System.out.println("Stouts are great!");
        }
        else if (type.equalsIgnoreCase("Porter"))
            System.out.println("Porters are a good go to!");
        else {
            System.out.println("I think we might be done here...but let's continue.");
        }
    }

    public void chooseBrewer() {
        System.out.println("Who brews your beer?");
        brewer = scanner.nextLine();
        System.out.printf("I heard %s might be a decent brewer.", brewer);
        System.out.println("There are only two more questions.");
    }

    public void chooseCompany() {
        System.out.printf("Who do like to drink %s with?\n", beer);
        company = scanner.nextLine();
        System.out.println("Ok, last question.");
    }

    public void chooseQty() {
        System.out.println("How many beers are you going to drink?");
        int drunk = scanner.nextInt();
        int drunkInt = Integer.valueOf(drunk);
        if (drunk < 3) {
            System.out.println("Perfect amount for an enjoyable evening!");
        }
        else if (drunk < 6) {
            System.out.println("You might be pushing it a bit...");
        }
        else {
            System.out.println("You will be hammer drunk! You might want to reconsider how many you plan to have.");
        }
    }

    public String getBeer() {
        return beer;
    }

    public String getType() {
        return type;
    }

    public String getBrewer() {
        return brewer;
    }

    public String getCompany() {
        return company;
    }

    public int getDrunk() {
        return drunk;
    }
}

