public class Replace {

    public void replaced() {
        String foxCat = "The quick brown fox jumps over the lazy dog.";
        String newFoxCat = foxCat.replaceAll("fox", "cat");
        System.out.println("Sample string: " + foxCat);
        System.out.println("New string: " + newFoxCat);
    }

}
