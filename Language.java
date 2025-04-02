/*

Languages, just like people, often have families. You can even map language lineage a bit like a family tree.

Java can help us build a model to track inherited traits across families. In this case, 
we’ll focus on something that often varies between language families: word order — where the subject, verb, and object would go in a sentence.

For example, in English, you would use subject-verb-object order

But in Japanese, you would use subject-object-verb order

Your Language Inheritance package has three Java files:

Language.java: for the Language parent class, which serves as the template for all languages.
Mayan.java: for Mayan, a child class of Language modeled after the Mayan language family.
SinoTibetan.java: for SinoTibetan, a child class of Language modeled after the Sino-Tibetan language family.

Name: Lucas Gabriel Nordio
Date: 02/04/2025

*/

public class Language {

    protected String name;
    protected int numSpeakers;
    protected String regionsSpoken;

    protected String wordOrder;

    public Language(String name, int numSpeakers, String regionsSpoken, String wordOrder) {
        this.name = name;
        this.numSpeakers = numSpeakers;
        this.regionsSpoken = regionsSpoken;
        this.wordOrder = wordOrder;
    }

    public void getInfo(){
        System.out.println(this.name + " is spoken by " + this.numSpeakers + " people mainly in " + this.regionsSpoken + ".");
        System.out.println("The language follows the word order: " + this.wordOrder);
    }

    public static void main(String[] args) throws Exception {

        Language language = new Language("Spanish", 5000000, "Spain", "subject-verb-objects");
        language.getInfo();
        Language mayan = new Mayan("Mayan", 3000000);
        mayan.getInfo();
        Language chinese = new SinoTibetan("Chinese", 20000);
        chinese.getInfo();
        Language nonChinese = new SinoTibetan("Burmese", 20000);
        nonChinese.getInfo();

    }
}
