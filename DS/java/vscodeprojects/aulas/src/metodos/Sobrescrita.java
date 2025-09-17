// metodo sobrescrita //
    class Animal {
    public void emitirSom() {
        System.out.println("animal produz som.");
    }
}
    class Cachorro extends Animal{
        @Override
        public void emitirSom(){
            System.out.println("cachorro faz: au au");
        }
    }
    public class Sobrescrita {
        public static void main(String[] args) {
            Animal animal = new Animal();
            Animal cachorro = new Cachorro();

            animal.emitirSom();
            cachorro.emitirSom();
        }
    }

