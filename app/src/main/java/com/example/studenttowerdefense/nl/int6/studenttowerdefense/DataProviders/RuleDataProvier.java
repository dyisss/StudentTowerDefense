package com.example.studenttowerdefense.nl.int6.studenttowerdefense.DataProviders;

import java.util.ArrayList;

/**
 * Created by Kyle on 03-Jun-18.
 */

public class RuleDataProvier {
    public static ArrayList<String> rulesArrayList;

    static {
        rulesArrayList = new ArrayList<>();
        rulesArrayList.add("1.Protect your Base from the enemy waves , do not let its hp become 0.");
        rulesArrayList.add("2.Towers can only be built along side the path in the level as not to block enemy movement.");
        rulesArrayList.add("3.Money is gained from slaying enemies as well as passively generated.");
        rulesArrayList.add("4.You can upgrade your towers to improve their stats.");
        rulesArrayList.add("5.When selling towers you only get 50% of the money you spent buying it.");
    }
}
