import java.lang.String;
 class Saving {
    String name;
    int money;
    Saving(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public void fixeddeposit() {
        System.out.println("Money depoited is : " + money);
    }

    public int totalMoney() {
        return money;
    }
}
    class Current {
    String name;
    int moneyCredited;
    Current(String name,int moneyCredited) {
        this.name=name;
        this.moneyCredited=moneyCredited;
    }
    public int creditedcash() {
        System.out.println("Money credited is : "+moneyCredited);
        return moneyCredited;
    }
    public int totalMoney() {
        return moneyCredited;
}

}