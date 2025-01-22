package automation;

public class CarDemo {
    public static void main(String[] args) {

        Audi a1 = new Thar();
        a1.sendKeys("Engine selected");
        a1.sendKeys("Engine working");

    }
}
        class Audi {
            void sendKeys(String value) {
                System.out.println("Audi" + value);
            }
        }
         class Thar extends Audi {
            @Override
            public void sendKeys(String value) {
                System.out.println("Thar" + value);
            }
        }

        class Swift extends Thar {
            @Override
            public void sendKeys(String value) {
                System.out.println("Swift" + value);
            }
        }

