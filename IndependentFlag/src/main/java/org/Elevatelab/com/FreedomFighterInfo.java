package org.Elevatelab.com;

import java.util.HashMap;
import java.util.Scanner;

public class FreedomFighterInfo {
    public static void main(String[] args) {
        HashMap<String, String> info = new HashMap<>();
        info.put("gandhi", "Mahatma Gandhi - Leader of the Indian independence movement, known for non-violence.");
        info.put("bhagat", "Bhagat Singh - Revolutionary freedom fighter, known for his courage.");
        info.put("nehru", "Jawaharlal Nehru - First Prime Minister of India.");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter freedom fighter's name (gandhi/bhagat/nehru): ");
        String name = sc.nextLine().toLowerCase();

        System.out.println(info.getOrDefault(name, "No information found."));
        sc.close();
    }
}

