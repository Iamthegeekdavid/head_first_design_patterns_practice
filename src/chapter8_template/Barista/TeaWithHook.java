package chapter8_template.Barista;

import java.io.*;

public class TeaWithHook extends CaffeineBeverageWithHook {

    public void brew() {
        System.out.println("Steeping the tea");
    }

    public void addCondiments() {
        System.out.println("Adding Lemon");
    }

    public boolean customerWantsCondiments() {
        String answer = getUserInput();
        if (answer.toLowerCase().startsWith("y")) {
            return true;
        } else {
            return false;
        }
    }

    private String getUserInput() {
        String answer = null;
        System.out.println("Would you like lemon with your tea (y/n) ?");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
           answer = in.readLine();
        } catch (IOException ioe) {
            System.err.println("IO Error trying to read your answer");
        }

        if (answer == null) {
            return "no";
        }
        return answer;
    }
}
