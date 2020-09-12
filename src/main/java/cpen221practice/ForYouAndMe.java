package cpen221practice;

public class ForYouAndMe {
    public String youandme(String name) {
        String sentence = new String();
        if (name == null)
        {
            sentence = "One for you, one for me.";
        }
        else
        {
            sentence = String.format("One for %s, one for me.", name);
        }
        return sentence;
    }
}
