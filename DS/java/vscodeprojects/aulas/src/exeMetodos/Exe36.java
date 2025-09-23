package exeMetodos;

public class Exe36 {
    public void emitirSom() {
        System.out.println("animais e seus sons");
    }

    public static void main(String[] args) {
        Exe36 ex = new Exe36();
        Exe36 cachorro = new Cachorro();
        Exe36 gato = new gato();
        ex.emitirSom();
        cachorro.emitirSom();
        gato.emitirSom();
    }
}

class Cachorro extends Exe36 {
    @Override
    public void emitirSom() {
        System.out.println("cachorro: au au");
    }
}

class gato extends Exe36{
    @Override
    public void emitirSom(){
        System.out.println("gato: miauu");
    }
}
