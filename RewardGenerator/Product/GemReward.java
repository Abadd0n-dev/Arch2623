package RewardGenerator.Product;

public class GemReward extends ItemReward{

    @Override
    public void open() {
        System.out.println("\u001B[34m" + "Gem!" + "\u001B[0m");
    }
    
}
