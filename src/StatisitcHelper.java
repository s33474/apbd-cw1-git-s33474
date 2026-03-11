public class StatisitcHelper {

    private int value;

    public StatisitcHelper(int value) {
        this.value = value;
    }


    public int addValue(int a){
        this.value += a;
        return this.value;
    }

    public int subtractValue(int a){
        this.value -= a;
        return this.value;
    }

    public int CalculateAverage(int[] tab){

        int sum = 0;
        for(int i = 0; i < tab.length; i++){
            sum += tab[i];
        }

        return sum;
    }

    public int calculateMax(int[] tab){
        return 0;
        
    }

    public int getValue() {
        return value;
    }
}

