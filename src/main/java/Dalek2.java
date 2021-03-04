public class Dalek2 {
    private String[] sayings;

    public void setSayings(String[] arr)
    {
        sayings = arr;
    }


    public void speak() {

        int rnd = (int) (Math.random() * sayings.length);

        System.out.println(sayings[rnd]);
    }
}
