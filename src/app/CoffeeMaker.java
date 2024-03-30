package app;

 class CoffeeMaker {

    private Coffee coffee;

    public void setCoffee(Coffee coffee) {
        this.coffee = coffee;
    }

    public void makeCoffee() {
        coffee.make();
    }
}
